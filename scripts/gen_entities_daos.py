#!/usr/bin/env python3
"""
Generate abacus-jdbc Entity + DAO classes from docs/db/MySQL.sql.

Mirrors the templates:
    src/main/java/com/landawn/ofbiz/entity/SampleSinglePKEntity.java
    src/main/java/com/landawn/ofbiz/entity/SampleCompositePKEntity.java
    src/main/java/com/landawn/ofbiz/dao/SampleSinglePKEntityDao.java
    src/main/java/com/landawn/ofbiz/dao/SampleCompositePKEntityDao.java

Also emits @JoinedBy fields for each FK and extends each FK-bearing DAO with
CrudJoinEntityHelper.

Usage:
    py scripts/gen_entities_daos.py --preview   # write 10 sample entities + DAOs to scripts/_preview/
    py scripts/gen_entities_daos.py             # generate full set into src/main/java/...
"""
from __future__ import annotations

import argparse
import re
import sys
from dataclasses import dataclass, field
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
MYSQL_SQL = ROOT / "docs" / "db" / "MySQL.sql"
ENTITY_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "entity"
DAO_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "dao"

# -----------------------------------------------------------------------------
# Model
# -----------------------------------------------------------------------------
@dataclass
class Column:
    name: str                 # raw SQL column name (UPPER_SNAKE)
    sql_type: str             # raw e.g. "VARCHAR(20)", "DECIMAL(18,2)", "LONGTEXT"
    not_null: bool

@dataclass
class Table:
    name: str                       # raw SQL table name (UPPER_SNAKE)
    columns: list[Column] = field(default_factory=list)
    pk: list[str] = field(default_factory=list)   # column names
    is_view: bool = False

@dataclass
class ForeignKey:
    local_table: str        # UPPER_SNAKE
    fk_name: str
    local_cols: list[str]   # UPPER_SNAKE
    ref_table: str          # UPPER_SNAKE
    ref_cols: list[str]     # UPPER_SNAKE

# -----------------------------------------------------------------------------
# SQL parsing
# -----------------------------------------------------------------------------
TABLE_RE = re.compile(
    r"CREATE TABLE IF NOT EXISTS `([A-Z0-9_]+)`\s*\((.*?)\)\s*ENGINE=InnoDB",
    re.DOTALL,
)
VIEW_RE = re.compile(
    r"CREATE OR REPLACE VIEW `([A-Z0-9_]+)` AS\s+SELECT (.*?)\s+FROM ",
    re.DOTALL,
)
COL_RE = re.compile(
    r"`([A-Z0-9_]+)`\s+([A-Z]+(?:\([0-9,]+\))?)(\s+NOT NULL)?",
    re.IGNORECASE,
)
PK_RE = re.compile(
    r"CONSTRAINT `PK_[A-Z0-9_]+` PRIMARY KEY \(([^)]+)\)"
)
VIEW_COL_RE = re.compile(
    r"AS `([A-Z0-9_]+)`"
)
FK_RE = re.compile(
    r"ALTER TABLE `([A-Z0-9_]+)` ADD CONSTRAINT `([A-Z0-9_]+)` "
    r"FOREIGN KEY \(([^)]+)\) REFERENCES `([A-Z0-9_]+)` \(([^)]+)\);"
)

def _split_col_list(s: str) -> list[str]:
    return [c.strip(" `") for c in s.split(",")]

