package com.landawn.ofbiz.controller;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.landawn.ofbiz.service.WorkeffortService;

@RestController
@RequestMapping("/workeffort")
public class WorkeffortController {

    private final WorkeffortService service;

    public WorkeffortController(WorkeffortService service) {
        this.service = service;
    }

    /**
     * Duplicate a Work Effort. If workEffortId is empty a new workEffortId will be generated. Set the statusId of the new WorkEffort to this status, otherwise, set the status to the first of the sequenceId of the statusTypeId
     * <p>service: duplicateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/workeffort/control/DuplicateWorkEffort")
    public ResponseEntity<Map<String, Object>> duplicateWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.duplicateWorkEffort(body));
    }

    /**
     * Create a WorkEffort Entity
     * <p>service: createWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/workeffort/control/WorkEffort/create")
    public ResponseEntity<Map<String, Object>> createWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createWorkEffort(body));
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/workeffort/control/WorkEffort/update")
    public ResponseEntity<Map<String, Object>> updateWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.updateWorkEffort(body));
    }

    /**
     * Add Timesheet to Invoice
     * <p>service: addTimesheetToInvoice  entities: Timesheet, TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/addTimesheetToInvoice")
    public ResponseEntity<Map<String, Object>> addTimesheetToInvoice(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.addTimesheetToInvoice(body));
    }

    /**
     * Add Timesheet to a NEW Invoice. Stub until the Accounting createInvoice service is ported.
     * <p>service: addTimesheetToNewInvoice  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/addTimesheetToNewInvoice")
    public ResponseEntity<Map<String, Object>> addTimesheetToNewInvoice(@RequestBody Map<String, Object> body) {
        return ResponseEntity.ok(service.addTimesheetToNewInvoice(body));
    }

    /**
     * Chain test endpoint — OFBiz framework's no-op self-test service.
     * <p>service: test  entities: -  auth: false
     */
    @GetMapping("/workeffort/control/chain")
    public ResponseEntity<Map<String, Object>> test(@RequestParam Map<String, String> params) {
        return ResponseEntity.ok(service.test(Map.copyOf(params)));
    }

