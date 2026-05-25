#!/usr/bin/env python3
"""
Inventory backend APIs in apache-ofbiz-framework and generate:
  1. docs/api/api.md         — Markdown table of every API endpoint
  2. com.landawn.ofbiz.controller.*Controller — empty Spring controller scaffolds

Sources scanned:
  - ofbiz-component.xml   -> webapp mount-points
  - WEB-INF/controller.xml -> request-map URIs + events (auth, method)
  - servicedef/services*.xml -> service implementations + entities touched

Re-runnable: always overwrites outputs.
"""
from __future__ import annotations

import datetime
import re
import sys
import xml.etree.ElementTree as ET
from dataclasses import dataclass, field
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
OFBIZ = ROOT / "apache-ofbiz-framework"
API_MD = ROOT / "docs" / "api" / "api.md"
CONTROLLER_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "controller"

# ---------------------------------------------------------------------------
# Model
# ---------------------------------------------------------------------------
@dataclass
class ServiceInfo:
    name: str
    engine: str = ""
    location: str = ""
    invoke: str = ""
    auth: str = ""
    export: bool = False
    description: str = ""
    default_entity: str = ""
    entities: list[str] = field(default_factory=list)   # touched entities (best-effort)
    in_attrs: list[str] = field(default_factory=list)   # IN attribute names

    def impl_str(self) -> str:
        if self.engine == "java":
            return f"{self.location}#{self.invoke}"
        if self.engine in ("groovy", "simple", "minilang"):
            base = self.location or "?"
            return f"{base}#{self.invoke}" if self.invoke else base
        if self.engine == "entity-auto":
            return f"entity-auto({self.invoke}: {self.default_entity})"
        return f"{self.engine}: {self.location or '?'}#{self.invoke or '?'}"

@dataclass
class Webapp:
    component: str
    webapp_name: str
    mount_point: str         # e.g. "/partymgr"
    controller_path: Path    # the controller.xml

@dataclass
class Endpoint:
    component: str
    webapp_name: str
    mount_point: str
    uri: str
    http_method: str          # "POST" | "GET" | etc.
    auth: str                 # "true" | "false" | ""
    event_type: str           # "service" | "java" | "groovy"
    event_invoke: str         # service name or java method
    event_path: str           # java event class path (when type=java)
    service: ServiceInfo | None = None
    description: str = ""

    @property
    def full_path(self) -> str:
        return f"{self.mount_point}/control/{self.uri}"

# ---------------------------------------------------------------------------
# Parsing helpers
# ---------------------------------------------------------------------------
def _parse_xml_safe(path: Path) -> ET.Element | None:
    try:
        return ET.parse(path).getroot()
    except (ET.ParseError, OSError) as e:
        print(f"WARN: cannot parse {path}: {e}", file=sys.stderr)
        return None

def _component_of(path: Path) -> str:
    """Derive component name from an OFBiz path: applications/X/... -> X; framework/X/... -> X; themes/X/... -> X."""
    parts = path.relative_to(OFBIZ).parts
    if len(parts) >= 2 and parts[0] in ("applications", "framework", "themes"):
        return parts[1]
    return parts[0] if parts else "unknown"

# ---------------------------------------------------------------------------
# 1) ofbiz-component.xml -> webapp mount-points
# ---------------------------------------------------------------------------
def discover_webapps() -> list[Webapp]:
    out: list[Webapp] = []
    for comp_xml in OFBIZ.rglob("ofbiz-component.xml"):
        if "test" in str(comp_xml) and "testsdata" in str(comp_xml):
            continue
        root = _parse_xml_safe(comp_xml)
        if root is None:
            continue
        comp_dir = comp_xml.parent
        component = _component_of(comp_xml)
        for w in root.iter("webapp"):
            mp = w.get("mount-point", "")
            loc = w.get("location", "")
            name = w.get("name", "")
            if not mp or not loc or "@" in mp or "@" in loc:
                continue
            ctrl = comp_dir / loc / "WEB-INF" / "controller.xml"
            if not ctrl.exists():
                continue
            out.append(Webapp(
                component=component,
                webapp_name=name,
                mount_point=mp.rstrip("/") or "/",
                controller_path=ctrl,
            ))
    return out

# ---------------------------------------------------------------------------
# 2) services*.xml -> service registry
# ---------------------------------------------------------------------------
ATTR_ENTITY_RE = re.compile(r'entity-name="([A-Za-z0-9_]+)"')

