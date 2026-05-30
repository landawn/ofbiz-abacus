#!/usr/bin/env python3
"""Build the complete per-method porting spec for AccountingService.

Combines:
  - scripts/accounting_routes.json   (method -> req/resp types, binding, isMap)
  - scripts/accounting_servicedef.json (method -> engine/invoke/entity/outs)
  - entity introspection              (PK fields per entity, via @Id scan)
  - DAO availability                  (dao class file present?)
  - DaoConfig wiring                  (which DAOs already @Bean)
  - existing AccountingService create logic (seq-gen field, fromDate default)

Writes scripts/accounting_spec.json and prints a human summary.
"""
import re, json, os

ROOT = r"C:\Users\haiyangl\Landawn\ofbiz-abacus"
SRC = os.path.join(ROOT, "src", "main", "java", "com", "landawn", "ofbiz")
ENT = os.path.join(SRC, "entity")
DAO = os.path.join(SRC, "dao")

routes = json.load(open(os.path.join(ROOT, "scripts", "accounting_routes.json"), encoding="utf-8"))
sdef = json.load(open(os.path.join(ROOT, "scripts", "accounting_servicedef.json"), encoding="utf-8"))
svc_src = open(os.path.join(SRC, "service", "AccountingService.java"), encoding="utf-8").read()
daoconfig = open(os.path.join(SRC, "config", "DaoConfig.java"), encoding="utf-8").read()

def camel(name):
    return name[0].lower() + name[1:]

def entity_pks(entity):
    """Return list of PK field names for an entity by scanning @Id annotations."""
    path = os.path.join(ENT, entity + ".java")
    if not os.path.exists(path):
        return None  # entity class missing
    txt = open(path, encoding="utf-8").read()
    pks = []
    # find @Id ... private <Type> <field>;  (allow @Column etc. between)
    for m in re.finditer(r'@Id\b(.*?)private\s+\w[\w<>.]*\s+(\w+)\s*;', txt, re.S):
        # ensure no other 'private' field declaration sits between @Id and the captured one
        between = m.group(1)
        if 'private ' in between:
            # @Id applied to a field further down; take the first private after @Id
            fm = re.search(r'private\s+\w[\w<>.]*\s+(\w+)\s*;', between)
            if fm:
                pks.append(fm.group(1))
                continue
        pks.append(m.group(2))
    return pks

def pk_type(entity, field):
    path = os.path.join(ENT, entity + ".java")
    txt = open(path, encoding="utf-8").read()
    m = re.search(r'private\s+(\w[\w<>.]*)\s+' + re.escape(field) + r'\s*;', txt)
    return m.group(1) if m else "String"

# existing create-method logic: seq field + fromDate default
existing_create = {}
for m in re.finditer(r'public Map<String, Object> (create\w+|copy\w+|add\w+)\(Map<String, Object> body\)[^{]*\{(.*?)\n    \}|public Map<String, Object> (create\w+|copy\w+|add\w+)\(Map<String, Object> body\)[^{]*\{([^\n]*)\}', svc_src):
    name = m.group(1) or m.group(3)
    body = m.group(2) or m.group(4) or ""
    seq = re.search(r'if \(Strings\.isEmpty\(e\.get(\w+)\(\)\)\) e\.set\w+\(SequenceUtil\.next\(\)\)', body)
    fromdate = 'e.setFromDate(nowTs())' in body
    existing_create[name] = dict(seqField=(camel(seq.group(1)) if seq else None),
                                 fromDate=fromdate,
                                 raw=body.strip())

# wired DAOs in DaoConfig (handles both `XxxDao.class` and FQN `a.b.c.XxxDao.class`)
wired = set(re.findall(r'createDao\(\s*(?:[\w.]+\.)?(\w+)\.class', daoconfig))
# @Autowired DAO fields already in AccountingService
autowired = set(re.findall(r'@Autowired private (\w+) (\w+);', svc_src))

spec = {}
entities_needed = {}
for name, route in routes["svc"].items():
    d = sdef.get(name, {})
    engine = d.get("engine")
    invoke = d.get("invoke")
    entity = d.get("entity")
    is_map = "MAP" in route["resp_types"]
    binding = route["bindings"]
    req_type = [t for t in route["req_types"] if t != "Map"]
    req_type = req_type[0] if req_type else None
    resp_type = [t for t in route["resp_types"] if t != "MAP"]
    resp_type = resp_type[0] if resp_type else None
    rec = dict(engine=engine, invoke=invoke, entity=entity, is_map=is_map,
               binding=binding, req_type=req_type, resp_type=resp_type,
               outs=d.get("outs", []))
    if engine == "entity-auto" and entity:
        dao_var = camel(entity) + "Dao"
        dao_cls = entity + "Dao"
        dao_exists = os.path.exists(os.path.join(DAO, dao_cls + ".java"))
        pks = entity_pks(entity)
        rec.update(dao_var=dao_var, dao_cls=dao_cls, dao_exists=dao_exists,
                   dao_wired=(dao_cls in wired), pks=pks,
                   composite=(pks is not None and len(pks) > 1))
        if pks:
            rec["pk_types"] = {p: pk_type(entity, p) for p in pks}
        if name in existing_create:
            rec["seqField"] = existing_create[name]["seqField"]
            rec["fromDate"] = existing_create[name]["fromDate"]
        entities_needed[entity] = dict(dao_cls=dao_cls, dao_exists=dao_exists,
                                       dao_wired=(dao_cls in wired), pks=pks)
    spec[name] = rec

json.dump(spec, open(os.path.join(ROOT, "scripts", "accounting_spec.json"), "w", encoding="utf-8"), indent=1)

# ---- summaries ----
print("=== entity-auto entities needing DAO wiring (exists but NOT wired) ===")
need_wire = sorted({e: v for e, v in entities_needed.items()
                    if v["dao_exists"] and not v["dao_wired"]}.items())
for e, v in need_wire:
    print(f"  {v['dao_cls']}  pks={v['pks']}")
print("  TOTAL:", len(need_wire))

print("\n=== entity-auto entities whose DAO CLASS is MISSING ===")
for e, v in sorted(entities_needed.items()):
    if not v["dao_exists"]:
        print(f"  {e} -> {v['dao_cls']} (no dao class)")

print("\n=== composite-PK entity-auto services ===")
for n in sorted(spec):
    r = spec[n]
    if r.get("composite"):
        print(f"  {n} | {r['invoke']} | {r['entity']} | pks={r['pks']}")

print("\n=== entity-auto with NO pk detected (entity class missing or no @Id) ===")
for n in sorted(spec):
    r = spec[n]
    if r["engine"] == "entity-auto" and not r.get("pks"):
        print(f"  {n} | {r['entity']} | dao_exists={r.get('dao_exists')}")

print("\n=== complex (java/simple/groovy/group) services count by engine ===")
from collections import Counter
c = Counter(spec[n]["engine"] for n in spec if spec[n]["engine"] not in ("entity-auto", None))
print(" ", dict(c))
print("\nwrote scripts/accounting_spec.json")
