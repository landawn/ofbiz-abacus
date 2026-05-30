#!/usr/bin/env python3
"""Parse AccountingController.java into a routing spec table.

Emits, per controller endpoint:
  http_verb, mapping_path, controller_method, service_method,
  request_type, response_type (or MAP), request_binding (BODY/PARAM/NONE)

Also emits a de-duplicated service-method -> (request_type, response_type) table,
since several endpoints share one service method.
"""
import re, json, sys, collections

CTRL = r"C:\Users\haiyangl\Landawn\ofbiz-abacus\src\main\java\com\landawn\ofbiz\controller\AccountingController.java"

src = open(CTRL, encoding="utf-8").read()

# Split into endpoint blocks: each starts at a @GetMapping/@PostMapping line.
mapping_re = re.compile(r'@(Get|Post)Mapping\("([^"]+)"\)')
# greedy (.+) so nested generics like Map<String, Object> are captured whole
method_sig_re = re.compile(
    r'public\s+ResponseEntity<(.+)>\s+(\w+)\(([^)]*)\)')
service_call_re = re.compile(r'service\.(\w+)\(')

lines = src.splitlines()
endpoints = []
i = 0
while i < len(lines):
    m = mapping_re.search(lines[i])
    if not m:
        i += 1
        continue
    verb = m.group(1).upper()
    path = m.group(2)
    # find the method signature on the next few lines
    sig = None
    j = i + 1
    while j < min(i + 4, len(lines)):
        sm = method_sig_re.search(lines[j])
        if sm:
            sig = sm
            break
        j += 1
    if not sig:
        i += 1
        continue
    resp_type = sig.group(1).strip()
    ctrl_method = sig.group(2)
    params = sig.group(3)
    # request binding + type
    if "@RequestBody" in params:
        binding = "BODY"
        rt = re.search(r'@RequestBody\s+(\w+)\s+\w+', params)
        req_type = rt.group(1) if rt else "?"
    elif "@RequestParam" in params:
        binding = "PARAM"
        req_type = "Map"
    else:
        binding = "NONE"
        req_type = "?"
    # find the service.<method>( call within this block
    svc_method = None
    k = j
    while k < min(j + 6, len(lines)):
        cm = service_call_re.search(lines[k])
        if cm:
            svc_method = cm.group(1)
            break
        k += 1
    is_map_resp = resp_type.startswith("Map")
    endpoints.append(dict(verb=verb, path=path, ctrl_method=ctrl_method,
                          svc_method=svc_method, req_type=req_type,
                          resp_type="MAP" if is_map_resp else resp_type,
                          binding=binding))
    i = j + 1

# de-dup service method -> spec
svc = {}
for e in endpoints:
    sm = e["svc_method"]
    if sm is None:
        continue
    cur = svc.setdefault(sm, dict(req_types=set(), resp_types=set(),
                                  bindings=set(), n=0))
    cur["req_types"].add(e["req_type"])
    cur["resp_types"].add(e["resp_type"])
    cur["bindings"].add(e["binding"])
    cur["n"] += 1

print("=== TOTAL ENDPOINTS:", len(endpoints), " DISTINCT SERVICE METHODS:", len(svc))
print()
print("=== SERVICE METHODS (name | reqTypes | respTypes | bindings | #endpoints) ===")
for name in sorted(svc):
    s = svc[name]
    print(f"{name} | {','.join(sorted(s['req_types']))} | {','.join(sorted(s['resp_types']))} | {','.join(sorted(s['bindings']))} | {s['n']}")

# methods whose response is MAP (no typed DTO) or have ambiguous req types
print()
print("=== MAP-RESPONSE service methods ===")
for name in sorted(svc):
    if "MAP" in svc[name]["resp_types"]:
        print(name)
print()
print("=== PARAM/NONE-binding service methods (GET/no body) ===")
for name in sorted(svc):
    if svc[name]["bindings"] - {"BODY"}:
        print(name, sorted(svc[name]["bindings"]))

# dump full json for downstream tooling
with open(r"C:\Users\haiyangl\Landawn\ofbiz-abacus\scripts\accounting_routes.json", "w", encoding="utf-8") as f:
    json.dump(dict(endpoints=endpoints,
                   svc={k: dict(req_types=sorted(v["req_types"]),
                                resp_types=sorted(v["resp_types"]),
                                bindings=sorted(v["bindings"]), n=v["n"])
                        for k, v in svc.items()}), f, indent=1)
print()
print("wrote scripts/accounting_routes.json")
