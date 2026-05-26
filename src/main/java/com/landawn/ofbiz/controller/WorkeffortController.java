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

import com.landawn.ofbiz.model.workeffort.AddTimesheetToInvoiceRequest;
import com.landawn.ofbiz.model.workeffort.AddTimesheetToInvoiceResponse;
import com.landawn.ofbiz.model.workeffort.AddTimesheetToNewInvoiceRequest;
import com.landawn.ofbiz.model.workeffort.AddTimesheetToNewInvoiceResponse;
import com.landawn.ofbiz.model.workeffort.CreateTimeEntryRequest;
import com.landawn.ofbiz.model.workeffort.CreateTimeEntryResponse;
import com.landawn.ofbiz.model.workeffort.CreateTimesheetForThisWeekRequest;
import com.landawn.ofbiz.model.workeffort.CreateTimesheetForThisWeekResponse;
import com.landawn.ofbiz.model.workeffort.CreateTimesheetRequest;
import com.landawn.ofbiz.model.workeffort.CreateTimesheetResponse;
import com.landawn.ofbiz.model.workeffort.CreateTimesheetRoleRequest;
import com.landawn.ofbiz.model.workeffort.CreateTimesheetRoleResponse;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortAndAssocRequest;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortAndAssocResponse;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortAndPartyAssignRequest;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortAndPartyAssignResponse;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortAssocRequest;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortAssocResponse;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortContactMechRequest;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortContactMechResponse;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortKeywordsRequest;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortKeywordsResponse;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortRequest;
import com.landawn.ofbiz.model.workeffort.CreateWorkEffortResponse;
import com.landawn.ofbiz.model.workeffort.DeleteTimeEntryRequest;
import com.landawn.ofbiz.model.workeffort.DeleteTimeEntryResponse;
import com.landawn.ofbiz.model.workeffort.DeleteTimesheetRoleRequest;
import com.landawn.ofbiz.model.workeffort.DeleteTimesheetRoleResponse;
import com.landawn.ofbiz.model.workeffort.DeleteWorkEffortContactMechRequest;
import com.landawn.ofbiz.model.workeffort.DeleteWorkEffortContactMechResponse;
import com.landawn.ofbiz.model.workeffort.DeleteWorkEffortKeywordsRequest;
import com.landawn.ofbiz.model.workeffort.DeleteWorkEffortKeywordsResponse;
import com.landawn.ofbiz.model.workeffort.DeleteWorkEffortRequest;
import com.landawn.ofbiz.model.workeffort.DeleteWorkEffortResponse;
import com.landawn.ofbiz.model.workeffort.DuplicateWorkEffortRequest;
import com.landawn.ofbiz.model.workeffort.DuplicateWorkEffortResponse;
import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.workeffort.TestResponse;
import com.landawn.ofbiz.model.workeffort.UpdateTimeEntryRequest;
import com.landawn.ofbiz.model.workeffort.UpdateTimeEntryResponse;
import com.landawn.ofbiz.model.workeffort.UpdateTimesheetRequest;
import com.landawn.ofbiz.model.workeffort.UpdateTimesheetResponse;
import com.landawn.ofbiz.model.workeffort.UpdateWorkEffortAndAssocRequest;
import com.landawn.ofbiz.model.workeffort.UpdateWorkEffortAndAssocResponse;
import com.landawn.ofbiz.model.workeffort.UpdateWorkEffortAssocRequest;
import com.landawn.ofbiz.model.workeffort.UpdateWorkEffortAssocResponse;
import com.landawn.ofbiz.model.workeffort.UpdateWorkEffortRequest;
import com.landawn.ofbiz.model.workeffort.UpdateWorkEffortResponse;
import com.landawn.ofbiz.service.ServiceResponse;
import com.landawn.ofbiz.service.WorkeffortService;

/**
 * REST surface for the 27 OFBiz workeffort endpoints. Each method delegates to one
 * {@link WorkeffortService} method and wraps the typed response DTO into a {@code ResponseEntity}.
 * Errors surfaced by the service (DTO with {@code errorMessage} set or {@code responseMessage} =
 * {@code "error"}/{@code "fail"}) map to HTTP 400; permission failures throw
 * {@code PermissionDeniedException} which maps to HTTP 403.
 *
 * <p>The success / error envelope keys ({@code responseMessage}, {@code successMessage},
 * {@code errorMessage}, {@code errorMessageList}) live on
 * {@link com.landawn.ofbiz.model.ResponseBase}, so a client always sees the same shape per
 * endpoint regardless of outcome.
 */
