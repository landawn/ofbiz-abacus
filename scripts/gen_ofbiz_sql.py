#!/usr/bin/env python3
"""
Generate H2 / MySQL / PostgreSQL DDL + seed-data SQL from the
apache-ofbiz-framework entity model and seed XML files.

Outputs:
    docs/db/H2.sql
    docs/db/MySQL.sql
    docs/db/PostgreSQL.sql
"""
from __future__ import annotations

import os
import re
import sys
import xml.etree.ElementTree as ET
from collections import OrderedDict
from glob import glob
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
OFBIZ = ROOT / "apache-ofbiz-framework"
OUT = ROOT / "docs" / "db"
OUT.mkdir(parents=True, exist_ok=True)

# -----------------------------------------------------------------------------
# OFBiz camelCase -> UPPER_SNAKE_CASE  (matches ModelEntity.makeColName)
# -----------------------------------------------------------------------------
def camel_to_upper_snake(name: str) -> str:
    out = []
    for i, c in enumerate(name):
        if c.isupper() and i > 0 and not name[i - 1].isupper():
            out.append("_")
        out.append(c.upper())
    return "".join(out)

def entity_to_table(entity_name: str) -> str:
    return camel_to_upper_snake(entity_name)

def field_to_column(field_name: str) -> str:
    return camel_to_upper_snake(field_name)

# -----------------------------------------------------------------------------
# Field-type maps (parsed from framework/entity/fieldtype/fieldtype<db>.xml)
# -----------------------------------------------------------------------------
FIELDTYPE_FILES = {
    "h2":       OFBIZ / "framework" / "entity" / "fieldtype" / "fieldtypeh2.xml",
    "mysql":    OFBIZ / "framework" / "entity" / "fieldtype" / "fieldtypemysql.xml",
    "postgres": OFBIZ / "framework" / "entity" / "fieldtype" / "fieldtypepostgres.xml",
}

def parse_fieldtype(path: Path) -> dict[str, str]:
    tree = ET.parse(path)
    root = tree.getroot()
    return {
        ft.get("type"): ft.get("sql-type")
        for ft in root.findall("field-type-def")
        if ft.get("type") and ft.get("sql-type")
    }

# -----------------------------------------------------------------------------
# Discover entitymodel + seed-data files via ofbiz-component.xml
# -----------------------------------------------------------------------------
def discover_resources() -> tuple[list[Path], list[Path]]:
    """Return (entitymodel_paths, seed_data_paths) following ofbiz-component.xml."""
    models: list[Path] = []
    seeds: list[Path] = []
    seen_models: set[Path] = set()
    seen_seeds: set[Path] = set()

    for comp_xml in OFBIZ.rglob("ofbiz-component.xml"):
        # skip the test-fixture component descriptors
        if "test" in comp_xml.parts and "testsdata" in str(comp_xml):
            continue
        try:
            tree = ET.parse(comp_xml)
        except ET.ParseError:
            continue
        comp_dir = comp_xml.parent
        for res in tree.getroot().iter("entity-resource"):
            kind = res.get("type")
            location = res.get("location")
            reader = res.get("reader-name", "")
            if not location:
                continue
            # skip template placeholders
            if "@" in location:
                continue
            path = (comp_dir / location).resolve()
            if not path.exists():
                continue
            if kind == "model":
                if path not in seen_models:
                    seen_models.add(path)
                    models.append(path)
            elif kind == "data" and reader in ("seed", "seed-initial"):
                if path not in seen_seeds:
                    seen_seeds.add(path)
                    seeds.append(path)
    return models, seeds

# -----------------------------------------------------------------------------
# Entity model parsing
# -----------------------------------------------------------------------------
class Entity:
    __slots__ = ("name", "table", "fields", "pk", "relations", "indexes", "source")

    def __init__(self, name: str, source: Path):
        self.name = name
        self.table = entity_to_table(name)
        self.fields: list[dict] = []      # [{name, type, not_null, col}]
        self.pk: list[str] = []           # field names
        self.relations: list[dict] = []   # [{fk_name, type, rel_entity, key_maps:[(from,to)]}]
        self.indexes: list[dict] = []     # [{name, unique, fields:[(name,fn)]}]
        self.source = source

