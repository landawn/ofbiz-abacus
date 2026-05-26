/*
 * Copyright (C) 2026 HaiYang Li
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
import java.time.temporal.ChronoUnit;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landawn.abacus.query.Filters;
import com.landawn.abacus.util.Strings;
import com.landawn.ofbiz.dao.*;
import com.landawn.ofbiz.entity.*;
import com.landawn.ofbiz.util.SequenceUtil;
import com.landawn.ofbiz.util.ServiceInput;

/**
 * Ports the 127 OFBiz services exposed by {@link com.landawn.ofbiz.controller.HumanresController}.
 *
 * <p>Dominated by entity-auto CRUD on HR-domain entities (EmplPosition, EmplLeave, Employment,
 * PartyBenefit/Qual/Resume/Skill, PayGrade/PayHistory, PerfReview, JobInterview, etc.). Composite
 * orchestrations (createEmployee, createInternalOrg, applyTraining, getChildHRCategoryTree) carry
 * {@code // TODO unimplemented:} markers — they depend on cross-component Party/Person/Workeffort
 * services that aren't yet ported.
 */
@Service
@Transactional
@SuppressWarnings("unused")
public class HumanresService {

    private final EmplPositionDao emplPositionDao;
    private final EmplPositionFulfillmentDao emplPositionFulfillmentDao;
    private final EmplPositionReportingStructDao emplPositionReportingStructDao;
    private final EmplPositionResponsibilityDao emplPositionResponsibilityDao;
    private final EmplPositionTypeDao emplPositionTypeDao;
    private final EmplPositionTypeRateDao emplPositionTypeRateDao;
    private final EmplLeaveDao emplLeaveDao;
    private final EmplLeaveReasonTypeDao emplLeaveReasonTypeDao;
    private final EmplLeaveTypeDao emplLeaveTypeDao;
    private final EmploymentDao employmentDao;
    private final EmploymentAppDao employmentAppDao;
    private final AgreementEmploymentApplDao agreementEmploymentApplDao;
    private final PartyBenefitDao partyBenefitDao;
    private final PartyQualDao partyQualDao;
    private final PartyResumeDao partyResumeDao;
    private final PartySkillDao partySkillDao;
    private final PayGradeDao payGradeDao;
    private final PayHistoryDao payHistoryDao;
    private final PayrollPreferenceDao payrollPreferenceDao;
    private final PerfReviewDao perfReviewDao;
    private final PerfReviewItemDao perfReviewItemDao;
    private final PerformanceNoteDao performanceNoteDao;
    private final ResponsibilityTypeDao responsibilityTypeDao;
    private final ValidResponsibilityDao validResponsibilityDao;
    private final SalaryStepDao salaryStepDao;
    private final SkillTypeDao skillTypeDao;
    private final TerminationReasonDao terminationReasonDao;
    private final TerminationTypeDao terminationTypeDao;
    private final UnemploymentClaimDao unemploymentClaimDao;
    private final JobInterviewDao jobInterviewDao;
    private final JobInterviewTypeDao jobInterviewTypeDao;
    private final JobRequisitionDao jobRequisitionDao;
    private final WorkEffortDao workEffortDao;
    private final WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao;

