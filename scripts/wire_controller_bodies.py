#!/usr/bin/env python3
"""
Inject delegation bodies into a controller, replacing every
`throw new UnsupportedOperationException();` with a call to the matching service method.

For each controller method:
  1. Extract the `service: <name>` tag from the Javadoc.
  2. Look up that method on the service class (by exact name match).
  3. If the controller method takes a typed request (`XxxRequest`), the delegation converts:
        Map<String,Object> result = service.<svc>(ServiceInput.toMap(request));
        return wrap(result, XxxResponse::new);
  4. If the controller method takes `@RequestBody Map<String,Object> body`, the delegation:
        return wrapMap(service.<svc>(body));
  5. If the controller method takes `@RequestParam Map<String,String> params`, the delegation:
        return wrapMap(service.<svc>(Map.copyOf(params)));

Requires the controller to already have the wrap/wrapMap helpers and the service field.
Use after the service class has been added.
"""
from __future__ import annotations

import argparse
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
CONTROLLER_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "controller"
SERVICE_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "service"

SERVICE_TAG_RE = re.compile(r"<p>\s*service:\s*([A-Za-z_][A-Za-z0-9_.]*)")

# Match a controller method: javadoc + @Mapping + signature + body.
# We rewrite the BODY (between `{` and matching `}`). The body matcher accepts EITHER the
# original `throw new UnsupportedOperationException()` stub OR any single-statement body that
# was injected by a previous run — making this script idempotent.
METHOD_RE = re.compile(
    r"(/\*\*[\s\S]*?\*/)\s*"                                            # 1: Javadoc
    r"(@(?:Get|Post|Put|Delete|Patch)Mapping[^\n]*)\n\s*"                # 2: mapping
    r"(public\s+ResponseEntity<[^>]+(?:>[^>]*)?>\s+(\w+)\s*\(([^)]*)\)" # 3: signature (sig text), 4: methodName, 5: params
    r"(?:\s+throws\s+[\w.,\s]+)?\s*)"                                    # (throws clause optional)
    r"\{[^{}]*\}",                                                       # body (no nested braces)
    re.MULTILINE,
)


def discover_service_methods(service_path: Path) -> set[str]:
    """Extract public method names from a service Java class."""
    src = service_path.read_text(encoding="utf-8")
    names = set()
    for m in re.finditer(r"^\s*public\s+(?:Map<String,\s*Object>|\w+)\s+(\w+)\s*\(",
                         src, re.MULTILINE):
        names.add(m.group(1))
    return names


def make_body(svc_method: str, params: str, sig: str) -> str:
    """Build the delegation body for a single controller method."""
    # Find the declared response type so we know whether to wrap to a typed DTO or a Map.
    rt = re.search(r"ResponseEntity<(\w+)>", sig)
    is_typed_response = bool(rt and rt.group(1) != "Map")
    response_dto = rt.group(1) if is_typed_response else None

    # Decide request shape from the params.
    if "@RequestBody" in params:
        if "Map<String, Object>" in params and "body" in params:
            return f"return wrapMap(service.{svc_method}(body));"
        # Typed @RequestBody XxxRequest request
        m = re.search(r"@RequestBody\s+\w+\s+request", params)
        if m and is_typed_response:
            return (f"Map<String, Object> result = service.{svc_method}(ServiceInput.toMap(request));\n"
                    f"        return wrap(result, {response_dto}::new);")
        return f"return wrapMap(service.{svc_method}(java.util.Map.of()));"
    if "@RequestParam" in params:
        if is_typed_response:
            return (f"Map<String, Object> result = service.{svc_method}(java.util.Map.copyOf(params));\n"
                    f"        return wrap(result, {response_dto}::new);")
        return f"return wrapMap(service.{svc_method}(java.util.Map.copyOf(params)));"
    # No params? unusual; emit a no-op delegation
    return f"return wrapMap(service.{svc_method}(java.util.Map.of()));"