class ViewEntity:
    __slots__ = ("name", "members", "aliases", "links", "source")

    def __init__(self, name: str, source: Path):
        self.name = name
        self.members: list[tuple[str, str]] = []   # [(alias, entity_name)]
        self.aliases: list[dict] = []              # [{alias, name, entity_alias, field, function, group_by}]
        self.links: list[dict] = []                # [{entity_alias, rel_entity_alias, key_maps:[(from,to)], rel_optional}]
        self.source = source

def parse_entitymodels(paths: list[Path]) -> tuple[OrderedDict[str, Entity], OrderedDict[str, ViewEntity], list[dict]]:
    """
    Returns:
        entities, views, extends
    extends entries: [{entity_name, extends, fields:[...], relations:[...], indexes:[...]}]
    """
    entities: OrderedDict[str, Entity] = OrderedDict()
    views: OrderedDict[str, ViewEntity] = OrderedDict()
    extends_list: list[dict] = []

    for path in paths:
        try:
            tree = ET.parse(path)
        except ET.ParseError as e:
            print(f"WARN: cannot parse {path}: {e}", file=sys.stderr)
            continue
        root = tree.getroot()

        for e in root.findall("entity"):
            name = e.get("entity-name")
            if not name:
                continue
            ent = Entity(name, path)
            _populate_entity_body(ent, e)
            entities[name] = ent

        for e in root.findall("extend-entity"):
            name = e.get("entity-name")
            if not name:
                continue
            ex = {"entity_name": name, "source": path,
                  "fields": [], "relations": [], "indexes": []}
            _collect_ext(ex, e)
            extends_list.append(ex)

        for v in root.findall("view-entity"):
            name = v.get("entity-name")
            if not name:
                continue
            ve = ViewEntity(name, path)
            for me in v.findall("member-entity"):
                ve.members.append((me.get("entity-alias"), me.get("entity-name")))
            for al in v.findall("alias"):
                ve.aliases.append({
                    "name":         al.get("name"),
                    "entity_alias": al.get("entity-alias"),
                    "field":        al.get("field") or al.get("name"),
                    "function":     al.get("function"),
                    "group_by":     al.get("group-by") == "true",
                    "kind":         "alias",
                })
            for al in v.findall("alias-all"):
                ve.aliases.append({
                    "entity_alias": al.get("entity-alias"),
                    "prefix":       al.get("prefix"),
                    "excludes":     [x.get("field") for x in al.findall("exclude") if x.get("field")],
                    "kind":         "alias-all",
                })
            for ln in v.findall("view-link"):
                key_maps = [(km.get("field-name"),
                             km.get("rel-field-name") or km.get("field-name"))
                            for km in ln.findall("key-map")]
                ve.links.append({
                    "entity_alias":     ln.get("entity-alias"),
                    "rel_entity_alias": ln.get("rel-entity-alias"),
                    "rel_optional":     ln.get("rel-optional") == "true",
                    "key_maps":         key_maps,
                })
            views[name] = ve

    # apply extend-entity
    for ex in extends_list:
        target = entities.get(ex["entity_name"])
        if not target:
            continue
        # add new fields, skipping dupes
        existing_fields = {f["name"] for f in target.fields}
        for f in ex["fields"]:
            if f["name"] not in existing_fields:
                target.fields.append(f)
                existing_fields.add(f["name"])
        target.relations.extend(ex["relations"])
        target.indexes.extend(ex["indexes"])

    return entities, views, extends_list

def _populate_entity_body(ent: Entity, node: ET.Element) -> None:
    for f in node.findall("field"):
        fname = f.get("name")
        ftype = f.get("type")
        if not fname or not ftype:
            continue
        not_null = f.get("not-null") == "true"
        ent.fields.append({
            "name":     fname,
            "type":     ftype,
            "not_null": not_null,
            "col":      field_to_column(fname),
            "enable_audit_log": f.get("enable-audit-log") == "true",
        })
    for pk in node.findall("prim-key"):
        fname = pk.get("field")
        if fname:
            ent.pk.append(fname)
    for r in node.findall("relation"):
        rtype = r.get("type")
        rel_entity = r.get("rel-entity-name")
        fk_name = r.get("fk-name")
        title = r.get("title", "")
        if not rel_entity:
            continue
        key_maps = [(km.get("field-name"),
                     km.get("rel-field-name") or km.get("field-name"))
                    for km in r.findall("key-map")]
        ent.relations.append({
            "fk_name":    fk_name,
            "type":       rtype,
            "rel_entity": rel_entity,
            "title":      title,
            "key_maps":   key_maps,
        })
    for idx in node.findall("index"):
        iname = idx.get("name")
        unique = idx.get("unique") == "true"
        fields = []
        for fld in idx.findall("index-field"):
            fn_name = fld.get("name")
            fn_func = fld.get("function")
            if fn_name:
                fields.append((fn_name, fn_func))
        if iname and fields:
            ent.indexes.append({"name": iname, "unique": unique, "fields": fields})

