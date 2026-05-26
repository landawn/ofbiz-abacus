#!/usr/bin/env python3
"""
Regenerate typed Request/Response DTOs for every endpoint method in every Spring controller
under src/main/java/com/landawn/ofbiz/controller/, by tracing each method's
`service: <name>` Javadoc tag back to the OFBiz <service> definition under
apache-ofbiz-framework/{applications,framework}/{component}/servicedef/services*.xml.

For each controller we:
  1. Parse the controller's .java file and extract the de-duplicated set of `service:` names.
  2. Parse the controller's component's servicedef XMLs.
  3. Resolve <auto-attributes>/<implements>/<override> per service.
  4. Emit Lombok-annotated DTOs into the controller's subpackage:
        src/main/java/com/landawn/ofbiz/model/<controller-lc>/
     where `<controller-lc>` is the lowercased controller name (e.g. `workeffort`, `product`).

The three shared base classes (RequestBase, ResponseBase, UserLoginRef) live at
com.landawn.ofbiz.model and are hand-maintained; this script does NOT overwrite them.

Re-runnable: same OFBiz source → byte-identical DTO files (modulo whitespace).

Usage:
    py scripts/gen_controller_dtos.py --all
    py scripts/gen_controller_dtos.py --controller Workeffort
    py scripts/gen_controller_dtos.py --controller Workeffort --controller Product
"""
from __future__ import annotations

import argparse
import re
import sys
import xml.etree.ElementTree as ET
from dataclasses import dataclass, field
from pathlib import Path
from typing import Optional

ROOT = Path(__file__).resolve().parent.parent
OFBIZ = ROOT / "apache-ofbiz-framework"
ENTITY_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "entity"
MODEL_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "model"
CONTROLLER_DIR = ROOT / "src" / "main" / "java" / "com" / "landawn" / "ofbiz" / "controller"

# ---------------------------------------------------------------------------
# Per-controller config: where to find the OFBiz servicedef XMLs and which subpackage to
# write DTOs into. `subpackage` is the lowercased controller stem (workeffort, product, etc.)
# and is appended to com.landawn.ofbiz.model.
#
# Most controllers map 1:1 to apache-ofbiz-framework/applications/{name}/servicedef/. Two
# exceptions live under framework/ — Webtools (framework/webtools) and Commonext
# (framework/common, since "commonext" is an extension of the framework's common services).
# ---------------------------------------------------------------------------
@dataclass(frozen=True)
class ControllerSpec:
    name: str              # controller name without the "Controller" suffix (e.g. "Workeffort")
    servicedef_dir: Path   # absolute path to the directory holding services*.xml
    subpackage: str        # lowercased — used in DTO `package` + output dir name

def _app(name: str) -> Path:
    return OFBIZ / "applications" / name / "servicedef"

def _framework(name: str) -> Path:
    return OFBIZ / "framework" / name / "servicedef"

CONTROLLERS: list[ControllerSpec] = [
    ControllerSpec("Accounting",    _app("accounting"),    "accounting"),
    ControllerSpec("Commonext",     _framework("common"),  "commonext"),
    ControllerSpec("Content",       _app("content"),       "content"),
    ControllerSpec("Humanres",      _app("humanres"),      "humanres"),
    ControllerSpec("Manufacturing", _app("manufacturing"), "manufacturing"),
    ControllerSpec("Marketing",     _app("marketing"),     "marketing"),
    ControllerSpec("Order",         _app("order"),         "order"),
    ControllerSpec("Party",         _app("party"),         "party"),
    ControllerSpec("Product",       _app("product"),       "product"),
    ControllerSpec("Webtools",      _framework("webtools"), "webtools"),
    ControllerSpec("Workeffort",    _app("workeffort"),    "workeffort"),
]
CONTROLLERS_BY_NAME = {c.name: c for c in CONTROLLERS}

