-- Baseline schema for the ofbiz-abacus rewrite.
-- Real OFBiz entitymodel.xml ports will be introduced in later migrations
-- (V2__party.sql, V3__security.sql, ...). Keep this file empty of DDL
-- so JPA `ddl-auto: validate` is satisfied against a blank schema until
-- the first real entity lands.

SELECT 1;