def _collect_ext(ex: dict, node: ET.Element) -> None:
    for f in node.findall("field"):
        fname = f.get("name")
        ftype = f.get("type")
        if not fname or not ftype:
            continue
        ex["fields"].append({
            "name":     fname,
            "type":     ftype,
            "not_null": f.get("not-null") == "true",
            "col":      field_to_column(fname),
            "enable_audit_log": f.get("enable-audit-log") == "true",
        })
    for r in node.findall("relation"):
        rel_entity = r.get("rel-entity-name")
        if not rel_entity:
            continue
        key_maps = [(km.get("field-name"),
                     km.get("rel-field-name") or km.get("field-name"))
                    for km in r.findall("key-map")]
        ex["relations"].append({
            "fk_name":    r.get("fk-name"),
            "type":       r.get("type"),
            "rel_entity": rel_entity,
            "title":      r.get("title", ""),
            "key_maps":   key_maps,
        })
    for idx in node.findall("index"):
        iname = idx.get("name")
        unique = idx.get("unique") == "true"
        fields = [(fld.get("name"), fld.get("function"))
                  for fld in idx.findall("index-field") if fld.get("name")]
        if iname and fields:
            ex["indexes"].append({"name": iname, "unique": unique, "fields": fields})

# -----------------------------------------------------------------------------
# Seed-data parsing
# -----------------------------------------------------------------------------
def parse_seed_records(seed_paths: list[Path]) -> list[tuple[str, dict, Path]]:
    """Return list of (EntityName, attr_dict, source_path)."""
    records: list[tuple[str, dict, Path]] = []
    for path in seed_paths:
        try:
            tree = ET.parse(path)
        except ET.ParseError as e:
            print(f"WARN: cannot parse {path}: {e}", file=sys.stderr)
            continue
        root = tree.getroot()
        # entity-engine-xml root contains <EntityName attr.../> children
        for child in root:
            tag = child.tag
            if tag in ("entity-engine-xml", "delete"):
                # <delete>...</delete> wraps records to remove on load — skip
                continue
            # Skip non-entity helper tags
            if tag.startswith("ofbiz-") or tag.endswith("-stub"):
                continue
            attrs = dict(child.attrib)
            # also support text-only nested fields (rare): <field>value</field>
            for sub in child:
                if sub.text is not None and sub.text.strip():
                    attrs[sub.tag] = sub.text
            if attrs or child.text:
                records.append((tag, attrs, path))
    return records

# -----------------------------------------------------------------------------
# SQL emitters
# -----------------------------------------------------------------------------
SQL_QUOTE_RE = re.compile(r"'")

def sql_quote_string(v: str) -> str:
    return "'" + SQL_QUOTE_RE.sub("''", v) + "'"

def sql_literal(value: str, sql_type: str) -> str:
    """Best-effort literal for INSERT VALUES — values are strings from XML attrs."""
    if value is None:
        return "NULL"
    upper = sql_type.upper()
    # numerics
    if any(t in upper for t in ("INT", "NUMERIC", "DECIMAL", "DOUBLE", "FLOAT")):
        if value.strip() == "":
            return "NULL"
        try:
            # Validate it's a number
            float(value.replace(",", ""))
            return value.strip()
        except ValueError:
            return sql_quote_string(value)
    # everything else as string
    return sql_quote_string(value)

def field_lookup(entity: Entity) -> dict[str, dict]:
    return {f["name"]: f for f in entity.fields}