def discover_services() -> dict[str, ServiceInfo]:
    services: dict[str, ServiceInfo] = {}
    for svc_xml in OFBIZ.rglob("services*.xml"):
        # only look in servicedef/ to skip controllers' service stub data
        if "servicedef" not in svc_xml.parts:
            continue
        root = _parse_xml_safe(svc_xml)
        if root is None:
            continue
        for s in root.iter("service"):
            name = s.get("name")
            if not name:
                continue
            info = ServiceInfo(
                name=name,
                engine=s.get("engine", ""),
                location=s.get("location", ""),
                invoke=s.get("invoke", ""),
                auth=s.get("auth", ""),
                export=(s.get("export") == "true"),
                default_entity=s.get("default-entity-name", ""),
            )
            desc_el = s.find("description")
            if desc_el is not None and desc_el.text:
                info.description = " ".join(desc_el.text.split())
            # Collect entity hints from attributes
            entity_set: set[str] = set()
            if info.default_entity:
                entity_set.add(info.default_entity)
            for el in s.iter():
                en = el.get("entity-name")
                if en:
                    entity_set.add(en)
            info.entities = sorted(entity_set)
            # IN attributes
            for a in s.findall("attribute"):
                mode = a.get("mode", "")
                if mode in ("IN", "INOUT"):
                    nm = a.get("name")
                    if nm:
                        info.in_attrs.append(nm)
            services[name] = info
    return services

# ---------------------------------------------------------------------------
# 3) controller.xml -> endpoints
# ---------------------------------------------------------------------------
def parse_endpoints(webapp: Webapp, services: dict[str, ServiceInfo]) -> list[Endpoint]:
    root = _parse_xml_safe(webapp.controller_path)
    if root is None:
        return []
    # site-conf uses default xmlns sometimes; iterate by local name
    out: list[Endpoint] = []
    for rm in root.iter():
        if not rm.tag.endswith("request-map"):
            continue
        uri = rm.get("uri")
        if not uri:
            continue
        method = (rm.get("method") or "").upper() or ""

        # Security/auth
        auth = ""
        for sec in rm:
            if sec.tag.endswith("security"):
                auth = sec.get("auth", "")
                break

        # Events: only request-maps with at least one event are real APIs
        events = [c for c in rm if c.tag.endswith("event")]
        if not events:
            continue  # view-only
        for ev in events:
            etype = ev.get("type", "")
            invoke = ev.get("invoke", "")
            path = ev.get("path", "")
            svc = services.get(invoke) if etype == "service" else None
            # Default HTTP method per event type
            http = method or ("POST" if etype == "service" else "GET")
            description = ""
            if svc:
                description = svc.description
            ep = Endpoint(
                component=webapp.component,
                webapp_name=webapp.webapp_name,
                mount_point=webapp.mount_point,
                uri=uri,
                http_method=http,
                auth=auth,
                event_type=etype,
                event_invoke=invoke,
                event_path=path,
                service=svc,
                description=description,
            )
            out.append(ep)
    return out

# ---------------------------------------------------------------------------
# Markdown rendering
# ---------------------------------------------------------------------------
def md_escape(s: str) -> str:
    return s.replace("|", "\\|").replace("\n", " ").strip()

def render_chain(ep: Endpoint) -> str:
    # Controller/handler segment
    if ep.event_type == "service":
        ctrl = f"org.apache.ofbiz.webapp.event.ServiceEventHandler [auth={ep.auth or '-'}]"
    elif ep.event_type == "java":
        ctrl = f"org.apache.ofbiz.webapp.event.JavaEventHandler [auth={ep.auth or '-'}]"
    else:
        ctrl = f"{ep.event_type}EventHandler [auth={ep.auth or '-'}]"

    # Service segment
    if ep.service:
        svc = f"{ep.event_invoke} -> {ep.service.impl_str()}"
    elif ep.event_type == "java":
        svc = f"{ep.event_path}#{ep.event_invoke}"
    else:
        svc = ep.event_invoke or "—"

    # Persistence segment
    if ep.service and ep.service.entities:
        ents = ", ".join(ep.service.entities)
    else:
        ents = "unknown"

    return f"{ctrl} -> {svc} -> {ents}"