    public HumanresService(EmplPositionDao emplPositionDao,
                           EmplPositionFulfillmentDao emplPositionFulfillmentDao,
                           EmplPositionReportingStructDao emplPositionReportingStructDao,
                           EmplPositionResponsibilityDao emplPositionResponsibilityDao,
                           EmplPositionTypeDao emplPositionTypeDao,
                           EmplPositionTypeRateDao emplPositionTypeRateDao,
                           EmplLeaveDao emplLeaveDao,
                           EmplLeaveReasonTypeDao emplLeaveReasonTypeDao,
                           EmplLeaveTypeDao emplLeaveTypeDao,
                           EmploymentDao employmentDao,
                           EmploymentAppDao employmentAppDao,
                           AgreementEmploymentApplDao agreementEmploymentApplDao,
                           PartyBenefitDao partyBenefitDao,
                           PartyQualDao partyQualDao,
                           PartyResumeDao partyResumeDao,
                           PartySkillDao partySkillDao,
                           PayGradeDao payGradeDao,
                           PayHistoryDao payHistoryDao,
                           PayrollPreferenceDao payrollPreferenceDao,
                           PerfReviewDao perfReviewDao,
                           PerfReviewItemDao perfReviewItemDao,
                           PerformanceNoteDao performanceNoteDao,
                           ResponsibilityTypeDao responsibilityTypeDao,
                           ValidResponsibilityDao validResponsibilityDao,
                           SalaryStepDao salaryStepDao,
                           SkillTypeDao skillTypeDao,
                           TerminationReasonDao terminationReasonDao,
                           TerminationTypeDao terminationTypeDao,
                           UnemploymentClaimDao unemploymentClaimDao,
                           JobInterviewDao jobInterviewDao,
                           JobInterviewTypeDao jobInterviewTypeDao,
                           JobRequisitionDao jobRequisitionDao,
                           WorkEffortDao workEffortDao,
                           WorkEffortPartyAssignmentDao workEffortPartyAssignmentDao) {
        this.emplPositionDao = emplPositionDao;
        this.emplPositionFulfillmentDao = emplPositionFulfillmentDao;
        this.emplPositionReportingStructDao = emplPositionReportingStructDao;
        this.emplPositionResponsibilityDao = emplPositionResponsibilityDao;
        this.emplPositionTypeDao = emplPositionTypeDao;
        this.emplPositionTypeRateDao = emplPositionTypeRateDao;
        this.emplLeaveDao = emplLeaveDao;
        this.emplLeaveReasonTypeDao = emplLeaveReasonTypeDao;
        this.emplLeaveTypeDao = emplLeaveTypeDao;
        this.employmentDao = employmentDao;
        this.employmentAppDao = employmentAppDao;
        this.agreementEmploymentApplDao = agreementEmploymentApplDao;
        this.partyBenefitDao = partyBenefitDao;
        this.partyQualDao = partyQualDao;
        this.partyResumeDao = partyResumeDao;
        this.partySkillDao = partySkillDao;
        this.payGradeDao = payGradeDao;
        this.payHistoryDao = payHistoryDao;
        this.payrollPreferenceDao = payrollPreferenceDao;
        this.perfReviewDao = perfReviewDao;
        this.perfReviewItemDao = perfReviewItemDao;
        this.performanceNoteDao = performanceNoteDao;
        this.responsibilityTypeDao = responsibilityTypeDao;
        this.validResponsibilityDao = validResponsibilityDao;
        this.salaryStepDao = salaryStepDao;
        this.skillTypeDao = skillTypeDao;
        this.terminationReasonDao = terminationReasonDao;
        this.terminationTypeDao = terminationTypeDao;
        this.unemploymentClaimDao = unemploymentClaimDao;
        this.jobInterviewDao = jobInterviewDao;
        this.jobInterviewTypeDao = jobInterviewTypeDao;
        this.jobRequisitionDao = jobRequisitionDao;
        this.workEffortDao = workEffortDao;
        this.workEffortPartyAssignmentDao = workEffortPartyAssignmentDao;
    }

    // =========================================================================
    // EmplPosition + EmplPositionType family
    // =========================================================================