def ensure_scaffolding(src: str, controller_name: str, service_name: str) -> str:
    """Make sure the controller has:
      - import ServiceInput
      - private final <Service> service; field + constructor
      - a wrap(T) helper, a wrapMap(Map) helper, and a wrap(Map, Supplier) typed-build helper.
    Idempotent — re-running leaves an already-scaffolded controller alone."""
    # Add ServiceInput import if missing.
    if "import com.landawn.ofbiz.util.ServiceInput;" not in src:
        src = re.sub(r"(package com\.landawn\.ofbiz\.controller;\n\n)",
                     r"\1import com.landawn.ofbiz.util.ServiceInput;\n", src, count=1)
    # Replace the class body's wrap-only helper with the full set + service field.
    if f"private final {service_name} service;" not in src:
        new_block = (
            f"    private final com.landawn.ofbiz.service.{service_name} service;\n"
            f"\n"
            f"    public {controller_name}Controller(com.landawn.ofbiz.service.{service_name} service) {{\n"
            f"        this.service = service;\n"
            f"    }}\n"
            f"\n"
            f"    /** 200/400 routing for typed responses. */\n"
            f"    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {{\n"
            f"        return com.landawn.ofbiz.service.ServiceResponse.isError(result)\n"
            f"                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)\n"
            f"                : ResponseEntity.ok(result);\n"
            f"    }}\n"
            f"\n"
            f"    /** Convert a service-result map into a typed response and wrap. */\n"
            f"    private static <T extends ResponseBase> ResponseEntity<T> wrap(\n"
            f"            Map<String, Object> result, java.util.function.Supplier<T> factory) {{\n"
            f"        return wrap(com.landawn.ofbiz.service.ServiceResponse.toDto(result, factory));\n"
            f"    }}\n"
            f"\n"
            f"    /** 200/400 routing for loosely-typed Map responses. */\n"
            f"    private static ResponseEntity<Map<String, Object>> wrapMap(Map<String, Object> result) {{\n"
            f"        return com.landawn.ofbiz.service.ServiceResponse.isError(result)\n"
            f"                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)\n"
            f"                : ResponseEntity.ok(result);\n"
            f"    }}\n"
        )
        # Find the existing wrap() helper and replace the block from `/** 200/400 …` through
        # its closing `}` with our new block.
        src = re.sub(
            r"    /\*\* 200/400 routing[^\n]*\n"
            r"    private static <T extends ResponseBase> ResponseEntity<T> wrap\(T result\) \{\n"
            r"        return com\.landawn\.ofbiz\.service\.ServiceResponse\.isError\(result\)\n"
            r"                \? ResponseEntity\.status\(org\.springframework\.http\.HttpStatus\.BAD_REQUEST\)\.body\(result\)\n"
            r"                : ResponseEntity\.ok\(result\);\n"
            r"    \}\n",
            new_block, src, count=1)
    return src


def wire_controller(controller_name: str, service_name: str) -> int:
    ctl_path = CONTROLLER_DIR / f"{controller_name}Controller.java"
    svc_path = SERVICE_DIR / f"{service_name}.java"
    if not ctl_path.exists():
        print(f"  ERROR: controller not found: {ctl_path}", file=sys.stderr)
        return 0
    if not svc_path.exists():
        print(f"  ERROR: service not found: {svc_path}", file=sys.stderr)
        return 0

    svc_methods = discover_service_methods(svc_path)
    src = ctl_path.read_text(encoding="utf-8")
    src = ensure_scaffolding(src, controller_name, service_name)

    wired = [0]
    skipped: list[str] = []

    def repl(m: re.Match) -> str:
        javadoc, mapping, sig_text, _method_name, params = (
            m.group(1), m.group(2), m.group(3), m.group(4), m.group(5))
        st = SERVICE_TAG_RE.search(javadoc)
        if not st:
            skipped.append("(no service: tag)")
            return m.group(0)
        svc = st.group(1)
        if "." in svc or svc == "unknown" or svc == "-":
            skipped.append(svc)
            return m.group(0)
        if svc not in svc_methods:
            skipped.append(svc)
            return m.group(0)
        body = make_body(svc, params, sig_text)
        # Ensure the signature declares `throws SQLException` — the service can throw.
        if "throws " not in sig_text:
            # The captured sig_text ends with whitespace before `{`. Inject the throws clause.
            sig_text = sig_text.rstrip() + " throws java.sql.SQLException "
        elif "SQLException" not in sig_text:
            sig_text = re.sub(r"throws\s+([\w.,\s]+?)\s*$", r"throws \1, java.sql.SQLException ", sig_text)
        wired[0] += 1
        return f"{javadoc}\n    {mapping}\n    {sig_text}{{\n        {body}\n    }}"

    new_src = METHOD_RE.sub(repl, src)
    # Post-pass: ensure every controller method signature declares `throws java.sql.SQLException`
    # since most service methods do. Safe — Spring tolerates extra throws.
    def fix_throws(m: re.Match) -> str:
        sig = m.group(0)
        if "throws" in sig:
            return sig
        return sig.rstrip(" \n{") + " throws java.sql.SQLException {"
    new_src = re.sub(
        r"public\s+ResponseEntity<[^>]+(?:>[^>]*)?>\s+\w+\s*\([^)]*\)\s*\{",
        fix_throws, new_src)
    ctl_path.write_text(new_src, encoding="utf-8", newline="\n")
    if skipped:
        print(f"  {controller_name}: wired {wired[0]} methods, skipped {len(skipped)} "
              f"(no matching service method)")
    else:
        print(f"  {controller_name}: wired {wired[0]} methods")
    return wired[0]


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--controller", required=True,
                    help="Controller stem (e.g. 'Marketing')")
    ap.add_argument("--service", required=True,
                    help="Service class name (e.g. 'MarketingService')")
    args = ap.parse_args()
    wired = wire_controller(args.controller, args.service)
    return 0 if wired > 0 else 1


if __name__ == "__main__":
    sys.exit(main())
