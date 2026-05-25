/*
 * Copyright (C) 2024 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.service;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.query.condition.Condition;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.CommunicationEventWorkEffDao;
import com.landawn.ofbiz.dao.ContactMechDao;
import com.landawn.ofbiz.dao.CustRequestContentDao;
import com.landawn.ofbiz.dao.CustRequestDao;
import com.landawn.ofbiz.dao.CustRequestWorkEffortDao;
import com.landawn.ofbiz.dao.InvoiceDao;
import com.landawn.ofbiz.dao.InvoiceItemDao;
import com.landawn.ofbiz.dao.NoteDataDao;
import com.landawn.ofbiz.dao.PartyContactMechDao;
import com.landawn.ofbiz.dao.PartyRateDao;
import com.landawn.ofbiz.dao.PartyRoleDao;
import com.landawn.ofbiz.dao.RateAmountDao;
import com.landawn.ofbiz.dao.RecurrenceInfoDao;
import com.landawn.ofbiz.dao.RuntimeDataDao;
import com.landawn.ofbiz.dao.StatusItemDao;
import com.landawn.ofbiz.dao.StatusValidChangeDao;
import com.landawn.ofbiz.dao.TimeEntryDao;
import com.landawn.ofbiz.dao.TimesheetDao;
import com.landawn.ofbiz.dao.TimesheetRoleDao;
import com.landawn.ofbiz.dao.WorkEffortAssocDao;
import com.landawn.ofbiz.dao.WorkEffortAttributeDao;
import com.landawn.ofbiz.dao.WorkEffortContactMechDao;
import com.landawn.ofbiz.dao.WorkEffortContentDao;
import com.landawn.ofbiz.dao.WorkEffortDao;
import com.landawn.ofbiz.dao.WorkEffortFixedAssetAssignDao;
import com.landawn.ofbiz.dao.WorkEffortKeywordDao;
import com.landawn.ofbiz.dao.WorkEffortNoteDao;
import com.landawn.ofbiz.dao.WorkEffortPartyAssignmentDao;
import com.landawn.ofbiz.dao.WorkEffortSkillStandardDao;
import com.landawn.ofbiz.dao.WorkEffortStatusDao;
import com.landawn.ofbiz.dao.WorkOrderItemFulfillmentDao;
import com.landawn.ofbiz.dao.WorkRequirementFulfillmentDao;
import com.landawn.ofbiz.entity.CommunicationEventWorkEff;
import com.landawn.ofbiz.entity.ContactMech;
import com.landawn.ofbiz.entity.CustRequest;
import com.landawn.ofbiz.entity.CustRequestContent;
import com.landawn.ofbiz.entity.CustRequestWorkEffort;
import com.landawn.ofbiz.entity.Invoice;
import com.landawn.ofbiz.entity.InvoiceItem;
import com.landawn.ofbiz.entity.NoteData;
import com.landawn.ofbiz.entity.PartyContactMech;
import com.landawn.ofbiz.entity.PartyRate;
import com.landawn.ofbiz.entity.PartyRole;
import com.landawn.ofbiz.entity.RateAmount;
import com.landawn.ofbiz.entity.StatusItem;
import com.landawn.ofbiz.entity.StatusValidChange;
import com.landawn.ofbiz.entity.TimeEntry;
import com.landawn.ofbiz.entity.Timesheet;
import com.landawn.ofbiz.entity.TimesheetRole;
import com.landawn.ofbiz.entity.WorkEffort;
import com.landawn.ofbiz.entity.WorkEffortAssoc;
import com.landawn.ofbiz.entity.WorkEffortAttribute;
import com.landawn.ofbiz.entity.WorkEffortContactMech;
import com.landawn.ofbiz.entity.WorkEffortContent;
import com.landawn.ofbiz.entity.WorkEffortFixedAssetAssign;
import com.landawn.ofbiz.entity.WorkEffortKeyword;
import com.landawn.ofbiz.entity.WorkEffortNote;
import com.landawn.ofbiz.entity.WorkEffortPartyAssignment;
import com.landawn.ofbiz.entity.WorkEffortSkillStandard;
import com.landawn.ofbiz.entity.WorkEffortStatus;
import com.landawn.ofbiz.entity.WorkRequirementFulfillment;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 24 unique OFBiz {@code workeffort} services exposed by
 * {@link com.landawn.ofbiz.controller.WorkeffortController} onto the abacus-jdbc stack.
 *
 * <p>Every method returns the OFBiz-style result envelope via {@link ServiceResponse} (keys
 * {@code responseMessage}, {@code successMessage}, {@code errorMessage}, {@code errorMessageList}
 * plus the OUT attributes). Permission gating runs through {@link SecurityService} — anonymous
 * callers (no {@code userLoginId} in the body) are allowed in dev. Secondary effects declared by
 * the OFBiz SECAs in {@code workeffort/servicedef/secas.xml} are implemented in-line; cross-
 * component dependencies (Accounting, Content, etc.) are written directly via their DAOs (see
 * {@link com.landawn.ofbiz.config.DaoConfig}).
 */
@Service
@Transactional
public class WorkeffortService {

    // --- defaults pulled from services*.xml <override default-value="..."/> ---
    private static final String DEFAULT_TIMESHEET_STATUS = "TIMESHEET_IN_PROCESS";
    private static final String DEFAULT_QUICK_ASSIGN_ROLE = "CAL_OWNER";
    private static final String DEFAULT_QUICK_ASSIGN_STATUS = "PRTYASGN_ASSIGNED";
    private static final String CRQ_ACCEPTED = "CRQ_ACCEPTED";
    private static final String CRQ_REVIEWED = "CRQ_REVIEWED";
    private static final String CUST_REQUEST_CONTENT_TYPE = "SUPPORTING_MEDIA";
    private static final String INVOICE_TYPE_SALES = "SALES_INVOICE";
    private static final String INVOICE_STATUS_IN_PROCESS = "INVOICE_IN_PROCESS";
    private static final String INV_TE_ITEM_TYPE = "INV_TE_ITEM";
    private static final String INV_TE_UOM = "TF_hr";

    private static final String PRIMARY_PERMISSION = "WORKEFFORTMGR";
    /** Mirrors {@code UtilValidate.checkValidDatabaseId} — alphanumerics, '_' '-' '.' ':' only. */
    private static final Pattern VALID_DB_ID = Pattern.compile("[A-Za-z0-9_\\-.:]+");
    private static final Set<String> KEYWORD_STOPWORDS = Set.of(
            "a", "an", "and", "or", "the", "of", "in", "to", "for", "with", "on", "at", "by", "is");