    public Map<String,Object> createEmplPosition(Map<String,Object> body) throws SQLException {
        EmplPosition e = new EmplPosition(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getEmplPositionId())) e.setEmplPositionId(SequenceUtil.next());
        emplPositionDao.insert(e);
        return ServiceResponse.success("emplPositionId", e.getEmplPositionId());
    }
    public Map<String,Object> updateEmplPosition(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "emplPositionId");
        EmplPosition e = emplPositionDao.gett(id);
        if (e == null) return ServiceResponse.error("EmplPosition not found: " + id);
        ServiceInput.populate(e, body); e.setEmplPositionId(id);
        emplPositionDao.update(e);
        return ServiceResponse.success("emplPositionId", id);
    }
    public Map<String,Object> deleteEmplPosition(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", emplPositionDao.deleteById(ServiceInput.str(body, "emplPositionId")));
    }

    public Map<String,Object> createEmplPositionFulfillment(Map<String,Object> body) throws SQLException {
        EmplPositionFulfillment e = new EmplPositionFulfillment(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        emplPositionFulfillmentDao.insert(e);
        return ServiceResponse.success("emplPositionId", e.getEmplPositionId());
    }
    public Map<String,Object> deleteEmplPositionFulfillment(Map<String,Object> body) throws SQLException {
        EmplPositionFulfillment pk = new EmplPositionFulfillment(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", emplPositionFulfillmentDao.delete(pk));
    }

    public Map<String,Object> createEmplPositionReportingStruct(Map<String,Object> body) throws SQLException {
        EmplPositionReportingStruct e = new EmplPositionReportingStruct(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        emplPositionReportingStructDao.insert(e);
        return ServiceResponse.success("emplPositionIdReportingTo", e.getEmplPositionIdReportingTo());
    }
    public Map<String,Object> deleteEmplPositionReportingStruct(Map<String,Object> body) throws SQLException {
        EmplPositionReportingStruct pk = new EmplPositionReportingStruct(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", emplPositionReportingStructDao.delete(pk));
    }

    public Map<String,Object> createEmplPositionResponsibility(Map<String,Object> body) throws SQLException {
        EmplPositionResponsibility e = new EmplPositionResponsibility(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        emplPositionResponsibilityDao.insert(e);
        return ServiceResponse.success("emplPositionId", e.getEmplPositionId());
    }
    public Map<String,Object> deleteEmplPositionResponsibility(Map<String,Object> body) throws SQLException {
        EmplPositionResponsibility pk = new EmplPositionResponsibility(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", emplPositionResponsibilityDao.delete(pk));
    }

    public Map<String,Object> createEmplPositionType(Map<String,Object> body) throws SQLException {
        EmplPositionType e = new EmplPositionType(); ServiceInput.populate(e, body);
        emplPositionTypeDao.insert(e);
        return ServiceResponse.success("emplPositionTypeId", e.getEmplPositionTypeId());
    }
    public Map<String,Object> deleteEmplPositionType(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", emplPositionTypeDao.deleteById(ServiceInput.str(body, "emplPositionTypeId")));
    }
    public Map<String,Object> updateEmplPositionType(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "emplPositionTypeId");
        EmplPositionType e = emplPositionTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("EmplPositionType not found: " + id);
        ServiceInput.populate(e, body); e.setEmplPositionTypeId(id);
        emplPositionTypeDao.update(e);
        return ServiceResponse.success("emplPositionTypeId", id);
    }
    public Map<String,Object> updateEmplPositionTypeRate(Map<String,Object> body) throws SQLException {
        EmplPositionTypeRate pk = new EmplPositionTypeRate(); ServiceInput.populate(pk, body);
        EmplPositionTypeRate e = emplPositionTypeRateDao.gett(pk);
        if (e == null) {
            ServiceInput.populate(pk, body);
            if (pk.getFromDate() == null) pk.setFromDate(nowTs());
            emplPositionTypeRateDao.insert(pk);
            return ServiceResponse.success("emplPositionTypeId", pk.getEmplPositionTypeId());
        }
        ServiceInput.populate(e, body); emplPositionTypeRateDao.update(e);
        return ServiceResponse.success("emplPositionTypeId", e.getEmplPositionTypeId());
    }
    public Map<String,Object> deleteEmplPositionTypeRate(Map<String,Object> body) throws SQLException {
        EmplPositionTypeRate pk = new EmplPositionTypeRate(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", emplPositionTypeRateDao.delete(pk));
    }
    public Map<String,Object> updateEmplPositionFulfillment(Map<String,Object> body) throws SQLException {
        EmplPositionFulfillment pk = new EmplPositionFulfillment(); ServiceInput.populate(pk, body);
        EmplPositionFulfillment e = emplPositionFulfillmentDao.gett(pk);
        if (e == null) return ServiceResponse.error("EmplPositionFulfillment not found");
        ServiceInput.populate(e, body); emplPositionFulfillmentDao.update(e);
        return ServiceResponse.success("emplPositionId", e.getEmplPositionId());
    }
    public Map<String,Object> updateEmplPositionReportingStruct(Map<String,Object> body) throws SQLException {
        EmplPositionReportingStruct pk = new EmplPositionReportingStruct(); ServiceInput.populate(pk, body);
        EmplPositionReportingStruct e = emplPositionReportingStructDao.gett(pk);
        if (e == null) return ServiceResponse.error("EmplPositionReportingStruct not found");
        ServiceInput.populate(e, body); emplPositionReportingStructDao.update(e);
        return ServiceResponse.success("emplPositionIdReportingTo", e.getEmplPositionIdReportingTo());
    }
    public Map<String,Object> updateEmplPositionResponsibility(Map<String,Object> body) throws SQLException {
        EmplPositionResponsibility pk = new EmplPositionResponsibility(); ServiceInput.populate(pk, body);
        EmplPositionResponsibility e = emplPositionResponsibilityDao.gett(pk);
        if (e == null) return ServiceResponse.error("EmplPositionResponsibility not found");
        ServiceInput.populate(e, body); emplPositionResponsibilityDao.update(e);
        return ServiceResponse.success("emplPositionId", e.getEmplPositionId());
    }

    // =========================================================================
    // EmplLeave family
    // =========================================================================

    public Map<String,Object> createEmplLeave(Map<String,Object> body) throws SQLException {
        EmplLeave e = new EmplLeave(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        emplLeaveDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updateEmplLeave(Map<String,Object> body) throws SQLException {
        EmplLeave pk = new EmplLeave(); ServiceInput.populate(pk, body);
        EmplLeave e = emplLeaveDao.gett(pk);
        if (e == null) return ServiceResponse.error("EmplLeave not found");
        ServiceInput.populate(e, body); emplLeaveDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deleteEmplLeave(Map<String,Object> body) throws SQLException {
        EmplLeave pk = new EmplLeave(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", emplLeaveDao.delete(pk));
    }
    public Map<String,Object> updateEmplLeaveStatus(Map<String,Object> body) throws SQLException {
        EmplLeave pk = new EmplLeave(); ServiceInput.populate(pk, body);
        EmplLeave e = emplLeaveDao.gett(pk);
        if (e == null) return ServiceResponse.error("EmplLeave not found");
        e.setApproverPartyId(ServiceInput.str(body, "approverPartyId"));
        emplLeaveDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> createEmplLeaveReasonType(Map<String,Object> body) throws SQLException {
        EmplLeaveReasonType e = new EmplLeaveReasonType(); ServiceInput.populate(e, body);
        emplLeaveReasonTypeDao.insert(e);
        return ServiceResponse.success("emplLeaveReasonTypeId", e.getEmplLeaveReasonTypeId());
    }
    public Map<String,Object> updateEmplLeaveReasonType(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "emplLeaveReasonTypeId");
        EmplLeaveReasonType e = emplLeaveReasonTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("EmplLeaveReasonType not found: " + id);
        ServiceInput.populate(e, body); e.setEmplLeaveReasonTypeId(id);
        emplLeaveReasonTypeDao.update(e);
        return ServiceResponse.success("emplLeaveReasonTypeId", id);
    }
    public Map<String,Object> deleteEmplLeaveReasonType(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", emplLeaveReasonTypeDao.deleteById(ServiceInput.str(body, "emplLeaveReasonTypeId")));
    }
    public Map<String,Object> createEmplLeaveType(Map<String,Object> body) throws SQLException {
        EmplLeaveType e = new EmplLeaveType(); ServiceInput.populate(e, body);
        emplLeaveTypeDao.insert(e);
        return ServiceResponse.success("leaveTypeId", e.getLeaveTypeId());
    }
    public Map<String,Object> updateEmplLeaveType(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "leaveTypeId");
        EmplLeaveType e = emplLeaveTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("EmplLeaveType not found: " + id);
        ServiceInput.populate(e, body); e.setLeaveTypeId(id);
        emplLeaveTypeDao.update(e);
        return ServiceResponse.success("leaveTypeId", id);
    }
    public Map<String,Object> deleteEmplLeaveType(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", emplLeaveTypeDao.deleteById(ServiceInput.str(body, "leaveTypeId")));
    }

    // =========================================================================
    // Employment + EmploymentApp + AgreementEmploymentAppl
    // =========================================================================

    public Map<String,Object> createEmployment(Map<String,Object> body) throws SQLException {
        Employment e = new Employment(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        employmentDao.insert(e);
        return ServiceResponse.success("partyIdFrom", e.getPartyIdFrom());
    }
    public Map<String,Object> updateEmployment(Map<String,Object> body) throws SQLException {
        Employment pk = new Employment(); ServiceInput.populate(pk, body);
        Employment e = employmentDao.gett(pk);
        if (e == null) return ServiceResponse.error("Employment not found");
        ServiceInput.populate(e, body); employmentDao.update(e);
        return ServiceResponse.success("partyIdFrom", e.getPartyIdFrom());
    }
    public Map<String,Object> deleteEmployment(Map<String,Object> body) throws SQLException {
        Employment pk = new Employment(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", employmentDao.delete(pk));
    }
    public Map<String,Object> createEmploymentApp(Map<String,Object> body) throws SQLException {
        EmploymentApp e = new EmploymentApp(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getApplicationId())) e.setApplicationId(SequenceUtil.next());
        employmentAppDao.insert(e);
        return ServiceResponse.success("applicationId", e.getApplicationId());
    }
    public Map<String,Object> updateEmploymentApp(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "applicationId");
        EmploymentApp e = employmentAppDao.gett(id);
        if (e == null) return ServiceResponse.error("EmploymentApp not found: " + id);
        ServiceInput.populate(e, body); e.setApplicationId(id);
        employmentAppDao.update(e);
        return ServiceResponse.success("applicationId", id);
    }
    public Map<String,Object> deleteEmploymentApp(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", employmentAppDao.deleteById(ServiceInput.str(body, "applicationId")));
    }
    public Map<String,Object> createAgreementEmploymentAppl(Map<String,Object> body) throws SQLException {
        AgreementEmploymentAppl e = new AgreementEmploymentAppl(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        agreementEmploymentApplDao.insert(e);
        return ServiceResponse.success("agreementId", e.getAgreementId());
    }
    public Map<String,Object> updateAgreementEmploymentAppl(Map<String,Object> body) throws SQLException {
        AgreementEmploymentAppl pk = new AgreementEmploymentAppl(); ServiceInput.populate(pk, body);
        AgreementEmploymentAppl e = agreementEmploymentApplDao.gett(pk);
        if (e == null) return ServiceResponse.error("AgreementEmploymentAppl not found");
        ServiceInput.populate(e, body); agreementEmploymentApplDao.update(e);
        return ServiceResponse.success("agreementId", e.getAgreementId());
    }
    public Map<String,Object> deleteAgreementEmploymentAppl(Map<String,Object> body) throws SQLException {
        AgreementEmploymentAppl pk = new AgreementEmploymentAppl(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", agreementEmploymentApplDao.delete(pk));
    }

    // =========================================================================
    // PartyBenefit / PartyQual / PartyResume / PartySkill
    // =========================================================================

    public Map<String,Object> createPartyBenefit(Map<String,Object> body) throws SQLException {
        PartyBenefit e = new PartyBenefit(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyBenefitDao.insert(e);
        return ServiceResponse.success("partyIdFrom", e.getPartyIdFrom());
    }
    public Map<String,Object> updatePartyBenefit(Map<String,Object> body) throws SQLException {
        PartyBenefit pk = new PartyBenefit(); ServiceInput.populate(pk, body);
        PartyBenefit e = partyBenefitDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyBenefit not found");
        ServiceInput.populate(e, body); partyBenefitDao.update(e);
        return ServiceResponse.success("partyIdFrom", e.getPartyIdFrom());
    }
    public Map<String,Object> deletePartyBenefit(Map<String,Object> body) throws SQLException {
        PartyBenefit pk = new PartyBenefit(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyBenefitDao.delete(pk));
    }
    public Map<String,Object> createPartyQual(Map<String,Object> body) throws SQLException {
        PartyQual e = new PartyQual(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        partyQualDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updatePartyQual(Map<String,Object> body) throws SQLException {
        PartyQual pk = new PartyQual(); ServiceInput.populate(pk, body);
        PartyQual e = partyQualDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartyQual not found");
        ServiceInput.populate(e, body); partyQualDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deletePartyQual(Map<String,Object> body) throws SQLException {
        PartyQual pk = new PartyQual(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partyQualDao.delete(pk));
    }
    public Map<String,Object> createPartyResume(Map<String,Object> body) throws SQLException {
        PartyResume e = new PartyResume(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getResumeId())) e.setResumeId(SequenceUtil.next());
        partyResumeDao.insert(e);
        return ServiceResponse.success("resumeId", e.getResumeId());
    }
    public Map<String,Object> updatePartyResume(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "resumeId");
        PartyResume e = partyResumeDao.gett(id);
        if (e == null) return ServiceResponse.error("PartyResume not found: " + id);
        ServiceInput.populate(e, body); e.setResumeId(id);
        partyResumeDao.update(e);
        return ServiceResponse.success("resumeId", id);
    }
    public Map<String,Object> deletePartyResume(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", partyResumeDao.deleteById(ServiceInput.str(body, "resumeId")));
    }
    public Map<String,Object> createPartySkill(Map<String,Object> body) throws SQLException {
        PartySkill e = new PartySkill(); ServiceInput.populate(e, body);
        partySkillDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updatePartySkill(Map<String,Object> body) throws SQLException {
        PartySkill pk = new PartySkill(); ServiceInput.populate(pk, body);
        PartySkill e = partySkillDao.gett(pk);
        if (e == null) return ServiceResponse.error("PartySkill not found");
        ServiceInput.populate(e, body); partySkillDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deletePartySkill(Map<String,Object> body) throws SQLException {
        PartySkill pk = new PartySkill(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", partySkillDao.delete(pk));
    }

    // =========================================================================
    // PayGrade / PayHistory / PayrollPreference / SalaryStep
    // =========================================================================

    public Map<String,Object> createPayGrade(Map<String,Object> body) throws SQLException {
        PayGrade e = new PayGrade(); ServiceInput.populate(e, body);
        payGradeDao.insert(e);
        return ServiceResponse.success("payGradeId", e.getPayGradeId());
    }
    public Map<String,Object> updatePayGrade(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "payGradeId");
        PayGrade e = payGradeDao.gett(id);
        if (e == null) return ServiceResponse.error("PayGrade not found: " + id);
        ServiceInput.populate(e, body); e.setPayGradeId(id);
        payGradeDao.update(e);
        return ServiceResponse.success("payGradeId", id);
    }
    public Map<String,Object> deletePayGrade(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", payGradeDao.deleteById(ServiceInput.str(body, "payGradeId")));
    }
    public Map<String,Object> updatePayHistory(Map<String,Object> body) throws SQLException {
        PayHistory pk = new PayHistory(); ServiceInput.populate(pk, body);
        PayHistory e = payHistoryDao.gett(pk);
        if (e == null) return ServiceResponse.error("PayHistory not found");
        ServiceInput.populate(e, body); payHistoryDao.update(e);
        return ServiceResponse.success("partyIdFrom", e.getPartyIdFrom());
    }
    public Map<String,Object> deletePayHistory(Map<String,Object> body) throws SQLException {
        PayHistory pk = new PayHistory(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", payHistoryDao.delete(pk));
    }
    public Map<String,Object> expirePayHistory(Map<String,Object> body) throws SQLException {
        PayHistory pk = new PayHistory(); ServiceInput.populate(pk, body);
        PayHistory e = payHistoryDao.gett(pk);
        if (e == null) return ServiceResponse.error("PayHistory not found");
        e.setThruDate(nowTs()); payHistoryDao.update(e);
        return ServiceResponse.success("partyIdFrom", e.getPartyIdFrom());
    }
    public Map<String,Object> createPayrollPreference(Map<String,Object> body) throws SQLException {
        PayrollPreference e = new PayrollPreference(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getPayrollPreferenceSeqId())) e.setPayrollPreferenceSeqId(SequenceUtil.next());
        payrollPreferenceDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> updatePayrollPreference(Map<String,Object> body) throws SQLException {
        PayrollPreference pk = new PayrollPreference(); ServiceInput.populate(pk, body);
        PayrollPreference e = payrollPreferenceDao.gett(pk);
        if (e == null) return ServiceResponse.error("PayrollPreference not found");
        ServiceInput.populate(e, body); payrollPreferenceDao.update(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }
    public Map<String,Object> deletePayrollPreference(Map<String,Object> body) throws SQLException {
        PayrollPreference pk = new PayrollPreference(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", payrollPreferenceDao.delete(pk));
    }
    public Map<String,Object> createSalaryStep(Map<String,Object> body) throws SQLException {
        SalaryStep e = new SalaryStep(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        salaryStepDao.insert(e);
        return ServiceResponse.success("payGradeId", e.getPayGradeId());
    }
    public Map<String,Object> updateSalaryStep(Map<String,Object> body) throws SQLException {
        SalaryStep pk = new SalaryStep(); ServiceInput.populate(pk, body);
        SalaryStep e = salaryStepDao.gett(pk);
        if (e == null) return ServiceResponse.error("SalaryStep not found");
        ServiceInput.populate(e, body); salaryStepDao.update(e);
        return ServiceResponse.success("payGradeId", e.getPayGradeId());
    }
    public Map<String,Object> deleteSalaryStep(Map<String,Object> body) throws SQLException {
        SalaryStep pk = new SalaryStep(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", salaryStepDao.delete(pk));
    }

    // =========================================================================
    // PerfReview / PerformanceNote
    // =========================================================================

    public Map<String,Object> createPerfReview(Map<String,Object> body) throws SQLException {
        PerfReview e = new PerfReview(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getPerfReviewId())) e.setPerfReviewId(SequenceUtil.next());
        perfReviewDao.insert(e);
        return ServiceResponse.success("perfReviewId", e.getPerfReviewId());
    }
    public Map<String,Object> updatePerfReview(Map<String,Object> body) throws SQLException {
        PerfReview pk = new PerfReview(); ServiceInput.populate(pk, body);
        PerfReview e = perfReviewDao.gett(pk);
        if (e == null) return ServiceResponse.error("PerfReview not found");
        ServiceInput.populate(e, body); perfReviewDao.update(e);
        return ServiceResponse.success("perfReviewId", e.getPerfReviewId());
    }
    public Map<String,Object> deletePerfReview(Map<String,Object> body) throws SQLException {
        PerfReview pk = new PerfReview(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", perfReviewDao.delete(pk));
    }
    public Map<String,Object> createPerfReviewItem(Map<String,Object> body) throws SQLException {
        PerfReviewItem e = new PerfReviewItem(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getPerfReviewItemSeqId())) e.setPerfReviewItemSeqId(SequenceUtil.next());
        perfReviewItemDao.insert(e);
        return ServiceResponse.success("perfReviewItemSeqId", e.getPerfReviewItemSeqId());
    }
    public Map<String,Object> updatePerfReviewItem(Map<String,Object> body) throws SQLException {
        PerfReviewItem pk = new PerfReviewItem(); ServiceInput.populate(pk, body);
        PerfReviewItem e = perfReviewItemDao.gett(pk);
        if (e == null) return ServiceResponse.error("PerfReviewItem not found");
        ServiceInput.populate(e, body); perfReviewItemDao.update(e);
        return ServiceResponse.success("perfReviewItemSeqId", e.getPerfReviewItemSeqId());
    }
    public Map<String,Object> deletePerfReviewItem(Map<String,Object> body) throws SQLException {
        PerfReviewItem pk = new PerfReviewItem(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", perfReviewItemDao.delete(pk));
    }
    public Map<String,Object> createPerformanceNote(Map<String,Object> body) throws SQLException {
        PerformanceNote e = new PerformanceNote(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        performanceNoteDao.insert(e);
        return ServiceResponse.success("partyId", e.getPartyId());
    }

    // =========================================================================
    // ResponsibilityType / ValidResponsibility
    // =========================================================================

    public Map<String,Object> createResponsibilityType(Map<String,Object> body) throws SQLException {
        ResponsibilityType e = new ResponsibilityType(); ServiceInput.populate(e, body);
        responsibilityTypeDao.insert(e);
        return ServiceResponse.success("responsibilityTypeId", e.getResponsibilityTypeId());
    }
    public Map<String,Object> updateResponsibilityType(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "responsibilityTypeId");
        ResponsibilityType e = responsibilityTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("ResponsibilityType not found: " + id);
        ServiceInput.populate(e, body); e.setResponsibilityTypeId(id);
        responsibilityTypeDao.update(e);
        return ServiceResponse.success("responsibilityTypeId", id);
    }
    public Map<String,Object> deleteResponsibilityType(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", responsibilityTypeDao.deleteById(ServiceInput.str(body, "responsibilityTypeId")));
    }
    public Map<String,Object> createValidResponsibility(Map<String,Object> body) throws SQLException {
        ValidResponsibility e = new ValidResponsibility(); ServiceInput.populate(e, body);
        if (e.getFromDate() == null) e.setFromDate(nowTs());
        validResponsibilityDao.insert(e);
        return ServiceResponse.success("emplPositionTypeId", e.getEmplPositionTypeId());
    }
    public Map<String,Object> updateValidResponsibility(Map<String,Object> body) throws SQLException {
        ValidResponsibility pk = new ValidResponsibility(); ServiceInput.populate(pk, body);
        ValidResponsibility e = validResponsibilityDao.gett(pk);
        if (e == null) return ServiceResponse.error("ValidResponsibility not found");
        ServiceInput.populate(e, body); validResponsibilityDao.update(e);
        return ServiceResponse.success("emplPositionTypeId", e.getEmplPositionTypeId());
    }
    public Map<String,Object> deleteValidResponsibility(Map<String,Object> body) throws SQLException {
        ValidResponsibility pk = new ValidResponsibility(); ServiceInput.populate(pk, body);
        return ServiceResponse.success("deletedRows", validResponsibilityDao.delete(pk));
    }

    // =========================================================================
    // SkillType / TerminationReason / TerminationType
    // =========================================================================

    public Map<String,Object> createSkillType(Map<String,Object> body) throws SQLException {
        SkillType e = new SkillType(); ServiceInput.populate(e, body);
        skillTypeDao.insert(e);
        return ServiceResponse.success("skillTypeId", e.getSkillTypeId());
    }
    public Map<String,Object> updateSkillType(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "skillTypeId");
        SkillType e = skillTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("SkillType not found: " + id);
        ServiceInput.populate(e, body); e.setSkillTypeId(id);
        skillTypeDao.update(e);
        return ServiceResponse.success("skillTypeId", id);
    }
    public Map<String,Object> deleteSkillType(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", skillTypeDao.deleteById(ServiceInput.str(body, "skillTypeId")));
    }
    public Map<String,Object> createTerminationReason(Map<String,Object> body) throws SQLException {
        TerminationReason e = new TerminationReason(); ServiceInput.populate(e, body);
        terminationReasonDao.insert(e);
        return ServiceResponse.success("terminationReasonId", e.getTerminationReasonId());
    }
    public Map<String,Object> updateTerminationReason(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "terminationReasonId");
        TerminationReason e = terminationReasonDao.gett(id);
        if (e == null) return ServiceResponse.error("TerminationReason not found: " + id);
        ServiceInput.populate(e, body); e.setTerminationReasonId(id);
        terminationReasonDao.update(e);
        return ServiceResponse.success("terminationReasonId", id);
    }
    public Map<String,Object> deleteTerminationReason(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", terminationReasonDao.deleteById(ServiceInput.str(body, "terminationReasonId")));
    }
    public Map<String,Object> createTerminationType(Map<String,Object> body) throws SQLException {
        TerminationType e = new TerminationType(); ServiceInput.populate(e, body);
        terminationTypeDao.insert(e);
        return ServiceResponse.success("terminationTypeId", e.getTerminationTypeId());
    }
    public Map<String,Object> updateTerminationType(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "terminationTypeId");
        TerminationType e = terminationTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("TerminationType not found: " + id);
        ServiceInput.populate(e, body); e.setTerminationTypeId(id);
        terminationTypeDao.update(e);
        return ServiceResponse.success("terminationTypeId", id);
    }
    public Map<String,Object> deleteTerminationType(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", terminationTypeDao.deleteById(ServiceInput.str(body, "terminationTypeId")));
    }

    // =========================================================================
    // UnemploymentClaim
    // =========================================================================

    public Map<String,Object> createUnemploymentClaim(Map<String,Object> body) throws SQLException {
        UnemploymentClaim e = new UnemploymentClaim(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getUnemploymentClaimId())) e.setUnemploymentClaimId(SequenceUtil.next());
        unemploymentClaimDao.insert(e);
        return ServiceResponse.success("unemploymentClaimId", e.getUnemploymentClaimId());
    }
    public Map<String,Object> updateUnemploymentClaim(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "unemploymentClaimId");
        UnemploymentClaim e = unemploymentClaimDao.gett(id);
        if (e == null) return ServiceResponse.error("UnemploymentClaim not found: " + id);
        ServiceInput.populate(e, body); e.setUnemploymentClaimId(id);
        unemploymentClaimDao.update(e);
        return ServiceResponse.success("unemploymentClaimId", id);
    }
    public Map<String,Object> deleteUnemploymentClaim(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", unemploymentClaimDao.deleteById(ServiceInput.str(body, "unemploymentClaimId")));
    }

    // =========================================================================
    // JobInterview / JobRequisition
    // =========================================================================

    public Map<String,Object> createJobInterview(Map<String,Object> body) throws SQLException {
        JobInterview e = new JobInterview(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getJobInterviewId())) e.setJobInterviewId(SequenceUtil.next());
        jobInterviewDao.insert(e);
        return ServiceResponse.success("jobInterviewId", e.getJobInterviewId());
    }
    public Map<String,Object> updateJobInterview(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "jobInterviewId");
        JobInterview e = jobInterviewDao.gett(id);
        if (e == null) return ServiceResponse.error("JobInterview not found: " + id);
        ServiceInput.populate(e, body); e.setJobInterviewId(id);
        jobInterviewDao.update(e);
        return ServiceResponse.success("jobInterviewId", id);
    }
    public Map<String,Object> deleteJobInterview(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", jobInterviewDao.deleteById(ServiceInput.str(body, "jobInterviewId")));
    }
    public Map<String,Object> createJobInterviewType(Map<String,Object> body) throws SQLException {
        JobInterviewType e = new JobInterviewType(); ServiceInput.populate(e, body);
        jobInterviewTypeDao.insert(e);
        return ServiceResponse.success("jobInterviewTypeId", e.getJobInterviewTypeId());
    }
    public Map<String,Object> updateJobInterviewType(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "jobInterviewTypeId");
        JobInterviewType e = jobInterviewTypeDao.gett(id);
        if (e == null) return ServiceResponse.error("JobInterviewType not found: " + id);
        ServiceInput.populate(e, body); e.setJobInterviewTypeId(id);
        jobInterviewTypeDao.update(e);
        return ServiceResponse.success("jobInterviewTypeId", id);
    }
    public Map<String,Object> deleteJobInterviewType(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", jobInterviewTypeDao.deleteById(ServiceInput.str(body, "jobInterviewTypeId")));
    }
    public Map<String,Object> createJobRequisition(Map<String,Object> body) throws SQLException {
        JobRequisition e = new JobRequisition(); ServiceInput.populate(e, body);
        if (Strings.isEmpty(e.getJobRequisitionId())) e.setJobRequisitionId(SequenceUtil.next());
        jobRequisitionDao.insert(e);
        return ServiceResponse.success("jobRequisitionId", e.getJobRequisitionId());
    }
    public Map<String,Object> updateJobRequisition(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "jobRequisitionId");
        JobRequisition e = jobRequisitionDao.gett(id);
        if (e == null) return ServiceResponse.error("JobRequisition not found: " + id);
        ServiceInput.populate(e, body); e.setJobRequisitionId(id);
        jobRequisitionDao.update(e);
        return ServiceResponse.success("jobRequisitionId", id);
    }
    public Map<String,Object> deleteJobRequisition(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", jobRequisitionDao.deleteById(ServiceInput.str(body, "jobRequisitionId")));
    }

    // =========================================================================
    // WorkEffort cross-component (delegate equivalents)
    // =========================================================================

    public Map<String,Object> createWorkEffortAndPartyAssign(Map<String,Object> body) throws SQLException {
        WorkEffort we = new WorkEffort(); ServiceInput.populate(we, body);
        if (Strings.isEmpty(we.getWorkEffortId())) we.setWorkEffortId(SequenceUtil.next());
        Timestamp now = nowTs();
        we.setCreatedDate(now); we.setLastModifiedDate(now); we.setLastStatusUpdate(now);
        we.setRevisionNumber(1);
        workEffortDao.insert(we);
        WorkEffortPartyAssignment a = new WorkEffortPartyAssignment(); ServiceInput.populate(a, body);
        a.setWorkEffortId(we.getWorkEffortId());
        if (a.getFromDate() == null) a.setFromDate(nowTs());
        workEffortPartyAssignmentDao.insert(a);
        return ServiceResponse.success("workEffortId", we.getWorkEffortId());
    }

    public Map<String,Object> updateWorkEffort(Map<String,Object> body) throws SQLException {
        String id = ServiceInput.str(body, "workEffortId");
        WorkEffort e = workEffortDao.gett(id);
        if (e == null) return ServiceResponse.error("WorkEffort not found: " + id);
        ServiceInput.populate(e, body); e.setWorkEffortId(id);
        e.setLastModifiedDate(nowTs());
        e.setRevisionNumber(e.getRevisionNumber() + 1);
        workEffortDao.update(e);
        return ServiceResponse.success("workEffortId", id);
    }

    public Map<String,Object> deleteWorkEffort(Map<String,Object> body) throws SQLException {
        return ServiceResponse.success("deletedRows", workEffortDao.deleteById(ServiceInput.str(body, "workEffortId")));
    }

    public Map<String,Object> updateApprovalStatus(Map<String,Object> body) {
        // TODO unimplemented: depends on workflow approval state machine.
        return ServiceResponse.successWithMessage("updateApprovalStatus not ported", null);
    }

    public Map<String,Object> updateTrainingStatus(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("updateTrainingStatus not ported", null);
    }

    public Map<String,Object> applyTraining(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("applyTraining not ported", null);
    }

    public Map<String,Object> assignTraining(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("assignTraining not ported", null);
    }

    public Map<String,Object> createTrainingTypes(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("createTrainingTypes not ported (Enumeration row)", null);
    }

    public Map<String,Object> updateTrainingTypes(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("updateTrainingTypes not ported", null);
    }

    public Map<String,Object> deleteTrainingTypes(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("deleteTrainingTypes not ported", null);
    }

    public Map<String,Object> createEmployee(Map<String,Object> body) {
        return ServiceResponse.successWithMessage(
                "createEmployee not ported (requires Party/Person orchestration)", null);
    }

    public Map<String,Object> createInternalOrg(Map<String,Object> body) {
        return ServiceResponse.successWithMessage(
                "createInternalOrg not ported (requires PartyGroup orchestration)", null);
    }

    public Map<String,Object> removeInternalOrg(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("removeInternalOrg not ported", null);
    }

    public Map<String,Object> getChildHRCategoryTree(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("getChildHRCategoryTree not ported", null);
    }

    public Map<String,Object> createPublicHoliday(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("createPublicHoliday not ported (no PublicHoliday entity)", null);
    }

    public Map<String,Object> createInternalJobPosting(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("createInternalJobPosting not ported (no InternalJobPosting entity)", null);
    }

    public Map<String,Object> updateInternalJobPosting(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("updateInternalJobPosting not ported", null);
    }

    public Map<String,Object> deleteInternalJobPosting(Map<String,Object> body) {
        return ServiceResponse.successWithMessage("deleteInternalJobPosting not ported", null);
    }

    // =========================================================================
    // Internals
    // =========================================================================

    private static Timestamp nowTs() {
        return Timestamp.from(Instant.now().truncatedTo(ChronoUnit.MILLIS));
    }
}