    /**
     * Creates TimeEntry
     * <p>service: createTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/createQuickTimeEntry")
    public ResponseEntity<Map<String, Object>> createTimeEntry(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createTimeEntry(body));
    }

    /**
     * Creates Timesheet
     * <p>service: createTimesheet  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheet")
    public ResponseEntity<Map<String, Object>> createTimesheet(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createTimesheet(body));
    }

    /**
     * Creates TimeEntry (alias of createQuickTimeEntry — same backing service).
     * <p>service: createTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheetEntry")
    public ResponseEntity<Map<String, Object>> createTimeEntryCreateTimesheetEntry(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createTimeEntry(body));
    }

    /**
     * Creates Timesheet for this week if no required date specified.
     * <p>service: createTimesheetForThisWeek  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheetForThisWeek")
    public ResponseEntity<Map<String, Object>> createTimesheetForThisWeek(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createTimesheetForThisWeek(body));
    }

    /**
     * Creates TimesheetRole
     * <p>service: createTimesheetRole  entities: TimesheetRole  auth: true
     */
    @PostMapping("/workeffort/control/createTimesheetRole")
    public ResponseEntity<Map<String, Object>> createTimesheetRole(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createTimesheetRole(body));
    }

    /**
     * Create a WorkEffort Entity (alias of WorkEffort/create — same backing service).
     * <p>service: createWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffort")
    public ResponseEntity<Map<String, Object>> createWorkEffortCreateWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createWorkEffort(body));
    }

    /**
     * Creates a WorkEffort entity and WorkEffortAssoc
     * <p>service: createWorkEffortAndAssoc  entities: WorkEffort, WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAndAssoc")
    public ResponseEntity<Map<String, Object>> createWorkEffortAndAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createWorkEffortAndAssoc(body));
    }

    /**
     * Create a WorkEffort Entity and assign to a party
     * <p>service: createWorkEffortAndPartyAssign  entities: WorkEffort, WorkEffortPartyAssignment  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAndPartyAssign")
    public ResponseEntity<Map<String, Object>> createWorkEffortAndPartyAssign(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createWorkEffortAndPartyAssign(body));
    }

    /**
     * Create a WorkEffort Assoc, for linking task to describe a project or for linking routing with its routingTasks
     * <p>service: createWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortAssoc")
    public ResponseEntity<Map<String, Object>> createWorkEffortAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createWorkEffortAssoc(body));
    }

    /**
     * Create WorkEffortContactMech; if contactMechId is not provided, a new contact mech is created (if partyId is set then the new contact mech is also associated to the party)
     * <p>service: createWorkEffortContactMech  entities: PartyContactMech, WorkEffortContactMech, ContactMech  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortContactMech")
    public ResponseEntity<Map<String, Object>> createWorkEffortContactMech(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createWorkEffortContactMech(body));
    }

    /**
     * Create a Work Effort Keyword
     * <p>service: createWorkEffortKeywords  entities: WorkEffortKeyword  auth: true
     */
    @PostMapping("/workeffort/control/createWorkEffortKeywords")
    public ResponseEntity<Map<String, Object>> createWorkEffortKeywords(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.createWorkEffortKeywords(body));
    }

    /**
     * Deletes TimeEntry
     * <p>service: deleteTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/deleteTimesheetEntry")
    public ResponseEntity<Map<String, Object>> deleteTimeEntry(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.deleteTimeEntry(body));
    }

    /**
     * Deletes TimesheetRole
     * <p>service: deleteTimesheetRole  entities: TimesheetRole  auth: true
     */
    @PostMapping("/workeffort/control/deleteTimesheetRole")
    public ResponseEntity<Map<String, Object>> deleteTimesheetRole(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.deleteTimesheetRole(body));
    }

    /**
     * Delete a WorkEffort Entity
     * <p>service: deleteWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/workeffort/control/deleteWorkEffort")
    public ResponseEntity<Map<String, Object>> deleteWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.deleteWorkEffort(body));
    }

    /**
     * Delete WorkEffortContactMech
     * <p>service: deleteWorkEffortContactMech  entities: WorkEffortContactMech  auth: true
     */
    @PostMapping("/workeffort/control/deleteWorkEffortContactMech")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortContactMech(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.deleteWorkEffortContactMech(body));
    }

    /**
     * Remove all Work Effort Keyword
     * <p>service: deleteWorkEffortKeywords  entities: WorkEffortKeyword  auth: true
     */
    @PostMapping("/workeffort/control/deleteWorkEffortKeywords")
    public ResponseEntity<Map<String, Object>> deleteWorkEffortKeywords(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.deleteWorkEffortKeywords(body));
    }

    /**
     * Updates Timesheet
     * <p>service: updateTimesheet  entities: Timesheet  auth: true
     */
    @PostMapping("/workeffort/control/updateTimesheet")
    public ResponseEntity<Map<String, Object>> updateTimesheet(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.updateTimesheet(body));
    }

    /**
     * Updates TimeEntry
     * <p>service: updateTimeEntry  entities: TimeEntry  auth: true
     */
    @PostMapping("/workeffort/control/updateTimesheetEntry")
    public ResponseEntity<Map<String, Object>> updateTimeEntry(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.updateTimeEntry(body));
    }

    /**
     * Update a WorkEffort Entity (alias of WorkEffort/update — same backing service).
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/workeffort/control/updateWorkEffort")
    public ResponseEntity<Map<String, Object>> updateWorkEffortUpdateWorkEffort(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.updateWorkEffort(body));
    }

    /**
     * Update a WorkEffort entity and its WorkEffortAssoc together (engine="group" fan-out).
     * <p>service: updateWorkEffortAndAssoc  entities: WorkEffort, WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/updateWorkEffortAndAssoc")
    public ResponseEntity<Map<String, Object>> updateWorkEffortAndAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.updateWorkEffortAndAssoc(body));
    }

    /**
     * Update a WorkEffort Assoc, for linking task to describe a project or for linking routing with its routingTasks
     * <p>service: updateWorkEffortAssoc  entities: WorkEffortAssoc  auth: true
     */
    @PostMapping("/workeffort/control/updateWorkEffortAssoc")
    public ResponseEntity<Map<String, Object>> updateWorkEffortAssoc(@RequestBody Map<String, Object> body) throws SQLException {
        return ResponseEntity.ok(service.updateWorkEffortAssoc(body));
    }
}