# Universal fields that live on RequestBase / ResponseBase. Subclasses must NOT redeclare.
UNIVERSAL_REQUEST_FIELDS = {"userLoginId", "userLogin", "locale", "timeZone"}
UNIVERSAL_RESPONSE_FIELDS = {"responseMessage", "successMessage", "errorMessage",
                             "errorMessageList"}

# ---------------------------------------------------------------------------
# Implementation-emitted OUT fields not declared in the OFBiz service definition. The OFBiz
# minilang / groovy bodies for some services emit additional result-map keys that the OFBiz
# <service> XML doesn't formalize as <attribute mode="OUT">. The replay tests assert these
# keys, so the typed response DTOs must carry them.
#
# Keyed by `<controller-name>:<service-name>` so collisions across components stay scoped.
# Add entries here only as a follow-up wiring task surfaces them.
# ---------------------------------------------------------------------------
IMPL_EXTRA_OUT_FIELDS: dict[str, list[tuple[str, str]]] = {
    # Workeffort — discovered while wiring WorkeffortController.
    "Workeffort:updateWorkEffort":            [("workEffortId", "String")],
    "Workeffort:deleteWorkEffort":            [("workEffortId", "String")],
    "Workeffort:createWorkEffortAssoc":       [("workEffortIdFrom", "String"),
                                               ("workEffortIdTo", "String"),
                                               ("workEffortAssocTypeId", "String"),
                                               ("fromDate", "java.sql.Timestamp")],
    "Workeffort:updateWorkEffortAssoc":       [("workEffortIdFrom", "String")],
    "Workeffort:createWorkEffortKeywords":    [("workEffortId", "String"),
                                               ("keywordsAdded", "Integer")],
    "Workeffort:deleteWorkEffortKeywords":    [("workEffortId", "String"),
                                               ("deletedRows", "Integer")],
    "Workeffort:deleteWorkEffortContactMech": [("deletedRows", "Integer")],
    "Workeffort:updateTimesheet":             [("timesheetId", "String")],
    "Workeffort:addTimesheetToInvoice":       [("timesheetId", "String"),
                                               ("invoiceId", "String"),
                                               ("linkedTimeEntries", "Integer"),
                                               ("invoiceItemsCreated", "Integer")],
    "Workeffort:createTimesheetRole":         [("timesheetId", "String"),
                                               ("partyId", "String"),
                                               ("roleTypeId", "String")],
    "Workeffort:deleteTimesheetRole":         [("deletedRows", "Integer")],
    "Workeffort:updateTimeEntry":             [("timeEntryId", "String")],
    "Workeffort:deleteTimeEntry":             [("deletedRows", "Integer")],
}

# ---------------------------------------------------------------------------
# Hardcoded services not present in any servicedef XML — framework-level chain-test and
# similar. Keyed by `<controller>:<service>` mirroring IMPL_EXTRA_OUT_FIELDS.
# Each value is a callable `() -> Service` (defined below `Service`'s declaration).
# ---------------------------------------------------------------------------
HARDCODED_SERVICES: dict[str, "Service"] = {}  # populated after Service is declared

# ---------------------------------------------------------------------------
# OFBiz type -> Java type mapping
# ---------------------------------------------------------------------------
SIMPLE_TYPE_MAP = {
    "String":               "String",
    "java.lang.String":     "String",
    "Boolean":              "Boolean",
    "java.lang.Boolean":    "Boolean",
    "Integer":              "Integer",
    "java.lang.Integer":    "Integer",
    "Long":                 "Long",
    "java.lang.Long":       "Long",
    "Double":               "Double",
    "java.lang.Double":     "Double",
    "Float":                "Double",
    "java.lang.Float":      "Double",
    "BigDecimal":           "double",   # project convention
    "java.math.BigDecimal": "double",
    "currency-amount":      "double",
    "Timestamp":            "java.sql.Timestamp",
    "java.sql.Timestamp":   "java.sql.Timestamp",
    "date-time":            "java.sql.Timestamp",
    "Date":                 "java.sql.Date",
    "java.sql.Date":        "java.sql.Date",
    "Time":                 "java.sql.Time",
    "java.sql.Time":        "java.sql.Time",
    "java.util.Locale":     "java.util.Locale",
    "java.util.TimeZone":   "java.util.TimeZone",
    "java.nio.ByteBuffer":  "byte[]",
    "byte-array":           "byte[]",
}