def render_md(endpoints: list[Endpoint], webapps: list[Webapp],
              services: dict[str, ServiceInfo]) -> str:
    today = datetime.date.today().isoformat()
    by_component: dict[str, list[Endpoint]] = {}
    for ep in endpoints:
        by_component.setdefault(ep.component, []).append(ep)

    total = len(endpoints)
    comp_counts = {k: len(v) for k, v in sorted(by_component.items())}

    # Header
    lines: list[str] = []
    lines.append("# OFBiz Backend API Inventory")
    lines.append("")
    lines.append(f"_Generated by `scripts/gen_api_inventory.py` on {today}._")
    lines.append("")
    lines.append(f"**Total endpoints:** {total}")
    lines.append("")
    lines.append("**Breakdown by component:**")
    lines.append("")
    lines.append("| Component | Endpoints |")
    lines.append("|---|---:|")
    for c, n in comp_counts.items():
        lines.append(f"| {c} | {n} |")
    lines.append("")

    # Source files
    lines.append("**Sources scanned:**")
    n_ctrl = len({w.controller_path for w in webapps})
    n_svc_files = sum(1 for _ in OFBIZ.rglob("services*.xml"))
    n_comp = sum(1 for _ in OFBIZ.rglob("ofbiz-component.xml"))
    lines.append(f"- `ofbiz-component.xml` files: {n_comp} (used to discover webapp mount-points)")
    lines.append(f"- `controller.xml` files: {n_ctrl}")
    lines.append(f"- `services*.xml` files: {n_svc_files}  ({len(services)} services registered)")
    lines.append("")

    # Tables
    for comp in sorted(by_component):
        lines.append(f"## {comp}")
        lines.append("")
        lines.append("| Path | Implementation (Controller -> Service -> Persistence) | Description |")
        lines.append("|---|---|---|")
        rows = sorted(by_component[comp], key=lambda e: (e.mount_point, e.uri, e.http_method))
        for ep in rows:
            path = f"`{ep.http_method} {ep.full_path}`"
            chain = md_escape(render_chain(ep))
            desc = md_escape(ep.description) or "—"
            lines.append(f"| {path} | {chain} | {desc} |")
        lines.append("")

    return "\n".join(lines) + "\n"

# ---------------------------------------------------------------------------
# Controller scaffolding
# ---------------------------------------------------------------------------
JAVA_KEYWORDS = {
    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
    "class", "const", "continue", "default", "do", "double", "else", "enum",
    "extends", "final", "finally", "float", "for", "goto", "if", "implements",
    "import", "instanceof", "int", "interface", "long", "native", "new",
    "package", "private", "protected", "public", "return", "short", "static",
    "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
    "transient", "try", "void", "volatile", "while", "true", "false", "null",
}

CAMEL_SANITIZE_RE = re.compile(r"[^A-Za-z0-9]")

def to_camel(name: str) -> str:
    """Convert any URI segment into a Java-safe camelCase identifier."""
    parts = re.split(r"[^A-Za-z0-9]+", name)
    parts = [p for p in parts if p]
    if not parts:
        return "endpoint"
    head = parts[0]
    head = head[:1].lower() + head[1:] if head else head
    tail = "".join(p[:1].upper() + p[1:] for p in parts[1:])
    name = head + tail
    if not name[0].isalpha() and name[0] != "_":
        name = "_" + name
    if name in JAVA_KEYWORDS:
        name = name + "_"
    return name

def to_pascal(name: str) -> str:
    parts = re.split(r"[^A-Za-z0-9]+", name)
    parts = [p for p in parts if p]
    return "".join(p[:1].upper() + p[1:] for p in parts) or "Component"

def method_annotation(http: str) -> str:
    return {
        "GET": "@GetMapping",
        "POST": "@PostMapping",
        "PUT": "@PutMapping",
        "DELETE": "@DeleteMapping",
        "PATCH": "@PatchMapping",
    }.get(http.upper(), "@RequestMapping")