def parse_mysql_sql(path: Path) -> tuple[list[Table], list[Table], list[ForeignKey]]:
    text = path.read_text(encoding="utf-8")

    tables: list[Table] = []
    for m in TABLE_RE.finditer(text):
        tname, body = m.group(1), m.group(2)
        t = Table(name=tname)
        for line in body.splitlines():
            line = line.strip().rstrip(",")
            if not line:
                continue
            if line.startswith("CONSTRAINT"):
                pkm = PK_RE.search(line)
                if pkm:
                    t.pk = _split_col_list(pkm.group(1))
                continue
            cm = COL_RE.match(line)
            if cm:
                t.columns.append(Column(
                    name=cm.group(1),
                    sql_type=cm.group(2).upper(),
                    not_null=bool(cm.group(3)),
                ))
        tables.append(t)

    views: list[Table] = []
    for m in VIEW_RE.finditer(text):
        vname, select_body = m.group(1), m.group(2)
        v = Table(name=vname, is_view=True)
        seen = set()
        for cm in VIEW_COL_RE.finditer(select_body):
            cname = cm.group(1)
            if cname in seen:
                continue
            seen.add(cname)
            v.columns.append(Column(name=cname, sql_type="__VIEW__", not_null=False))
        views.append(v)

    fks: list[ForeignKey] = []
    for m in FK_RE.finditer(text):
        fks.append(ForeignKey(
            local_table=m.group(1),
            fk_name=m.group(2),
            local_cols=_split_col_list(m.group(3)),
            ref_table=m.group(4),
            ref_cols=_split_col_list(m.group(5)),
        ))

    return tables, views, fks

def resolve_view_column_types(views: list[Table], tables: list[Table]) -> None:
    by_col: dict[str, Column] = {}
    for t in tables:
        for c in t.columns:
            by_col.setdefault(c.name, c)
    for v in views:
        for c in v.columns:
            if c.sql_type == "__VIEW__":
                ref = by_col.get(c.name)
                c.sql_type = ref.sql_type if ref else "VARCHAR(255)"

# -----------------------------------------------------------------------------
# Naming
# -----------------------------------------------------------------------------
def upper_snake_to_pascal(name: str) -> str:
    return "".join(p.capitalize() for p in name.split("_"))

def upper_snake_to_camel(name: str) -> str:
    parts = name.split("_")
    return parts[0].lower() + "".join(p.capitalize() for p in parts[1:])

def lower_first(s: str) -> str:
    return s[:1].lower() + s[1:] if s else s

def strip_id_marker(camel_col: str) -> str:
    """
    Strip "Id" from a camelCase column name to produce a join field name.
    Examples:
      partyIdFrom -> partyFrom
      partyIdTo   -> partyTo
      originGeoId -> originGeo
      productId   -> product
    """
    return re.sub(r"Id(?=[A-Z]|$)", "", camel_col)

# -----------------------------------------------------------------------------
# Type mapping (MySQL -> Java)
# -----------------------------------------------------------------------------
def java_type_for(col: Column, is_pk: bool) -> str:
    t = col.sql_type.upper()
    base = re.sub(r"\(.*\)$", "", t)

    if base in ("VARCHAR", "CHAR", "LONGTEXT", "TEXT", "MEDIUMTEXT", "TINYTEXT"):
        return "String"
    if base in ("DECIMAL", "NUMERIC"):
        return "double"
    if base in ("DATETIME", "TIMESTAMP"):
        return "java.sql.Timestamp"
    if base == "DATE":
        return "java.sql.Date"
    if base == "TIME":
        return "java.sql.Time"
    if base in ("INT", "INTEGER", "MEDIUMINT", "SMALLINT", "TINYINT"):
        return "Integer"
    if base == "BIGINT":
        return "Long"
    if base in ("DOUBLE", "FLOAT", "REAL"):
        return "Double"
    if base in ("LONGBLOB", "BLOB", "MEDIUMBLOB", "TINYBLOB", "BINARY", "VARBINARY"):
        return "byte[]"
    if base == "BIT":
        return "Boolean"
    return "String"

JAVA_LANG_IMPLICIT = {"String", "Integer", "Long", "Double", "Boolean", "Byte", "Short", "Float", "Character"}

def needs_import(java_type: str) -> str | None:
    if java_type in JAVA_LANG_IMPLICIT:
        return None
    if java_type in ("double", "long", "int", "boolean", "byte", "short", "float", "char"):
        return None
    if java_type == "byte[]":
        return None
    if java_type.startswith("java.lang."):
        return None
    if "." in java_type:
        return java_type
    return None

def short_name(java_type: str) -> str:
    return java_type.rsplit(".", 1)[-1] if "." in java_type else java_type

# -----------------------------------------------------------------------------
# Join field naming
# -----------------------------------------------------------------------------
@dataclass
class JoinField:
    fk: ForeignKey
    ref_entity: str           # PascalCase class name
    field_name: str           # camelCase final field name
    annotation_value: str     # contents inside @JoinedBy("...")