def map_ofbiz_type(t: Optional[str], attr_name: str = "") -> str:
    """Map an OFBiz attribute type string to a Java type."""
    if not t:
        return "String"
    t = t.strip()
    if t in SIMPLE_TYPE_MAP:
        return SIMPLE_TYPE_MAP[t]

    # List / collection narrowing
    if t == "List" or t == "java.util.List" or t.startswith("List<"):
        return narrow_list_type(attr_name)

    # Map narrowing — default to Map<String, Object>; almost no OFBiz attribute is more specific.
    if t == "Map" or t == "java.util.Map" or t.startswith("Map<"):
        return "Map<String, Object>"

    # OFBiz-internal Java types (GenericValue, ShoppingCart, BOMTree, ...) don't exist in our
    # Spring port. Substitute Object so the DTO compiles; field stays nullable so future wiring
    # can populate it however the corresponding service decides.
    if t.startswith("org.apache.ofbiz."):
        return "Object"

    # Already a fully-qualified class
    if "." in t:
        return t
    # Unknown type — surface it
    return "String"


def narrow_list_type(attr_name: str) -> str:
    """Per the prompt's heuristics, infer List<?> element type from the attribute name."""
    n = attr_name.lower()
    if (n.endswith("idlist") or n.endswith("ids") or n.endswith("names")
            or n.endswith("keys") or n.endswith("keywords")
            or "messageid" in n):
        return "List<String>"
    if n.endswith("list"):
        # A bare *List with no other signal — default to <String> if the prefix is a String
        # entity-PK name (heuristic), otherwise fall back to Object.
        return "List<String>"
    return "List<Object>"


# ---------------------------------------------------------------------------
# Entity parsing — extract field name + Java type from generated entity .java
# ---------------------------------------------------------------------------
FIELD_DECL_RE = re.compile(
    r"(@Id\s+)?@Column\(name = \"[^\"]+\"\)\s+"
    r"private\s+([\w.<>\[\]]+)\s+(\w+);",
    re.MULTILINE,
)

@dataclass
class EntityField:
    name: str           # camelCase property name
    java_type: str      # raw Java type as declared on the entity field
    is_pk: bool         # @Id-annotated?


def parse_entity(entity_name: str) -> tuple[list[EntityField], list[EntityField]]:
    """Return (pk_fields, nonpk_fields) for the given OFBiz entity, parsed from its generated
    Java entity class. pk_fields preserves declaration order; nonpk_fields too."""
    path = ENTITY_DIR / f"{entity_name}.java"
    if not path.exists():
        raise FileNotFoundError(f"Entity not found: {entity_name} ({path})")
    src = path.read_text(encoding="utf-8")
    pk, nonpk = [], []
    for m in FIELD_DECL_RE.finditer(src):
        is_pk = bool(m.group(1))
        jtype = m.group(2)
        name = m.group(3)
        f = EntityField(name=name, java_type=jtype, is_pk=is_pk)
        (pk if is_pk else nonpk).append(f)
    return pk, nonpk


# ---------------------------------------------------------------------------
# services.xml parsing
# ---------------------------------------------------------------------------
@dataclass
class Attr:
    name: str
    java_type: str                # mapped Java type
    mode: str                     # "IN" | "OUT" | "INOUT"
    optional: bool                # true unless explicitly set to false
    deprecated: bool = False
    comment: Optional[str] = None # e.g. "(deprecated)"