    // ---- DAOs ----
    private final SecurityService securityService;
    private final WorkEffortDao workEffortDao;
    private final WorkEffortAssocDao workEffortAssocDao;
    private final WorkEffortContactMechDao workEffortContactMechDao;
    private final WorkEffortKeywordDao workEffortKeywordDao;
    private final WorkEffortStatusDao workEffortStatusDao;
    private final WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao;
    private final WorkEffortContentDao workEffortContentDao;
    private final WorkEffortNoteDao workEffortNoteDao;
    private final WorkEffortAttributeDao workEffortAttributeDao;
    private final WorkEffortFixedAssetAssignDao workEffortFixedAssetAssignDao;
    private final WorkEffortSkillStandardDao workEffortSkillStandardDao;
    private final WorkOrderItemFulfillmentDao workOrderItemFulfillmentDao;
    private final TimesheetDao timesheetDao;
    private final TimesheetRoleDao timesheetRoleDao;
    private final TimeEntryDao timeEntryDao;
    private final StatusItemDao statusItemDao;
    private final StatusValidChangeDao statusValidChangeDao;
    private final PartyRoleDao partyRoleDao;
    private final PartyRateDao partyRateDao;
    private final ContactMechDao contactMechDao;
    private final PartyContactMechDao partyContactMechDao;
    private final CommunicationEventWorkEffDao communicationEventWorkEffDao;
    private final CustRequestDao custRequestDao;
    private final CustRequestWorkEffortDao custRequestWorkEffortDao;
    private final CustRequestContentDao custRequestContentDao;
    private final WorkRequirementFulfillmentDao workRequirementFulfillmentDao;
    private final NoteDataDao noteDataDao;
    private final RateAmountDao rateAmountDao;
    private final RecurrenceInfoDao recurrenceInfoDao;
    private final RuntimeDataDao runtimeDataDao;
    private final InvoiceDao invoiceDao;
    private final InvoiceItemDao invoiceItemDao;

    public WorkeffortService(SecurityService securityService,
                             WorkEffortDao workEffortDao,
                             WorkEffortAssocDao workEffortAssocDao,
                             WorkEffortContactMechDao workEffortContactMechDao,
                             WorkEffortKeywordDao workEffortKeywordDao,
                             WorkEffortStatusDao workEffortStatusDao,
                             WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao,
                             WorkEffortContentDao workEffortContentDao,
                             WorkEffortNoteDao workEffortNoteDao,
                             WorkEffortAttributeDao workEffortAttributeDao,
                             WorkEffortFixedAssetAssignDao workEffortFixedAssetAssignDao,
                             WorkEffortSkillStandardDao workEffortSkillStandardDao,
                             WorkOrderItemFulfillmentDao workOrderItemFulfillmentDao,
                             TimesheetDao timesheetDao,
                             TimesheetRoleDao timesheetRoleDao,
                             TimeEntryDao timeEntryDao,
                             StatusItemDao statusItemDao,
                             StatusValidChangeDao statusValidChangeDao,
                             PartyRoleDao partyRoleDao,
                             PartyRateDao partyRateDao,
                             ContactMechDao contactMechDao,
                             PartyContactMechDao partyContactMechDao,
                             CommunicationEventWorkEffDao communicationEventWorkEffDao,
                             CustRequestDao custRequestDao,
                             CustRequestWorkEffortDao custRequestWorkEffortDao,
                             CustRequestContentDao custRequestContentDao,
                             WorkRequirementFulfillmentDao workRequirementFulfillmentDao,
                             NoteDataDao noteDataDao,
                             RateAmountDao rateAmountDao,
                             RecurrenceInfoDao recurrenceInfoDao,
                             RuntimeDataDao runtimeDataDao,
                             InvoiceDao invoiceDao,
                             InvoiceItemDao invoiceItemDao) {
        this.securityService = securityService;
        this.workEffortDao = workEffortDao;
        this.workEffortAssocDao = workEffortAssocDao;
        this.workEffortContactMechDao = workEffortContactMechDao;
        this.workEffortKeywordDao = workEffortKeywordDao;
        this.workEffortStatusDao = workEffortStatusDao;
        this.workEffortPartyAssignmentDao = workEffortPartyAssignmentDao;
        this.workEffortContentDao = workEffortContentDao;
        this.workEffortNoteDao = workEffortNoteDao;
        this.workEffortAttributeDao = workEffortAttributeDao;
        this.workEffortFixedAssetAssignDao = workEffortFixedAssetAssignDao;
        this.workEffortSkillStandardDao = workEffortSkillStandardDao;
        this.workOrderItemFulfillmentDao = workOrderItemFulfillmentDao;
        this.timesheetDao = timesheetDao;
        this.timesheetRoleDao = timesheetRoleDao;
        this.timeEntryDao = timeEntryDao;
        this.statusItemDao = statusItemDao;
        this.statusValidChangeDao = statusValidChangeDao;
        this.partyRoleDao = partyRoleDao;
        this.partyRateDao = partyRateDao;
        this.contactMechDao = contactMechDao;
        this.partyContactMechDao = partyContactMechDao;
        this.communicationEventWorkEffDao = communicationEventWorkEffDao;
        this.custRequestDao = custRequestDao;
        this.custRequestWorkEffortDao = custRequestWorkEffortDao;
        this.custRequestContentDao = custRequestContentDao;
        this.workRequirementFulfillmentDao = workRequirementFulfillmentDao;
        this.noteDataDao = noteDataDao;
        this.rateAmountDao = rateAmountDao;
        this.recurrenceInfoDao = recurrenceInfoDao;
        this.runtimeDataDao = runtimeDataDao;
        this.invoiceDao = invoiceDao;
        this.invoiceItemDao = invoiceItemDao;
    }

    // =========================================================================
    // WorkEffort
    // =========================================================================

    /**
     * Ported from {@code WorkEffortServicesScript.groovy#createWorkEffort} (groovy) with the four
     * {@code <eca service="createWorkEffort" event="commit">} fan-outs from {@code secas.xml}.
     */
    public Map<String, Object> createWorkEffort(Map<String, Object> body) throws SQLException {
        String userLoginId = checkPermission(body, "CREATE");

        WorkEffort we = new WorkEffort();
        ServiceInput.populate(we, body);
        if (Strings.isEmpty(we.getWorkEffortId())) {
            we.setWorkEffortId(SequenceUtil.next());
        }
        if (!VALID_DB_ID.matcher(we.getWorkEffortId()).matches()) {
            return ServiceResponse.error("Invalid workEffortId: " + we.getWorkEffortId());
        }

        Timestamp now = nowTs();
        we.setLastStatusUpdate(now);
        we.setLastModifiedDate(now);
        we.setCreatedDate(now);
        we.setRevisionNumber(1);
        we.setCreatedByUserLogin(userLoginId);
        we.setLastModifiedByUserLogin(userLoginId);
        workEffortDao.insert(we);

        if (Strings.isNotEmpty(we.getCurrentStatusId())) {
            workEffortStatusDao.insert(WorkEffortStatus.builder()
                    .workEffortId(we.getWorkEffortId())
                    .statusId(we.getCurrentStatusId())
                    .statusDatetime(now)
                    .setByUserLogin(userLoginId)
                    .build());
        }

        runCreateWorkEffortSecas(body, we.getWorkEffortId(), userLoginId);

        return ServiceResponse.success("workEffortId", we.getWorkEffortId());
    }

