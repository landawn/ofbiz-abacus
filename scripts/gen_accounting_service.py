#!/usr/bin/env python3
"""Generate a typed AccountingService.java.

Disposition per service method:
  MAP      -> keep existing Map<String,Object> body verbatim (cross-module, no DTO)
  AUTO     -> generate typed single-entity CRUD body (create/update/delete/expire)
  CURATED  -> hand-written typed body from CURATED dict
  STUB     -> typed placeholder returning success+message

Entity-auto services (from servicedef) are AUTO. A handful of java/simple/groovy
services that are really single-entity CRUD are listed in AUTO_EXTRA. Everything
else complex is CURATED (if a body is provided) or STUB.
"""
import re, json, os, sys

ROOT = r"C:\Users\haiyangl\Landawn\ofbiz-abacus"
SRCJ = os.path.join(ROOT, "src", "main", "java", "com", "landawn", "ofbiz")
ENT = os.path.join(SRCJ, "entity")
DAO = os.path.join(SRCJ, "dao")
SVC_FILE = os.path.join(SRCJ, "service", "AccountingService.java")

routes = json.load(open(os.path.join(ROOT, "scripts", "accounting_routes.json"), encoding="utf-8"))["svc"]
sdef = json.load(open(os.path.join(ROOT, "scripts", "accounting_servicedef.json"), encoding="utf-8"))

cap = lambda s: s[0].upper() + s[1:]
camel = lambda s: s[0].lower() + s[1:]

def entity_path(e): return os.path.join(ENT, e + ".java")
def entity_exists(e): return e and os.path.exists(entity_path(e))
def dao_exists(e): return e and os.path.exists(os.path.join(DAO, e + "Dao.java"))

_pk_cache = {}
def entity_pks(e):
    if e in _pk_cache: return _pk_cache[e]
    if not entity_exists(e):
        _pk_cache[e] = None; return None
    txt = open(entity_path(e), encoding="utf-8").read()
    pks = []
    for m in re.finditer(r'@Id\b\s*(?:@[^\n]*\n\s*)*private\s+\w[\w<>.]*\s+(\w+)\s*;', txt):
        pks.append(m.group(1))
    _pk_cache[e] = pks
    return pks

def entity_has_field(e, f):
    if not entity_exists(e): return False
    txt = open(entity_path(e), encoding="utf-8").read()
    return re.search(r'private\s+\w[\w<>.]*\s+' + re.escape(f) + r'\s*;', txt) is not None

# ---- extract existing method bodies (for MAP verbatim) ----
src = open(SVC_FILE, encoding="utf-8").read()
def extract_methods(s):
    out = {}
    for m in re.finditer(r'\n    public (?:Map<String, Object>|[A-Za-z0-9_]+) (\w+)\(', s):
        name = m.group(1)
        # locate first '{' after the ')' that closes the param list
        i = m.start() + 1
        # find '{' of body
        brace = s.index('{', m.end())
        depth = 0; j = brace
        while j < len(s):
            if s[j] == '{': depth += 1
            elif s[j] == '}':
                depth -= 1
                if depth == 0:
                    break
            j += 1
        out[name] = s[i:j+1]
    return out
existing = extract_methods(src)

MAP_METHODS = {n for n in routes if "MAP" in routes[n]["resp_types"]}
MAP_METHODS.add("test")