def compute_join_fields_for_table(
    table: Table,
    fks: list[ForeignKey],
    all_table_names: set[str],
) -> tuple[list[JoinField], int]:
    """
    Return (join_fields_in_declared_order, disambiguated_count).
    Skips FKs whose ref table doesn't exist in `all_table_names`.
    Avoids name collisions with existing column fields.
    """
    table_fks = [fk for fk in fks if fk.local_table == table.name and fk.ref_table in all_table_names]

    target_counts: dict[str, int] = {}
    for fk in table_fks:
        target_counts[fk.ref_table] = target_counts.get(fk.ref_table, 0) + 1

    # Pre-seed used_names with column field names so join fields never collide.
    used_names: set[str] = {upper_snake_to_camel(c.name) for c in table.columns}

    out: list[JoinField] = []
    disambiguated = 0

    for fk in table_fks:
        ref_entity = upper_snake_to_pascal(fk.ref_table)
        need_disambig = target_counts[fk.ref_table] > 1
        if need_disambig:
            base = strip_id_marker(upper_snake_to_camel(fk.local_cols[0]))
            disambiguated += 1
        else:
            base = lower_first(ref_entity)

        # Ensure uniqueness; if `base` collides (with another join field OR with a column),
        # append "Ref" when base already ends with the entity name (to avoid `XxxUserLoginUserLogin`),
        # otherwise append the entity name. Then numeric suffix as last resort.
        name = base
        if name in used_names:
            candidate = (base + "Ref") if base.endswith(ref_entity) else (base + ref_entity)
            name = candidate
            n = 2
            while name in used_names:
                name = f"{candidate}{n}"
                n += 1
        used_names.add(name)

        # Build annotation value: "localCol1=RefEntity.refCol1, localCol2=RefEntity.refCol2"
        pairs = []
        for lc, rc in zip(fk.local_cols, fk.ref_cols):
            pairs.append(f"{upper_snake_to_camel(lc)}={ref_entity}.{upper_snake_to_camel(rc)}")
        annot = ", ".join(pairs)

        out.append(JoinField(
            fk=fk,
            ref_entity=ref_entity,
            field_name=name,
            annotation_value=annot,
        ))
    return out, disambiguated

# -----------------------------------------------------------------------------
# Rendering — Entity
# -----------------------------------------------------------------------------
ENTITY_TEMPLATE_BODY = '''\
package com.landawn.ofbiz.entity;

{imports}

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "{table_name_lower}")
public class {ClassName} {{
{fields}
}}
'''