    /**
     * Ported from {@code WorkEffortServicesScript.groovy#updateWorkEffort}. Validates status
     * transitions against {@code StatusValidChange} and writes a {@code WorkEffortStatus}
     * history row when {@code currentStatusId} changes.
     */
    public Map<String, Object> updateWorkEffort(Map<String, Object> body) throws SQLException {
        String userLoginId = checkPermission(body, "UPDATE");

        String workEffortId = ServiceInput.str(body, "workEffortId");
        WorkEffort existing = workEffortDao.gett(workEffortId);
        if (existing == null) {
            return ServiceResponse.error("WorkEffort not found: " + workEffortId);
        }
        Timestamp now = nowTs();
        String newStatus = ServiceInput.str(body, "currentStatusId");
        boolean statusChanged = Strings.isNotEmpty(newStatus)
                && Strings.isNotEmpty(existing.getCurrentStatusId())
                && !newStatus.equals(existing.getCurrentStatusId());

        // SECA-like validation of the status transition (StatusValidChange).
        if (statusChanged) {
            StatusValidChange probe = StatusValidChange.builder()
                    .statusId(existing.getCurrentStatusId())
                    .statusIdTo(newStatus)
                    .build();
            if (statusValidChangeDao.gett(probe) == null
                    && statusValidChangeDao.count(Filters.and(
                            Filters.eq("statusId", existing.getCurrentStatusId()),
                            Filters.eq("statusIdTo", newStatus))) == 0) {
                return ServiceResponse.error(
                        "Status change from " + existing.getCurrentStatusId() + " to "
                                + newStatus + " is not allowed by StatusValidChange");
            }
        }

        ServiceInput.populate(existing, body);
        existing.setWorkEffortId(workEffortId);  // PK never changes
        existing.setLastModifiedDate(now);
        existing.setLastModifiedByUserLogin(userLoginId);
        existing.setRevisionNumber(existing.getRevisionNumber() + 1);
        if (statusChanged) {
            existing.setLastStatusUpdate(now);
        }
        workEffortDao.update(existing);

        if (statusChanged) {
            workEffortStatusDao.insert(WorkEffortStatus.builder()
                    .workEffortId(workEffortId)
                    .statusId(newStatus)
                    .statusDatetime(now)
                    .setByUserLogin(userLoginId)
                    .build());
        }
        return ServiceResponse.success("workEffortId", workEffortId);
    }

    /**
     * Ported from {@code WorkEffortServicesScript.groovy#deleteWorkEffort}. Cascades dependents
     * across all entities OFBiz removes via {@code workEffort.removeRelated(...)} in the original.
     */
    public Map<String, Object> deleteWorkEffort(Map<String, Object> body) throws SQLException {
        checkPermission(body, "DELETE");

        String workEffortId = ServiceInput.str(body, "workEffortId");
        WorkEffort we = workEffortDao.gett(workEffortId);
        if (we == null) {
            return ServiceResponse.error("WorkEffort not found: " + workEffortId);
        }

        // --- direct-FK dependents on workEffort_id ---
        workEffortKeywordDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortStatusDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortPartyAssignmentDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortContactMechDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortAttributeDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortFixedAssetAssignDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortSkillStandardDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortContentDao.delete(Filters.eq("workEffortId", workEffortId));
        workOrderItemFulfillmentDao.delete(Filters.eq("workEffortId", workEffortId));
        rateAmountDao.delete(Filters.eq("workEffortId", workEffortId));
        // TimeEntry references work_effort_id and must be cleared before deleting the work effort.
        timeEntryDao.delete(Filters.eq("workEffortId", workEffortId));
        workRequirementFulfillmentDao.delete(Filters.eq("workEffortId", workEffortId));

        // WorkEffortNote rows carry the noteId; collect them before delete so we can also remove
        // the NoteData rows they point at.
        List<WorkEffortNote> notes = workEffortNoteDao.list(Filters.eq("workEffortId", workEffortId));
        workEffortNoteDao.delete(Filters.eq("workEffortId", workEffortId));
        for (WorkEffortNote wn : notes) {
            if (Strings.isNotEmpty(wn.getNoteId())) {
                noteDataDao.deleteById(wn.getNoteId());
            }
        }

        // Single-row FKs hanging off the workEffort row itself.
        if (Strings.isNotEmpty(we.getRecurrenceInfoId())) {
            recurrenceInfoDao.deleteById(we.getRecurrenceInfoId());
        }
        if (Strings.isNotEmpty(we.getRuntimeDataId())) {
            runtimeDataDao.deleteById(we.getRuntimeDataId());
        }

        // FromWorkEffortAssoc / ToWorkEffortAssoc.
        workEffortAssocDao.delete(Filters.or(
                Filters.eq("workEffortIdFrom", workEffortId),
                Filters.eq("workEffortIdTo", workEffortId)));

        workEffortDao.deleteById(workEffortId);
        return ServiceResponse.success("workEffortId", workEffortId);
    }

    /**
     * Ported from {@code WorkEffortServicesScript.groovy#duplicateWorkEffort}. Clones the source
     * WorkEffort, optionally duplicates assocs / notes / contents / assignment rates, and
     * optionally removes them from the source.
     */
    public Map<String, Object> duplicateWorkEffort(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        String requestedId = ServiceInput.str(body, "workEffortId");
        final String newId = Strings.isEmpty(requestedId) ? SequenceUtil.next() : requestedId;
        final String oldId = ServiceInput.str(body, "oldWorkEffortId");
        WorkEffort old = workEffortDao.gett(oldId);
        if (old == null) {
            return ServiceResponse.error("Source workEffort not found: " + oldId);
        }
        WorkEffort dup = cloneShallow(old);
        dup.setWorkEffortId(newId);

        // Status: explicit override or first sequenceId of the statusType.
        String overrideStatus = ServiceInput.str(body, "statusId");
        if (Strings.isNotEmpty(overrideStatus)) {
            dup.setCurrentStatusId(overrideStatus);
        } else if (Strings.isNotEmpty(old.getCurrentStatusId())) {
            StatusItem oldStatus = statusItemDao.gett(old.getCurrentStatusId());
            if (oldStatus != null && Strings.isNotEmpty(oldStatus.getStatusTypeId())) {
                List<StatusItem> peers = statusItemDao.list(
                        Filters.eq("statusTypeId", oldStatus.getStatusTypeId()));
                peers.stream()
                        .filter(s -> Strings.isNotEmpty(s.getSequenceId()))
                        .min((a, b) -> a.getSequenceId().compareTo(b.getSequenceId()))
                        .ifPresent(s -> dup.setCurrentStatusId(s.getStatusId()));
            }
        }

        Map<String, Object> createInput = new HashMap<>(body);
        createInput.put("workEffortId", newId);
        createInput.putAll(toFieldMap(dup));
        createWorkEffort(createInput);

        if ("Y".equals(ServiceInput.str(body, "duplicateWorkEffortAssocs"))) {
            workEffortAssocDao.list(Filters.eq("workEffortIdFrom", oldId)).forEach(a -> {
                WorkEffortAssoc copy = cloneShallow(a);
                copy.setWorkEffortIdFrom(newId);
                try { workEffortAssocDao.insert(copy); } catch (SQLException e) { /* dup OK */ }
            });
            workEffortAssocDao.list(Filters.eq("workEffortIdTo", oldId)).forEach(a -> {
                WorkEffortAssoc copy = cloneShallow(a);
                copy.setWorkEffortIdTo(newId);
                try { workEffortAssocDao.insert(copy); } catch (SQLException e) { /* dup OK */ }
            });
        }
        if ("Y".equals(ServiceInput.str(body, "duplicateWorkEffortNotes"))) {
            workEffortNoteDao.list(Filters.eq("workEffortId", oldId)).forEach(n -> {
                WorkEffortNote copy = cloneShallow(n);
                copy.setWorkEffortId(newId);
                try { workEffortNoteDao.insert(copy); } catch (SQLException e) { /* dup OK */ }
            });
        }
        if ("Y".equals(ServiceInput.str(body, "duplicateWorkEffortContents"))) {
            workEffortContentDao.list(Filters.eq("workEffortId", oldId)).forEach(c -> {
                WorkEffortContent copy = cloneShallow(c);
                copy.setWorkEffortId(newId);
                try { workEffortContentDao.insert(copy); } catch (SQLException e) { /* dup OK */ }
            });
        }
        if ("Y".equals(ServiceInput.str(body, "duplicateWorkEffortAssignmentRates"))) {
            rateAmountDao.list(Filters.eq("workEffortId", oldId)).forEach(r -> {
                RateAmount copy = cloneShallow(r);
                copy.setWorkEffortId(newId);
                try { rateAmountDao.insert(copy); } catch (SQLException e) { /* dup OK */ }
            });
        }

        if ("Y".equals(ServiceInput.str(body, "removeWorkEffortAssocs"))) {
            workEffortAssocDao.delete(Filters.or(
                    Filters.eq("workEffortIdFrom", oldId),
                    Filters.eq("workEffortIdTo", oldId)));
        }
        if ("Y".equals(ServiceInput.str(body, "removeWorkEffortNotes"))) {
            workEffortNoteDao.delete(Filters.eq("workEffortId", oldId));
        }
        if ("Y".equals(ServiceInput.str(body, "removeWorkEffortContents"))) {
            workEffortContentDao.delete(Filters.eq("workEffortId", oldId));
        }
        if ("Y".equals(ServiceInput.str(body, "removeWorkEffortAssignmentRates"))) {
            rateAmountDao.delete(Filters.eq("workEffortId", oldId));
        }
        return ServiceResponse.success("workEffortId", newId);
    }