# java/simple/groovy services that are really single-entity CRUD -> (op, entity)
AUTO_EXTRA = {
    "createInvoice": ("create", "Invoice"),
    "createInvoiceItem": ("create", "InvoiceItem"),
    "createAcctgTrans": ("create", "AcctgTrans"),
    "createAcctgTransEntry": ("create", "AcctgTransEntry"),
    "createFinAccount": ("create", "FinAccount"),
    "createFinAccountAuth": ("create", "FinAccountAuth"),
    "createFinAccountRole": ("create", "FinAccountRole"),
    "createFinAccountTrans": ("create", "FinAccountTrans"),
    "createPaymentApplication": ("create", "PaymentApplication"),
    "createPaymentGroupMember": ("create", "PaymentGroupMember"),
    "createPartyAcctgPreference": ("create", "PartyAcctgPreference"),
    "createPartyTaxAuthInfo": ("create", "PartyTaxAuthInfo"),
    "deleteAcctgTransEntry": ("delete", "AcctgTransEntry"),
    "updateInvoice": ("update", "Invoice"),
    "updatePayment": ("update", "Payment"),
    "updateFinAccount": ("update", "FinAccount"),
    "updateAcctgTransEntry": ("update", "AcctgTransEntry"),
    "updatePartyTaxAuthInfo": ("update", "PartyTaxAuthInfo"),
    "updateGlAccountCategoryMember": ("update", "GlAccountCategoryMember"),
    "removeInvoiceItem": ("delete", "InvoiceItem"),
    "removePaymentApplication": ("delete", "PaymentApplication"),
    "expireFinAccountAuth": ("expire", "FinAccountAuth"),
    "expirePaymentGroupMember": ("expire", "PaymentGroupMember"),
    "updatePaymentGatewayConfig": ("update", "PaymentGatewayConfig"),
    "updatePaymentGatewayConfigType": ("update", "PaymentGatewayConfigType"),
    "updatePaymentGatewayConfigCyberSource": ("update", "PaymentGatewayCyberSource"),
    "updatePaymentGatewayConfigPayPal": ("update", "PaymentGatewayPayPal"),
    "updatePaymentGatewayConfigPayflowPro": ("update", "PaymentGatewayPayflowPro"),
    "updatePaymentGatewayConfigSecurePay": ("update", "PaymentGatewaySecurePay"),
    "updatePaymentGatewayConfigWorldPay": ("update", "PaymentGatewayWorldPay"),
    "createFixedAssetMaint": ("create", "FixedAssetMaint"),
    "updateFixedAssetMaint": ("update", "FixedAssetMaint"),
    "createFixedAssetMaintOrder": ("create", "FixedAssetMaintOrder"),
    "updateInvoiceItem": ("update", "InvoiceItem"),
    "updatePaymentApplicationDef": ("update", "PaymentApplication"),
}

# OUT-declared sequence fields that the create service should generate when empty
SEQ_OUT = {"budgetItemSeqId", "partyPrefDocTypeTplId"}

CURATED = {}  # filled by curated_bodies(); name -> full method text (typed)

# ---------------- code generation helpers ----------------
MODEL = os.path.join(SRCJ, "model", "accounting")
def dto_exists(n): return os.path.exists(os.path.join(MODEL, n + ".java"))

def req_resp(name):
    r = routes[name]
    req = next((t for t in r["req_types"] if t != "Map"), None)
    resp = next((t for t in r["resp_types"] if t != "MAP"), None)
    # GET/param endpoints record req_types={"Map"} even when a typed DTO exists; derive it.
    if req is None and dto_exists(cap(name) + "Request"):
        req = cap(name) + "Request"
    if resp is None and dto_exists(cap(name) + "Response"):
        resp = cap(name) + "Response"
    return req, resp

def dao_var(entity): return camel(entity) + "Dao"