def emit_create_table(ent: Entity, type_map: dict[str, str], dialect: str) -> str:
    lines = []
    pk_cols = []
    for f in ent.fields:
        sql_type = type_map.get(f["type"], "VARCHAR(255)")
        null_clause = " NOT NULL" if (f["not_null"] or f["name"] in ent.pk) else ""
        lines.append(f'    "{f["col"]}" {sql_type}{null_clause}')
    if ent.pk:
        for pk in ent.pk:
            f = next((x for x in ent.fields if x["name"] == pk), None)
            if f:
                pk_cols.append(f'"{f["col"]}"')
    if pk_cols:
        lines.append(f"    CONSTRAINT \"PK_{ent.table}\" PRIMARY KEY ({', '.join(pk_cols)})")
    body = ",\n".join(lines)
    if dialect == "mysql":
        return f'CREATE TABLE IF NOT EXISTS `{ent.table}` (\n{body.replace(chr(34), chr(96))}\n) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;\n'
    return f'CREATE TABLE IF NOT EXISTS "{ent.table}" (\n{body}\n);\n'

def emit_foreign_keys(ent: Entity, entities: dict[str, Entity], dialect: str) -> list[str]:
    out = []
    fk_seen = set()
    for rel in ent.relations:
        if rel["type"] not in ("one", "one-nofk"):
            continue
        if rel["type"] == "one-nofk":
            continue
        rel_entity = entities.get(rel["rel_entity"])
        if not rel_entity:
            continue
        # Build column lists
        local_cols = []
        ref_cols = []
        rel_field_map = {f["name"]: f for f in rel_entity.fields}
        local_field_map = {f["name"]: f for f in ent.fields}
        ok = True
        for from_field, to_field in rel["key_maps"]:
            lf = local_field_map.get(from_field)
            rf = rel_field_map.get(to_field) or rel_field_map.get(from_field)
            if not lf or not rf:
                ok = False
                break
            local_cols.append(lf["col"])
            ref_cols.append(rf["col"])
        if not ok or not local_cols:
            continue
        fk_name = rel["fk_name"] or f"FK_{ent.table}_{rel_entity.table}"
        # ensure uniqueness (OFBiz allows duplicate fk-names across entities, but per-entity should be unique)
        base = fk_name
        n = 1
        while fk_name in fk_seen:
            n += 1
            fk_name = f"{base}_{n}"
        fk_seen.add(fk_name)
        if dialect == "mysql":
            local_list = ", ".join(f"`{c}`" for c in local_cols)
            ref_list = ", ".join(f"`{c}`" for c in ref_cols)
            out.append(
                f"ALTER TABLE `{ent.table}` ADD CONSTRAINT `{fk_name}` "
                f"FOREIGN KEY ({local_list}) REFERENCES `{rel_entity.table}` ({ref_list});"
            )
        else:
            local_list = ", ".join(f'"{c}"' for c in local_cols)
            ref_list = ", ".join(f'"{c}"' for c in ref_cols)
            out.append(
                f'ALTER TABLE "{ent.table}" ADD CONSTRAINT "{fk_name}" '
                f'FOREIGN KEY ({local_list}) REFERENCES "{rel_entity.table}" ({ref_list});'
            )
    return out

def emit_indexes(ent: Entity, dialect: str) -> list[str]:
    out = []
    for idx in ent.indexes:
        cols = []
        local_field_map = {f["name"]: f for f in ent.fields}
        ok = True
        for fn, _func in idx["fields"]:
            f = local_field_map.get(fn)
            if not f:
                ok = False
                break
            cols.append(f["col"])
        if not ok or not cols:
            continue
        unique = "UNIQUE " if idx["unique"] else ""
        if dialect == "mysql":
            col_list = ", ".join(f"`{c}`" for c in cols)
            out.append(f'CREATE {unique}INDEX `{idx["name"]}` ON `{ent.table}` ({col_list});')
        else:
            col_list = ", ".join(f'"{c}"' for c in cols)
            out.append(f'CREATE {unique}INDEX "{idx["name"]}" ON "{ent.table}" ({col_list});')
    return out