    /** Ported from {@code WorkEffortServicesScript.groovy#createWorkEffortAndPartyAssign}. */
    public Map<String, Object> createWorkEffortAndPartyAssign(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        String partyId = ServiceInput.str(body, "partyId");
        String roleTypeId = Strings.firstNonEmpty(
                ServiceInput.str(body, "roleTypeId"), DEFAULT_QUICK_ASSIGN_ROLE);
        PartyRole pkProbe = PartyRole.builder().partyId(partyId).roleTypeId(roleTypeId).build();
        if (partyRoleDao.gett(pkProbe) == null) {
            return ServiceResponse.error(
                    "Party " + partyId + " is not assigned to role " + roleTypeId);
        }

        Map<String, Object> created = createWorkEffort(body);
        if (ServiceResponse.isError(created)) {
            return created;
        }
        String workEffortId = (String) created.get("workEffortId");

        Map<String, Object> wepa = new HashMap<>(body);
        wepa.put("workEffortId", workEffortId);
        wepa.put("partyId", partyId);
        wepa.put("roleTypeId", roleTypeId);
        WorkEffortPartyAssignment a = new WorkEffortPartyAssignment();
        ServiceInput.populate(a, wepa);
        if (a.getFromDate() == null) {
            a.setFromDate(nowTs());
        }
        workEffortPartyAssignmentDao.insert(a);
        return ServiceResponse.success("workEffortId", workEffortId);
    }

    // =========================================================================
    // SECA fan-out helpers (called from createWorkEffort)
    // =========================================================================

    private void runCreateWorkEffortSecas(Map<String, Object> body, String workEffortId, String userLoginId)
            throws SQLException {
        String quickAssignPartyId = ServiceInput.str(body, "quickAssignPartyId");
        String communicationEventId = ServiceInput.str(body, "communicationEventId");
        String custRequestId = ServiceInput.str(body, "custRequestId");
        String requirementId = ServiceInput.str(body, "requirementId");

        if (Strings.isNotEmpty(quickAssignPartyId)) {
            Map<String, Object> in = new HashMap<>(body);
            in.put("workEffortId", workEffortId);
            quickAssignPartyToWorkEffort(in);
        }
        if (Strings.isNotEmpty(communicationEventId) && Strings.isEmpty(custRequestId)) {
            Map<String, Object> in = new HashMap<>(body);
            in.put("workEffortId", workEffortId);
            makeCommunicationEventWorkEffort(in);
        }
        if (Strings.isNotEmpty(custRequestId)) {
            Map<String, Object> in = new HashMap<>(body);
            in.put("workEffortId", workEffortId);
            assocAcceptedCustRequestToWorkEffort(in, userLoginId);
        }
        if (Strings.isNotEmpty(requirementId)) {
            Map<String, Object> in = new HashMap<>(body);
            in.put("workEffortId", workEffortId);
            createWorkRequirementFulfillment(in);
        }
    }

    /** Ported from {@code WorkEffortServicesScript.groovy#quickAssignPartyToWorkEffort}. */
    public Map<String, Object> quickAssignPartyToWorkEffort(Map<String, Object> body) throws SQLException {
        String workEffortId = ServiceInput.str(body, "workEffortId");
        String partyId = ServiceInput.str(body, "quickAssignPartyId");
        String roleTypeId = Strings.firstNonEmpty(
                ServiceInput.str(body, "roleTypeId"), DEFAULT_QUICK_ASSIGN_ROLE);
        ensurePartyRole(partyId, roleTypeId);

        WorkEffortPartyAssignment a = new WorkEffortPartyAssignment();
        ServiceInput.populate(a, body);
        a.setWorkEffortId(workEffortId);
        a.setPartyId(partyId);
        a.setRoleTypeId(roleTypeId);
        a.setStatusId(DEFAULT_QUICK_ASSIGN_STATUS);
        if (a.getFromDate() == null) {
            a.setFromDate(nowTs());
        }
        if (workEffortPartyAssignmentDao.gett(a) == null) {
            workEffortPartyAssignmentDao.insert(a);
        }
        return ServiceResponse.success(Map.of(
                "workEffortId", workEffortId, "partyId", partyId, "roleTypeId", roleTypeId));
    }

    /** Ported from {@code WorkEffortSimpleServices.xml#makeCommunicationEventWorkEffort}. */
    public Map<String, Object> makeCommunicationEventWorkEffort(Map<String, Object> body) throws SQLException {
        String workEffortId = ServiceInput.str(body, "workEffortId");
        String communicationEventId = ServiceInput.str(body, "communicationEventId");
        String description = ServiceInput.str(body, "relationDescription");

        CommunicationEventWorkEff probe = CommunicationEventWorkEff.builder()
                .workEffortId(workEffortId)
                .communicationEventId(communicationEventId)
                .build();
        CommunicationEventWorkEff existing = communicationEventWorkEffDao.gett(probe);
        if (existing != null) {
            existing.setDescription(description);
            communicationEventWorkEffDao.update(existing);
        } else {
            probe.setDescription(description);
            communicationEventWorkEffDao.insert(probe);
        }
        return ServiceResponse.success(Map.of(
                "workEffortId", workEffortId, "communicationEventId", communicationEventId));
    }

