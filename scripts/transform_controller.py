#!/usr/bin/env python3
"""Rewrite AccountingController endpoints to call the typed service directly.

For each endpoint method:
  - Map<...> response (wrapMap)  -> leave unchanged (cross-module Map services).
  - typed response, @RequestBody REQ request -> body becomes `return wrap(service.SVC(request));`
  - typed response, @RequestParam Map params -> param becomes `REQ request` (Spring binds
    query params to the DTO), body becomes `return wrap(service.SVC(request));`
"""
import re, os

ROOT = r"C:\Users\haiyangl\Landawn\ofbiz-abacus"
CTRL = os.path.join(ROOT, "src", "main", "java", "com", "landawn", "ofbiz",
                    "controller", "AccountingController.java")
MODEL = os.path.join(ROOT, "src", "main", "java", "com", "landawn", "ofbiz",
                     "model", "accounting")
cap = lambda s: s[0].upper() + s[1:]
dto_exists = lambda n: os.path.exists(os.path.join(MODEL, n + ".java"))

src = open(CTRL, encoding="utf-8").read()
sig_re = re.compile(r'public\s+ResponseEntity<(.+?)>\s+(\w+)\(([^)]*)\)([^{]*)\{')

out = []
i = 0
n_body = n_param = n_skip = 0
while True:
    m = sig_re.search(src, i)
    if not m:
        out.append(src[i:])
        break
    resp_type = m.group(1).strip()
    ctrl_method = m.group(2)
    params = m.group(3).strip()
    tail = m.group(4)  # e.g. " throws java.sql.SQLException "
    # brace-match the body
    bstart = m.end() - 1  # index of '{'
    depth = 0; j = bstart
    while j < len(src):
        if src[j] == '{': depth += 1
        elif src[j] == '}':
            depth -= 1
            if depth == 0: break
        j += 1
    body = src[bstart+1:j]
    out.append(src[i:m.start()])  # text before this method (annotations, javadoc)

    svc_m = re.search(r'service\.(\w+)\(', body)
    svc = svc_m.group(1) if svc_m else None
    is_map_resp = resp_type.startswith("Map")

    if is_map_resp or svc is None:
        out.append(src[m.start():j+1])  # unchanged whole method
        n_skip += 1
        i = j + 1
        continue

    # typed response -> rewrite
    if "@RequestBody" in params:
        new_params = params
        n_body += 1
    elif "@RequestParam" in params:
        req_type = cap(svc) + "Request"
        if not dto_exists(req_type):
            # no DTO to bind; leave unchanged
            out.append(src[m.start():j+1]); n_skip += 1; i = j + 1; continue
        new_params = f"{req_type} request"
        n_param += 1
    else:
        out.append(src[m.start():j+1]); n_skip += 1; i = j + 1; continue

    new_method = (f"public ResponseEntity<{resp_type}> {ctrl_method}({new_params})"
                  f"{tail}{{\n        return wrap(service.{svc}(request));\n    }}")
    out.append(new_method)
    i = j + 1

new_src = "".join(out)
with open(CTRL, "w", encoding="utf-8", newline="\n") as f:
    f.write(new_src)
print(f"typed-body rewrites: {n_body}, typed-param rewrites: {n_param}, unchanged: {n_skip}")