# -----------------------------------------------------------------------------
# View entity emission
# -----------------------------------------------------------------------------
def expand_view_aliases(ve: ViewEntity, entities: dict[str, Entity]) -> list[tuple[str, str, str]]:
    """Return list of (output_column_name, qualified_source, function_or_None)."""
    out = []
    member_map = dict(ve.members)
    seen_out = set()
    for al in ve.aliases:
        if al["kind"] == "alias-all":
            ea = al["entity_alias"]
            ent_name = member_map.get(ea)
            if not ent_name:
                continue
            ent = entities.get(ent_name)
            if not ent:
                continue
            for f in ent.fields:
                if f["name"] in al.get("excludes", []):
                    continue
                fname = f["name"]
                if al.get("prefix"):
                    fname = al["prefix"] + fname[0].upper() + fname[1:]
                col = field_to_column(fname)
                if col in seen_out:
                    continue
                seen_out.add(col)
                out.append((col, f'{ea}.{f["col"]}', None))
        else:
            ea = al["entity_alias"]
            ent_name = member_map.get(ea)
            ent = entities.get(ent_name) if ent_name else None
            source_field = al.get("field") or al.get("name")
            col_src = field_to_column(source_field) if source_field else None
            if not col_src or not ea:
                continue
            out_col = field_to_column(al["name"])
            if out_col in seen_out:
                continue
            seen_out.add(out_col)
            out.append((out_col, f"{ea}.{col_src}", al.get("function")))
    return out

def emit_create_view(ve: ViewEntity, entities: dict[str, Entity], dialect: str) -> str | None:
    # Validate all member entities exist (skip if any missing — view depends on something we don't have)
    if not ve.members:
        return None
    for _alias, ename in ve.members:
        if ename not in entities:
            return None
    cols = expand_view_aliases(ve, entities)
    if not cols:
        return None
    q = '`' if dialect == "mysql" else '"'

    select_parts = []
    for out_col, qualified, func in cols:
        ea, src = qualified.split(".", 1)
        expr = f'{q}{ea}{q}.{q}{src}{q}'
        if func:
            expr = f'{func.upper()}({expr})'
        select_parts.append(f'{expr} AS {q}{out_col}{q}')

    first_alias, first_ent = ve.members[0]
    from_clause = f'{q}{entities[first_ent].table}{q} {q}{first_alias}{q}'
    joins = []
    joined = {first_alias}
    for ln in ve.links:
        ea = ln["entity_alias"]
        rea = ln["rel_entity_alias"]
        if rea in joined:
            # already joined; skip
            continue
        rel_ent = next((m[1] for m in ve.members if m[0] == rea), None)
        if not rel_ent:
            continue
        on_parts = []
        for from_f, to_f in ln["key_maps"]:
            on_parts.append(f'{q}{ea}{q}.{q}{field_to_column(from_f)}{q} = {q}{rea}{q}.{q}{field_to_column(to_f)}{q}')
        join_type = "LEFT OUTER JOIN" if ln["rel_optional"] else "INNER JOIN"
        joins.append(f'{join_type} {q}{entities[rel_ent].table}{q} {q}{rea}{q} ON {" AND ".join(on_parts)}')
        joined.add(rea)

    view_name = entity_to_table(ve.name)
    sql = (
        f"CREATE OR REPLACE VIEW {q}{view_name}{q} AS\n"
        f"SELECT {', '.join(select_parts)}\n"
        f"FROM {from_clause}\n"
    )
    if joins:
        sql += "\n".join(joins) + "\n"
    sql += ";\n"
    return sql

# H2 does not support "OR REPLACE" — rewrite
def view_sql_for_dialect(sql: str, dialect: str) -> str:
    if dialect == "h2":
        return sql.replace("CREATE OR REPLACE VIEW", "CREATE VIEW IF NOT EXISTS", 1)
    return sql

# -----------------------------------------------------------------------------
# Seed data INSERT emission
# -----------------------------------------------------------------------------
def emit_inserts(records: list[tuple[str, dict, Path]],
                 entities: dict[str, Entity],
                 type_map: dict[str, str],
                 dialect: str) -> list[str]:
    q = '`' if dialect == "mysql" else '"'
    out = []
    skipped_entities = set()
    for ent_name, attrs, _src in records:
        ent = entities.get(ent_name)
        if not ent:
            skipped_entities.add(ent_name)
            continue
        field_map = field_lookup(ent)
        cols = []
        vals = []
        for attr_name, attr_val in attrs.items():
            f = field_map.get(attr_name)
            if not f:
                continue  # ignore unknown attrs (defaults, etc.)
            cols.append(f"{q}{f['col']}{q}")
            vals.append(sql_literal(attr_val, type_map.get(f["type"], "VARCHAR(255)")))
        if not cols:
            continue
        out.append(
            f"INSERT INTO {q}{ent.table}{q} ({', '.join(cols)}) VALUES ({', '.join(vals)});"
        )
    if skipped_entities:
        print(f"INFO: seed-data referenced {len(skipped_entities)} unknown entities (e.g. {sorted(list(skipped_entities))[:5]})",
              file=sys.stderr)
    return out