def render_entity(t: Table, join_fields: list[JoinField]) -> str:
    class_name = upper_snake_to_pascal(t.name)
    is_view = t.is_view
    pk_set = set(t.pk)
    needs_id = False
    needs_readonly = False
    field_lines: list[str] = []
    type_imports: set[str] = set()

    for c in t.columns:
        is_pk = c.name in pk_set
        jt = java_type_for(c, is_pk=is_pk)
        imp = needs_import(jt)
        if imp:
            type_imports.add(imp)
        st = short_name(jt)

        annot_lines = []
        if is_view:
            annot_lines.append("    @ReadOnly")
            needs_readonly = True
        else:
            if is_pk:
                annot_lines.append("    @Id")
                needs_id = True
        annot_lines.append(f'    @Column(name = "{c.name.lower()}")')

        java_field_type = st
        if st == "double":
            pass
        elif is_pk and len(t.pk) == 1 and c.not_null and st in ("Integer", "Long", "Double"):
            java_field_type = {"Integer": "int", "Long": "long", "Double": "double"}[st]

        field_lines.append("\n".join(annot_lines) + f"\n    private {java_field_type} {upper_snake_to_camel(c.name)};")

    # Append @JoinedBy fields after all @Column fields
    has_joined = bool(join_fields)
    for jf in join_fields:
        block = (
            f'    @JoinedBy("{jf.annotation_value}")\n'
            f'    @ToString.Exclude\n'
            f'    @EqualsAndHashCode.Exclude\n'
            f'    private {jf.ref_entity} {jf.field_name};'
        )
        field_lines.append(block)

    # Abacus imports
    abacus_imports: list[str] = ["import com.landawn.abacus.annotation.Column;"]
    if needs_id:
        abacus_imports.append("import com.landawn.abacus.annotation.Id;")
    if has_joined:
        abacus_imports.append("import com.landawn.abacus.annotation.JoinedBy;")
    if needs_readonly:
        abacus_imports.append("import com.landawn.abacus.annotation.ReadOnly;")
    abacus_imports.append("import com.landawn.abacus.annotation.Table;")
    abacus_imports.sort()

    other_imports = sorted({f"import {i};" for i in type_imports if not i.startswith("java.lang.")})

    lombok_set = {
        "import lombok.AllArgsConstructor;",
        "import lombok.Builder;",
        "import lombok.Data;",
        "import lombok.NoArgsConstructor;",
    }
    if has_joined:
        lombok_set.add("import lombok.EqualsAndHashCode;")
        lombok_set.add("import lombok.ToString;")
    lombok_imports = sorted(lombok_set)

    import_blocks = ["\n".join(abacus_imports)]
    if other_imports:
        import_blocks.append("\n".join(other_imports))
    import_blocks.append("\n".join(lombok_imports))
    imports_str = "\n\n".join(import_blocks)

    return ENTITY_TEMPLATE_BODY.format(
        imports=imports_str,
        table_name_lower=t.name.lower(),
        ClassName=class_name,
        fields="\n\n".join(field_lines),
    )

# -----------------------------------------------------------------------------
# Rendering — DAO
# -----------------------------------------------------------------------------
DAO_LICENSE = '''\
/*
 * Copyright (C) 2024 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
'''

def boxed(j: str) -> str:
    return {"long": "Long", "int": "Integer", "double": "Double",
            "boolean": "Boolean", "float": "Float", "short": "Short", "byte": "Byte"}.get(j, j)

def render_dao(t: Table, has_fks: bool) -> str:
    class_name = upper_snake_to_pascal(t.name)
    dao_name = class_name + "Dao"
    id_import_block = ""

    if t.is_view or not t.pk:
        id_type = class_name
    elif len(t.pk) == 1:
        pk_col = next(c for c in t.columns if c.name == t.pk[0])
        jt = java_type_for(pk_col, is_pk=True)
        st = short_name(jt)
        id_type = boxed(st)
        if "." in jt and not jt.startswith("java.lang."):
            id_import_block = f"import {jt};\n"
    else:
        id_type = class_name

    abacus_jdbc_imports = ["import com.landawn.abacus.jdbc.dao.CrudDao;"]
    if has_fks:
        abacus_jdbc_imports.append("import com.landawn.abacus.jdbc.dao.CrudJoinEntityHelper;")
    abacus_jdbc_imports.sort()
    abacus_jdbc_block = "\n".join(abacus_jdbc_imports) + "\n"

    if has_fks:
        extends_clause = (
            f"CrudDao<{class_name}, {id_type}, SqlBuilder.PSC, {dao_name}>, "
            f"CrudJoinEntityHelper<{class_name}, {id_type}, SqlBuilder.PSC, {dao_name}>"
        )
    else:
        extends_clause = f"CrudDao<{class_name}, {id_type}, SqlBuilder.PSC, {dao_name}>"

    body = (
        f"{DAO_LICENSE}"
        f"package com.landawn.ofbiz.dao;\n\n"
        f"{abacus_jdbc_block}"
        f"import com.landawn.abacus.query.SqlBuilder;\n"
        f"{id_import_block}"
        f"import com.landawn.ofbiz.entity.{class_name};\n\n"
        f"public interface {dao_name} extends {extends_clause} {{\n"
        f"}}\n"
    )
    return body

