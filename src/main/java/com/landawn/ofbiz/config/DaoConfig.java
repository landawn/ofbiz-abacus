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
@org.springframework.context.annotation.Lazy
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

    // ---- DAOs added for WebtoolsController endpoints ----

    /** Stand-in for Common's Geo CRUD — createGeo / updateGeo / deleteGeo. */
    @Bean
    public com.landawn.ofbiz.dao.GeoDao geoDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.GeoDao.class, ds);
    }

    /** Stand-in for Common's GeoAssoc CRUD — deleteGeoAssoc / linkGeos. */
    @Bean
    public com.landawn.ofbiz.dao.GeoAssocDao geoAssocDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.GeoAssocDao.class, ds);
    }

    /** Stand-in for Service-framework JobSandbox CRUD — cancelScheduledJob / resetScheduledJob. */
    @Bean
    public com.landawn.ofbiz.dao.JobSandboxDao jobSandboxDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.JobSandboxDao.class, ds);
    }

    /** Stand-in for Service-framework JobManagerLock CRUD. */
    @Bean
    public com.landawn.ofbiz.dao.JobManagerLockDao jobManagerLockDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.JobManagerLockDao.class, ds);
    }

    /** Stand-in for entity sync — resetEntitySyncStatus. */
    @Bean
    public com.landawn.ofbiz.dao.EntitySyncDao entitySyncDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.EntitySyncDao.class, ds);
    }

    // ---- DAOs added for MarketingController endpoints ----

    @Bean
    public com.landawn.ofbiz.dao.MarketingCampaignDao marketingCampaignDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.MarketingCampaignDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.MarketingCampaignRoleDao marketingCampaignRoleDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.MarketingCampaignRoleDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.ContactListDao contactListDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContactListDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.ContactListPartyDao contactListPartyDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContactListPartyDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.ContactListPartyStatusDao contactListPartyStatusDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContactListPartyStatusDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.WebSiteContactListDao webSiteContactListDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.WebSiteContactListDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.SegmentGroupDao segmentGroupDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.SegmentGroupDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.SegmentGroupClassificationDao segmentGroupClassificationDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.SegmentGroupClassificationDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.SegmentGroupGeoDao segmentGroupGeoDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.SegmentGroupGeoDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.SegmentGroupRoleDao segmentGroupRoleDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.SegmentGroupRoleDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.TrackingCodeDao trackingCodeDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.TrackingCodeDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.TrackingCodeTypeDao trackingCodeTypeDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.TrackingCodeTypeDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.DataSourceDao dataSourceDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.DataSourceDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.DataSourceTypeDao dataSourceTypeDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.DataSourceTypeDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.SalesForecastDao salesForecastDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.SalesForecastDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.SalesForecastDetailDao salesForecastDetailDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.SalesForecastDetailDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.SalesOpportunityDao salesOpportunityDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.SalesOpportunityDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.PartyDataSourceDao partyDataSourceDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyDataSourceDao.class, ds);
    }

    // ---- DAOs added for ManufacturingController endpoints ----

    @Bean
    public com.landawn.ofbiz.dao.TechDataCalendarDao techDataCalendarDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.TechDataCalendarDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.TechDataCalendarWeekDao techDataCalendarWeekDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.TechDataCalendarWeekDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.TechDataCalendarExcDayDao techDataCalendarExcDayDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.TechDataCalendarExcDayDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.TechDataCalendarExcWeekDao techDataCalendarExcWeekDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.TechDataCalendarExcWeekDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.CostComponentCalcDao costComponentCalcDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.CostComponentCalcDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.ProductManufacturingRuleDao productManufacturingRuleDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductManufacturingRuleDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.WorkEffortCostCalcDao workEffortCostCalcDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.WorkEffortCostCalcDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.WorkEffortGoodStandardDao workEffortGoodStandardDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.WorkEffortGoodStandardDao.class, ds);
    }

    @Bean
    public com.landawn.ofbiz.dao.WorkEffortFixedAssetStdDao workEffortFixedAssetStdDao(DataSource ds) {
        return JdbcUtil.createDao(com.landawn.ofbiz.dao.WorkEffortFixedAssetStdDao.class, ds);
    }

    // ---- DAOs added for HumanresController endpoints ----
    @Bean public com.landawn.ofbiz.dao.EmplPositionDao emplPositionDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplPositionDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmplPositionFulfillmentDao emplPositionFulfillmentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplPositionFulfillmentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmplPositionReportingStructDao emplPositionReportingStructDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplPositionReportingStructDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmplPositionResponsibilityDao emplPositionResponsibilityDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplPositionResponsibilityDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmplPositionTypeDao emplPositionTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplPositionTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmplPositionTypeRateDao emplPositionTypeRateDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplPositionTypeRateDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmplLeaveDao emplLeaveDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplLeaveDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmplLeaveReasonTypeDao emplLeaveReasonTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplLeaveReasonTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmplLeaveTypeDao emplLeaveTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmplLeaveTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmploymentDao employmentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmploymentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EmploymentAppDao employmentAppDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EmploymentAppDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementEmploymentApplDao agreementEmploymentApplDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementEmploymentApplDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyBenefitDao partyBenefitDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyBenefitDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyQualDao partyQualDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyQualDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyResumeDao partyResumeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyResumeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartySkillDao partySkillDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartySkillDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PayGradeDao payGradeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PayGradeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PayHistoryDao payHistoryDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PayHistoryDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PayrollPreferenceDao payrollPreferenceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PayrollPreferenceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PerfReviewDao perfReviewDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PerfReviewDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PerfReviewItemDao perfReviewItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PerfReviewItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PerformanceNoteDao performanceNoteDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PerformanceNoteDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ResponsibilityTypeDao responsibilityTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ResponsibilityTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ValidResponsibilityDao validResponsibilityDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ValidResponsibilityDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SalaryStepDao salaryStepDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SalaryStepDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SkillTypeDao skillTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SkillTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.TerminationReasonDao terminationReasonDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.TerminationReasonDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.TerminationTypeDao terminationTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.TerminationTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.UnemploymentClaimDao unemploymentClaimDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.UnemploymentClaimDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.JobInterviewDao jobInterviewDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.JobInterviewDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.JobInterviewTypeDao jobInterviewTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.JobInterviewTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.JobRequisitionDao jobRequisitionDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.JobRequisitionDao.class, ds); }

    // ---- DAOs added for PartyController endpoints ----
    @Bean public com.landawn.ofbiz.dao.PartyDao partyDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PersonDao personDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PersonDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyGroupDao partyGroupDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyGroupDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyAttributeDao partyAttributeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyAttributeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyClassificationDao partyClassificationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyClassificationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyClassificationGroupDao partyClassificationGroupDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyClassificationGroupDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyContactMechPurposeDao partyContactMechPurposeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyContactMechPurposeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyContentDao partyContentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyContentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyNoteDao partyNoteDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyNoteDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyIdentificationDao partyIdentificationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyIdentificationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyInvitationDao partyInvitationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyInvitationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyInvitationGroupAssocDao partyInvitationGroupAssocDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyInvitationGroupAssocDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyInvitationRoleAssocDao partyInvitationRoleAssocDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyInvitationRoleAssocDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyRelationshipDao partyRelationshipDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyRelationshipDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyRelationshipTypeDao partyRelationshipTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyRelationshipTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyCarrierAccountDao partyCarrierAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyCarrierAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyTaxAuthInfoDao partyTaxAuthInfoDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyTaxAuthInfoDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.MaritalStatusDao maritalStatusDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.MaritalStatusDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.MaritalStatusTypeDao maritalStatusTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.MaritalStatusTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.RoleTypeDao roleTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.RoleTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductStoreRoleDao productStoreRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductStoreRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.BillingAccountDao billingAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.BillingAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.BillingAccountRoleDao billingAccountRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.BillingAccountRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CommunicationEventRoleDao communicationEventRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CommunicationEventRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CommunicationEventPurposeDao communicationEventPurposeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CommunicationEventPurposeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CommunicationEventProductDao communicationEventProductDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CommunicationEventProductDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CommunicationEventReturnDao communicationEventReturnDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CommunicationEventReturnDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CommunicationEventOrderDao communicationEventOrderDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CommunicationEventOrderDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CommEventContentAssocDao commEventContentAssocDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CommEventContentAssocDao.class, ds); }
    // CommEventContentDataResource has no @Id field (view entity) — not a CrudDao candidate.
    // Replaced with the assoc DAO; createCommContentDataResource service inlines what it needs.
    @Bean public com.landawn.ofbiz.dao.ShoppingListDao shoppingListDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ShoppingListDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ShoppingListItemDao shoppingListItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ShoppingListItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CreditCardDao creditCardDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CreditCardDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.EftAccountDao eftAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.EftAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.GiftCardDao giftCardDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GiftCardDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CheckAccountDao checkAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CheckAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AddressMatchMapDao addressMatchMapDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AddressMatchMapDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyIcsAvsOverrideDao partyIcsAvsOverrideDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyIcsAvsOverrideDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PostalAddressDao postalAddressDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PostalAddressDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.TelecomNumberDao telecomNumberDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.TelecomNumberDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FtpAddressDao ftpAddressDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FtpAddressDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyAcctgPreferenceDao partyAcctgPreferenceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyAcctgPreferenceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.UserPreferenceDao userPreferenceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.UserPreferenceDao.class, ds); }

    // ---- DAOs added for Commonext + Content/Product entities used by other controllers ----
    @Bean public com.landawn.ofbiz.dao.FacilityDao facilityDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FacilityDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProdCatalogDao prodCatalogDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProdCatalogDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductCategoryDao productCategoryDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductCategoryDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductStoreDao productStoreDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductStoreDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.WebSiteDao webSiteDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.WebSiteDao.class, ds); }

    // ---- DAOs added for OrderController endpoints ----
    @Bean public com.landawn.ofbiz.dao.OrderHeaderDao orderHeaderDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderHeaderDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderItemDao orderItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderRoleDao orderRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderStatusDao orderStatusDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderStatusDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderAdjustmentDao orderAdjustmentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderAdjustmentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderItemShipGroupDao orderItemShipGroupDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderItemShipGroupDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderItemShipGroupAssocDao orderItemShipGroupAssocDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderItemShipGroupAssocDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderTermDao orderTermDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderTermDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderDeliveryScheduleDao orderDeliveryScheduleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderDeliveryScheduleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.OrderPaymentPreferenceDao orderPaymentPreferenceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.OrderPaymentPreferenceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.QuoteDao quoteDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.QuoteDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.QuoteItemDao quoteItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.QuoteItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.QuoteRoleDao quoteRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.QuoteRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.QuoteTermDao quoteTermDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.QuoteTermDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.QuoteAttributeDao quoteAttributeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.QuoteAttributeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.QuoteCoefficientDao quoteCoefficientDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.QuoteCoefficientDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.QuoteAdjustmentDao quoteAdjustmentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.QuoteAdjustmentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.QuoteWorkEffortDao quoteWorkEffortDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.QuoteWorkEffortDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ReturnHeaderDao returnHeaderDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ReturnHeaderDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ReturnItemDao returnItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ReturnItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ReturnAdjustmentDao returnAdjustmentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ReturnAdjustmentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ReturnContactMechDao returnContactMechDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ReturnContactMechDao.class, ds); }
    // RequirementDao registered earlier; reusing.
    @Bean public com.landawn.ofbiz.dao.RequirementRoleDao requirementRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.RequirementRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.RequirementStatusDao requirementStatusDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.RequirementStatusDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AllocationPlanHeaderDao allocationPlanHeaderDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AllocationPlanHeaderDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AllocationPlanItemDao allocationPlanItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AllocationPlanItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CustRequestItemDao custRequestItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CustRequestItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CustRequestItemNoteDao custRequestItemNoteDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CustRequestItemNoteDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CustRequestPartyDao custRequestPartyDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CustRequestPartyDao.class, ds); }

    // ---- DAOs added for AccountingController endpoints ----
    @Bean public com.landawn.ofbiz.dao.AcctgTransDao acctgTransDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AcctgTransDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AcctgTransEntryDao acctgTransEntryDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AcctgTransEntryDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementDao agreementDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementItemDao agreementItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementRoleDao agreementRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementTermDao agreementTermDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementTermDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementProductApplDao agreementProductApplDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementProductApplDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementWorkEffortApplicDao agreementWorkEffortApplicDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementWorkEffortApplicDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InvoiceItemTypeGlAccountDao invoiceItemTypeGlAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InvoiceItemTypeGlAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentMethodTypeGlAccountDao paymentMethodTypeGlAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentMethodTypeGlAccountDao.class, ds); }
    // PaymentTypeGlAccountDao/entity doesn't exist — service stubbed in AccountingService.
    @Bean public com.landawn.ofbiz.dao.GlAccountDao glAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GlAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.GlAccountCategoryDao glAccountCategoryDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GlAccountCategoryDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.GlAccountOrganizationDao glAccountOrganizationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GlAccountOrganizationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.GlJournalDao glJournalDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GlJournalDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.GlReconciliationDao glReconciliationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GlReconciliationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentDao paymentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentApplicationDao paymentApplicationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentApplicationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGroupDao paymentGroupDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGroupDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGroupMemberDao paymentGroupMemberDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGroupMemberDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FinAccountDao finAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FinAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FinAccountAuthDao finAccountAuthDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FinAccountAuthDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FinAccountRoleDao finAccountRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FinAccountRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FinAccountTransDao finAccountTransDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FinAccountTransDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetDao fixedAssetDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetIdentDao fixedAssetIdentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetIdentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetMaintDao fixedAssetMaintDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetMaintDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetRegistrationDao fixedAssetRegistrationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetRegistrationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetStdCostDao fixedAssetStdCostDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetStdCostDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.TaxAuthorityDao taxAuthorityDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.TaxAuthorityDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.TaxAuthorityAssocDao taxAuthorityAssocDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.TaxAuthorityAssocDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.TaxAuthorityCategoryDao taxAuthorityCategoryDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.TaxAuthorityCategoryDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.TaxAuthorityGlAccountDao taxAuthorityGlAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.TaxAuthorityGlAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.TaxAuthorityRateProductDao taxAuthorityRateProductDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.TaxAuthorityRateProductDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.BudgetDao budgetDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.BudgetDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.BudgetItemDao budgetItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.BudgetItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.BudgetReviewDao budgetReviewDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.BudgetReviewDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.BudgetRoleDao budgetRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.BudgetRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InvoiceRoleDao invoiceRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InvoiceRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InvoiceTermDao invoiceTermDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InvoiceTermDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.BillingAccountTermDao billingAccountTermDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.BillingAccountTermDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CustomTimePeriodDao customTimePeriodDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CustomTimePeriodDao.class, ds); }
    // PartyAcctgPreferenceDao already registered in the Party block above.

    // ---- DAOs added for ContentController endpoints ----
    @Bean public com.landawn.ofbiz.dao.ContentDao contentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentAssocDao contentAssocDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentAssocDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentAssocPredicateDao contentAssocPredicateDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentAssocPredicateDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentAssocTypeDao contentAssocTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentAssocTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentAttributeDao contentAttributeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentAttributeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentKeywordDao contentKeywordDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentKeywordDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentMetaDataDao contentMetaDataDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentMetaDataDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentPurposeDao contentPurposeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentPurposeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentPurposeTypeDao contentPurposeTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentPurposeTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentRevisionDao contentRevisionDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentRevisionDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentRevisionItemDao contentRevisionItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentRevisionItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentRoleDao contentRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentTypeDao contentTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentTypeAttrDao contentTypeAttrDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentTypeAttrDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ContentApprovalDao contentApprovalDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ContentApprovalDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.DataResourceDao dataResourceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.DataResourceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.DataResourceAttributeDao dataResourceAttributeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.DataResourceAttributeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.DataResourceRoleDao dataResourceRoleDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.DataResourceRoleDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.DataResourceTypeDao dataResourceTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.DataResourceTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.DataResourceTypeAttrDao dataResourceTypeAttrDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.DataResourceTypeAttrDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.DataCategoryDao dataCategoryDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.DataCategoryDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SurveyDao surveyDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SurveyDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SurveyPageDao surveyPageDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SurveyPageDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SurveyQuestionDao surveyQuestionDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SurveyQuestionDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SurveyQuestionApplDao surveyQuestionApplDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SurveyQuestionApplDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SurveyQuestionCategoryDao surveyQuestionCategoryDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SurveyQuestionCategoryDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SurveyQuestionOptionDao surveyQuestionOptionDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SurveyQuestionOptionDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SurveyResponseDao surveyResponseDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SurveyResponseDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SurveyResponseAnswerDao surveyResponseAnswerDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SurveyResponseAnswerDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.WebSiteContentDao webSiteContentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.WebSiteContentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.WebSitePathAliasDao webSitePathAliasDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.WebSitePathAliasDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.WebAnalyticsConfigDao webAnalyticsConfigDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.WebAnalyticsConfigDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.MimeTypeDao mimeTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.MimeTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.MimeTypeHtmlTemplateDao mimeTypeHtmlTemplateDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.MimeTypeHtmlTemplateDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CharacterSetDao characterSetDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CharacterSetDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FileExtensionDao fileExtensionDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FileExtensionDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.MetaDataPredicateDao metaDataPredicateDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.MetaDataPredicateDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ElectronicTextDao electronicTextDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ElectronicTextDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SubscriptionDao subscriptionDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SubscriptionDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SubscriptionResourceDao subscriptionResourceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SubscriptionResourceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SubscriptionAttributeDao subscriptionAttributeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SubscriptionAttributeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SubscriptionFulfillmentPieceDao subscriptionFulfillmentPieceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SubscriptionFulfillmentPieceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.SubscriptionTypeAttrDao subscriptionTypeAttrDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.SubscriptionTypeAttrDao.class, ds); }

    // ---- DAOs added for ProductController endpoints ----
    @Bean public com.landawn.ofbiz.dao.ProductDao productDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductAssocDao productAssocDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductAssocDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductAttributeDao productAttributeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductAttributeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductContentDao productContentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductContentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductKeywordDao productKeywordDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductKeywordDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductPriceDao productPriceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductPriceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductCategoryAttributeDao productCategoryAttributeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductCategoryAttributeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductCategoryLinkDao productCategoryLinkDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductCategoryLinkDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductCategoryRollupDao productCategoryRollupDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductCategoryRollupDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductFeatureDao productFeatureDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductFeatureDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductFeatureApplDao productFeatureApplDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductFeatureApplDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductFeatureGroupDao productFeatureGroupDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductFeatureGroupDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductFeatureCategoryDao productFeatureCategoryDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductFeatureCategoryDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductFeatureTypeDao productFeatureTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductFeatureTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductStoreFacilityDao productStoreFacilityDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductStoreFacilityDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductStoreCatalogDao productStoreCatalogDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductStoreCatalogDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FacilityGroupDao facilityGroupDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FacilityGroupDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FacilityLocationDao facilityLocationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FacilityLocationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FacilityContentDao facilityContentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FacilityContentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FacilityContactMechDao facilityContactMechDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FacilityContactMechDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InventoryItemDao inventoryItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InventoryItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InventoryItemDetailDao inventoryItemDetailDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InventoryItemDetailDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InventoryItemLabelDao inventoryItemLabelDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InventoryItemLabelDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InventoryTransferDao inventoryTransferDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InventoryTransferDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.GoodIdentificationDao goodIdentificationDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GoodIdentificationDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductPromoDao productPromoDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductPromoDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductPromoCodeDao productPromoCodeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductPromoCodeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductReviewDao productReviewDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductReviewDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ProductFacilityDao productFacilityDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ProductFacilityDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ShipmentDao shipmentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ShipmentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.ShipmentItemDao shipmentItemDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.ShipmentItemDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.KeywordThesaurusDao keywordThesaurusDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.KeywordThesaurusDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CarrierShipmentMethodDao carrierShipmentMethodDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CarrierShipmentMethodDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PicklistDao picklistDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PicklistDao.class, ds); }

    // ---- DAOs added for AccountingController entity-auto services ----
    @Bean public com.landawn.ofbiz.dao.AgreementContentDao agreementContentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementContentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementFacilityApplDao agreementFacilityApplDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementFacilityApplDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementGeographicalApplicDao agreementGeographicalApplicDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementGeographicalApplicDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementPartyApplicDao agreementPartyApplicDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementPartyApplicDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.AgreementPromoApplDao agreementPromoApplDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.AgreementPromoApplDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.CreditCardTypeGlAccountDao creditCardTypeGlAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.CreditCardTypeGlAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FinAccountTypeGlAccountDao finAccountTypeGlAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FinAccountTypeGlAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetDepMethodDao fixedAssetDepMethodDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetDepMethodDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetMaintOrderDao fixedAssetMaintOrderDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetMaintOrderDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetMeterDao fixedAssetMeterDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetMeterDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetProductDao fixedAssetProductDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetProductDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.FixedAssetTypeGlAccountDao fixedAssetTypeGlAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.FixedAssetTypeGlAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.GlAccountCategoryMemberDao glAccountCategoryMemberDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GlAccountCategoryMemberDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.GlAccountTypeDefaultDao glAccountTypeDefaultDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.GlAccountTypeDefaultDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InvoiceItemTypeDao invoiceItemTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InvoiceItemTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyFixedAssetAssignmentDao partyFixedAssetAssignmentDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyFixedAssetAssignmentDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyGlAccountDao partyGlAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyGlAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PartyPrefDocTypeTplDao partyPrefDocTypeTplDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PartyPrefDocTypeTplDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayAuthorizeNetDao paymentGatewayAuthorizeNetDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayAuthorizeNetDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayClearCommerceDao paymentGatewayClearCommerceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayClearCommerceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayConfigDao paymentGatewayConfigDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayConfigDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayEwayDao paymentGatewayEwayDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayEwayDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewaySagePayDao paymentGatewaySagePayDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewaySagePayDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGlAccountTypeMapDao paymentGlAccountTypeMapDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGlAccountTypeMapDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentMethodTypeDao paymentMethodTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentMethodTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.VarianceReasonGlAccountDao varianceReasonGlAccountDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.VarianceReasonGlAccountDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayConfigTypeDao paymentGatewayConfigTypeDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayConfigTypeDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayCyberSourceDao paymentGatewayCyberSourceDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayCyberSourceDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayPayPalDao paymentGatewayPayPalDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayPayPalDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayPayflowProDao paymentGatewayPayflowProDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayPayflowProDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewaySecurePayDao paymentGatewaySecurePayDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewaySecurePayDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.PaymentGatewayWorldPayDao paymentGatewayWorldPayDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.PaymentGatewayWorldPayDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.InvoiceStatusDao invoiceStatusDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.InvoiceStatusDao.class, ds); }
    @Bean public com.landawn.ofbiz.dao.BudgetStatusDao budgetStatusDao(DataSource ds) { return JdbcUtil.createDao(com.landawn.ofbiz.dao.BudgetStatusDao.class, ds); }
}
