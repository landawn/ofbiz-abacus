#!/usr/bin/env python3
"""
Generate a placeholder Spring service class containing one method per OFBiz `service:` tag
found in a controller's Javadoc. Each method returns a documented `successWithMessage`
envelope — meant for controllers whose endpoints are too numerous to hand-port in one
pass. Hand-edit afterward to replace placeholders with real entity-auto CRUD where the
DAO is available.

Usage:
    py scripts/gen_placeholder_service.py --controller Order --service OrderService
"""
import argparse
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
CONTROLLER_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "controller"
SERVICE_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "service"

SERVICE_TAG_RE = re.compile(r"<p>\s*service:\s*([A-Za-z_][A-Za-z0-9_]*)")


TEMPLATE = '''\
/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Ports the OFBiz services exposed by {{@link com.landawn.ofbiz.controller.{controller}Controller}}.
 *
 * <p>This is an auto-generated placeholder service: every endpoint returns a documented
 * {{@code successWithMessage}} envelope so the API surface is complete and compiles. Hand-edit
 * methods to replace placeholders with real entity-auto CRUD as DAOs come online in DaoConfig.
 *
 * <p>The full implementation follows the WorkeffortService / WebtoolsService pattern: inject
 * the relevant DAOs, populate entities via {{@link com.landawn.ofbiz.util.ServiceInput#populate}},
 * insert/update via {{@code CrudDao}} methods, return {{@code ServiceResponse.success(...)}}.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class {classname} {{

    private static Map<String, Object> notPortedYet(String serviceName) {{
        return ServiceResponse.successWithMessage(
                serviceName + " not yet ported (placeholder; see " + "{classname}" + " Javadoc)", null);
    }}

    /** Framework chain-test service. */
    public Map<String, Object> test(Map<String, Object> body) {{
        Map<String, Object> out = new HashMap<>(3);
        out.put("ok", Boolean.TRUE);
        out.put("echo", body == null ? Map.of() : body);
        return ServiceResponse.success(out);
    }}

{methods}
}}
'''


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--controller", required=True)
    ap.add_argument("--service", required=True)
    args = ap.parse_args()

    ctl = CONTROLLER_DIR / f"{args.controller}Controller.java"
    if not ctl.exists():
        print(f"Controller not found: {ctl}", file=sys.stderr)
        return 1
    src = ctl.read_text(encoding="utf-8")
    names = []
    seen = set()
    for m in SERVICE_TAG_RE.finditer(src):
        n = m.group(1)
        if n in seen or n == "test":
            continue
        seen.add(n)
        names.append(n)

    method_lines = []
    for n in sorted(names):
        method_lines.append(f"    public Map<String, Object> {n}(Map<String, Object> body) {{ return notPortedYet(\"{n}\"); }}")

    out = TEMPLATE.format(
        controller=args.controller,
        classname=args.service,
        methods="\n".join(method_lines),
    )
    out_path = SERVICE_DIR / f"{args.service}.java"
    out_path.write_text(out, encoding="utf-8", newline="\n")
    print(f"Generated {out_path} ({len(names)} services)")
    return 0


if __name__ == "__main__":
    sys.exit(main())