# -----------------------------------------------------------------------------
# Main
# -----------------------------------------------------------------------------
def main() -> None:
    print(f"Scanning {OFBIZ} ...")
    model_paths, seed_paths = discover_resources()
    print(f"  found {len(model_paths)} entitymodel XMLs, {len(seed_paths)} seed-data XMLs")

    entities, views, extends = parse_entitymodels(model_paths)
    print(f"  parsed {len(entities)} entities, {len(views)} view-entities, {len(extends)} extends")

    records = parse_seed_records(seed_paths)
    print(f"  parsed {len(records)} seed records")

    fieldtype_maps = {dialect: parse_fieldtype(path) for dialect, path in FIELDTYPE_FILES.items()}

    # Topological order for FKs is enforced via deferred constraints (added after all tables).
    # Tables are emitted in entity-name discovery order.

    for dialect, type_map in fieldtype_maps.items():
        nice_name = {"h2": "H2", "mysql": "MySQL", "postgres": "PostgreSQL"}[dialect]
        out_path = OUT / f"{nice_name}.sql"
        print(f"Writing {out_path} ...")
        with open(out_path, "w", encoding="utf-8", newline="\n") as fh:
            fh.write(f"-- Generated by scripts/gen_ofbiz_sql.py from apache-ofbiz-framework\n")
            fh.write(f"-- Target DB: {nice_name}\n")
            fh.write(f"-- Entities: {len(entities)}, View-entities: {len(views)}, Seed records: {len(records)}\n")
            fh.write(f"-- Source entitymodel files ({len(model_paths)}):\n")
            for p in model_paths:
                rel = p.relative_to(ROOT).as_posix()
                fh.write(f"--   {rel}\n")
            fh.write(f"-- Source seed-data files ({len(seed_paths)}):\n")
            for p in seed_paths:
                rel = p.relative_to(ROOT).as_posix()
                fh.write(f"--   {rel}\n")
            fh.write("\n")

            if dialect == "mysql":
                fh.write("SET FOREIGN_KEY_CHECKS=0;\n")
                fh.write("SET NAMES utf8mb4;\n\n")
            elif dialect == "postgres":
                fh.write("SET session_replication_role = 'replica';  -- defer FK checks during load\n\n")
            else:  # h2
                fh.write("SET REFERENTIAL_INTEGRITY FALSE;\n\n")

            fh.write("-- ========================================================================\n")
            fh.write("-- TABLES\n")
            fh.write("-- ========================================================================\n\n")
            for ent in entities.values():
                fh.write(emit_create_table(ent, type_map, dialect))
                fh.write("\n")

            fh.write("\n-- ========================================================================\n")
            fh.write("-- INDEXES\n")
            fh.write("-- ========================================================================\n\n")
            for ent in entities.values():
                for line in emit_indexes(ent, dialect):
                    fh.write(line + "\n")

            fh.write("\n-- ========================================================================\n")
            fh.write("-- FOREIGN KEYS\n")
            fh.write("-- ========================================================================\n\n")
            for ent in entities.values():
                for line in emit_foreign_keys(ent, entities, dialect):
                    fh.write(line + "\n")

            fh.write("\n-- ========================================================================\n")
            fh.write("-- SEED DATA\n")
            fh.write("-- ========================================================================\n\n")
            for line in emit_inserts(records, entities, type_map, dialect):
                fh.write(line + "\n")

            fh.write("\n-- ========================================================================\n")
            fh.write("-- VIEWS\n")
            fh.write("-- ========================================================================\n\n")
            for ve in views.values():
                sql = emit_create_view(ve, entities, dialect)
                if sql:
                    fh.write(view_sql_for_dialect(sql, dialect))
                    fh.write("\n")

            if dialect == "mysql":
                fh.write("\nSET FOREIGN_KEY_CHECKS=1;\n")
            elif dialect == "postgres":
                fh.write("\nSET session_replication_role = 'origin';\n")
            else:
                fh.write("\nSET REFERENTIAL_INTEGRITY TRUE;\n")

        size_mb = out_path.stat().st_size / (1024 * 1024)
        print(f"  wrote {out_path} ({size_mb:.2f} MB)")

if __name__ == "__main__":
    main()
