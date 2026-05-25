#!/usr/bin/env python3
"""
Spring-side self-consistency replay for every endpoint in WorkeffortController.

Drives all 27 endpoints in dependency order against a running Spring instance,
asserts each returns a well-formed envelope (responseMessage=success/error,
plus the expected OUT attributes), and threads created IDs through to dependent
endpoints. Each row gets a pass/fail/skip and a one-line note.

Usage:
    1. mvn spring-boot:run            (in a separate shell)
    2. py scripts/replay_workeffort.py [--base-url http://localhost:8080]
"""
from __future__ import annotations

import argparse
import json
import sys
import time
import urllib.error
import urllib.request
from dataclasses import dataclass, field
from typing import Any, Callable, Optional


@dataclass
class Result:
    name: str
    method: str
    path: str
    status: Optional[int] = None
    body: Optional[dict] = None
    error: Optional[str] = None
    ok: bool = False
    note: str = ""


@dataclass
class Ctx:
    """Mutable bag of IDs minted by earlier endpoints, referenced by later ones."""
    we_id_1: Optional[str] = None
    we_id_2: Optional[str] = None
    we_id_3: Optional[str] = None
    we_id_dup: Optional[str] = None
    assoc_from: Optional[str] = None
    assoc_to: Optional[str] = None
    assoc_from_date: Optional[str] = None
    assoc2_from_date: Optional[str] = None
    # WorkEffortAssocType: WORK_EFF_DEPENDENCY exists in seed; MANAGER does not.
    assoc_type: str = "WORK_EFF_DEPENDENCY"
    contact_mech_id: Optional[str] = None
    contact_mech_from_date: Optional[str] = None
    timesheet_id_1: Optional[str] = None
    timesheet_id_2: Optional[str] = None
    # Only 'system' and '_NA_' party rows exist in the seed; PartyRole(system, PACKER) exists.
    timesheet_role_party: str = "system"
    timesheet_role_role: str = "PACKER"
    time_entry_id_1: Optional[str] = None
    time_entry_id_2: Optional[str] = None
    invoice_id_new: Optional[str] = None


def post(base_url: str, path: str, body: dict) -> tuple[Optional[int], Optional[dict], Optional[str]]:
    req = urllib.request.Request(
        base_url + path,
        data=json.dumps(body).encode("utf-8"),
        method="POST",
        headers={"Content-Type": "application/json"},
    )
    try:
        with urllib.request.urlopen(req, timeout=30) as resp:
            txt = resp.read().decode("utf-8", "replace")
            try:
                return resp.status, json.loads(txt), None
            except json.JSONDecodeError:
                return resp.status, None, f"non-JSON body: {txt[:120]}"
    except urllib.error.HTTPError as e:
        txt = e.read().decode("utf-8", "replace") if e.fp else ""
        try:
            return e.code, json.loads(txt), None
        except json.JSONDecodeError:
            return e.code, None, txt[:200]
    except urllib.error.URLError as e:
        return None, None, f"connect: {e.reason}"


def get(base_url: str, path: str) -> tuple[Optional[int], Optional[dict], Optional[str]]:
    req = urllib.request.Request(base_url + path, method="GET")
    try:
        with urllib.request.urlopen(req, timeout=30) as resp:
            txt = resp.read().decode("utf-8", "replace")
            try:
                return resp.status, json.loads(txt), None
            except json.JSONDecodeError:
                return resp.status, None, f"non-JSON body: {txt[:120]}"
    except urllib.error.HTTPError as e:
        txt = e.read().decode("utf-8", "replace") if e.fp else ""
        try:
            return e.code, json.loads(txt), None
        except json.JSONDecodeError:
            return e.code, None, txt[:200]
    except urllib.error.URLError as e:
        return None, None, f"connect: {e.reason}"


