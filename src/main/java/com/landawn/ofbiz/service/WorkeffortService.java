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
import com.landawn.ofbiz.dao.PartyContactMechDao;
import com.landawn.ofbiz.dao.PartyRoleDao;
import com.landawn.ofbiz.dao.StatusItemDao;
import com.landawn.ofbiz.dao.TimeEntryDao;
import com.landawn.ofbiz.dao.TimesheetDao;
import com.landawn.ofbiz.dao.TimesheetRoleDao;
import com.landawn.ofbiz.dao.WorkEffortAssocDao;
import com.landawn.ofbiz.dao.WorkEffortContactMechDao;
import com.landawn.ofbiz.dao.WorkEffortContentDao;
import com.landawn.ofbiz.dao.WorkEffortDao;
import com.landawn.ofbiz.dao.WorkEffortKeywordDao;
import com.landawn.ofbiz.dao.WorkEffortPartyAssignmentDao;
import com.landawn.ofbiz.dao.WorkEffortStatusDao;
import com.landawn.ofbiz.dao.WorkRequirementFulfillmentDao;
import com.landawn.ofbiz.entity.CommunicationEventWorkEff;
import com.landawn.ofbiz.entity.ContactMech;
import com.landawn.ofbiz.entity.CustRequest;
import com.landawn.ofbiz.entity.CustRequestContent;
import com.landawn.ofbiz.entity.CustRequestWorkEffort;
import com.landawn.ofbiz.entity.PartyContactMech;
import com.landawn.ofbiz.entity.PartyRole;
import com.landawn.ofbiz.entity.StatusItem;
import com.landawn.ofbiz.entity.TimeEntry;
import com.landawn.ofbiz.entity.Timesheet;
import com.landawn.ofbiz.entity.TimesheetRole;
import com.landawn.ofbiz.entity.WorkEffort;
import com.landawn.ofbiz.entity.WorkEffortAssoc;
import com.landawn.ofbiz.entity.WorkEffortContactMech;
import com.landawn.ofbiz.entity.WorkEffortContent;
import com.landawn.ofbiz.entity.WorkEffortKeyword;
import com.landawn.ofbiz.entity.WorkEffortPartyAssignment;
import com.landawn.ofbiz.entity.WorkEffortStatus;
import com.landawn.ofbiz.entity.WorkRequirementFulfillment;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 24 unique OFBiz {@code workeffort} services exposed by
 * {@link com.landawn.ofbiz.controller.WorkeffortController} onto the abacus-jdbc stack.
 *
 * <p>Each method implements the primary data effect of the OFBiz service it replaces. Secondary
 * effects (ECA triggers, audit logs, downstream notifications, etc.) are tagged with inline
 * {@code // TODO secondary:} comments.
 *
 * <p>Permission checks declared by {@code <permission-service>} in {@code services*.xml} are noted
 * as {@code // TODO permission check:} no-ops until the security port lands.
 */
@Service
@Transactional
public class WorkeffortService {

    private static final String DEFAULT_TIMESHEET_STATUS = "TIMESHEET_IN_PROCESS";
    private static final String DEFAULT_QUICK_ASSIGN_ROLE = "CAL_OWNER";
    private static final String DEFAULT_QUICK_ASSIGN_STATUS = "PRTYASGN_ASSIGNED";
    private static final String CRQ_ACCEPTED = "CRQ_ACCEPTED";
    private static final String CRQ_REVIEWED = "CRQ_REVIEWED";
    private static final String CUST_REQUEST_CONTENT_TYPE = "SUPPORTING_MEDIA";
    private static final String PRIMARY_PERMISSION = "WORKEFFORTMGR";
    /** Mirrors {@code UtilValidate.checkValidDatabaseId} — alphanumerics, '_' '-' '.' ':' only. */
    private static final Pattern VALID_DB_ID = Pattern.compile("[A-Za-z0-9_\\-.:]+");

    private static final Set<String> KEYWORD_STOPWORDS = Set.of(
            "a", "an", "and", "or", "the", "of", "in", "to", "for", "with", "on", "at", "by", "is");

    private final SecurityService securityService;
    private final WorkEffortDao workEffortDao;
    private final WorkEffortAssocDao workEffortAssocDao;
    private final WorkEffortContactMechDao workEffortContactMechDao;
    private final WorkEffortKeywordDao workEffortKeywordDao;
    private final WorkEffortStatusDao workEffortStatusDao;
    private final WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao;
    private final WorkEffortContentDao workEffortContentDao;
    private final TimesheetDao timesheetDao;
    private final TimesheetRoleDao timesheetRoleDao;
    private final TimeEntryDao timeEntryDao;
    private final StatusItemDao statusItemDao;
    private final PartyRoleDao partyRoleDao;
    private final ContactMechDao contactMechDao;
    private final PartyContactMechDao partyContactMechDao;
    private final CommunicationEventWorkEffDao communicationEventWorkEffDao;
    private final CustRequestDao custRequestDao;
    private final CustRequestWorkEffortDao custRequestWorkEffortDao;
    private final CustRequestContentDao custRequestContentDao;
    private final WorkRequirementFulfillmentDao workRequirementFulfillmentDao;

    public WorkeffortService(SecurityService securityService,
                             WorkEffortDao workEffortDao,
                             WorkEffortAssocDao workEffortAssocDao,
                             WorkEffortContactMechDao workEffortContactMechDao,
                             WorkEffortKeywordDao workEffortKeywordDao,
                             WorkEffortStatusDao workEffortStatusDao,
                             WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao,
                             WorkEffortContentDao workEffortContentDao,
                             TimesheetDao timesheetDao,
                             TimesheetRoleDao timesheetRoleDao,
                             TimeEntryDao timeEntryDao,
                             StatusItemDao statusItemDao,
                             PartyRoleDao partyRoleDao,
                             ContactMechDao contactMechDao,
                             PartyContactMechDao partyContactMechDao,
                             CommunicationEventWorkEffDao communicationEventWorkEffDao,
                             CustRequestDao custRequestDao,
                             CustRequestWorkEffortDao custRequestWorkEffortDao,
                             CustRequestContentDao custRequestContentDao,
                             WorkRequirementFulfillmentDao workRequirementFulfillmentDao) {
        this.securityService = securityService;
        this.workEffortDao = workEffortDao;
        this.workEffortAssocDao = workEffortAssocDao;
        this.workEffortContactMechDao = workEffortContactMechDao;
        this.workEffortKeywordDao = workEffortKeywordDao;
        this.workEffortStatusDao = workEffortStatusDao;
        this.workEffortPartyAssignmentDao = workEffortPartyAssignmentDao;
        this.workEffortContentDao = workEffortContentDao;
        this.timesheetDao = timesheetDao;
        this.timesheetRoleDao = timesheetRoleDao;
        this.timeEntryDao = timeEntryDao;
        this.statusItemDao = statusItemDao;
        this.partyRoleDao = partyRoleDao;
        this.contactMechDao = contactMechDao;
        this.partyContactMechDao = partyContactMechDao;
        this.communicationEventWorkEffDao = communicationEventWorkEffDao;
        this.custRequestDao = custRequestDao;
        this.custRequestWorkEffortDao = custRequestWorkEffortDao;
        this.custRequestContentDao = custRequestContentDao;
        this.workRequirementFulfillmentDao = workRequirementFulfillmentDao;
    }

    // =========================================================================
    // WorkEffort
    // =========================================================================

    /**
     * Ported from {@code WorkEffortServicesScript.groovy#createWorkEffort} (groovy) with the four
     * {@code <eca service="createWorkEffort" event="commit">} fan-outs from {@code secas.xml}.
     *
     * <p>Flow:
     * <ol>
     *   <li>{@code workEffortGenericPermission} CREATE — see {@link SecurityService}</li>
     *   <li>Validate {@code workEffortId} characters and generate one when missing</li>
     *   <li>Stamp audit columns (createdDate, lastModifiedDate, lastStatusUpdate, revisionNumber,
     *       createdByUserLogin, lastModifiedByUserLogin) and INSERT the {@code work_effort} row</li>
     *   <li>Insert a {@code work_effort_status} history row reflecting the initial status</li>
     *   <li>SECA: {@code quickAssignPartyId} set → {@link #quickAssignPartyToWorkEffort}</li>
     *   <li>SECA: {@code communicationEventId} set &amp; {@code custRequestId} empty →
     *       {@link #makeCommunicationEventWorkEffort}</li>
     *   <li>SECA: {@code custRequestId} set → {@link #assocAcceptedCustRequestToWorkEffort}</li>
     *   <li>SECA: {@code requirementId} set → {@link #createWorkRequirementFulfillment}</li>
     * </ol>
     */
    public Map<String, Object> createWorkEffort(Map<String, Object> body) throws SQLException {
        // 1) permission gate
        String userLoginId = SecurityService.currentUserLoginId(body);
        if (!securityService.hasEntityPermission(PRIMARY_PERMISSION, "CREATE", userLoginId)) {
            throw new PermissionDeniedException(PRIMARY_PERMISSION, "CREATE", userLoginId);
        }

        // 2) build entity + validate ID
        WorkEffort we = new WorkEffort();
        ServiceInput.populate(we, body);
        if (Strings.isEmpty(we.getWorkEffortId())) {
            we.setWorkEffortId(SequenceUtil.next());
        }
        if (!VALID_DB_ID.matcher(we.getWorkEffortId()).matches()) {
            return Map.of("_error", "Invalid workEffortId: " + we.getWorkEffortId());
        }

        // 3) audit + INSERT
        Timestamp now = nowTs();
        we.setLastStatusUpdate(now);
        we.setLastModifiedDate(now);
        we.setCreatedDate(now);
        we.setRevisionNumber(1);
        we.setCreatedByUserLogin(userLoginId);
        we.setLastModifiedByUserLogin(userLoginId);
        workEffortDao.insert(we);

        // 4) initial status history row
        if (Strings.isNotEmpty(we.getCurrentStatusId())) {
            workEffortStatusDao.insert(WorkEffortStatus.builder()
                    .workEffortId(we.getWorkEffortId())
                    .statusId(we.getCurrentStatusId())
                    .statusDatetime(now)
                    .setByUserLogin(userLoginId)
                    .build());
        }

        // 5-8) Service-Event-Condition-Action fan-outs (workeffort/servicedef/secas.xml)
        runCreateWorkEffortSecas(body, we.getWorkEffortId(), userLoginId);

        return Map.of("workEffortId", we.getWorkEffortId());
    }

    /**
     * Fires the four ECAs declared on {@code createWorkEffort event="commit"}. Extracted so the
     * primary insert above stays readable and so other services that "implement createWorkEffort"
     * (e.g. {@link #createWorkEffortAndPartyAssign}) can reuse the same fan-out semantics.
     */
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

    /**
     * Ported from {@code WorkEffortServicesScript.groovy#quickAssignPartyToWorkEffort}:
     * ensures a {@code PartyRole(quickAssignPartyId, roleTypeId)} row exists (creating it if not)
     * and then creates a {@code WorkEffortPartyAssignment} with status {@code PRTYASGN_ASSIGNED}.
     */
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
        // Composite-PK upsert: ignore if already exists.
        if (workEffortPartyAssignmentDao.gett(a) == null) {
            workEffortPartyAssignmentDao.insert(a);
        }
        return Map.of("workEffortId", workEffortId, "partyId", partyId, "roleTypeId", roleTypeId);
    }

    /**
     * Ported from {@code WorkEffortSimpleServices.xml#makeCommunicationEventWorkEffort}:
     * upserts a {@code CommunicationEventWorkEff} row keyed by (communicationEventId, workEffortId)
     * with the {@code relationDescription} as its description.
     */
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
        return Map.of("workEffortId", workEffortId, "communicationEventId", communicationEventId);
    }

    /**
     * Ported from {@code WorkEffortServicesScript.groovy#assocAcceptedCustRequestToWorkEffort}:
     * verifies the {@code CustRequest} is in {@code CRQ_ACCEPTED}, links it to the workEffort,
     * flips its status to {@code CRQ_REVIEWED}, and duplicates every {@code CustRequestContent}
     * onto the workEffort as a {@code SUPPORTING_MEDIA} {@code WorkEffortContent} row.
     */
    public Map<String, Object> assocAcceptedCustRequestToWorkEffort(Map<String, Object> body, String userLoginId)
            throws SQLException {
        String custRequestId = ServiceInput.str(body, "custRequestId");
        String workEffortId = ServiceInput.str(body, "workEffortId");

        CustRequest cr = custRequestDao.gett(custRequestId);
        if (cr == null) {
            return Map.of("_error", "CustRequest not found: " + custRequestId);
        }
        if (!CRQ_ACCEPTED.equals(cr.getStatusId())) {
            return Map.of("_error", "CustRequest status is not " + CRQ_ACCEPTED + ": " + cr.getStatusId());
        }

        // (a) link
        CustRequestWorkEffort link = CustRequestWorkEffort.builder()
                .custRequestId(custRequestId)
                .workEffortId(workEffortId)
                .build();
        if (custRequestWorkEffortDao.gett(link) == null) {
            custRequestWorkEffortDao.insert(link);
        }

        // (b) flip status to CRQ_REVIEWED
        Timestamp now = nowTs();
        cr.setStatusId(CRQ_REVIEWED);
        cr.setLastModifiedDate(now);
        cr.setLastModifiedByUserLogin(userLoginId);
        custRequestDao.update(cr);

        // (c) duplicate content
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
        return Map.of("custRequestId", custRequestId, "workEffortId", workEffortId,
                "contentRowsDuplicated", contents.size());
    }

    /**
     * Service: {@code createWorkRequirementFulfillment} (engine="entity-auto" create on
     * {@code WorkRequirementFulfillment}). Inserts {@code (requirementId, workEffortId)} idempotently.
     */
    public Map<String, Object> createWorkRequirementFulfillment(Map<String, Object> body) throws SQLException {
        WorkRequirementFulfillment wrf = new WorkRequirementFulfillment();
        ServiceInput.populate(wrf, body);
        if (workRequirementFulfillmentDao.gett(wrf) == null) {
            workRequirementFulfillmentDao.insert(wrf);
        }
        return Map.of(
                "requirementId", wrf.getRequirementId(),
                "workEffortId", wrf.getWorkEffortId());
    }

    /**
     * Ported from {@code party/minilang/party/PartySimpleMethods.xml#ensureNaPartyRole}.
     * Inserts a {@code PartyRole(partyId, roleTypeId)} row if one does not already exist.
     */
    private void ensurePartyRole(String partyId, String roleTypeId) throws SQLException {
        if (Strings.isEmpty(partyId) || Strings.isEmpty(roleTypeId)) {
            return;
        }
        PartyRole probe = PartyRole.builder().partyId(partyId).roleTypeId(roleTypeId).build();
        if (partyRoleDao.gett(probe) == null) {
            partyRoleDao.insert(probe);
        }
    }

    /** Service: updateWorkEffort (groovy WorkEffortServicesScript#updateWorkEffort) */
    public Map<String, Object> updateWorkEffort(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=UPDATE
        String workEffortId = ServiceInput.str(body, "workEffortId");
        WorkEffort existing = workEffortDao.gett(workEffortId);
        if (existing == null) {
            return Map.of("_error", "WorkEffort not found: " + workEffortId);
        }
        Timestamp now = nowTs();
        String newStatus = ServiceInput.str(body, "currentStatusId");
        boolean statusChanged = Strings.isNotEmpty(newStatus)
                && Strings.isNotEmpty(existing.getCurrentStatusId())
                && !newStatus.equals(existing.getCurrentStatusId());
        // TODO secondary: validate status change against StatusValidChange

        // Apply non-PK updates from body
        ServiceInput.populate(existing, body);
        existing.setWorkEffortId(workEffortId);  // PK never changes
        existing.setLastModifiedDate(now);
        existing.setLastModifiedByUserLogin(ServiceInput.str(body, "lastModifiedByUserLogin"));
        existing.setRevisionNumber(existing.getRevisionNumber() + 1);
        workEffortDao.update(existing);

        if (statusChanged) {
            workEffortStatusDao.insert(WorkEffortStatus.builder()
                    .workEffortId(workEffortId)
                    .statusId(newStatus)
                    .statusDatetime(now)
                    .setByUserLogin(existing.getLastModifiedByUserLogin())
                    .build());
        }
        // TODO secondary: ECA triggers, notification email when statusChanged
        return Map.of("workEffortId", workEffortId);
    }

    /** Service: deleteWorkEffort (groovy WorkEffortServicesScript#deleteWorkEffort) */
    public Map<String, Object> deleteWorkEffort(Map<String, Object> body) throws SQLException {
        // TODO permission check: WORKEFFORTMGR_DELETE (or WorkEffortPartyAssignment ownership)
        String workEffortId = ServiceInput.str(body, "workEffortId");
        // Remove dependents that share a workEffortId FK (only ones with their own DAO bean here).
        workEffortKeywordDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortStatusDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortPartyAssignmentDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortContactMechDao.delete(Filters.eq("workEffortId", workEffortId));
        workEffortAssocDao.delete(Filters.or(
                Filters.eq("workEffortIdFrom", workEffortId),
                Filters.eq("workEffortIdTo", workEffortId)));
        // TODO secondary: also remove WorkEffortAttribute, WorkOrderItemFulfillment, NoteData,
        // RecurrenceInfo, RuntimeData, WorkEffortFixedAssetAssign, WorkEffortSkillStandard,
        // WorkEffortContent (no DAO beans registered yet).
        workEffortDao.deleteById(workEffortId);
        return Map.of("workEffortId", workEffortId);
    }

    /** Service: duplicateWorkEffort (groovy WorkEffortServicesScript#duplicateWorkEffort) */
    public Map<String, Object> duplicateWorkEffort(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=CREATE
        String requestedId = ServiceInput.str(body, "workEffortId");
        final String newId = Strings.isEmpty(requestedId) ? SequenceUtil.next() : requestedId;
        final String oldId = ServiceInput.str(body, "oldWorkEffortId");
        WorkEffort old = workEffortDao.gett(oldId);
        if (old == null) {
            return Map.of("_error", "Source workEffort not found: " + oldId);
        }
        WorkEffort dup = cloneShallow(old);
        dup.setWorkEffortId(newId);

        // Status: explicit override or first sequenceId of the statusType
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
        // Carry over the duplicated entity's fields so createWorkEffort sees them.
        createInput.putAll(toFieldMap(dup));
        createWorkEffort(createInput);

        if ("Y".equals(ServiceInput.str(body, "duplicateWorkEffortAssocs"))) {
            // Copy both From and To assocs
            workEffortAssocDao.list(Filters.eq("workEffortIdFrom", oldId)).forEach(a -> {
                WorkEffortAssoc copy = cloneShallow(a);
                copy.setWorkEffortIdFrom(newId);
                try { workEffortAssocDao.insert(copy); } catch (SQLException e) { /* dup ok */ }
            });
            workEffortAssocDao.list(Filters.eq("workEffortIdTo", oldId)).forEach(a -> {
                WorkEffortAssoc copy = cloneShallow(a);
                copy.setWorkEffortIdTo(newId);
                try { workEffortAssocDao.insert(copy); } catch (SQLException e) { /* dup ok */ }
            });
        }
        if ("Y".equals(ServiceInput.str(body, "removeWorkEffortAssocs"))) {
            workEffortAssocDao.delete(Filters.or(
                    Filters.eq("workEffortIdFrom", oldId),
                    Filters.eq("workEffortIdTo", oldId)));
        }
        // TODO secondary: duplicateWorkEffortNotes, duplicateWorkEffortContents,
        // duplicateWorkEffortAssignmentRates, removeWorkEffortNotes/Contents/AssignmentRates
        // (their entities don't have DAO beans registered yet).
        return Map.of("workEffortId", newId);
    }

    /** Service: createWorkEffortAndPartyAssign (groovy WorkEffortServicesScript) */
    public Map<String, Object> createWorkEffortAndPartyAssign(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=CREATE
        String partyId = ServiceInput.str(body, "partyId");
        String roleTypeId = ServiceInput.str(body, "roleTypeId");
        if (Strings.isEmpty(roleTypeId)) {
            roleTypeId = "CAL_OWNER";  // default from services.xml
        }
        PartyRole pkProbe = PartyRole.builder().partyId(partyId).roleTypeId(roleTypeId).build();
        PartyRole partyRole = partyRoleDao.gett(pkProbe);
        if (partyRole == null) {
            return Map.of("_error",
                    "Party " + partyId + " is not assigned to role " + roleTypeId);
        }
        Map<String, Object> created = createWorkEffort(body);
        String workEffortId = (String) created.get("workEffortId");

        // Create the WorkEffortPartyAssignment
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
        return Map.of("workEffortId", workEffortId);
    }

    // =========================================================================
    // WorkEffortAssoc
    // =========================================================================

    /** Service: createWorkEffortAssoc (minilang WorkEffortSimpleServices#createWorkEffortAssoc) */
    public Map<String, Object> createWorkEffortAssoc(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=CREATE
        WorkEffortAssoc assoc = new WorkEffortAssoc();
        ServiceInput.populate(assoc, body);
        if (assoc.getFromDate() == null) {
            assoc.setFromDate(nowTs());
        }
        // Reject duplicates on the composite PK
        WorkEffortAssoc existing = workEffortAssocDao.gett(assoc);
        if (existing != null) {
            return Map.of("_error", "WorkEffortAssoc already exists");
        }
        workEffortAssocDao.insert(assoc);
        return Map.of(
                "workEffortIdFrom", assoc.getWorkEffortIdFrom(),
                "workEffortIdTo", assoc.getWorkEffortIdTo(),
                "workEffortAssocTypeId", assoc.getWorkEffortAssocTypeId(),
                "fromDate", assoc.getFromDate());
    }

    /** Service: updateWorkEffortAssoc (engine="entity-auto" update on WorkEffortAssoc) */
    public Map<String, Object> updateWorkEffortAssoc(Map<String, Object> body) throws SQLException {
        WorkEffortAssoc pkProbe = new WorkEffortAssoc();
        ServiceInput.populate(pkProbe, body);
        WorkEffortAssoc existing = workEffortAssocDao.gett(pkProbe);
        if (existing == null) {
            return Map.of("_error", "WorkEffortAssoc not found");
        }
        ServiceInput.populate(existing, body);
        workEffortAssocDao.update(existing);
        return Map.of("workEffortIdFrom", existing.getWorkEffortIdFrom());
    }

    /** Service: createWorkEffortAndAssoc (minilang) */
    public Map<String, Object> createWorkEffortAndAssoc(Map<String, Object> body) throws SQLException {
        Map<String, Object> input = new HashMap<>(body);
        if (input.get("fromDate") == null) {
            input.put("fromDate", nowTs());
        }
        // Create the destination WorkEffort if workEffortIdTo isn't provided
        if (Strings.isEmpty(ServiceInput.str(input, "workEffortIdTo"))) {
            Map<String, Object> created = createWorkEffort(input);
            input.put("workEffortIdTo", created.get("workEffortId"));
        }
        createWorkEffortAssoc(input);
        return Map.of(
                "workEffortIdFrom", ServiceInput.str(input, "workEffortIdFrom"),
                "workEffortIdTo", ServiceInput.str(input, "workEffortIdTo"),
                "workEffortAssocTypeId", ServiceInput.str(input, "workEffortAssocTypeId"));
    }

    /** Service: updateWorkEffortAndAssoc (engine="group" → updateWorkEffort + updateWorkEffortAssoc) */
    public Map<String, Object> updateWorkEffortAndAssoc(Map<String, Object> body) throws SQLException {
        Map<String, Object> r1 = updateWorkEffort(body);
        Map<String, Object> r2 = updateWorkEffortAssoc(body);
        Map<String, Object> out = new HashMap<>();
        out.putAll(r1);
        out.putAll(r2);
        return out;
    }

    // =========================================================================
    // WorkEffortContactMech
    // =========================================================================

    /** Service: createWorkEffortContactMech (groovy WorkEffortServicesScript) */
    public Map<String, Object> createWorkEffortContactMech(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=CREATE
        String contactMechId = ServiceInput.str(body, "contactMechId");
        String contactMechTypeId = ServiceInput.str(body, "contactMechTypeId");
        String partyId = ServiceInput.str(body, "partyId");

        if (Strings.isEmpty(contactMechId)) {
            if (Strings.isEmpty(contactMechTypeId)) {
                return Map.of("_error", "Either contactMechId or contactMechTypeId is required");
            }
            // Primary effect: create a fresh ContactMech (the OFBiz groovy delegates to
            // createXxx / createPartyXxx service variants — we cover the base shape here).
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
            // TODO secondary: route by relationEntityName to TelecomNumber/PostalAddress/etc.
        }

        WorkEffortContactMech wecm = new WorkEffortContactMech();
        ServiceInput.populate(wecm, body);
        wecm.setContactMechId(contactMechId);
        wecm.setFromDate(nowTs());
        workEffortContactMechDao.insert(wecm);
        return Map.of("contactMechId", contactMechId);
    }

    /** Service: deleteWorkEffortContactMech (engine="entity-auto" delete) */
    public Map<String, Object> deleteWorkEffortContactMech(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=DELETE
        WorkEffortContactMech pk = new WorkEffortContactMech();
        ServiceInput.populate(pk, body);
        int n = workEffortContactMechDao.delete(pk);
        return Map.of("deletedRows", n);
    }

    // =========================================================================
    // WorkEffortKeyword
    // =========================================================================

    /** Service: createWorkEffortKeywords (minilang → calls WorkEffortKeywordIndex.indexKeywords). */
    public Map<String, Object> createWorkEffortKeywords(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortManagerPermission main-action=CREATE
        String workEffortId = ServiceInput.str(body, "workEffortId");
        WorkEffort we = workEffortDao.gett(workEffortId);
        if (we == null) {
            return Map.of("_error", "WorkEffort not found: " + workEffortId);
        }
        // Primary effect: derive keyword set from name + description; secondary nuance
        // (relevancy weighting from WorkEffortKeywordIndex) intentionally simplified.
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
        // TODO secondary: full WorkEffortKeywordIndex.indexKeywords semantics (relevancy,
        // stemming, related-entity content scraping)
        return Map.of("workEffortId", workEffortId, "keywordsAdded", inserted);
    }

    /** Service: deleteWorkEffortKeywords (minilang → remove-related WorkEffortKeyword). */
    public Map<String, Object> deleteWorkEffortKeywords(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortManagerPermission main-action=DELETE
        String workEffortId = ServiceInput.str(body, "workEffortId");
        int n = workEffortKeywordDao.delete(Filters.eq("workEffortId", workEffortId));
        return Map.of("workEffortId", workEffortId, "deletedRows", n);
    }

    // =========================================================================
    // Timesheet
    // =========================================================================

    /** Service: createTimesheet (engine="entity-auto" create, default statusId TIMESHEET_IN_PROCESS). */
    public Map<String, Object> createTimesheet(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=CREATE
        Timesheet t = new Timesheet();
        ServiceInput.populate(t, body);
        if (Strings.isEmpty(t.getTimesheetId())) {
            t.setTimesheetId(SequenceUtil.next());
        }
        if (Strings.isEmpty(t.getStatusId())) {
            t.setStatusId(DEFAULT_TIMESHEET_STATUS);
        }
        timesheetDao.insert(t);
        return Map.of("timesheetId", t.getTimesheetId());
    }

    /** Service: updateTimesheet (engine="entity-auto" update). */
    public Map<String, Object> updateTimesheet(Map<String, Object> body) throws SQLException {
        String timesheetId = ServiceInput.str(body, "timesheetId");
        Timesheet existing = timesheetDao.gett(timesheetId);
        if (existing == null) {
            return Map.of("_error", "Timesheet not found: " + timesheetId);
        }
        ServiceInput.populate(existing, body);
        existing.setTimesheetId(timesheetId);
        timesheetDao.update(existing);
        return Map.of("timesheetId", timesheetId);
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
            return Map.of("_error", "Timesheet already exists for this week");
        }
        Map<String, Object> createInput = new HashMap<>(body);
        createInput.put("fromDate", weekStart);
        createInput.put("thruDate", weekEnd);
        return createTimesheet(createInput);
    }

    /**
     * Service: addTimesheetToInvoice (minilang TimesheetServices). Primary effect is associating
     * the timesheet's TimeEntry rows to the supplied invoiceId.
     */
    public Map<String, Object> addTimesheetToInvoice(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortManagerPermission main-action=CREATE
        String timesheetId = ServiceInput.str(body, "timesheetId");
        String invoiceId = ServiceInput.str(body, "invoiceId");
        if (Strings.isEmpty(invoiceId)) {
            // TODO unimplemented: createInvoice (Accounting service not yet ported); cannot
            // auto-create an invoice when invoiceId is absent.
            return Map.of("_error", "invoiceId is required until createInvoice is ported");
        }
        List<TimeEntry> entries = timeEntryDao.list(Filters.eq("timesheetId", timesheetId));
        int linked = 0;
        for (TimeEntry te : entries) {
            if (Strings.isEmpty(te.getInvoiceId())) {
                te.setInvoiceId(invoiceId);
                timeEntryDao.update(te);
                linked++;
            }
        }
        // TODO secondary: createInvoiceItem rows per TimeEntry (combineInvoiceItem rules);
        // PartyRate percentage adjustments; updateInvoice currency normalization.
        return Map.of("timesheetId", timesheetId, "invoiceId", invoiceId, "linkedTimeEntries", linked);
    }

    /** Service: addTimesheetToNewInvoice — same as above; without a ported createInvoice, we can't
     *  mint a new invoice, so we surface that as an unimplemented dependency. */
    public Map<String, Object> addTimesheetToNewInvoice(Map<String, Object> body) {
        // TODO unimplemented: createInvoice (Accounting service not yet ported). Requires
        // partyIdFrom + partyId to create a SALES_INVOICE in INVOICE_IN_PROCESS status.
        return Map.of(
                "_error", "createInvoice not yet ported; pass an existing invoiceId via addTimesheetToInvoice",
                "timesheetId", ServiceInput.str(body, "timesheetId"));
    }

    // =========================================================================
    // TimesheetRole
    // =========================================================================

    /** Service: createTimesheetRole (engine="entity-auto" create). */
    public Map<String, Object> createTimesheetRole(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=CREATE
        TimesheetRole tr = new TimesheetRole();
        ServiceInput.populate(tr, body);
        timesheetRoleDao.insert(tr);
        return Map.of(
                "timesheetId", tr.getTimesheetId(),
                "partyId", tr.getPartyId(),
                "roleTypeId", tr.getRoleTypeId());
    }

    /** Service: deleteTimesheetRole (engine="entity-auto" delete). */
    public Map<String, Object> deleteTimesheetRole(Map<String, Object> body) throws SQLException {
        // TODO permission check: workEffortGenericPermission main-action=DELETE
        TimesheetRole pk = new TimesheetRole();
        ServiceInput.populate(pk, body);
        int n = timesheetRoleDao.delete(pk);
        return Map.of("deletedRows", n);
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
        return Map.of("timeEntryId", te.getTimeEntryId());
    }

    /** Service: updateTimeEntry (minilang TimesheetServices; hours auto-calculated from dates). */
    public Map<String, Object> updateTimeEntry(Map<String, Object> body) throws SQLException {
        String timeEntryId = ServiceInput.str(body, "timeEntryId");
        TimeEntry existing = timeEntryDao.gett(timeEntryId);
        if (existing == null) {
            return Map.of("_error", "TimeEntry not found: " + timeEntryId);
        }
        // TODO secondary: checkTimesheetStatus (parent Timesheet must be TIMESHEET_IN_PROCESS,
        // except for invoiceId-only updates)

        Map<String, Object> fields = new HashMap<>(body);
        // OFBiz only updates invoiceId/invoiceItemSeqId if currently empty
        if (Strings.isNotEmpty(existing.getInvoiceId())) {
            fields.remove("invoiceId");
            fields.remove("invoiceItemSeqId");
        }
        // Auto-calc hours when dates moved and hours not explicitly provided
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
        return Map.of("timeEntryId", timeEntryId);
    }

    /** Service: deleteTimeEntry (engine="entity-auto" delete). */
    public Map<String, Object> deleteTimeEntry(Map<String, Object> body) throws SQLException {
        String timeEntryId = ServiceInput.str(body, "timeEntryId");
        int n = timeEntryDao.deleteById(timeEntryId);
        return Map.of("deletedRows", n);
    }

    // =========================================================================
    // Misc
    // =========================================================================

    /** Service: test (no-op stand-in for the OFBiz framework's chain-test endpoint). */
    public Map<String, Object> test(Map<String, Object> body) {
        return Map.of("ok", Boolean.TRUE, "echo", body == null ? Map.of() : body);
    }

    // =========================================================================
    // Internals
    // =========================================================================

    private static Timestamp nowTs() {
        return Timestamp.from(Instant.now());
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

    /** Shallow copy via abacus's Beans.copy. */
    private static <T> T cloneShallow(T bean) {
        return com.landawn.abacus.util.Beans.copy(bean);
    }

    /** Map an entity to its property-map (used to feed createXxx services from a duplicate clone). */
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

    /** Heuristic: don't carry FK navigation fields (they're entities themselves) into a Map dump. */
    private static boolean isEntityRef(Object v) {
        return v.getClass().getName().startsWith("com.landawn.ofbiz.entity.");
    }
}