def render_controller(component: str, endpoints: list[Endpoint]) -> str:
    class_name = to_pascal(component) + "Controller"
    base_path = f"/{component.lower()}"

    # Group/dedupe endpoints by (full_path, http_method) — already unique URIs at the controller.xml level,
    # but request URIs can repeat across two webapps with different mount-points. Use full_path for keys.
    seen_methods: set[str] = set()
    methods_out: list[str] = []
    annotations_used: set[str] = set()

    sorted_eps = sorted(endpoints, key=lambda e: (e.mount_point, e.uri, e.http_method))
    for ep in sorted_eps:
        # Base method name from service name if present, else from URI
        base = ep.event_invoke or ep.uri.split("/")[-1]
        method = to_camel(base)
        if method in seen_methods:
            # Suffix with URI's last segment (camelCased) to disambiguate
            suffix = to_camel(ep.uri.split("/")[-1])
            method = method + suffix[:1].upper() + suffix[1:]
            n = 2
            base_method = method
            while method in seen_methods:
                method = f"{base_method}{n}"
                n += 1
        seen_methods.add(method)

        annot = method_annotation(ep.http_method)
        annotations_used.add(annot.strip("@"))

        # Path relative to class-level @RequestMapping: prepend the webapp mount + control segment.
        # e.g. base_path=/party, full_path=/partymgr/control/createParty -> rel path "/partymgr/control/createParty"
        # We keep full mount path so it matches OFBiz URLs verbatim — class-level mapping is purely organizational.
        rel_path = ep.full_path

        entities_str = ", ".join(ep.service.entities) if (ep.service and ep.service.entities) else "unknown"
        service_name = ep.event_invoke or "-"
        auth_str = ep.auth or "-"
        desc_one = (ep.description or "").replace("\n", " ").strip() or "No description."

        # Parameter style by HTTP method
        if ep.http_method.upper() in ("POST", "PUT", "PATCH"):
            params = "@RequestBody Map<String, Object> body"
        else:
            params = "@RequestParam Map<String, String> params"

        method_block = (
            f"    /**\n"
            f"     * {desc_one}\n"
            f"     * <p>service: {service_name}  entities: {entities_str}  auth: {auth_str}\n"
            f"     */\n"
            f"    {annot}(\"{rel_path}\")\n"
            f"    public ResponseEntity<Map<String, Object>> {method}({params}) {{\n"
            f"        // TODO\n"
            f"        throw new UnsupportedOperationException();\n"
            f"    }}\n"
        )
        methods_out.append(method_block)

    # Imports
    import_lines = ["import org.springframework.http.ResponseEntity;"]
    for a in sorted(annotations_used | {"RestController", "RequestMapping", "RequestBody", "RequestParam"}):
        import_lines.append(f"import org.springframework.web.bind.annotation.{a};")
    import_lines.append("")
    import_lines.append("import java.util.Map;")

    body = (
        f"package com.landawn.ofbiz.controller;\n\n"
        + "\n".join(import_lines)
        + "\n\n"
        f"@RestController\n"
        f"@RequestMapping(\"{base_path}\")\n"
        f"public class {class_name} {{\n\n"
        + "\n".join(methods_out)
        + "}\n"
    )
    return body

# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------
def main() -> None:
    print(f"Scanning {OFBIZ} ...")
    webapps = discover_webapps()
    print(f"  webapps with controller.xml: {len(webapps)}")

    services = discover_services()
    print(f"  services registered: {len(services)}")

    endpoints: list[Endpoint] = []
    for w in webapps:
        endpoints.extend(parse_endpoints(w, services))
    print(f"  endpoints discovered: {len(endpoints)}")

    by_component: dict[str, list[Endpoint]] = {}
    for ep in endpoints:
        by_component.setdefault(ep.component, []).append(ep)

    # --- write api.md
    API_MD.parent.mkdir(parents=True, exist_ok=True)
    API_MD.write_text(render_md(endpoints, webapps, services), encoding="utf-8")
    print(f"Wrote {API_MD}  ({API_MD.stat().st_size // 1024} KB)")

    # --- write controllers (clean directory first to avoid stale files)
    CONTROLLER_DIR.mkdir(parents=True, exist_ok=True)
    for old in CONTROLLER_DIR.glob("*Controller.java"):
        old.unlink()

    methods_total = 0
    for comp, eps in sorted(by_component.items()):
        ctrl = render_controller(comp, eps)
        path = CONTROLLER_DIR / f"{to_pascal(comp)}Controller.java"
        path.write_text(ctrl, encoding="utf-8")
        methods_total += len(eps)
    print(f"Wrote {len(by_component)} controllers -> {CONTROLLER_DIR}")
    print(f"  total endpoint methods emitted: {methods_total}")

if __name__ == "__main__":
    main()