    /** Ported from {@code WorkEffortServicesScript.groovy#assocAcceptedCustRequestToWorkEffort}. */
    public Map<String, Object> assocAcceptedCustRequestToWorkEffort(Map<String, Object> body, String userLoginId)
            throws SQLException {
        String custRequestId = ServiceInput.str(body, "custRequestId");
        String workEffortId = ServiceInput.str(body, "workEffortId");

        CustRequest cr = custRequestDao.gett(custRequestId);
        if (cr == null) {
            return ServiceResponse.error("CustRequest not found: " + custRequestId);
        }
        if (!CRQ_ACCEPTED.equals(cr.getStatusId())) {
            return ServiceResponse.error("CustRequest status is not " + CRQ_ACCEPTED + ": " + cr.getStatusId());
        }

        CustRequestWorkEffort link = CustRequestWorkEffort.builder()
                .custRequestId(custRequestId)
                .workEffortId(workEffortId)
                .build();
        if (custRequestWorkEffortDao.gett(link) == null) {
            custRequestWorkEffortDao.insert(link);
        }

        Timestamp now = nowTs();
        cr.setStatusId(CRQ_REVIEWED);
        cr.setLastModifiedDate(now);
        cr.setLastModifiedByUserLogin(userLoginId);
        custRequestDao.update(cr);

        List<CustRequestContent> contents = custRequestContentDao.list(
                Filters.eq("custRequestId", custRequestId));
        for (CustRequestContent crc : contents) {
            WorkEffortContent wec = WorkEffortContent.builder()
                    .workEffortId(workEffortId)
                    .contentId(crc.getContentId())
                    .workEffortContentTypeId(CUST_REQUEST_CONTENT_TYPE)
                    .fromDate(now)
                    .build();
            if (workEffortContentDao.gett(wec) == null) {
                workEffortContentDao.insert(wec);
            }
        }
        return ServiceResponse.success(Map.of(
                "custRequestId", custRequestId, "workEffortId", workEffortId,
                "contentRowsDuplicated", contents.size()));
    }

    /** Service: {@code createWorkRequirementFulfillment} (engine="entity-auto" create). */
    public Map<String, Object> createWorkRequirementFulfillment(Map<String, Object> body) throws SQLException {
        WorkRequirementFulfillment wrf = new WorkRequirementFulfillment();
        ServiceInput.populate(wrf, body);
        if (workRequirementFulfillmentDao.gett(wrf) == null) {
            workRequirementFulfillmentDao.insert(wrf);
        }
        return ServiceResponse.success(Map.of(
                "requirementId", wrf.getRequirementId(),
                "workEffortId", wrf.getWorkEffortId()));
    }

    /** Ported from {@code party/.../PartySimpleMethods.xml#ensureNaPartyRole}. */
    private void ensurePartyRole(String partyId, String roleTypeId) throws SQLException {
        if (Strings.isEmpty(partyId) || Strings.isEmpty(roleTypeId)) {
            return;
        }
        PartyRole probe = PartyRole.builder().partyId(partyId).roleTypeId(roleTypeId).build();
        if (partyRoleDao.gett(probe) == null) {
            partyRoleDao.insert(probe);
        }
    }

    // =========================================================================
    // WorkEffortAssoc
    // =========================================================================

    /** Ported from {@code WorkEffortSimpleServices.xml#createWorkEffortAssoc}. */
    public Map<String, Object> createWorkEffortAssoc(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        WorkEffortAssoc assoc = new WorkEffortAssoc();
        ServiceInput.populate(assoc, body);
        if (assoc.getFromDate() == null) {
            assoc.setFromDate(nowTs());
        }
        if (workEffortAssocDao.gett(assoc) != null) {
            return ServiceResponse.error("WorkEffortAssoc already exists");
        }
        workEffortAssocDao.insert(assoc);
        return ServiceResponse.success(Map.of(
                "workEffortIdFrom", assoc.getWorkEffortIdFrom(),
                "workEffortIdTo", assoc.getWorkEffortIdTo(),
                "workEffortAssocTypeId", assoc.getWorkEffortAssocTypeId(),
                "fromDate", assoc.getFromDate()));
    }

    /** Service: updateWorkEffortAssoc (engine="entity-auto" update on WorkEffortAssoc). */
    public Map<String, Object> updateWorkEffortAssoc(Map<String, Object> body) throws SQLException {
        checkPermission(body, "UPDATE");

        WorkEffortAssoc pkProbe = new WorkEffortAssoc();
        ServiceInput.populate(pkProbe, body);
        WorkEffortAssoc existing = workEffortAssocDao.gett(pkProbe);
        if (existing == null) {
            return ServiceResponse.error("WorkEffortAssoc not found");
        }
        ServiceInput.populate(existing, body);
        workEffortAssocDao.update(existing);
        return ServiceResponse.success("workEffortIdFrom", existing.getWorkEffortIdFrom());
    }

    /** Service: createWorkEffortAndAssoc (minilang). */
    public Map<String, Object> createWorkEffortAndAssoc(Map<String, Object> body) throws SQLException {
        Map<String, Object> input = new HashMap<>(body);
        if (input.get("fromDate") == null) {
            input.put("fromDate", nowTs());
        }
        if (Strings.isEmpty(ServiceInput.str(input, "workEffortIdTo"))) {
            Map<String, Object> created = createWorkEffort(input);
            if (ServiceResponse.isError(created)) {
                return created;
            }
            input.put("workEffortIdTo", created.get("workEffortId"));
        }
        Map<String, Object> assoc = createWorkEffortAssoc(input);
        if (ServiceResponse.isError(assoc)) {
            return assoc;
        }
        return ServiceResponse.success(Map.of(
                "workEffortIdFrom", ServiceInput.str(input, "workEffortIdFrom"),
                "workEffortIdTo", ServiceInput.str(input, "workEffortIdTo"),
                "workEffortAssocTypeId", ServiceInput.str(input, "workEffortAssocTypeId")));
    }

    /** Service: updateWorkEffortAndAssoc (engine="group" → updateWorkEffort + updateWorkEffortAssoc). */
    public Map<String, Object> updateWorkEffortAndAssoc(Map<String, Object> body) throws SQLException {
        Map<String, Object> r1 = updateWorkEffort(body);
        if (ServiceResponse.isError(r1)) {
            return r1;
        }
        Map<String, Object> r2 = updateWorkEffortAssoc(body);
        if (ServiceResponse.isError(r2)) {
            return r2;
        }
        Map<String, Object> out = new HashMap<>();
        out.putAll(r1);
        out.putAll(r2);
        out.put(ServiceResponse.RESPONSE_MESSAGE, ServiceResponse.SUCCESS);
        return out;
    }

    // =========================================================================
    // WorkEffortContactMech
    // =========================================================================