def evaluate(r: Result, expect_keys: list[str], expected_status: int = 200) -> None:
    """Mark r.ok / r.note based on status code, envelope shape, and required keys."""
    if r.error and r.status is None:
        r.ok = False
        r.note = r.error
        return
    if r.status != expected_status:
        r.ok = False
        r.note = f"want HTTP {expected_status}, got {r.status}"
        if r.body and "errorMessage" in r.body:
            r.note += f" ({r.body['errorMessage']})"
        return
    if not isinstance(r.body, dict):
        r.ok = False
        r.note = "no JSON body"
        return
    rm = r.body.get("responseMessage")
    if expected_status == 200 and rm != "success":
        r.ok = False
        r.note = f"responseMessage={rm!r}"
        return
    if expected_status >= 400 and rm not in ("error", "fail"):
        r.ok = False
        r.note = f"responseMessage={rm!r}"
        return
    missing = [k for k in expect_keys if k not in r.body]
    if missing:
        r.ok = False
        r.note = f"missing keys: {missing}"
        return
    r.ok = True
    summary_keys = [k for k in expect_keys if k != "responseMessage"]
    r.note = ", ".join(f"{k}={r.body[k]!r}" for k in summary_keys) or "ok"


# -----------------------------------------------------------------------------
# the 27 endpoint runners
# -----------------------------------------------------------------------------
WE_BASE = "/workeffort/workeffort/control"


