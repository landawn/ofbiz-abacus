package com.landawn.ofbiz.controller;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.landawn.ofbiz.service.ServiceResponse;
import com.landawn.ofbiz.service.WorkeffortService;

/**
 * REST surface for the 27 OFBiz workeffort endpoints. Each method delegates to one
 * {@link WorkeffortService} method and wraps the OFBiz-style result envelope into a
 * {@code ResponseEntity}. Errors surfaced by {@link ServiceResponse#error(String)} map to HTTP 400;
 * permission failures throw {@code PermissionDeniedException} which maps to HTTP 403.
 *
 * <p>For OFBiz endpoints whose original response was an HTML page render, this Spring port returns
 * a JSON envelope of the service's OUT attributes plus the {@code responseMessage} / optional
 * {@code successMessage} / {@code errorMessage} keys — no HTML.
 */
@RestController
@RequestMapping("/workeffort")
public class WorkeffortController {

    private final WorkeffortService service;

    public WorkeffortController(WorkeffortService service) {
        this.service = service;
    }

    /** Wraps a service result map into a 200/400 ResponseEntity based on the envelope. */
    private static ResponseEntity<Map<String, Object>> wrap(Map<String, Object> result) {
        return ServiceResponse.isError(result)
                ? ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /**
     * Duplicate a Work Effort. If workEffortId is empty a new workEffortId is generated. The new
     * status comes from the explicit {@code statusId}, or the first sequenceId of the source
     * statusType.
     * <p>service: duplicateWorkEffort  entities: WorkEffort, WorkEffortAssoc, WorkEffortNote,
     * WorkEffortContent, RateAmount  auth: true
     */
    @PostMapping("/workeffort/control/DuplicateWorkEffort")
    public ResponseEntity<Map<String, Object>> duplicateWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.duplicateWorkEffort(body));
    }

    /**
     * Create a WorkEffort entity. Runs the 4 OFBiz SECAs on commit (quickAssignParty,
     * makeCommunicationEventWorkEffort, assocAcceptedCustRequestToWorkEffort,
     * createWorkRequirementFulfillment).
     * <p>service: createWorkEffort  entities: WorkEffort, WorkEffortStatus  auth: true
     */
    @PostMapping("/workeffort/control/WorkEffort/create")
    public ResponseEntity<Map<String, Object>> createWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createWorkEffort(body));
    }

    /**
     * Update a WorkEffort. Validates status transitions against {@code StatusValidChange} and
     * writes a WorkEffortStatus history row when currentStatusId changes.
     * <p>service: updateWorkEffort  entities: WorkEffort, WorkEffortStatus  auth: true
     */
    @PostMapping("/workeffort/control/WorkEffort/update")
    public ResponseEntity<Map<String, Object>> updateWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.updateWorkEffort(body));
    }

    /**
     * Link every unbilled TimeEntry on the supplied timesheet to the supplied invoiceId and
     * mint an InvoiceItem per entry (rate adjusted by PartyRate.percentageUsed, amount from
     * RateAmount).
     * <p>service: addTimesheetToInvoice  entities: Timesheet, TimeEntry, Invoice, InvoiceItem  auth: true
     */
    @PostMapping("/workeffort/control/addTimesheetToInvoice")
    public ResponseEntity<Map<String, Object>> addTimesheetToInvoice(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.addTimesheetToInvoice(body));
    }

    /**
     * Mint a new SALES_INVOICE in INVOICE_IN_PROCESS status (partyIdFrom + partyId from body) and
     * then delegate to addTimesheetToInvoice. The new invoiceId is echoed in the response.
     * <p>service: addTimesheetToNewInvoice  entities: Invoice, InvoiceItem, TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/addTimesheetToNewInvoice")
    public ResponseEntity<Map<String, Object>> addTimesheetToNewInvoice(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.addTimesheetToNewInvoice(body));
    }

    /**
     * Chain test endpoint — OFBiz framework's no-op self-test service.
     * <p>service: test  entities: -  auth: false
     */
    @GetMapping("/workeffort/control/chain")
    public ResponseEntity<Map<String, Object>> test(@RequestParam Map<String, String> params) {
        return wrap(service.test(Map.copyOf(params)));
    }

    /**
     * Creates a TimeEntry (default fromDate = now).
     * <p>service: createTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/createQuickTimeEntry")
    public ResponseEntity<Map<String, Object>> createTimeEntry(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createTimeEntry(body));
    }

    /**
     * Creates a Timesheet (default statusId TIMESHEET_IN_PROCESS).
     * <p>service: createTimesheet  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheet")
    public ResponseEntity<Map<String, Object>> createTimesheet(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createTimesheet(body));
    }

    /** Alias of createQuickTimeEntry. */
    @PostMapping("/workeffort/control/createTimesheetEntry")
    public ResponseEntity<Map<String, Object>> createTimeEntryCreateTimesheetEntry(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createTimeEntry(body));
    }

    /**
     * Creates a Timesheet for the week containing {@code requiredDate} (default: now). Errors if a
     * Timesheet for the same partyId / fromDate / thruDate already exists.
     * <p>service: createTimesheetForThisWeek  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheetForThisWeek")
    public ResponseEntity<Map<String, Object>> createTimesheetForThisWeek(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createTimesheetForThisWeek(body));
    }

    /**
     * Creates a TimesheetRole row.
     * <p>service: createTimesheetRole  entities: TimesheetRole  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheetRole")
    public ResponseEntity<Map<String, Object>> createTimesheetRole(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createTimesheetRole(body));
    }

    /** Alias of WorkEffort/create. */
    @PostMapping("/workeffort/control/createWorkEffort")
    public ResponseEntity<Map<String, Object>> createWorkEffortCreateWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createWorkEffort(body));
    }

    /**
     * Creates a WorkEffort and its WorkEffortAssoc in one shot. The destination WorkEffort is
     * created if {@code workEffortIdTo} is absent.
     * <p>service: createWorkEffortAndAssoc  entities: WorkEffort, WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAndAssoc")
    public ResponseEntity<Map<String, Object>> createWorkEffortAndAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createWorkEffortAndAssoc(body));
    }

    /**
     * Creates a WorkEffort and assigns it to a Party in the supplied role. Requires the
     * {@code (partyId, roleTypeId)} PartyRole to exist.
     * <p>service: createWorkEffortAndPartyAssign  entities: WorkEffort, WorkEffortPartyAssignment  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAndPartyAssign")
    public ResponseEntity<Map<String, Object>> createWorkEffortAndPartyAssign(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createWorkEffortAndPartyAssign(body));
    }

    /**
     * Creates a WorkEffortAssoc (link between two work efforts). FromDate defaults to now.
     * <p>service: createWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAssoc")
    public ResponseEntity<Map<String, Object>> createWorkEffortAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createWorkEffortAssoc(body));
    }

    /**
     * Creates a WorkEffortContactMech (and a fresh ContactMech if contactMechId is absent and
     * contactMechTypeId is supplied; if partyId is also supplied, the new ContactMech is linked
     * via PartyContactMech too).
     * <p>service: createWorkEffortContactMech  entities: ContactMech, PartyContactMech, WorkEffortContactMech  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortContactMech")
    public ResponseEntity<Map<String, Object>> createWorkEffortContactMech(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createWorkEffortContactMech(body));
    }

    /**
     * Extracts keywords from the workEffort's name + description and inserts WorkEffortKeyword
     * rows for each token (lowercased, length &gt;= 2, stop-words filtered, dedup'd).
     * <p>service: createWorkEffortKeywords  entities: WorkEffortKeyword  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortKeywords")
    public ResponseEntity<Map<String, Object>> createWorkEffortKeywords(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.createWorkEffortKeywords(body));
    }

    /**
     * Deletes a TimeEntry by timeEntryId.
     * <p>service: deleteTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/deleteTimesheetEntry")
    public ResponseEntity<Map<String, Object>> deleteTimeEntry(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.deleteTimeEntry(body));
    }

    /**
     * Deletes a TimesheetRole.
     * <p>service: deleteTimesheetRole  entities: TimesheetRole  auth: true
     */
    @PostMapping("/workeffort/control/deleteTimesheetRole")
    public ResponseEntity<Map<String, Object>> deleteTimesheetRole(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.deleteTimesheetRole(body));
    }

    /**
     * Deletes a WorkEffort and cascades to every dependent: WorkEffortKeyword, WorkEffortStatus,
     * WorkEffortPartyAssignment, WorkEffortContactMech, WorkEffortAttribute,
     * WorkEffortFixedAssetAssign, WorkEffortSkillStandard, WorkEffortContent,
     * WorkOrderItemFulfillment, RateAmount, WorkEffortNote (+ NoteData), WorkEffortAssoc (from/to),
     * RecurrenceInfo, RuntimeData.
     * <p>service: deleteWorkEffort  entities: WorkEffort + 14 dependents  auth: true
     */
    @PostMapping("/workeffort/control/deleteWorkEffort")
    public ResponseEntity<Map<String, Object>> deleteWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.deleteWorkEffort(body));
    }

    /**
     * Deletes a WorkEffortContactMech (composite PK delete).
     * <p>service: deleteWorkEffortContactMech  entities: WorkEffortContactMech  auth: true
     */
    @PostMapping("/workeffort/control/deleteWorkEffortContactMech")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortContactMech(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.deleteWorkEffortContactMech(body));
    }

    /**
     * Removes all WorkEffortKeyword rows for the given workEffortId.
     * <p>service: deleteWorkEffortKeywords  entities: WorkEffortKeyword  auth: true
     */
    @PostMapping("/workeffort/control/deleteWorkEffortKeywords")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortKeywords(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.deleteWorkEffortKeywords(body));
    }

    /**
     * Updates a Timesheet.
     * <p>service: updateTimesheet  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/updateTimesheet")
    public ResponseEntity<Map<String, Object>> updateTimesheet(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.updateTimesheet(body));
    }

    /**
     * Updates a TimeEntry. Guarded by checkTimesheetStatus (the parent Timesheet must be in
     * TIMESHEET_IN_PROCESS unless this update only sets the invoice linkage); hours are auto-
     * calculated from fromDate/thruDate when not supplied.
     * <p>service: updateTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/updateTimesheetEntry")
    public ResponseEntity<Map<String, Object>> updateTimeEntry(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.updateTimeEntry(body));
    }

    /** Alias of WorkEffort/update. */
    @PostMapping("/workeffort/control/updateWorkEffort")
    public ResponseEntity<Map<String, Object>> updateWorkEffortUpdateWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.updateWorkEffort(body));
    }

    /**
     * Updates a WorkEffort and its WorkEffortAssoc together (OFBiz {@code engine="group"} fan-out
     * to updateWorkEffort + updateWorkEffortAssoc).
     * <p>service: updateWorkEffortAndAssoc  entities: WorkEffort, WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/updateWorkEffortAndAssoc")
    public ResponseEntity<Map<String, Object>> updateWorkEffortAndAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.updateWorkEffortAndAssoc(body));
    }

    /**
     * Updates a WorkEffortAssoc (engine="entity-auto" update).
     * <p>service: updateWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/updateWorkEffortAssoc")
    public ResponseEntity<Map<String, Object>> updateWorkEffortAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return wrap(service.updateWorkEffortAssoc(body));
    }
}