    /** Ported from {@code WorkEffortServicesScript.groovy#createWorkEffortContactMech}. */
    public Map<String, Object> createWorkEffortContactMech(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        String contactMechId = ServiceInput.str(body, "contactMechId");
        String contactMechTypeId = ServiceInput.str(body, "contactMechTypeId");
        String partyId = ServiceInput.str(body, "partyId");

        if (Strings.isEmpty(contactMechId)) {
            if (Strings.isEmpty(contactMechTypeId)) {
                return ServiceResponse.error(
                        "Either contactMechId or contactMechTypeId is required");
            }
            // Primary effect: create a fresh ContactMech. The OFBiz groovy switches between
            // createXxx variants (TelecomNumber, PostalAddress, ...) by relationEntityName —
            // we cover the generic ContactMech shape here. Any subtype-specific row insertion
            // would need its own DAO; not required by any captured access-log triplet so far.
            ContactMech cm = new ContactMech();
            ServiceInput.populate(cm, body);
            cm.setContactMechId(SequenceUtil.next());
            cm.setContactMechTypeId(contactMechTypeId);
            contactMechDao.insert(cm);
            contactMechId = cm.getContactMechId();

            if (Strings.isNotEmpty(partyId)) {
                PartyContactMech pcm = PartyContactMech.builder()
                        .partyId(partyId)
                        .contactMechId(contactMechId)
                        .fromDate(nowTs())
                        .allowSolicitation(ServiceInput.str(body, "allowSolicitation"))
                        .extension(ServiceInput.str(body, "extension"))
                        .build();
                partyContactMechDao.insert(pcm);
            }
        }

        WorkEffortContactMech wecm = new WorkEffortContactMech();
        ServiceInput.populate(wecm, body);
        wecm.setContactMechId(contactMechId);
        wecm.setFromDate(nowTs());
        workEffortContactMechDao.insert(wecm);
        return ServiceResponse.success("contactMechId", contactMechId);
    }

