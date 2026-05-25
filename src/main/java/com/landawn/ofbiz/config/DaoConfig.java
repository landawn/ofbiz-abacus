/*
 * Copyright (C) 2026 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 */
package com.landawn.ofbiz.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.landawn.abacus.jdbc.JdbcUtil;
import com.landawn.ofbiz.dao.CommunicationEventDao;
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
import com.landawn.ofbiz.dao.RequirementDao;
import com.landawn.ofbiz.dao.RuntimeDataDao;
import com.landawn.ofbiz.dao.SecurityGroupPermissionDao;
import com.landawn.ofbiz.dao.StatusItemDao;
import com.landawn.ofbiz.dao.StatusValidChangeDao;
import com.landawn.ofbiz.dao.TimeEntryDao;
import com.landawn.ofbiz.dao.TimesheetDao;
import com.landawn.ofbiz.dao.TimesheetRoleDao;
import com.landawn.ofbiz.dao.UserLoginDao;
import com.landawn.ofbiz.dao.UserLoginSecurityGroupDao;
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

/**
 * Wires the abacus-jdbc DAO interfaces used by {@code com.landawn.ofbiz.service} into the Spring
 * application context. Each bean is created via {@link JdbcUtil#createDao(Class, DataSource)} which
 * produces a dynamic proxy backed by the configured H2 DataSource.
 *
 * <p>Only the DAOs that current service implementations consume are registered here. Add new beans
 * as additional services come online.
 */
@Configuration
public class DaoConfig {