# -----------------------------------------------------------------------------
# Main
# -----------------------------------------------------------------------------
def pick_samples(tables: list[Table], views: list[Table]) -> list[Table]:
    out: list[Table] = []
    name_to_t = {t.name: t for t in tables}
    name_to_v = {v.name: v for v in views}

    for name in ("DATA_SOURCE", "DATA_RESOURCE", "PARTY_RELATIONSHIP", "PRODUCT", "ORDER_ITEM"):
        if name in name_to_t and name_to_t[name] not in out:
            out.append(name_to_t[name])
    composite = next((t for t in tables if len(t.pk) >= 2 and t not in out), None)
    if composite:
        out.append(composite)
    if views:
        out.append(views[0])
    big_view = max(views, key=lambda v: len(v.columns)) if views else None
    if big_view and big_view not in out:
        out.append(big_view)
    for t in tables:
        if len(out) >= 10:
            break
        if t not in out:
            out.append(t)
    return out[:10]

def main() -> None:
    ap = argparse.ArgumentParser()
    ap.add_argument("--preview", action="store_true",
                    help="Write 10 sample entities + DAOs to scripts/_preview/ instead of full output")
    args = ap.parse_args()

    print(f"Parsing {MYSQL_SQL} ...")
    tables, views, fks = parse_mysql_sql(MYSQL_SQL)
    resolve_view_column_types(views, tables)

    all_table_names = {t.name for t in tables}
    print(f"  tables: {len(tables)}  views: {len(views)}  FKs: {len(fks)}")
    print(f"  single-PK: {sum(1 for t in tables if len(t.pk) == 1)}  "
          f"composite-PK: {sum(1 for t in tables if len(t.pk) >= 2)}  "
          f"no-PK: {sum(1 for t in tables if not t.pk)}")

    # Pre-compute join fields per table
    join_fields_by_table: dict[str, list[JoinField]] = {}
    disambig_total = 0
    for t in tables:
        jfs, dcount = compute_join_fields_for_table(t, fks, all_table_names)
        join_fields_by_table[t.name] = jfs
        disambig_total += dcount

    fk_bearing_tables = sum(1 for t in tables if join_fields_by_table[t.name])
    fk_fields_total = sum(len(v) for v in join_fields_by_table.values())
    print(f"  FK-bearing entities: {fk_bearing_tables}  "
          f"@JoinedBy fields emitted: {fk_fields_total}  "
          f"disambiguated names: {disambig_total}")

    def jfs_for(t: Table) -> list[JoinField]:
        return [] if t.is_view else join_fields_by_table.get(t.name, [])

    if args.preview:
        out_dir = ROOT / "scripts" / "_preview"
        ent_dir = out_dir / "entity"
        dao_dir = out_dir / "dao"
        ent_dir.mkdir(parents=True, exist_ok=True)
        dao_dir.mkdir(parents=True, exist_ok=True)
        samples = pick_samples(tables, views)
        for t in samples:
            jfs = jfs_for(t)
            (ent_dir / f"{upper_snake_to_pascal(t.name)}.java").write_text(
                render_entity(t, jfs), encoding="utf-8")
            (dao_dir / f"{upper_snake_to_pascal(t.name)}Dao.java").write_text(
                render_dao(t, has_fks=bool(jfs)), encoding="utf-8")
        print(f"Wrote {len(samples)} sample entities to {ent_dir}")
        print(f"Wrote {len(samples)} sample DAOs to {dao_dir}")
        print("Picked:", [t.name for t in samples])
        return

    ENTITY_DIR.mkdir(parents=True, exist_ok=True)
    DAO_DIR.mkdir(parents=True, exist_ok=True)
    all_things = tables + views
    daos_with_helper = 0
    for t in all_things:
        jfs = jfs_for(t)
        (ENTITY_DIR / f"{upper_snake_to_pascal(t.name)}.java").write_text(
            render_entity(t, jfs), encoding="utf-8")
        has_fks = bool(jfs)
        if has_fks:
            daos_with_helper += 1
        (DAO_DIR / f"{upper_snake_to_pascal(t.name)}Dao.java").write_text(
            render_dao(t, has_fks=has_fks), encoding="utf-8")
    print(f"Wrote {len(all_things)} entities to {ENTITY_DIR}")
    print(f"Wrote {len(all_things)} DAOs to {DAO_DIR}")
    print(f"  DAOs with CrudJoinEntityHelper: {daos_with_helper}")

if __name__ == "__main__":
    main()