@dataclass
class Service:
    name: str
    default_entity: Optional[str]
    deprecated: bool = False
    # ordered dict-like: name -> Attr (so overrides + auto-attrs interplay cleanly)
    attrs_in: dict[str, Attr] = field(default_factory=dict)
    attrs_out: dict[str, Attr] = field(default_factory=dict)
    # raw elements for resolution passes
    raw: Optional[ET.Element] = None


def load_services_in_dir(servicedef_dir: Path) -> dict[str, Service]:
    """Parse every services*.xml under `servicedef_dir` into a name -> Service map (raw form)."""
    services: dict[str, Service] = {}
    if not servicedef_dir.exists():
        print(f"  WARN: servicedef dir does not exist: {servicedef_dir}", file=sys.stderr)
        return services
    for path in sorted(servicedef_dir.glob("services*.xml")):
        try:
            tree = ET.parse(path)
        except ET.ParseError as e:
            print(f"  WARN: failed to parse {path}: {e}", file=sys.stderr)
            continue
        for el in tree.getroot().iter():
            if el.tag != "service":
                continue
            name = el.get("name")
            if not name:
                continue
            services[name] = Service(
                name=name,
                default_entity=el.get("default-entity-name"),
                deprecated=el.find("deprecated") is not None,
                raw=el,
            )
    return services


# Extract `service: <name>` tags from a controller .java file. Pattern matches the project's
# Javadoc convention: `<p>service: <serviceName>  entities: …  auth: …`
SERVICE_TAG_RE = re.compile(r"<p>\s*service:\s*([A-Za-z_][A-Za-z0-9_.]*)")

def discover_target_services(controller_path: Path) -> list[str]:
    """Extract de-duplicated service names from a controller .java file, in declaration order.
    Skips any value that contains a dot (entity-name leaking into the tag) or that is the
    literal placeholder 'unknown' used by stub controllers."""
    src = controller_path.read_text(encoding="utf-8")
    seen: dict[str, None] = {}
    for m in SERVICE_TAG_RE.finditer(src):
        name = m.group(1)
        if "." in name or name == "unknown":
            continue
        seen.setdefault(name, None)
    return list(seen.keys())


def resolve_service(svc: Service, all_services: dict[str, Service],
                    visiting: Optional[set] = None) -> Service:
    """Fully resolve a service's IN/OUT attribute map by walking <implements>, <auto-attributes>,
    <attribute> and <override> children in declaration order. Returns the same Service (mutated)
    so caller can chain."""
    if svc.attrs_in or svc.attrs_out:
        return svc  # already resolved
    visiting = visiting or set()
    if svc.name in visiting:
        return svc  # cycle protection
    visiting = visiting | {svc.name}

    for child in list(svc.raw):
        tag = child.tag
        if tag == "implements":
            target = child.get("service")
            if target and target in all_services:
                resolve_service(all_services[target], all_services, visiting)
                # Inherit all attributes
                for k, v in all_services[target].attrs_in.items():
                    svc.attrs_in.setdefault(k, v)
                for k, v in all_services[target].attrs_out.items():
                    svc.attrs_out.setdefault(k, v)
        elif tag == "auto-attributes":
            apply_auto_attributes(svc, child)
        elif tag == "attribute":
            apply_attribute_element(svc, child)
        elif tag == "override":
            apply_override(svc, child)
    return svc


