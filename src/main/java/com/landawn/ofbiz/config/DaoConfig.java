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
}