def run_all(base_url: str) -> list[Result]:
    ctx = Ctx()
    results: list[Result] = []

    def step(name: str, method: str, path: str,
             body: Optional[dict], expect_keys: list[str],
             expected_status: int = 200,
             after: Optional[Callable[[Result], None]] = None) -> Result:
        full = path
        r = Result(name=name, method=method, path=full)
        if method == "POST":
            r.status, r.body, r.error = post(base_url, full, body or {})
        else:
            r.status, r.body, r.error = get(base_url, full)
        evaluate(r, expect_keys, expected_status)
        if after and r.ok:
            try:
                after(r)
            except Exception as e:
                r.ok = False
                r.note = f"{r.note} | post-hook: {e}"
        results.append(r)
        return r

    # --- 1. test (chain) ---
    step("test (chain)", "GET", f"{WE_BASE}/chain?foo=bar",
         body=None, expect_keys=["ok", "echo"])

    # --- 2 & 3. createWorkEffort (two URLs, same service) ---
    step("createWorkEffort (WorkEffort/create)", "POST", f"{WE_BASE}/WorkEffort/create",
         body={"workEffortTypeId": "TASK", "workEffortName": "Replay alpha",
               "currentStatusId": "_NA_", "userLoginId": "system"},
         expect_keys=["workEffortId"],
         after=lambda r: setattr(ctx, "we_id_1", r.body["workEffortId"]))
    step("createWorkEffort (alias /createWorkEffort)", "POST", f"{WE_BASE}/createWorkEffort",
         body={"workEffortTypeId": "TASK", "workEffortName": "Replay beta",
               "currentStatusId": "_NA_", "userLoginId": "system"},
         expect_keys=["workEffortId"],
         after=lambda r: setattr(ctx, "we_id_2", r.body["workEffortId"]))

    # --- 4 & 5. updateWorkEffort (two URLs) ---
    if ctx.we_id_1:
        step("updateWorkEffort (WorkEffort/update)", "POST", f"{WE_BASE}/WorkEffort/update",
             body={"workEffortId": ctx.we_id_1, "description": "updated A",
                   "userLoginId": "system"},
             expect_keys=["workEffortId"])
    if ctx.we_id_2:
        step("updateWorkEffort (alias /updateWorkEffort)", "POST", f"{WE_BASE}/updateWorkEffort",
             body={"workEffortId": ctx.we_id_2, "description": "updated B",
                   "userLoginId": "system"},
             expect_keys=["workEffortId"])

    # --- 6. createWorkEffortKeywords ---
    if ctx.we_id_1:
        step("createWorkEffortKeywords", "POST", f"{WE_BASE}/createWorkEffortKeywords",
             body={"workEffortId": ctx.we_id_1, "userLoginId": "system"},
             expect_keys=["workEffortId", "keywordsAdded"])

    # --- 7. createWorkEffortAssoc ---
    if ctx.we_id_1 and ctx.we_id_2:
        step("createWorkEffortAssoc", "POST", f"{WE_BASE}/createWorkEffortAssoc",
             body={"workEffortIdFrom": ctx.we_id_1, "workEffortIdTo": ctx.we_id_2,
                   "workEffortAssocTypeId": ctx.assoc_type, "userLoginId": "system"},
             expect_keys=["workEffortIdFrom", "workEffortIdTo",
                          "workEffortAssocTypeId", "fromDate"],
             after=lambda r: (setattr(ctx, "assoc_from", r.body["workEffortIdFrom"]),
                              setattr(ctx, "assoc_to", r.body["workEffortIdTo"]),
                              setattr(ctx, "assoc_from_date", r.body["fromDate"])))

    # --- 8. updateWorkEffortAssoc (fromDate is part of the composite PK, must pass it back). ---
    if ctx.assoc_from and ctx.assoc_from_date:
        step("updateWorkEffortAssoc", "POST", f"{WE_BASE}/updateWorkEffortAssoc",
             body={"workEffortIdFrom": ctx.assoc_from, "workEffortIdTo": ctx.assoc_to,
                   "workEffortAssocTypeId": ctx.assoc_type,
                   "fromDate": ctx.assoc_from_date,
                   "sequenceNum": 1, "userLoginId": "system"},
             expect_keys=["workEffortIdFrom"])

    # --- 9. createWorkEffortAndAssoc (mints a 3rd workeffort as the "to") ---
    # Use a different assoc type than step 7 so the composite PK doesn't collide. Capture fromDate
    # for step 10's update (the response doesn't echo it from this composite service; we re-derive
    # it by querying the assoc back via the same body).
    if ctx.we_id_1:
        r = step("createWorkEffortAndAssoc", "POST", f"{WE_BASE}/createWorkEffortAndAssoc",
                 body={"workEffortIdFrom": ctx.we_id_1,
                       "workEffortAssocTypeId": "WORK_EFF_BREAKDOWN",
                       "workEffortTypeId": "TASK",
                       "workEffortName": "Replay gamma (created via and-assoc)",
                       "currentStatusId": "_NA_", "userLoginId": "system"},
                 expect_keys=["workEffortIdFrom", "workEffortIdTo",
                              "workEffortAssocTypeId"])
        if r.ok and r.body and r.body.get("workEffortIdTo"):
            ctx.we_id_3 = r.body["workEffortIdTo"]
            # We don't get fromDate back from this service, so step 10 can't update by
            # composite-PK lookup. Skip step 10 if we don't have a fromDate.

    # --- 10. updateWorkEffortAndAssoc ---
    # The OFBiz service-group invokes updateWorkEffortAssoc which needs fromDate to look up the
    # assoc row. createWorkEffortAndAssoc doesn't echo fromDate, so we drive this with a fresh
    # assoc that we just created in step 7 (and whose fromDate we DO have).
    if ctx.we_id_1 and ctx.assoc_from_date and ctx.we_id_2:
        step("updateWorkEffortAndAssoc", "POST", f"{WE_BASE}/updateWorkEffortAndAssoc",
             body={"workEffortId": ctx.we_id_1,
                   "description": "updated via and-assoc",
                   "workEffortIdFrom": ctx.we_id_1, "workEffortIdTo": ctx.we_id_2,
                   "workEffortAssocTypeId": ctx.assoc_type,
                   "fromDate": ctx.assoc_from_date,
                   "sequenceNum": 2, "userLoginId": "system"},
             expect_keys=["workEffortId"])

    # --- 11. createWorkEffortAndPartyAssign ---
    # PartyRole(system, PACKER) exists in seed, so this should succeed end-to-end.
    if True:
        r = step("createWorkEffortAndPartyAssign", "POST",
                 f"{WE_BASE}/createWorkEffortAndPartyAssign",
                 body={"workEffortTypeId": "TASK",
                       "workEffortName": "Replay delta (party-assigned)",
                       "currentStatusId": "_NA_",
                       "partyId": "system", "roleTypeId": "PACKER",
                       "userLoginId": "system"},
                 expect_keys=["workEffortId"])

    # --- 12. createWorkEffortContactMech (mint ContactMech inline) ---
    if ctx.we_id_1:
        r = step("createWorkEffortContactMech", "POST", f"{WE_BASE}/createWorkEffortContactMech",
                 body={"workEffortId": ctx.we_id_1,
                       "contactMechTypeId": "EMAIL_ADDRESS",
                       "infoString": "replay@example.com",
                       "userLoginId": "system"},
                 expect_keys=["contactMechId"],
                 after=lambda r: setattr(ctx, "contact_mech_id", r.body["contactMechId"]))

    # --- 13. deleteWorkEffortContactMech ---
    if ctx.we_id_1 and ctx.contact_mech_id:
        # We need the fromDate. Since the service used now(), we approximate by skipping the
        # date filter; the underlying composite-PK delete with just (workEffortId, contactMechId)
        # won't match a real row. We expect 0 rows deleted but envelope success.
        step("deleteWorkEffortContactMech (without fromDate, expect 0 rows)", "POST",
             f"{WE_BASE}/deleteWorkEffortContactMech",
             body={"workEffortId": ctx.we_id_1,
                   "contactMechId": ctx.contact_mech_id,
                   "userLoginId": "system"},
             expect_keys=["deletedRows"])

    # --- 14 & 15. createTimesheet / updateTimesheet ---
    # 'system' is one of only two Party rows in seed; '_NA_' is the other.
    step("createTimesheet", "POST", f"{WE_BASE}/createTimesheet",
         body={"partyId": "system", "userLoginId": "system"},
         expect_keys=["timesheetId"],
         after=lambda r: setattr(ctx, "timesheet_id_1", r.body["timesheetId"]))
    if ctx.timesheet_id_1:
        step("updateTimesheet", "POST", f"{WE_BASE}/updateTimesheet",
             body={"timesheetId": ctx.timesheet_id_1, "comments": "replay",
                   "userLoginId": "system"},
             expect_keys=["timesheetId"])

    # --- 16. createTimesheetForThisWeek ---
    # Use _NA_ so it doesn't collide with the createTimesheet above (same fromDate/thruDate
    # would only collide if the same partyId is used).
    step("createTimesheetForThisWeek", "POST", f"{WE_BASE}/createTimesheetForThisWeek",
         body={"partyId": "_NA_", "userLoginId": "system"},
         expect_keys=["timesheetId"],
         after=lambda r: setattr(ctx, "timesheet_id_2", r.body["timesheetId"]))

    # --- 17 & 18. createTimesheetRole / deleteTimesheetRole ---
    if ctx.timesheet_id_1:
        step("createTimesheetRole", "POST", f"{WE_BASE}/createTimesheetRole",
             body={"timesheetId": ctx.timesheet_id_1,
                   "partyId": ctx.timesheet_role_party,
                   "roleTypeId": ctx.timesheet_role_role,
                   "userLoginId": "system"},
             expect_keys=["timesheetId", "partyId", "roleTypeId"])
        step("deleteTimesheetRole", "POST", f"{WE_BASE}/deleteTimesheetRole",
             body={"timesheetId": ctx.timesheet_id_1,
                   "partyId": ctx.timesheet_role_party,
                   "roleTypeId": ctx.timesheet_role_role,
                   "userLoginId": "system"},
             expect_keys=["deletedRows"])

    # --- 19 & 20. createTimeEntry (two aliases) ---
    if ctx.timesheet_id_1 and ctx.we_id_1:
        step("createTimeEntry (createQuickTimeEntry)", "POST", f"{WE_BASE}/createQuickTimeEntry",
             body={"timesheetId": ctx.timesheet_id_1, "workEffortId": ctx.we_id_1,
                   "partyId": "system", "hours": 3.5, "userLoginId": "system"},
             expect_keys=["timeEntryId"],
             after=lambda r: setattr(ctx, "time_entry_id_1", r.body["timeEntryId"]))
        step("createTimeEntry (alias createTimesheetEntry)", "POST",
             f"{WE_BASE}/createTimesheetEntry",
             body={"timesheetId": ctx.timesheet_id_1, "workEffortId": ctx.we_id_1,
                   "partyId": "system", "hours": 2.0, "userLoginId": "system"},
             expect_keys=["timeEntryId"],
             after=lambda r: setattr(ctx, "time_entry_id_2", r.body["timeEntryId"]))

    # --- 21. updateTimeEntry ---
    if ctx.time_entry_id_1:
        step("updateTimeEntry", "POST", f"{WE_BASE}/updateTimesheetEntry",
             body={"timeEntryId": ctx.time_entry_id_1, "hours": 4.0,
                   "comments": "replay update", "userLoginId": "system"},
             expect_keys=["timeEntryId"])

    # --- 22. deleteTimeEntry (the second one) ---
    if ctx.time_entry_id_2:
        step("deleteTimeEntry", "POST", f"{WE_BASE}/deleteTimesheetEntry",
             body={"timeEntryId": ctx.time_entry_id_2, "userLoginId": "system"},
             expect_keys=["deletedRows"])

    # --- 23 & 24. addTimesheetToNewInvoice then addTimesheetToInvoice ---
    if ctx.timesheet_id_1:
        r = step("addTimesheetToNewInvoice", "POST", f"{WE_BASE}/addTimesheetToNewInvoice",
                 body={"timesheetId": ctx.timesheet_id_1,
                       "partyIdFrom": "system", "partyId": "_NA_",
                       "userLoginId": "system"},
                 expect_keys=["invoiceId"])
        if r.ok and r.body and r.body.get("invoiceId"):
            ctx.invoice_id_new = r.body["invoiceId"]

    # For addTimesheetToInvoice we need a NEW timesheet whose time entries aren't already on an
    # invoice (the previous one was just consumed by addTimesheetToNewInvoice). Use timesheet_2.
    if ctx.timesheet_id_2 and ctx.invoice_id_new and ctx.we_id_1:
        # Add a time entry to timesheet_2 first so addTimesheetToInvoice has something to link.
        post(base_url, f"{WE_BASE}/createQuickTimeEntry",
             {"timesheetId": ctx.timesheet_id_2, "workEffortId": ctx.we_id_1,
              "partyId": "_NA_", "hours": 1.5, "userLoginId": "system"})
        step("addTimesheetToInvoice", "POST", f"{WE_BASE}/addTimesheetToInvoice",
             body={"timesheetId": ctx.timesheet_id_2, "invoiceId": ctx.invoice_id_new,
                   "userLoginId": "system"},
             expect_keys=["timesheetId", "invoiceId", "linkedTimeEntries",
                          "invoiceItemsCreated"])

    # --- 25. deleteWorkEffortKeywords ---
    if ctx.we_id_1:
        step("deleteWorkEffortKeywords", "POST", f"{WE_BASE}/deleteWorkEffortKeywords",
             body={"workEffortId": ctx.we_id_1, "userLoginId": "system"},
             expect_keys=["workEffortId", "deletedRows"])

    # --- 26. deleteWorkEffort (cascade) ---
    if ctx.we_id_1:
        step("deleteWorkEffort (cascade)", "POST", f"{WE_BASE}/deleteWorkEffort",
             body={"workEffortId": ctx.we_id_1, "userLoginId": "system"},
             expect_keys=["workEffortId"])

    # --- 27. duplicateWorkEffort ---
    if ctx.we_id_2:
        r = step("duplicateWorkEffort", "POST", f"{WE_BASE}/DuplicateWorkEffort",
                 body={"oldWorkEffortId": ctx.we_id_2,
                       "duplicateWorkEffortAssocs": "Y", "userLoginId": "system"},
                 expect_keys=["workEffortId"])
        if r.ok and r.body and r.body.get("workEffortId"):
            ctx.we_id_dup = r.body["workEffortId"]

    return results