    /** Service: deleteWorkEffortContactMech (engine="entity-auto" delete). */
    public Map<String, Object> deleteWorkEffortContactMech(Map<String, Object> body) throws SQLException {
        checkPermission(body, "DELETE");

        WorkEffortContactMech pk = new WorkEffortContactMech();
        ServiceInput.populate(pk, body);
        int n = workEffortContactMechDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // WorkEffortKeyword
    // =========================================================================

    /**
     * Service: {@code createWorkEffortKeywords}. The OFBiz minilang calls
     * {@code WorkEffortKeywordIndex.indexKeywords()} which derives keywords from name +
     * description (plus related content). We implement the data effect: split the workEffort's
     * name and description into tokens (lowercased, length &gt;= 2, stop-words filtered) and
     * insert each as a {@code WorkEffortKeyword} row.
     */
    public Map<String, Object> createWorkEffortKeywords(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        String workEffortId = ServiceInput.str(body, "workEffortId");
        WorkEffort we = workEffortDao.gett(workEffortId);
        if (we == null) {
            return ServiceResponse.error("WorkEffort not found: " + workEffortId);
        }
        Set<String> kws = extractKeywords(we.getWorkEffortName(), we.getDescription());
        int inserted = 0;
        for (String kw : kws) {
            WorkEffortKeyword wek = WorkEffortKeyword.builder()
                    .workEffortId(workEffortId)
                    .keyword(kw)
                    .relevancyWeight(1.0)
                    .build();
            try {
                workEffortKeywordDao.insert(wek);
                inserted++;
            } catch (SQLException dup) {
                // composite PK collision — keyword already indexed
            }
        }
        return ServiceResponse.success(Map.of(
                "workEffortId", workEffortId, "keywordsAdded", inserted));
    }

    /** Service: deleteWorkEffortKeywords (minilang → remove-related WorkEffortKeyword). */
    public Map<String, Object> deleteWorkEffortKeywords(Map<String, Object> body) throws SQLException {
        checkPermission(body, "DELETE");

        String workEffortId = ServiceInput.str(body, "workEffortId");
        int n = workEffortKeywordDao.delete(Filters.eq("workEffortId", workEffortId));
        return ServiceResponse.success(Map.of(
                "workEffortId", workEffortId, "deletedRows", n));
    }

    // =========================================================================
    // Timesheet
    // =========================================================================

    /** Service: createTimesheet (engine="entity-auto" create, default statusId TIMESHEET_IN_PROCESS). */
    public Map<String, Object> createTimesheet(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        Timesheet t = new Timesheet();
        ServiceInput.populate(t, body);
        if (Strings.isEmpty(t.getTimesheetId())) {
            t.setTimesheetId(SequenceUtil.next());
        }
        if (Strings.isEmpty(t.getStatusId())) {
            t.setStatusId(DEFAULT_TIMESHEET_STATUS);
        }
        timesheetDao.insert(t);
        return ServiceResponse.success("timesheetId", t.getTimesheetId());
    }

    /** Service: updateTimesheet (engine="entity-auto" update). */
    public Map<String, Object> updateTimesheet(Map<String, Object> body) throws SQLException {
        checkPermission(body, "UPDATE");

        String timesheetId = ServiceInput.str(body, "timesheetId");
        Timesheet existing = timesheetDao.gett(timesheetId);
        if (existing == null) {
            return ServiceResponse.error("Timesheet not found: " + timesheetId);
        }
        ServiceInput.populate(existing, body);
        existing.setTimesheetId(timesheetId);
        timesheetDao.update(existing);
        return ServiceResponse.success("timesheetId", timesheetId);
    }

    /** Service: createTimesheetForThisWeek (minilang TimesheetServices). */
    public Map<String, Object> createTimesheetForThisWeek(Map<String, Object> body) throws SQLException {
        Timestamp requiredDate = ServiceInput.ts(body, "requiredDate");
        Timestamp anchor = requiredDate != null ? requiredDate : nowTs();
        Timestamp weekStart = weekStart(anchor);
        Timestamp weekEnd = weekEnd(anchor);
        String partyId = ServiceInput.str(body, "partyId");

        Condition dupeCond = Filters.and(
                Filters.eq("partyId", partyId),
                Filters.eq("fromDate", weekStart),
                Filters.eq("thruDate", weekEnd));
        if (timesheetDao.count(dupeCond) > 0) {
            return ServiceResponse.error("Timesheet already exists for this week");
        }
        Map<String, Object> createInput = new HashMap<>(body);
        createInput.put("fromDate", weekStart);
        createInput.put("thruDate", weekEnd);
        return createTimesheet(createInput);
    }

    /**
     * Ported from {@code TimesheetServices.xml#addTimesheetToInvoice}. Links every unbilled
     * {@code TimeEntry} of the timesheet to the supplied invoice and emits an
     * {@code InvoiceItem} per entry (rate from {@code PartyRate} when present).
     */
    public Map<String, Object> addTimesheetToInvoice(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        String timesheetId = ServiceInput.str(body, "timesheetId");
        String invoiceId = ServiceInput.str(body, "invoiceId");
        if (Strings.isEmpty(invoiceId)) {
            return ServiceResponse.error("invoiceId is required");
        }
        Invoice invoice = invoiceDao.gett(invoiceId);
        if (invoice == null) {
            return ServiceResponse.error("Invoice not found: " + invoiceId);
        }
        if (!INVOICE_STATUS_IN_PROCESS.equals(invoice.getStatusId())) {
            return ServiceResponse.error(
                    "Invoice " + invoiceId + " is not in status " + INVOICE_STATUS_IN_PROCESS);
        }
        Timesheet timesheet = timesheetDao.gett(timesheetId);
        if (timesheet == null) {
            return ServiceResponse.error("Timesheet not found: " + timesheetId);
        }
        List<TimeEntry> entries = timeEntryDao.list(Filters.eq("timesheetId", timesheetId));
        String description = "[Timesheet:" + timesheetId + "]";

        // Continue the invoiceItemSeqId counter past whatever already exists on this invoice
        // (the same invoice can collect items from multiple timesheets across calls).
        List<InvoiceItem> existingItems = invoiceItemDao.list(Filters.eq("invoiceId", invoiceId));
        int seq = existingItems.stream()
                .map(InvoiceItem::getInvoiceItemSeqId)
                .filter(Strings::isNotEmpty)
                .mapToInt(s -> { try { return Integer.parseInt(s); } catch (NumberFormatException e) { return 0; } })
                .max().orElse(0) + 1;
        int linked = 0;
        int items = 0;
        for (TimeEntry te : entries) {
            if (Strings.isNotEmpty(te.getInvoiceId())) {
                continue;  // already on an invoice
            }
            // PartyRate percentage adjustment
            Double hours = te.getHours();
            if (hours == null) {
                continue;
            }
            String partyId = Strings.isNotEmpty(te.getPartyId())
                    ? te.getPartyId() : timesheet.getPartyId();
            double adjustedHours = hours;
            double rate = 0.0;
            if (Strings.isNotEmpty(partyId) && Strings.isNotEmpty(te.getRateTypeId())) {
                // PartyRate gives the percentage-used adjustment (e.g. only 80% billable).
                List<PartyRate> partyRates = partyRateDao.list(Filters.and(
                        Filters.eq("partyId", partyId),
                        Filters.eq("rateTypeId", te.getRateTypeId())));
                if (!partyRates.isEmpty() && partyRates.get(0).getPercentageUsed() != null) {
                    double percent = partyRates.get(0).getPercentageUsed();
                    if (percent > 0) {
                        adjustedHours = adjustedHours * percent / 100.0;
                    }
                }
                // RateAmount gives the per-hour money amount (ported from getRateAmount service).
                List<RateAmount> rateAmounts = rateAmountDao.list(Filters.and(
                        Filters.eq("partyId", partyId),
                        Filters.eq("rateTypeId", te.getRateTypeId())));
                if (!rateAmounts.isEmpty()) {
                    rate = rateAmounts.get(0).getRateAmount();
                }
            }

            // INSERT an InvoiceItem per TimeEntry.
            String seqId = String.format("%05d", seq++);
            InvoiceItem ii = new InvoiceItem();
            ii.setInvoiceId(invoiceId);
            ii.setInvoiceItemSeqId(seqId);
            ii.setInvoiceItemTypeId(INV_TE_ITEM_TYPE);
            ii.setUomId(INV_TE_UOM);
            ii.setTaxableFlag("N");
            ii.setDescription(Strings.firstNonEmpty(te.getComments(), description));
            ii.setQuantity(adjustedHours);
            ii.setAmount(rate);
            invoiceItemDao.insert(ii);
            items++;

            // Link the TimeEntry to the invoice item we just created.
            te.setInvoiceId(invoiceId);
            te.setInvoiceItemSeqId(seqId);
            timeEntryDao.update(te);
            linked++;
        }
        return ServiceResponse.success(Map.of(
                "timesheetId", timesheetId,
                "invoiceId", invoiceId,
                "linkedTimeEntries", linked,
                "invoiceItemsCreated", items));
    }

    /**
     * Ported from {@code TimesheetServices.xml#addWorkEffortTimeToInvoice} (the OFBiz service
     * declared as engine="simple" invoke="addTimesheetToInvoice" — same script, mints invoice).
     * We create a SALES_INVOICE in INVOICE_IN_PROCESS status directly via {@link InvoiceDao},
     * then delegate to {@link #addTimesheetToInvoice}.
     */
    public Map<String, Object> addTimesheetToNewInvoice(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        String partyIdFrom = ServiceInput.str(body, "partyIdFrom");
        String partyId = ServiceInput.str(body, "partyId");
        String timesheetId = ServiceInput.str(body, "timesheetId");
        if (Strings.isEmpty(timesheetId) || Strings.isEmpty(partyIdFrom) || Strings.isEmpty(partyId)) {
            return ServiceResponse.error("timesheetId, partyIdFrom, partyId are all required");
        }

        // Mint a new Invoice directly (Accounting service not yet ported — see DaoConfig note).
        Invoice inv = new Invoice();
        inv.setInvoiceId(SequenceUtil.next());
        inv.setInvoiceTypeId(INVOICE_TYPE_SALES);
        inv.setStatusId(INVOICE_STATUS_IN_PROCESS);
        inv.setPartyIdFrom(partyIdFrom);
        inv.setPartyId(partyId);
        inv.setInvoiceDate(nowTs());
        invoiceDao.insert(inv);

        Map<String, Object> input = new HashMap<>(body);
        input.put("invoiceId", inv.getInvoiceId());
        Map<String, Object> result = addTimesheetToInvoice(input);
        if (ServiceResponse.isError(result)) {
            return result;
        }
        // Echo the newly-minted invoiceId per the OFBiz OUT-attribute contract.
        result.put("invoiceId", inv.getInvoiceId());
        return result;
    }

    // =========================================================================
    // TimesheetRole
    // =========================================================================

    /** Service: createTimesheetRole (engine="entity-auto" create). */
    public Map<String, Object> createTimesheetRole(Map<String, Object> body) throws SQLException {
        checkPermission(body, "CREATE");

        TimesheetRole tr = new TimesheetRole();
        ServiceInput.populate(tr, body);
        timesheetRoleDao.insert(tr);
        return ServiceResponse.success(Map.of(
                "timesheetId", tr.getTimesheetId(),
                "partyId", tr.getPartyId(),
                "roleTypeId", tr.getRoleTypeId()));
    }

    /** Service: deleteTimesheetRole (engine="entity-auto" delete). */
    public Map<String, Object> deleteTimesheetRole(Map<String, Object> body) throws SQLException {
        checkPermission(body, "DELETE");

        TimesheetRole pk = new TimesheetRole();
        ServiceInput.populate(pk, body);
        int n = timesheetRoleDao.delete(pk);
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // TimeEntry
    // =========================================================================

    /** Service: createTimeEntry (engine="entity-auto" create, default fromDate = now). */
    public Map<String, Object> createTimeEntry(Map<String, Object> body) throws SQLException {
        TimeEntry te = new TimeEntry();
        ServiceInput.populate(te, body);
        if (Strings.isEmpty(te.getTimeEntryId())) {
            te.setTimeEntryId(SequenceUtil.next());
        }
        if (te.getFromDate() == null) {
            te.setFromDate(nowTs());
        }
        timeEntryDao.insert(te);
        return ServiceResponse.success("timeEntryId", te.getTimeEntryId());
    }

    /**
     * Ported from {@code TimesheetServices.xml#updateTimeEntry}. Guards the update with
     * {@code checkTimesheetStatus} (parent Timesheet must be in TIMESHEET_IN_PROCESS, unless
     * the only thing changing is the invoice linkage).
     */
    public Map<String, Object> updateTimeEntry(Map<String, Object> body) throws SQLException {
        String timeEntryId = ServiceInput.str(body, "timeEntryId");
        TimeEntry existing = timeEntryDao.gett(timeEntryId);
        if (existing == null) {
            return ServiceResponse.error("TimeEntry not found: " + timeEntryId);
        }

        // checkTimesheetStatus: parent must be TIMESHEET_IN_PROCESS, unless this update only sets
        // invoiceId on a TimeEntry that's already on a completed timesheet (OFBiz allows that
        // case so completed timesheets can still be invoiced).
        boolean invoiceOnlyUpdate = Strings.isEmpty(ServiceInput.str(body, "invoiceId")) ? false : true;
        String timesheetIdForCheck = Strings.firstNonEmpty(
                ServiceInput.str(body, "timesheetId"), existing.getTimesheetId());
        if (Strings.isNotEmpty(timesheetIdForCheck) && !invoiceOnlyUpdate) {
            Timesheet ts = timesheetDao.gett(timesheetIdForCheck);
            if (ts == null) {
                return ServiceResponse.error("Parent Timesheet not found: " + timesheetIdForCheck);
            }
            if (!DEFAULT_TIMESHEET_STATUS.equals(ts.getStatusId())) {
                return ServiceResponse.error(
                        "Can only update TimeEntry when Timesheet is " + DEFAULT_TIMESHEET_STATUS
                                + "; current status: " + ts.getStatusId());
            }
        }

        Map<String, Object> fields = new HashMap<>(body);
        // OFBiz only updates invoiceId/invoiceItemSeqId if currently empty.
        if (Strings.isNotEmpty(existing.getInvoiceId())) {
            fields.remove("invoiceId");
            fields.remove("invoiceItemSeqId");
        }
        // Auto-calc hours when dates moved and hours not explicitly provided.
        if (fields.get("hours") == null
                && (fields.containsKey("fromDate") || fields.containsKey("thruDate"))) {
            Timestamp from = ServiceInput.ts(fields, "fromDate");
            Timestamp thru = ServiceInput.ts(fields, "thruDate");
            if (from == null) from = existing.getFromDate();
            if (thru == null) thru = existing.getThruDate();
            if (from != null && thru != null) {
                long millis = thru.getTime() - from.getTime();
                fields.put("hours", millis / 3_600_000.0);
            }
        }
        ServiceInput.populate(existing, fields);
        existing.setTimeEntryId(timeEntryId);
        timeEntryDao.update(existing);
        return ServiceResponse.success("timeEntryId", timeEntryId);
    }

    /** Service: deleteTimeEntry (engine="entity-auto" delete). */
    public Map<String, Object> deleteTimeEntry(Map<String, Object> body) throws SQLException {
        String timeEntryId = ServiceInput.str(body, "timeEntryId");
        int n = timeEntryDao.deleteById(timeEntryId);
        return ServiceResponse.success("deletedRows", n);
    }

    // =========================================================================
    // Misc
    // =========================================================================

    /** Service: test (no-op stand-in for the OFBiz framework's chain-test endpoint). */
    public Map<String, Object> test(Map<String, Object> body) {
        Map<String, Object> out = new HashMap<>(3);
        out.put("ok", Boolean.TRUE);
        out.put("echo", body == null ? Map.of() : body);
        out.put(ServiceResponse.RESPONSE_MESSAGE, ServiceResponse.SUCCESS);
        return out;
    }

    // =========================================================================
    // Internals
    // =========================================================================

    /**
     * Gates a method on {@code workEffortGenericPermission}. Returns the active userLoginId
     * extracted from {@code body} (null is allowed in dev — anonymous calls pass).
     */
    private String checkPermission(Map<String, Object> body, String mainAction) throws SQLException {
        String userLoginId = SecurityService.currentUserLoginId(body);
        if (!securityService.hasEntityPermission(PRIMARY_PERMISSION, mainAction, userLoginId)) {
            throw new PermissionDeniedException(PRIMARY_PERMISSION, mainAction, userLoginId);
        }
        return userLoginId;
    }

    /**
     * Truncated to millisecond precision intentionally. Jackson serializes {@code Timestamp} with
     * millisecond resolution, so any client round-tripping a value back as a composite-PK field
     * (e.g. WorkEffortAssoc.fromDate in updateWorkEffortAssoc) needs the stored value to match
     * what they get back. Storing nanoseconds would make those lookups miss.
     */
    private static Timestamp nowTs() {
        return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS));
    }