def apply_auto_attributes(svc: Service, el: ET.Element) -> None:
    entity_name = el.get("entity-name") or svc.default_entity
    if not entity_name:
        return
    include = el.get("include", "pk")  # pk | nonpk | all
    mode = el.get("mode", "IN").upper()
    optional = (el.get("optional", "true") == "true")
    excludes = {x.get("field-name") for x in el.findall("exclude") if x.get("field-name")}

    try:
        pk, nonpk = parse_entity(entity_name)
    except FileNotFoundError as e:
        print(f"  WARN: {svc.name}: {e}", file=sys.stderr)
        return

    fields: list[EntityField] = []
    if include in ("pk", "all"):
        fields += pk
    if include in ("nonpk", "all"):
        fields += nonpk

    for f in fields:
        if f.name in excludes:
            continue
        # DTO fields must be nullable (an optional service input can be missing), so box any
        # primitive captured from the entity. Entities use primitive `double` / `long` / `int`
        # because the SQL column has a NOT NULL default; the DTO has no such guarantee.
        jtype = f.java_type
        if jtype == "long":     jtype = "Long"
        elif jtype == "int":    jtype = "Integer"
        elif jtype == "double": jtype = "Double"
        elif jtype == "float":  jtype = "Float"
        elif jtype == "boolean": jtype = "Boolean"
        register_attr(svc, f.name, jtype, mode, optional)


def apply_attribute_element(svc: Service, el: ET.Element) -> None:
    name = el.get("name")
    if not name:
        return
    raw_type = el.get("type") or "String"
    mode = (el.get("mode") or "IN").upper()
    optional = (el.get("optional", "true") == "true")
    jtype = map_ofbiz_type(raw_type, name)
    register_attr(svc, name, jtype, mode, optional)


def apply_override(svc: Service, el: ET.Element) -> None:
    name = el.get("name")
    if not name:
        return
    optional_attr = el.get("optional")
    mode_attr = el.get("mode")
    type_attr = el.get("type")

    for bucket in (svc.attrs_in, svc.attrs_out):
        if name in bucket:
            a = bucket[name]
            if optional_attr is not None:
                a.optional = (optional_attr == "true")
            if type_attr:
                a.java_type = map_ofbiz_type(type_attr, name)
            if mode_attr:
                # mode change may move the attr to a different bucket
                new_mode = mode_attr.upper()
                if new_mode != a.mode:
                    del bucket[name]
                    a.mode = new_mode
                    if "IN" in new_mode:
                        svc.attrs_in[name] = a
                    if "OUT" in new_mode:
                        svc.attrs_out[name] = a
                    return


def register_attr(svc: Service, name: str, jtype: str, mode: str, optional: bool) -> None:
    a = Attr(name=name, java_type=jtype, mode=mode, optional=optional)
    if "IN" in mode:
        # Don't overwrite an attribute already registered (auto-attributes runs after implements,
        # but the FIRST declaration wins per OFBiz semantics).
        svc.attrs_in.setdefault(name, a)
    if "OUT" in mode:
        svc.attrs_out.setdefault(name, a)


# ---------------------------------------------------------------------------
# Hardcoded services not in any servicedef XML (framework chain-tests etc.).
# Populated here once Service / Attr exist.
# ---------------------------------------------------------------------------
def _hardcoded_workeffort_test() -> Service:
    s = Service(name="test", default_entity=None)
    s.attrs_out["ok"] = Attr(name="ok", java_type="Boolean", mode="OUT", optional=True)
    s.attrs_out["echo"] = Attr(name="echo", java_type="Map<String, Object>",
                               mode="OUT", optional=True)
    return s

HARDCODED_SERVICES["Workeffort:test"] = _hardcoded_workeffort_test()


# ---------------------------------------------------------------------------
# Rendering
# ---------------------------------------------------------------------------
JAVA_LANG_TYPES = {"String", "Boolean", "Integer", "Long", "Double", "Float", "Byte", "Short",
                   "Character", "Object"}

# Bare (unqualified) Java type name -> fully-qualified name. Resolves entity fields declared as
# e.g. `private Timestamp foo;` (relying on the entity file's `import java.sql.Timestamp`).
SHORT_NAME_FQN = {
    "Timestamp":  "java.sql.Timestamp",
    "Date":       "java.sql.Date",
    "Time":       "java.sql.Time",
    "BigDecimal": "java.math.BigDecimal",
    "Locale":     "java.util.Locale",
    "TimeZone":   "java.util.TimeZone",
    "List":       "java.util.List",
    "Map":        "java.util.Map",
    "Set":        "java.util.Set",
    "Collection": "java.util.Collection",
}


