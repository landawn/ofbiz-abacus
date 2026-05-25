#!/usr/bin/env python3
"""
Generate abacus-jdbc Entity + DAO classes from docs/db/MySQL.sql.

Mirrors the templates:
    src/main/java/com/landawn/ofbiz/entity/SampleSinglePKEntity.java
    src/main/java/com/landawn/ofbiz/entity/SampleCompositePKEntity.java
    src/main/java/com/landawn/ofbiz/dao/SampleSinglePKEntityDao.java
    src/main/java/com/landawn/ofbiz/dao/SampleCompositePKEntityDao.java

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

def parse_mysql_sql(path: Path) -> tuple[list[Table], list[Table]]:
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
                    cols = [c.strip(" `") for c in pkm.group(1).split(",")]
                    t.pk = cols
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
            # View columns have no declared SQL type in the CREATE VIEW; default to VARCHAR(255).
            # We can't know without resolving the underlying table column. Use a sentinel for fallback.
            v.columns.append(Column(name=cname, sql_type="__VIEW__", not_null=False))
        views.append(v)

    return tables, views

def resolve_view_column_types(views: list[Table], tables: list[Table]) -> None:
    """For each view column, search for a same-named column in any table and copy its type."""
    by_col: dict[str, Column] = {}
    for t in tables:
        for c in t.columns:
            by_col.setdefault(c.name, c)
    for v in views:
        for c in v.columns:
            if c.sql_type == "__VIEW__":
                ref = by_col.get(c.name)
                if ref:
                    c.sql_type = ref.sql_type
                else:
                    c.sql_type = "VARCHAR(255)"  # last-resort fallback

# -----------------------------------------------------------------------------
# Naming
# -----------------------------------------------------------------------------
def upper_snake_to_pascal(name: str) -> str:
    return "".join(p.capitalize() for p in name.split("_"))

def upper_snake_to_camel(name: str) -> str:
    parts = name.split("_")
    return parts[0].lower() + "".join(p.capitalize() for p in parts[1:])

def upper_snake_to_lower_snake(name: str) -> str:
    return name.lower()

# -----------------------------------------------------------------------------
# Type mapping (MySQL -> Java)
# -----------------------------------------------------------------------------
def java_type_for(col: Column, is_pk: bool) -> str:
    """Return Java type string. For NOT NULL numeric PK we may use primitive (sample uses `long`)."""
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
    return "String"  # safe fallback

JAVA_LANG_IMPLICIT = {"String", "Integer", "Long", "Double", "Boolean", "Byte", "Short", "Float", "Character"}

def needs_import(java_type: str) -> str | None:
    """Return the import string needed for this Java type, or None if implicit/primitive/array."""
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

def render_entity(t: Table) -> str:
    class_name = upper_snake_to_pascal(t.name)
    is_view = t.is_view
    pk_set = set(t.pk)
    needs_id = False
    needs_readonly_id = False
    needs_readonly = False
    needs_non_updatable = False
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
            # Views: read-only; no PK in OFBiz views, mark every field @ReadOnly
            annot_lines.append("    @ReadOnly")
            needs_readonly = True
        else:
            if is_pk:
                # OFBiz PKs are application-supplied (not DB-auto-generated),
                # so use @Id for both single and composite PK fields.
                annot_lines.append("    @Id")
                needs_id = True
        annot_lines.append(f'    @Column(name = "{c.name.lower()}")')

        # primitive for NOT NULL single-PK numeric (sample uses `long id`)
        # AND for DECIMAL (user rule: double primitive)
        java_field_type = st
        if st == "double":
            pass  # already primitive
        elif is_pk and len(t.pk) == 1 and c.not_null and st in ("Integer", "Long", "Double"):
            java_field_type = {"Integer": "int", "Long": "long", "Double": "double"}[st]

        field_lines.append("\n".join(annot_lines) + f"\n    private {java_field_type} {upper_snake_to_camel(c.name)};")

    # Build imports
    abacus_imports: list[str] = []
    abacus_imports.append("import com.landawn.abacus.annotation.Column;")
    if needs_id:
        abacus_imports.append("import com.landawn.abacus.annotation.Id;")
    if needs_readonly:
        abacus_imports.append("import com.landawn.abacus.annotation.ReadOnly;")
    if needs_readonly_id:
        abacus_imports.append("import com.landawn.abacus.annotation.ReadOnlyId;")
    abacus_imports.append("import com.landawn.abacus.annotation.Table;")
    abacus_imports.sort()

    other_imports = sorted({f"import {i};" for i in type_imports if not i.startswith("java.lang.")})

    lombok_imports = [
        "import lombok.AllArgsConstructor;",
        "import lombok.Builder;",
        "import lombok.Data;",
        "import lombok.NoArgsConstructor;",
    ]

    import_blocks = ["\n".join(abacus_imports)]
    if other_imports:
        import_blocks.append("\n".join(other_imports))
    import_blocks.append("\n".join(lombok_imports))
    imports_str = "\n\n".join(import_blocks)

    body = ENTITY_TEMPLATE_BODY.format(
        imports=imports_str,
        table_name_lower=t.name.lower(),
        ClassName=class_name,
        fields="\n\n".join(field_lines),
    )
    return body

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

def render_dao(t: Table) -> str:
    class_name = upper_snake_to_pascal(t.name)
    dao_name = class_name + "Dao"
    if t.is_view or not t.pk:
        # No PK → mirror composite sample: use entity itself as ID type
        id_type = class_name
        id_import_block = ""  # entity class already imported
    elif len(t.pk) == 1:
        pk_col = next(c for c in t.columns if c.name == t.pk[0])
        jt = java_type_for(pk_col, is_pk=True)
        st = short_name(jt)
        # box: sample uses Long for `long` PK
        id_type = boxed(st)
        id_import_block = ""
        # if type is java.sql.* we need import
        if "." in jt and not jt.startswith("java.lang."):
            id_import_block = f"import {jt};\n"
    else:
        # composite PK: use entity itself as ID type, per sample
        id_type = class_name
        id_import_block = ""

    body = (
        f"{DAO_LICENSE}"
        f"package com.landawn.ofbiz.dao;\n\n"
        f"import com.landawn.abacus.jdbc.dao.CrudDao;\n"
        f"import com.landawn.abacus.query.SqlBuilder;\n"
        f"{id_import_block}"
        f"import com.landawn.ofbiz.entity.{class_name};\n\n"
        f"public interface {dao_name} extends CrudDao<{class_name}, {id_type}, SqlBuilder.PSC, {dao_name}> {{\n"
        f"}}\n"
    )
    return body

# -----------------------------------------------------------------------------
# Main
# -----------------------------------------------------------------------------
def pick_samples(tables: list[Table], views: list[Table]) -> list[Table]:
    """Pick 10 representative tables and views."""
    out: list[Table] = []
    # 1) a tiny single-PK string table
    out.append(next(t for t in tables if t.name == "DATA_SOURCE_TYPE"))
    # 2) catalina session (single PK + binary + numeric)
    out.append(next(t for t in tables if t.name == "CATALINA_SESSION"))
    # 3) Product (common big single-PK table) if exists
    out.append(next((t for t in tables if t.name == "PRODUCT"), tables[0]))
    # 4) Composite PK table — pick the first one with len(pk) >= 2
    composite = next((t for t in tables if len(t.pk) >= 2), None)
    if composite: out.append(composite)
    # 5) Composite PK with date-time
    composite_dt = next((t for t in tables if len(t.pk) >= 2 and any(c.sql_type.startswith("DATETIME") for c in t.columns)), None)
    if composite_dt and composite_dt not in out: out.append(composite_dt)
    # 6) A table with DECIMAL columns
    dec = next((t for t in tables if any(c.sql_type.startswith("DECIMAL") for c in t.columns) and t not in out), None)
    if dec: out.append(dec)
    # 7) A table with TEXT/LONGTEXT
    lt = next((t for t in tables if any(c.sql_type in ("LONGTEXT", "TEXT") for c in t.columns) and t not in out), None)
    if lt: out.append(lt)
    # 8) A table with no PK (rare)
    no_pk = next((t for t in tables if not t.pk and t not in out), None)
    if no_pk: out.append(no_pk)
    # 9) A view
    if views: out.append(views[0])
    # 10) A view with many columns
    if len(views) > 1:
        big_view = max(views, key=lambda v: len(v.columns))
        if big_view not in out:
            out.append(big_view)
    # Fill up if still short
    for t in tables:
        if len(out) >= 10: break
        if t not in out:
            out.append(t)
    return out[:10]

def main() -> None:
    ap = argparse.ArgumentParser()
    ap.add_argument("--preview", action="store_true",
                    help="Write 10 sample entities + DAOs to scripts/_preview/ instead of full output")
    args = ap.parse_args()

    print(f"Parsing {MYSQL_SQL} ...")
    tables, views = parse_mysql_sql(MYSQL_SQL)
    resolve_view_column_types(views, tables)
    print(f"  tables: {len(tables)}  views: {len(views)}")
    print(f"  single-PK: {sum(1 for t in tables if len(t.pk) == 1)}  "
          f"composite-PK: {sum(1 for t in tables if len(t.pk) >= 2)}  "
          f"no-PK: {sum(1 for t in tables if not t.pk)}")

    if args.preview:
        out_dir = ROOT / "scripts" / "_preview"
        ent_dir = out_dir / "entity"
        dao_dir = out_dir / "dao"
        ent_dir.mkdir(parents=True, exist_ok=True)
        dao_dir.mkdir(parents=True, exist_ok=True)
        samples = pick_samples(tables, views)
        for t in samples:
            (ent_dir / f"{upper_snake_to_pascal(t.name)}.java").write_text(render_entity(t), encoding="utf-8")
            (dao_dir / f"{upper_snake_to_pascal(t.name)}Dao.java").write_text(render_dao(t), encoding="utf-8")
        print(f"Wrote {len(samples)} sample entities to {ent_dir}")
        print(f"Wrote {len(samples)} sample DAOs to {dao_dir}")
        print("Picked:", [t.name for t in samples])
        return

    # Full generation
    ENTITY_DIR.mkdir(parents=True, exist_ok=True)
    DAO_DIR.mkdir(parents=True, exist_ok=True)
    all_things = tables + views
    for t in all_things:
        (ENTITY_DIR / f"{upper_snake_to_pascal(t.name)}.java").write_text(render_entity(t), encoding="utf-8")
        (DAO_DIR / f"{upper_snake_to_pascal(t.name)}Dao.java").write_text(render_dao(t), encoding="utf-8")
    print(f"Wrote {len(all_things)} entities to {ENTITY_DIR}")
    print(f"Wrote {len(all_things)} DAOs to {DAO_DIR}")

if __name__ == "__main__":
    main()