@RestController
@RequestMapping("/workeffort")
public class WorkeffortController {

    private final WorkeffortService service;

    public WorkeffortController(WorkeffortService service) {
        this.service = service;
    }

    /** 200/400 routing decided by the response DTO's envelope state. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
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
    public ResponseEntity<DuplicateWorkEffortResponse> duplicateWorkEffort(
            @RequestBody DuplicateWorkEffortRequest request) throws SQLException {
        return wrap(service.duplicateWorkEffort(request));
    }

    /**
     * Create a WorkEffort entity. Runs the 4 OFBiz SECAs on commit (quickAssignParty,
     * makeCommunicationEventWorkEffort, assocAcceptedCustRequestToWorkEffort,
     * createWorkRequirementFulfillment).
     * <p>service: createWorkEffort  entities: WorkEffort, WorkEffortStatus  auth: true
     */
    @PostMapping("/workeffort/control/WorkEffort/create")
    public ResponseEntity<CreateWorkEffortResponse> createWorkEffort(
            @RequestBody CreateWorkEffortRequest request) throws SQLException {
        return wrap(service.createWorkEffort(request));
    }

    /**
     * Update a WorkEffort. Validates status transitions against {@code StatusValidChange} and
     * writes a WorkEffortStatus history row when currentStatusId changes.
     * <p>service: updateWorkEffort  entities: WorkEffort, WorkEffortStatus  auth: true
     */
    @PostMapping("/workeffort/control/WorkEffort/update")
    public ResponseEntity<UpdateWorkEffortResponse> updateWorkEffort(
            @RequestBody UpdateWorkEffortRequest request) throws SQLException {
        return wrap(service.updateWorkEffort(request));
    }

    /**
     * Link every unbilled TimeEntry on the supplied timesheet to the supplied invoiceId and
     * mint an InvoiceItem per entry (rate adjusted by PartyRate.percentageUsed, amount from
     * RateAmount).
     * <p>service: addTimesheetToInvoice  entities: Timesheet, TimeEntry, Invoice, InvoiceItem  auth: true
     */
    @PostMapping("/workeffort/control/addTimesheetToInvoice")
    public ResponseEntity<AddTimesheetToInvoiceResponse> addTimesheetToInvoice(
            @RequestBody AddTimesheetToInvoiceRequest request) throws SQLException {
        return wrap(service.addTimesheetToInvoice(request));
    }

    /**
     * Mint a new SALES_INVOICE in INVOICE_IN_PROCESS status (partyIdFrom + partyId from body) and
     * then delegate to addTimesheetToInvoice. The new invoiceId is echoed in the response.
     * <p>service: addTimesheetToNewInvoice  entities: Invoice, InvoiceItem, TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/addTimesheetToNewInvoice")
    public ResponseEntity<AddTimesheetToNewInvoiceResponse> addTimesheetToNewInvoice(
            @RequestBody AddTimesheetToNewInvoiceRequest request) throws SQLException {
        return wrap(service.addTimesheetToNewInvoice(request));
    }

    /**
     * Chain test endpoint — OFBiz framework's no-op self-test service. Free-form: query params are
     * echoed back unchanged, so the request stays as {@code Map<String,String>} rather than a
     * fixed schema.
     * <p>service: test  entities: -  auth: false
     */
    @GetMapping("/workeffort/control/chain")
    public ResponseEntity<TestResponse> test(@RequestParam Map<String, String> params) {
        return wrap(service.test(Map.copyOf(params)));
    }

    /**
     * Creates a TimeEntry (default fromDate = now).
     * <p>service: createTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/createQuickTimeEntry")
    public ResponseEntity<CreateTimeEntryResponse> createTimeEntry(
            @RequestBody CreateTimeEntryRequest request) throws SQLException {
        return wrap(service.createTimeEntry(request));
    }

    /**
     * Creates a Timesheet (default statusId TIMESHEET_IN_PROCESS).
     * <p>service: createTimesheet  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheet")
    public ResponseEntity<CreateTimesheetResponse> createTimesheet(
            @RequestBody CreateTimesheetRequest request) throws SQLException {
        return wrap(service.createTimesheet(request));
    }

    /** Alias of createQuickTimeEntry. */
    @PostMapping("/workeffort/control/createTimesheetEntry")
    public ResponseEntity<CreateTimeEntryResponse> createTimeEntryCreateTimesheetEntry(
            @RequestBody CreateTimeEntryRequest request) throws SQLException {
        return wrap(service.createTimeEntry(request));
    }

