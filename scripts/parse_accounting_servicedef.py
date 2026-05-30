#!/usr/bin/env python3
"""Parse vendor accounting servicedef XML for the services AccountingController exposes.

For each service name we care about, capture:
  engine, invoke, default-entity-name, location/invoke(java), OUT attrs.
Cross-reference with scripts/accounting_routes.json (the 246 service methods).
"""
import re, json, glob, os, xml.etree.ElementTree as ET

SVCDEF = r"C:\Users\haiyangl\Landawn\ofbiz-abacus\apache-ofbiz-framework\applications\accounting\servicedef"
routes = json.load(open(r"C:\Users\haiyangl\Landawn\ofbiz-abacus\scripts\accounting_routes.json", encoding="utf-8"))
wanted = set(routes["svc"].keys())

found = {}
for path in glob.glob(os.path.join(SVCDEF, "services_*.xml")):
    txt = open(path, encoding="utf-8").read()
    # strip DOCTYPE to let ET parse
    txt = re.sub(r'<!DOCTYPE[^>]*>', '', txt)
    try:
        root = ET.fromstring(txt)
    except ET.ParseError as e:
        print("PARSE FAIL", os.path.basename(path), e)
        continue
    for svc in root.iter("service"):
        name = svc.get("name")
        if name not in wanted:
            continue
        outs = []
        for a in svc.iter("attribute"):
            if a.get("mode") in ("OUT", "INOUT"):
                outs.append(a.get("name"))
        auto_out = []
        for a in svc.iter("auto-attributes"):
            if a.get("mode") in ("OUT", "INOUT"):
                auto_out.append("pk" if a.get("include") == "pk" else a.get("include") or "all")
        found[name] = dict(
            engine=svc.get("engine"),
            invoke=svc.get("invoke"),
            entity=svc.get("default-entity-name"),
            location=svc.get("location"),
            file=os.path.basename(path),
            outs=outs,
            auto_out=auto_out,
        )

missing = sorted(wanted - set(found))
print("services matched in servicedef:", len(found), "/", len(wanted))
print("\n=== NOT FOUND in accounting servicedef (defined elsewhere / interface) ===", len(missing))
for m in missing:
    print(" ", m)

# group by engine+invoke
from collections import Counter
combo = Counter()
for n, d in found.items():
    combo[(d["engine"], d["invoke"] if d["engine"] == "entity-auto" else "")] += 1
print("\n=== engine/invoke combos ===")
for k, v in sorted(combo.items(), key=lambda x: -x[1]):
    print(f"  {k}: {v}")

# entity-auto breakdown (these get generated)
print("\n=== ENTITY-AUTO services (name | invoke | entity | outs) ===")
for n in sorted(found):
    d = found[n]
    if d["engine"] == "entity-auto":
        print(f"  {n} | {d['invoke']} | {d['entity']} | outs={d['outs']} auto_out={d['auto_out']}")

with open(r"C:\Users\haiyangl\Landawn\ofbiz-abacus\scripts\accounting_servicedef.json", "w", encoding="utf-8") as f:
    json.dump(found, f, indent=1)
print("\nwrote scripts/accounting_servicedef.json")