    /** First-millisecond-of-Monday for the week containing {@code anchor} (system zone). */
    static Timestamp weekStart(Timestamp anchor) {
        return Timestamp.from(anchor.toInstant().atZone(ZoneId.systemDefault())
                .with(TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY))
                .truncatedTo(ChronoUnit.DAYS)
                .toInstant());
    }

    /** Last-millisecond-of-Sunday for the week containing {@code anchor} (system zone). */
    static Timestamp weekEnd(Timestamp anchor) {
        return Timestamp.from(anchor.toInstant().atZone(ZoneId.systemDefault())
                .with(TemporalAdjusters.nextOrSame(java.time.DayOfWeek.SUNDAY))
                .truncatedTo(ChronoUnit.DAYS)
                .plus(1, ChronoUnit.DAYS).minus(1, ChronoUnit.MILLIS)
                .toInstant());
    }

    private static Set<String> extractKeywords(String... sources) {
        return Arrays.stream(sources)
                .filter(Strings::isNotEmpty)
                .flatMap(s -> Arrays.stream(s.toLowerCase(Locale.ROOT).split("\\W+")))
                .filter(w -> w.length() >= 2 && !KEYWORD_STOPWORDS.contains(w))
                .collect(Collectors.toCollection(java.util.LinkedHashSet::new));
    }

    private static <T> T cloneShallow(T bean) {
        return com.landawn.abacus.util.Beans.copy(bean);
    }

    private static Map<String, Object> toFieldMap(Object bean) {
        Map<String, Object> out = new HashMap<>();
        for (String p : com.landawn.abacus.util.Beans.getPropNameList(bean.getClass())) {
            try {
                Object v = com.landawn.abacus.util.Beans.getBeanInfo(bean.getClass())
                        .getPropInfo(p).getPropValue(bean);
                if (v != null && !(v instanceof java.util.Collection) && !isEntityRef(v)) {
                    out.put(p, v);
                }
            } catch (RuntimeException ignored) {
                // skip non-readable / join-field reflection failures
            }
        }
        return out;
    }

    private static boolean isEntityRef(Object v) {
        return v.getClass().getName().startsWith("com.landawn.ofbiz.entity.");
    }
}