def gen_auto(name, op, entity):
    req, resp = req_resp(name)
    pks = entity_pks(entity)
    if not entity_exists(entity) or not dao_exists(entity) or not pks:
        return None  # fall back to stub
    dv = dao_var(entity)
    composite = len(pks) > 1
    pk0 = pks[0]
    L = []
    sig = f"    public {resp} {name}({req} req) throws SQLException {{"
    if op == "create":
        L.append(f"        {entity} e = new {entity}();")
        L.append("        ServiceInput.populate(e, req);")
        if not composite:
            L.append(f"        if (Strings.isEmpty(e.get{cap(pk0)}())) e.set{cap(pk0)}(SequenceUtil.next());")
        else:
            if "fromDate" in pks and entity_has_field(entity, "fromDate"):
                L.append("        if (e.getFromDate() == null) e.setFromDate(nowTs());")
            for p in pks:
                if p in SEQ_OUT:
                    L.append(f"        if (Strings.isEmpty(e.get{cap(p)}())) e.set{cap(p)}(SequenceUtil.next());")
        L.append(f"        {dv}.insert(e);")
        L.append(f"        return ServiceResponse.ok({resp}::new, e);")
    elif op == "update":
        if not composite:
            L.append(f"        String id = req.get{cap(pk0)}();")
            L.append(f"        {entity} e = {dv}.gett(id);")
            L.append(f'        if (e == null) return ServiceResponse.error("{entity} not found: " + id, {resp}::new);')
            L.append("        ServiceInput.populate(e, req);")
            L.append(f"        {dv}.update(e);")
            L.append(f"        return ServiceResponse.ok({resp}::new, e);")
        else:
            L.append(f"        {entity} probe = new {entity}();")
            L.append("        ServiceInput.populate(probe, req);")
            L.append(f"        {entity} e = {dv}.gett(probe);")
            L.append(f'        if (e == null) return ServiceResponse.error("{entity} not found", {resp}::new);')
            L.append("        ServiceInput.populate(e, req);")
            L.append(f"        {dv}.update(e);")
            L.append(f"        return ServiceResponse.ok({resp}::new, e);")
    elif op in ("delete", "remove"):
        if not composite:
            L.append(f"        {dv}.deleteById(req.get{cap(pk0)}());")
            L.append(f"        return ServiceResponse.ok({resp}::new);")
        else:
            L.append(f"        {entity} pk = new {entity}();")
            L.append("        ServiceInput.populate(pk, req);")
            L.append(f"        {dv}.delete(pk);")
            L.append(f"        return ServiceResponse.ok({resp}::new);")
    elif op == "expire":
        if not entity_has_field(entity, "thruDate"):
            return None
        if not composite:
            L.append(f"        {entity} e = {dv}.gett(req.get{cap(pk0)}());")
            L.append(f'        if (e == null) return ServiceResponse.error("{entity} not found", {resp}::new);')
        else:
            L.append(f"        {entity} probe = new {entity}();")
            L.append("        ServiceInput.populate(probe, req);")
            L.append(f"        {entity} e = {dv}.gett(probe);")
            L.append(f'        if (e == null) return ServiceResponse.error("{entity} not found", {resp}::new);')
        L.append("        e.setThruDate(nowTs());")
        L.append(f"        {dv}.update(e);")
        L.append(f"        return ServiceResponse.ok({resp}::new, e);")
    else:
        return None
    return sig + "\n" + "\n".join(L) + "\n    }", entity

def gen_stub(name):
    req, resp = req_resp(name)
    if not req or not resp:
        return None
    return f"    public {resp} {name}({req} req) {{ return notPortedYet({resp}::new, \"{name}\"); }}", None

# ---------------- build plan ----------------
plan = {}      # name -> ('MAP'|'AUTO'|'CURATED'|'STUB', text)
used_entities = set()
disposition = {"MAP": [], "AUTO": [], "CURATED": [], "STUB": []}

# import curated bodies from sibling module if present
try:
    import accounting_curated
    CURATED = accounting_curated.CURATED
    USED = getattr(accounting_curated, "USED_DAOS", set())
except Exception:
    USED = set()

for name in sorted(routes):
    if name in MAP_METHODS:
        plan[name] = ("MAP", "    " + existing[name].strip().replace("\n", "\n").rstrip())
        disposition["MAP"].append(name)
        continue
    if name in CURATED:
        plan[name] = ("CURATED", CURATED[name].rstrip())
        disposition["CURATED"].append(name)
        continue
    d = sdef.get(name, {})
    op = None; entity = None
    if d.get("engine") == "entity-auto":
        op, entity = d.get("invoke"), d.get("entity")
    elif name in AUTO_EXTRA:
        op, entity = AUTO_EXTRA[name]
    if op and entity:
        res = gen_auto(name, op, entity)
        if res:
            text, ent = res
            plan[name] = ("AUTO", text)
            used_entities.add(ent)
            disposition["AUTO"].append(name)
            continue
    st = gen_stub(name)
    if st:
        plan[name] = ("STUB", st[0])
        disposition["STUB"].append(name)
    else:
        # no DTO and not map? keep verbatim if exists
        plan[name] = ("MAP", "    " + existing[name].strip())
        disposition["MAP"].append(name)