def print_report(results: list[Result]) -> int:
    print()
    print(f"{'#':>3}  {'STATUS':6}  {'CODE':>4}  {'METHOD':6}  ENDPOINT")
    print("-" * 100)
    pass_n = fail_n = 0
    for i, r in enumerate(results, 1):
        status = "PASS" if r.ok else "FAIL"
        if r.ok: pass_n += 1
        else:    fail_n += 1
        code = str(r.status) if r.status is not None else "  - "
        # Trim path so the line stays readable
        short_path = r.path if len(r.path) <= 60 else "..." + r.path[-58:]
        print(f"{i:>3}  {status:6}  {code:>4}  {r.method:6}  {r.name}")
        print(f"          --> {short_path}")
        print(f"          --> {r.note}")
    print()
    print(f"Total: {len(results)}   pass={pass_n}   fail={fail_n}")
    return 0 if fail_n == 0 else 1


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--base-url", default="http://localhost:8080")
    args = ap.parse_args()

    # Sanity: is Spring up?
    print(f"Checking {args.base_url} ...")
    try:
        code, _, err = get(args.base_url, "/actuator/health")
        if err:
            print(f"WARN: actuator health probe failed: {err}", file=sys.stderr)
        else:
            print(f"  health check: HTTP {code}")
    except Exception as e:
        print(f"WARN: {e}", file=sys.stderr)

    t0 = time.time()
    results = run_all(args.base_url)
    elapsed = time.time() - t0
    rc = print_report(results)
    print(f"Elapsed: {elapsed:.2f}s")
    return rc


if __name__ == "__main__":
    sys.exit(main())