def short_type(jtype: str) -> tuple[str, set[str]]:
    """Return (short Java type, set of imports needed)."""
    imports: set[str] = set()
    if "<" in jtype:
        outer, _, rest = jtype.partition("<")
        inner = rest.rsplit(">", 1)[0]
        inner_parts = split_top_level(inner)
        rendered_inner = []
        for p in inner_parts:
            s, i = short_type(p.strip())
            rendered_inner.append(s)
            imports |= i
        outer_s, outer_i = short_type(outer)
        return f"{outer_s}<{', '.join(rendered_inner)}>", imports | outer_i

    if "." in jtype and not jtype.startswith("java.lang."):
        if jtype not in JAVA_LANG_TYPES:
            imports.add(jtype)
            return jtype.rsplit(".", 1)[-1], imports
    elif jtype in SHORT_NAME_FQN:
        imports.add(SHORT_NAME_FQN[jtype])
        return jtype, imports
    return jtype, imports


def split_top_level(s: str) -> list[str]:
    """Split 'A, B<C, D>, E' on top-level commas (depth 0)."""
    out, buf, depth = [], [], 0
    for ch in s:
        if ch == "<":
            depth += 1; buf.append(ch)
        elif ch == ">":
            depth -= 1; buf.append(ch)
        elif ch == "," and depth == 0:
            out.append("".join(buf).strip()); buf = []
        else:
            buf.append(ch)
    if buf:
        out.append("".join(buf).strip())
    return out


DTO_TEMPLATE = '''\
/*
 * Generated by scripts/gen_controller_dtos.py — DO NOT EDIT BY HAND.
 * Re-run the script if the OFBiz service definition for {service} changes.
 */
package com.landawn.ofbiz.model.{subpackage};

import com.landawn.ofbiz.model.{base_class};
{imports}import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * {role} DTO for the {service} service.
{header_note} */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class {class_name} extends {base_class} {{

{fields}
}}
'''


def render_dto(service_name: str, role: str, attrs: dict[str, Attr],
               subpackage: str, header_note: str = "") -> str:
    """role: 'Request' or 'Response'."""
    class_name = pascal(service_name) + role
    base_class = "RequestBase" if role == "Request" else "ResponseBase"
    skip = UNIVERSAL_REQUEST_FIELDS if role == "Request" else UNIVERSAL_RESPONSE_FIELDS

    field_lines: list[str] = []
    needed_imports: set[str] = set()
    rendered_any = False
    for a in attrs.values():
        if a.name in skip:
            continue
        short, imps = short_type(a.java_type)
        needed_imports |= imps
        field_lines.append(f"    private {short} {a.name};")
        rendered_any = True
    if not rendered_any:
        field_lines.append("    // (no service-specific fields beyond the base envelope)")

    imports_block = ""
    if needed_imports:
        imports_block = "\n" + "\n".join(f"import {i};" for i in sorted(needed_imports)) + "\n"

    note_lines = (" * " + header_note + "\n") if header_note else ""

    return DTO_TEMPLATE.format(
        service=service_name,
        role=role,
        class_name=class_name,
        base_class=base_class,
        subpackage=subpackage,
        imports=imports_block,
        fields="\n".join(field_lines),
        header_note=note_lines,
    )


def pascal(name: str) -> str:
    if not name:
        return ""
    return name[0].upper() + name[1:]