    @Bean
    public WorkEffortDao workEffortDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortDao.class, ds);
    }

    @Bean
    public WorkEffortAssocDao workEffortAssocDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortAssocDao.class, ds);
    }

    @Bean
    public WorkEffortContactMechDao workEffortContactMechDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortContactMechDao.class, ds);
    }

    @Bean
    public WorkEffortKeywordDao workEffortKeywordDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortKeywordDao.class, ds);
    }

    @Bean
    public WorkEffortStatusDao workEffortStatusDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortStatusDao.class, ds);
    }

    @Bean
    public WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortPartyAssignmentDao.class, ds);
    }

    @Bean
    public TimesheetDao timesheetDao(DataSource ds) {
        return JdbcUtil.createDao(TimesheetDao.class, ds);
    }

    @Bean
    public TimesheetRoleDao timesheetRoleDao(DataSource ds) {
        return JdbcUtil.createDao(TimesheetRoleDao.class, ds);
    }

    @Bean
    public TimeEntryDao timeEntryDao(DataSource ds) {
        return JdbcUtil.createDao(TimeEntryDao.class, ds);
    }

    @Bean
    public StatusItemDao statusItemDao(DataSource ds) {
        return JdbcUtil.createDao(StatusItemDao.class, ds);
    }

    @Bean
    public PartyRoleDao partyRoleDao(DataSource ds) {
        return JdbcUtil.createDao(PartyRoleDao.class, ds);
    }

    @Bean
    public ContactMechDao contactMechDao(DataSource ds) {
        return JdbcUtil.createDao(ContactMechDao.class, ds);
    }

    @Bean
    public PartyContactMechDao partyContactMechDao(DataSource ds) {
        return JdbcUtil.createDao(PartyContactMechDao.class, ds);
    }

    // ---- DAOs added for the full createWorkEffort SECA chain ----

    @Bean
    public CommunicationEventDao communicationEventDao(DataSource ds) {
        return JdbcUtil.createDao(CommunicationEventDao.class, ds);
    }

    @Bean
    public CommunicationEventWorkEffDao communicationEventWorkEffDao(DataSource ds) {
        return JdbcUtil.createDao(CommunicationEventWorkEffDao.class, ds);
    }

    @Bean
    public CustRequestDao custRequestDao(DataSource ds) {
        return JdbcUtil.createDao(CustRequestDao.class, ds);
    }

    @Bean
    public CustRequestWorkEffortDao custRequestWorkEffortDao(DataSource ds) {
        return JdbcUtil.createDao(CustRequestWorkEffortDao.class, ds);
    }

    @Bean
    public CustRequestContentDao custRequestContentDao(DataSource ds) {
        return JdbcUtil.createDao(CustRequestContentDao.class, ds);
    }

    @Bean
    public WorkEffortContentDao workEffortContentDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortContentDao.class, ds);
    }

    @Bean
    public RequirementDao requirementDao(DataSource ds) {
        return JdbcUtil.createDao(RequirementDao.class, ds);
    }

    @Bean
    public WorkRequirementFulfillmentDao workRequirementFulfillmentDao(DataSource ds) {
        return JdbcUtil.createDao(WorkRequirementFulfillmentDao.class, ds);
    }

    @Bean
    public UserLoginDao userLoginDao(DataSource ds) {
        return JdbcUtil.createDao(UserLoginDao.class, ds);
    }

    @Bean
    public UserLoginSecurityGroupDao userLoginSecurityGroupDao(DataSource ds) {
        return JdbcUtil.createDao(UserLoginSecurityGroupDao.class, ds);
    }

    @Bean
    public SecurityGroupPermissionDao securityGroupPermissionDao(DataSource ds) {
        return JdbcUtil.createDao(SecurityGroupPermissionDao.class, ds);
    }

    // -----------------------------------------------------------------------------------
    // Cross-component DAOs — stand in for service ports we haven't done yet (Accounting,
    // Content, workeffort secondary entities). WorkeffortService writes directly through
    // these. Promote each to a proper service-layer call when the owning component is
    // ported.
    // -----------------------------------------------------------------------------------

    /** Stand-in for Accounting's createInvoice — used by addTimesheetToNewInvoice. */
    @Bean
    public InvoiceDao invoiceDao(DataSource ds) {
        return JdbcUtil.createDao(InvoiceDao.class, ds);
    }

    /** Stand-in for Accounting's createInvoiceItem — used by addTimesheet*ToInvoice. */
    @Bean
    public InvoiceItemDao invoiceItemDao(DataSource ds) {
        return JdbcUtil.createDao(InvoiceItemDao.class, ds);
    }

    /** Stand-in for Accounting's PartyRate lookup — addTimesheetToInvoice rate adjustment. */
    @Bean
    public PartyRateDao partyRateDao(DataSource ds) {
        return JdbcUtil.createDao(PartyRateDao.class, ds);
    }

    /** Workeffort secondary — deleteWorkEffort cascade + duplicateWorkEffortNotes. */
    @Bean
    public WorkEffortNoteDao workEffortNoteDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortNoteDao.class, ds);
    }

    /** Stand-in for Content's NoteData — WorkEffortNote depends on NoteData rows. */
    @Bean
    public NoteDataDao noteDataDao(DataSource ds) {
        return JdbcUtil.createDao(NoteDataDao.class, ds);
    }

    /** Workeffort secondary — duplicateWorkEffortAssignmentRates + delete cascade. */
    @Bean
    public RateAmountDao rateAmountDao(DataSource ds) {
        return JdbcUtil.createDao(RateAmountDao.class, ds);
    }

    /** Workeffort secondary — deleteWorkEffort cascade. */
    @Bean
    public WorkEffortAttributeDao workEffortAttributeDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortAttributeDao.class, ds);
    }

    /** Workeffort secondary — deleteWorkEffort cascade. */
    @Bean
    public WorkEffortFixedAssetAssignDao workEffortFixedAssetAssignDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortFixedAssetAssignDao.class, ds);
    }

    /** Workeffort secondary — deleteWorkEffort cascade. */
    @Bean
    public WorkEffortSkillStandardDao workEffortSkillStandardDao(DataSource ds) {
        return JdbcUtil.createDao(WorkEffortSkillStandardDao.class, ds);
    }

    /** Order secondary — deleteWorkEffort cascade (WorkOrderItemFulfillment links). */
    @Bean
    public WorkOrderItemFulfillmentDao workOrderItemFulfillmentDao(DataSource ds) {
        return JdbcUtil.createDao(WorkOrderItemFulfillmentDao.class, ds);
    }

    /** Workeffort secondary — deleteWorkEffort cascade. */
    @Bean
    public RecurrenceInfoDao recurrenceInfoDao(DataSource ds) {
        return JdbcUtil.createDao(RecurrenceInfoDao.class, ds);
    }

    /** Service framework — deleteWorkEffort cascade (RuntimeData refs from workeffort). */
    @Bean
    public RuntimeDataDao runtimeDataDao(DataSource ds) {
        return JdbcUtil.createDao(RuntimeDataDao.class, ds);
    }

    /** Used by updateWorkEffort to validate status-change transitions. */
    @Bean
    public StatusValidChangeDao statusValidChangeDao(DataSource ds) {
        return JdbcUtil.createDao(StatusValidChangeDao.class, ds);
    }
}
