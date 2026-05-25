# ofbiz-abacus

Apache OFBiz data model rewritten on **Spring Boot** with **abacus-jdbc** as the
persistence layer.

The original Apache OFBiz framework ships a rich, battle-tested ERP/e-commerce
data model (~850 entities across Party, Product, Order, Accounting, Content,
HumanRes, Manufacturing, Marketing, WorkEffort, Shipment, etc.) but is tightly
coupled to its own Groovy/MiniLang stack. This project lifts only the data
model out of OFBiz and projects it onto a modern Java stack:

- **Spring Boot** for application bootstrap, configuration, and DI
- **abacus-jdbc** for typed entities + DAOs (no JPA)
- **Flyway** for schema migration
- **H2 / MySQL / PostgreSQL** as supported target databases

Everything DB-facing in `src/main/java/com/landawn/ofbiz/{entity,dao}/` and
`docs/db/*.sql` is **generated** from the upstream OFBiz XML descriptors —
re-runnable any time the upstream model changes.

## Layout

```
apache-ofbiz-framework/   Vendored Apache OFBiz source — read-only input
docs/db/                  Generated DDL: H2.sql, MySQL.sql, PostgreSQL.sql
scripts/                  Python generators (gen_ofbiz_sql.py, gen_entities_daos.py)
src/main/java/
  com/landawn/ofbiz/
    entity/               Generated entity classes (1 per table + 1 per view)
    dao/                  Generated DAO interfaces extending CrudDao /
                          CrudJoinEntityHelper
```

## Generation pipeline

```
apache-ofbiz-framework/**/*entitymodel*.xml
apache-ofbiz-framework/**/*SeedData*.xml         ──┐
apache-ofbiz-framework/framework/entity/             scripts/gen_ofbiz_sql.py
  fieldtype/fieldtype{h2,mysql,postgres}.xml     ──┘          │
                                                              ▼
                                          docs/db/{H2,MySQL,PostgreSQL}.sql
                                                              │
                                                              ▼
                                                scripts/gen_entities_daos.py
                                                              │
                                                              ▼
                                          src/main/java/com/landawn/ofbiz/
                                            entity/*.java   (≈1,117 files)
                                            dao/*.java      (≈1,117 files)
```

Re-run after upstream changes:
```sh
py scripts/gen_ofbiz_sql.py
py scripts/gen_entities_daos.py
```

## Generated artifacts at a glance

| Asset | Count | Source |
|---|---|---|
| Tables (`CREATE TABLE`) | 856 | OFBiz `<entity>` |
| Views (`CREATE VIEW`) | 261 | OFBiz `<view-entity>` |
| Foreign keys | 1,941 | OFBiz `<relation type="one">` |
| Seed-data INSERTs | ~8,700 | OFBiz `*SeedData.xml`, `*Data.xml` |
| Entity classes | 1,117 | one per table + view |
| DAO interfaces | 1,117 | one per entity |
| DAOs with `CrudJoinEntityHelper` | 731 | entities with at least one FK |

## Conventions

- Identifier mapping: OFBiz `camelCase` ↔ SQL `UPPER_SNAKE_CASE` ↔ Java
  `camelCase` (matches `ModelEntity.makeColName`).
- Type mapping (MySQL → Java): `VARCHAR/CHAR/TEXT` → `String`,
  `DECIMAL` → `double`, `DATETIME/TIMESTAMP` → `java.sql.Timestamp`,
  `DATE` → `java.sql.Date`, `TIME` → `java.sql.Time`,
  `LONGBLOB` → `byte[]`.
- Entity templates live under `src/main/java/com/landawn/ofbiz/{entity,dao}/`
  as `SampleSinglePKEntity*` / `SampleCompositePKEntity*` — the generator
  mirrors their exact annotation and import style and never overwrites them.

## Status

This is a data-model migration project, not a port of OFBiz application
logic. Business services, screens, and workflows are out of scope.