# ---------------------------------------------------------------------------
# Per-controller generation
# ---------------------------------------------------------------------------
def generate_for_controller(spec: ControllerSpec) -> tuple[int, int]:
    """Generate every DTO for `spec`. Returns (files_written, services_skipped)."""
    controller_path = CONTROLLER_DIR / f"{spec.name}Controller.java"
    if not controller_path.exists():
        print(f"  WARN: controller file not found: {controller_path}", file=sys.stderr)
        return (0, 0)

    target_services = discover_target_services(controller_path)
    print(f"  {spec.name}: discovered {len(target_services)} unique service(s) in Javadoc tags")

    component_services = load_services_in_dir(spec.servicedef_dir)
    print(f"    parsed {len(component_services)} <service> defs from {spec.servicedef_dir.relative_to(ROOT)}")

    # Merge hardcoded entries for this controller into the lookup
    for key, svc in HARDCODED_SERVICES.items():
        ctrl_part, svc_name = key.split(":", 1)
        if ctrl_part == spec.name:
            component_services[svc_name] = svc

    out_dir = MODEL_DIR / spec.subpackage
    out_dir.mkdir(parents=True, exist_ok=True)

    written = 0
    skipped: list[str] = []
    for svc_name in target_services:
        svc = component_services.get(svc_name)
        if svc is None:
            skipped.append(svc_name)
            continue

        if svc.raw is not None:
            resolve_service(svc, component_services)

        # Inject implementation-emitted OUT fields scoped to this controller+service.
        extras_key = f"{spec.name}:{svc_name}"
        for fname, ftype in IMPL_EXTRA_OUT_FIELDS.get(extras_key, []):
            svc.attrs_out.setdefault(
                fname, Attr(name=fname, java_type=map_ofbiz_type(ftype, fname),
                            mode="OUT", optional=True))

        header_note = (f"Generated from OFBiz service definition; default-entity-name="
                       f"{svc.default_entity or '(none)'}.")

        req_path = out_dir / f"{pascal(svc_name)}Request.java"
        resp_path = out_dir / f"{pascal(svc_name)}Response.java"
        req_path.write_text(
            render_dto(svc_name, "Request", svc.attrs_in, spec.subpackage, header_note),
            encoding="utf-8", newline="\n")
        resp_path.write_text(
            render_dto(svc_name, "Response", svc.attrs_out, spec.subpackage, header_note),
            encoding="utf-8", newline="\n")
        written += 2

    if skipped:
        print(f"    SKIPPED {len(skipped)} services (no <service> def found): "
              f"{', '.join(skipped[:6])}{'...' if len(skipped) > 6 else ''}",
              file=sys.stderr)
    print(f"    wrote {written} DTOs to model/{spec.subpackage}/")
    return (written, len(skipped))


# ---------------------------------------------------------------------------
# Main / CLI
# ---------------------------------------------------------------------------
def main(argv: Optional[list[str]] = None) -> int:
    ap = argparse.ArgumentParser(description="Generate typed Request/Response DTOs from OFBiz "
                                             "service defs, scoped to one or more controllers.")
    ap.add_argument("--controller", action="append", default=[],
                    help="Controller stem (e.g. 'Workeffort'). May be repeated.")
    ap.add_argument("--all", action="store_true",
                    help="Generate DTOs for every controller in the CONTROLLERS registry.")
    args = ap.parse_args(argv)

    if not args.all and not args.controller:
        ap.error("specify --all or --controller <Name> (one or more)")

    selected = (list(CONTROLLERS) if args.all
                else [CONTROLLERS_BY_NAME[n] for n in args.controller
                      if n in CONTROLLERS_BY_NAME])
    unknown = [n for n in args.controller if n not in CONTROLLERS_BY_NAME]
    for n in unknown:
        print(f"WARN: unknown controller '{n}' (not in registry)", file=sys.stderr)

    MODEL_DIR.mkdir(parents=True, exist_ok=True)
    total_written = 0
    total_skipped = 0
    for spec in selected:
        print(f"==> {spec.name}Controller")
        w, s = generate_for_controller(spec)
        total_written += w
        total_skipped += s

    print()
    print(f"Total: {total_written} DTOs written across {len(selected)} controller(s); "
          f"{total_skipped} services skipped.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