    /**
     * Creates a Timesheet for the week containing {@code requiredDate} (default: now). Errors if a
     * Timesheet for the same partyId / fromDate / thruDate already exists.
     * <p>service: createTimesheetForThisWeek  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheetForThisWeek")
    public ResponseEntity<CreateTimesheetForThisWeekResponse> createTimesheetForThisWeek(
            @RequestBody CreateTimesheetForThisWeekRequest request) throws SQLException {
        return wrap(service.createTimesheetForThisWeek(request));
    }

    /**
     * Creates a TimesheetRole row.
     * <p>service: createTimesheetRole  entities: TimesheetRole  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheetRole")
    public ResponseEntity<CreateTimesheetRoleResponse> createTimesheetRole(
            @RequestBody CreateTimesheetRoleRequest request) throws SQLException {
        return wrap(service.createTimesheetRole(request));
    }

    /** Alias of WorkEffort/create. */
    @PostMapping("/workeffort/control/createWorkEffort")
    public ResponseEntity<CreateWorkEffortResponse> createWorkEffortCreateWorkEffort(
            @RequestBody CreateWorkEffortRequest request) throws SQLException {
        return wrap(service.createWorkEffort(request));
    }

    /**
     * Creates a WorkEffort and its WorkEffortAssoc in one shot. The destination WorkEffort is
     * created if {@code workEffortIdTo} is absent.
     * <p>service: createWorkEffortAndAssoc  entities: WorkEffort, WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAndAssoc")
    public ResponseEntity<CreateWorkEffortAndAssocResponse> createWorkEffortAndAssoc(
            @RequestBody CreateWorkEffortAndAssocRequest request) throws SQLException {
        return wrap(service.createWorkEffortAndAssoc(request));
    }

    /**
     * Creates a WorkEffort and assigns it to a Party in the supplied role. Requires the
     * {@code (partyId, roleTypeId)} PartyRole to exist.
     * <p>service: createWorkEffortAndPartyAssign  entities: WorkEffort, WorkEffortPartyAssignment  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAndPartyAssign")
    public ResponseEntity<CreateWorkEffortAndPartyAssignResponse> createWorkEffortAndPartyAssign(
            @RequestBody CreateWorkEffortAndPartyAssignRequest request) throws SQLException {
        return wrap(service.createWorkEffortAndPartyAssign(request));
    }

    /**
     * Creates a WorkEffortAssoc (link between two work efforts). FromDate defaults to now.
     * <p>service: createWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAssoc")
    public ResponseEntity<CreateWorkEffortAssocResponse> createWorkEffortAssoc(
            @RequestBody CreateWorkEffortAssocRequest request) throws SQLException {
        return wrap(service.createWorkEffortAssoc(request));
    }

    /**
     * Creates a WorkEffortContactMech (and a fresh ContactMech if contactMechId is absent and
     * contactMechTypeId is supplied; if partyId is also supplied, the new ContactMech is linked
     * via PartyContactMech too).
     * <p>service: createWorkEffortContactMech  entities: ContactMech, PartyContactMech, WorkEffortContactMech  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortContactMech")
    public ResponseEntity<CreateWorkEffortContactMechResponse> createWorkEffortContactMech(
            @RequestBody CreateWorkEffortContactMechRequest request) throws SQLException {
        return wrap(service.createWorkEffortContactMech(request));
    }

    /**
     * Extracts keywords from the workEffort's name + description and inserts WorkEffortKeyword
     * rows for each token (lowercased, length &gt;= 2, stop-words filtered, dedup'd).
     * <p>service: createWorkEffortKeywords  entities: WorkEffortKeyword  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortKeywords")
    public ResponseEntity<CreateWorkEffortKeywordsResponse> createWorkEffortKeywords(
            @RequestBody CreateWorkEffortKeywordsRequest request) throws SQLException {
        return wrap(service.createWorkEffortKeywords(request));
    }

    /**
     * Deletes a TimeEntry by timeEntryId.
     * <p>service: deleteTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/deleteTimesheetEntry")
    public ResponseEntity<DeleteTimeEntryResponse> deleteTimeEntry(
            @RequestBody DeleteTimeEntryRequest request) throws SQLException {
        return wrap(service.deleteTimeEntry(request));
    }

    /**
     * Deletes a TimesheetRole.
     * <p>service: deleteTimesheetRole  entities: TimesheetRole  auth: true
     */
    @PostMapping("/workeffort/control/deleteTimesheetRole")
    public ResponseEntity<DeleteTimesheetRoleResponse> deleteTimesheetRole(
            @RequestBody DeleteTimesheetRoleRequest request) throws SQLException {
        return wrap(service.deleteTimesheetRole(request));
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
    public ResponseEntity<DeleteWorkEffortResponse> deleteWorkEffort(
            @RequestBody DeleteWorkEffortRequest request) throws SQLException {
        return wrap(service.deleteWorkEffort(request));
    }

    /**
     * Deletes a WorkEffortContactMech (composite PK delete).
     * <p>service: deleteWorkEffortContactMech  entities: WorkEffortContactMech  auth: true
     */
    @PostMapping("/workeffort/control/deleteWorkEffortContactMech")
    public ResponseEntity<DeleteWorkEffortContactMechResponse> deleteWorkEffortContactMech(
            @RequestBody DeleteWorkEffortContactMechRequest request) throws SQLException {
        return wrap(service.deleteWorkEffortContactMech(request));
    }

    /**
     * Removes all WorkEffortKeyword rows for the given workEffortId.
     * <p>service: deleteWorkEffortKeywords  entities: WorkEffortKeyword  auth: true
     */
    @PostMapping("/workeffort/control/deleteWorkEffortKeywords")
    public ResponseEntity<DeleteWorkEffortKeywordsResponse> deleteWorkEffortKeywords(
            @RequestBody DeleteWorkEffortKeywordsRequest request) throws SQLException {
        return wrap(service.deleteWorkEffortKeywords(request));
    }

    /**
     * Updates a Timesheet.
     * <p>service: updateTimesheet  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/updateTimesheet")
    public ResponseEntity<UpdateTimesheetResponse> updateTimesheet(
            @RequestBody UpdateTimesheetRequest request) throws SQLException {
        return wrap(service.updateTimesheet(request));
    }

    /**
     * Updates a TimeEntry. Guarded by checkTimesheetStatus (the parent Timesheet must be in
     * TIMESHEET_IN_PROCESS unless this update only sets the invoice linkage); hours are auto-
     * calculated from fromDate/thruDate when not supplied.
     * <p>service: updateTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/updateTimesheetEntry")
    public ResponseEntity<UpdateTimeEntryResponse> updateTimeEntry(
            @RequestBody UpdateTimeEntryRequest request) throws SQLException {
        return wrap(service.updateTimeEntry(request));
    }

    /** Alias of WorkEffort/update. */
    @PostMapping("/workeffort/control/updateWorkEffort")
    public ResponseEntity<UpdateWorkEffortResponse> updateWorkEffortUpdateWorkEffort(
            @RequestBody UpdateWorkEffortRequest request) throws SQLException {
        return wrap(service.updateWorkEffort(request));
    }

    /**
     * Updates a WorkEffort and its WorkEffortAssoc together (OFBiz {@code engine="group"} fan-out
     * to updateWorkEffort + updateWorkEffortAssoc).
     * <p>service: updateWorkEffortAndAssoc  entities: WorkEffort, WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/updateWorkEffortAndAssoc")
    public ResponseEntity<UpdateWorkEffortAndAssocResponse> updateWorkEffortAndAssoc(
            @RequestBody UpdateWorkEffortAndAssocRequest request) throws SQLException {
        return wrap(service.updateWorkEffortAndAssoc(request));
    }

    /**
     * Updates a WorkEffortAssoc (engine="entity-auto" update).
     * <p>service: updateWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/updateWorkEffortAssoc")
    public ResponseEntity<UpdateWorkEffortAssocResponse> updateWorkEffortAssoc(
            @RequestBody UpdateWorkEffortAssocRequest request) throws SQLException {
        return wrap(service.updateWorkEffortAssoc(request));
    }
}