# ---- DAO fields: union of entities used by AUTO + curated USED ----
dao_entities = set(used_entities)
dao_fields = sorted({dao_var(e): e for e in dao_entities}.items())

print("DISPOSITION:", {k: len(v) for k, v in disposition.items()})
print("\nSTUB methods (", len(disposition["STUB"]), "):")
for n in disposition["STUB"]:
    print("  ", n)
print("\nAUTO entities used:", len(dao_entities))

# write plan to json for reference
json.dump({n: dict(kind=plan[n][0], text=plan[n][1]) for n in plan},
          open(os.path.join(ROOT, "scripts", "accounting_plan.json"), "w", encoding="utf-8"), indent=1)

# ---------------- assemble AccountingService.java ----------------
# keep test() verbatim (unexposed framework chain-test)
test_method = "    " + existing["test"].strip() if "test" in existing else None

bodies = []
for name in sorted(plan):
    bodies.append(plan[name][1])
if test_method:
    bodies.append(test_method)
all_text = "\n\n".join(bodies)

# DAO fields = every `<lowerCamel>Dao.` reference across all emitted bodies
dao_vars = sorted(set(re.findall(r'\b([a-z][A-Za-z0-9]*Dao)\b\s*\.', all_text)))
dao_field_lines = "\n".join(
    f"    @Autowired private {cap(v)} {v};" for v in dao_vars)

header = '''/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.util.Beans;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.*;
import com.landawn.ofbiz.entity.*;
import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.accounting.*;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the OFBiz accounting services exposed by {@link com.landawn.ofbiz.controller.AccountingController}.
 *
 * <p>Signatures are typed: each method takes its generated {@code *Request} DTO and returns its
 * {@code *Response} DTO (the model.accounting package). The entity-auto CRUD subset (create/update/
 * delete/expire across the AcctgTrans, Agreement, BillingAccount, Budget, FinAccount, FixedAsset,
 * GlAccount/Journal/Reconciliation, Invoice, Payment, TaxAuthority and gateway-config families) is
 * fully implemented against the abacus DAOs. Heavier workflow services (payment capture/auth/refund,
 * GL posting, commission invoices, bank reconciliation, gateway integrations, CSV import) carry typed
 * {@code notPortedYet} placeholders pending a business-logic port. A few cross-module services
 * (product/vendor/supplier/workeffort/customTimePeriod) keep loosely-typed {@code Map} signatures
 * because no per-service DTO is generated for them in this module.
 *
 * <p><b>Generated by scripts/gen_accounting_service.py</b> — edit curated bodies in
 * scripts/accounting_curated.py and re-run, rather than hand-editing this file.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class AccountingService {

    private static Map<String, Object> notPortedYet(String serviceName) {
        return ServiceResponse.successWithMessage(
                serviceName + " not yet ported (placeholder; see AccountingService Javadoc)", null);
    }

    private static <T extends ResponseBase> T notPortedYet(Supplier<T> factory, String serviceName) {
        T r = ServiceResponse.ok(factory);
        r.setSuccessMessage(serviceName + " not yet ported (placeholder; see AccountingService Javadoc)");
        return r;
    }

    private static Timestamp nowTs() { return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS)); }

'''

out = header + dao_field_lines + "\n\n" + all_text + "\n}\n"
with open(SVC_FILE, "w", encoding="utf-8", newline="\n") as f:
    f.write(out)
print(f"\nwrote {SVC_FILE}")
print("DAO fields:", len(dao_vars))
print("methods emitted:", len(bodies))
