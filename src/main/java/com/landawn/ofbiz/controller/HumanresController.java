package com.landawn.ofbiz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/humanres")
public class HumanresController {

    /**
     * Create Training Request
     * <p>service: applyTraining  entities: PersonTraining  auth: true
     */
    @PostMapping("/humanres/control/applyTraining")
    public ResponseEntity<Map<String, Object>> applyTraining(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Training Request
     * <p>service: assignTraining  entities: PersonTraining  auth: true
     */
    @PostMapping("/humanres/control/assignTraining")
    public ResponseEntity<Map<String, Object>> assignTraining(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Agreement Employment Appl
     * <p>service: createAgreementEmploymentAppl  entities: AgreementEmploymentAppl  auth: true
     */
    @PostMapping("/humanres/control/createAgreementEmploymentAppl")
    public ResponseEntity<Map<String, Object>> createAgreementEmploymentAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Leave
     * <p>service: createEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/createEmplLeave")
    public ResponseEntity<Map<String, Object>> createEmplLeave(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Leave
     * <p>service: createEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/createEmplLeaveExt")
    public ResponseEntity<Map<String, Object>> createEmplLeaveCreateEmplLeaveExt(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid Leave Reason Type
     * <p>service: createEmplLeaveReasonType  entities: EmplLeaveReasonType  auth: true
     */
    @PostMapping("/humanres/control/createEmplLeaveReasonType")
    public ResponseEntity<Map<String, Object>> createEmplLeaveReasonType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid LeaveType
     * <p>service: createEmplLeaveType  entities: EmplLeaveType  auth: true
     */
    @PostMapping("/humanres/control/createEmplLeaveType")
    public ResponseEntity<Map<String, Object>> createEmplLeaveType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Employee Position
     * <p>service: createEmplPosition  entities: EmplPosition  auth: true
     */
    @PostMapping("/humanres/control/createEmplPosition")
    public ResponseEntity<Map<String, Object>> createEmplPosition(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Position Fulfillment
     * <p>service: createEmplPositionFulfillment  entities: EmplPositionFulfillment  auth: true
     */
    @PostMapping("/humanres/control/createEmplPositionFulfillment")
    public ResponseEntity<Map<String, Object>> createEmplPositionFulfillment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Position Reporting Structure
     * <p>service: createEmplPositionReportingStruct  entities: EmplPositionReportingStruct  auth: true
     */
    @PostMapping("/humanres/control/createEmplPositionReportingStruct")
    public ResponseEntity<Map<String, Object>> createEmplPositionReportingStruct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Position Responsibility
     * <p>service: createEmplPositionResponsibility  entities: EmplPositionResponsibility  auth: true
     */
    @PostMapping("/humanres/control/createEmplPositionResponsibility")
    public ResponseEntity<Map<String, Object>> createEmplPositionResponsibility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid PositionType
     * <p>service: createEmplPositionType  entities: EmplPositionType  auth: true
     */
    @PostMapping("/humanres/control/createEmplPositionType")
    public ResponseEntity<Map<String, Object>> createEmplPositionType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Employee its role and contact details
     * <p>service: createEmployee  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/humanres/control/createEmployee")
    public ResponseEntity<Map<String, Object>> createEmployee(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Party Qualification entry
     * <p>service: createPartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/createEmployeeQualification")
    public ResponseEntity<Map<String, Object>> createPartyQual(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Skill for a Party
     * <p>service: createPartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/createEmployeeSkill")
    public ResponseEntity<Map<String, Object>> createPartySkill(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employment and first record in PayHistory
     * <p>service: createEmployment  entities: Employment  auth: true
     */
    @PostMapping("/humanres/control/createEmployment")
    public ResponseEntity<Map<String, Object>> createEmployment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Employment Application
     * <p>service: createEmploymentApp  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/createEmploymentApp")
    public ResponseEntity<Map<String, Object>> createEmploymentApp(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Employment Application
     * <p>service: createEmploymentApp  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/createEmploymentAppExt")
    public ResponseEntity<Map<String, Object>> createEmploymentAppCreateEmploymentAppExt(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a New Internal Job Posting
     * <p>service: createInternalJobPosting  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/createInternalJobPosting")
    public ResponseEntity<Map<String, Object>> createInternalJobPosting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createInternalOrg  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/createInternalOrg")
    public ResponseEntity<Map<String, Object>> createInternalOrg(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Job Interview
     * <p>service: createJobInterview  entities: JobInterview  auth: true
     */
    @PostMapping("/humanres/control/createJobInterview")
    public ResponseEntity<Map<String, Object>> createJobInterview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a New Interview Type
     * <p>service: createJobInterviewType  entities: JobInterviewType  auth: true
     */
    @PostMapping("/humanres/control/createJobInterviewType")
    public ResponseEntity<Map<String, Object>> createJobInterviewType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Job Requisition
     * <p>service: createJobRequisition  entities: JobRequisition  auth: true
     */
    @PostMapping("/humanres/control/createJobRequisition")
    public ResponseEntity<Map<String, Object>> createJobRequisition(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Party Benefit
     * <p>service: createPartyBenefit  entities: PartyBenefit  auth: true
     */
    @PostMapping("/humanres/control/createPartyBenefit")
    public ResponseEntity<Map<String, Object>> createPartyBenefit(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Party Qualification entry
     * <p>service: createPartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/createPartyQual")
    public ResponseEntity<Map<String, Object>> createPartyQualCreatePartyQual(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Party Qualification entry
     * <p>service: createPartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/createPartyQualExt")
    public ResponseEntity<Map<String, Object>> createPartyQualCreatePartyQualExt(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Resume for a Party
     * <p>service: createPartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/humanres/control/createPartyResume")
    public ResponseEntity<Map<String, Object>> createPartyResume(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Skill for a Party
     * <p>service: createPartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/createPartySkill")
    public ResponseEntity<Map<String, Object>> createPartySkillCreatePartySkill(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Skill for a Party
     * <p>service: createPartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/createPartySkillExt")
    public ResponseEntity<Map<String, Object>> createPartySkillCreatePartySkillExt(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Pay Grade
     * <p>service: createPayGrade  entities: PayGrade  auth: true
     */
    @PostMapping("/humanres/control/createPayGrade")
    public ResponseEntity<Map<String, Object>> createPayGrade(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Payroll Preference
     * <p>service: createPayrollPreference  entities: PayrollPreference  auth: true
     */
    @PostMapping("/humanres/control/createPayrollPreference")
    public ResponseEntity<Map<String, Object>> createPayrollPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Performance Review
     * <p>service: createPerfReview  entities: PerfReview  auth: true
     */
    @PostMapping("/humanres/control/createPerfReview")
    public ResponseEntity<Map<String, Object>> createPerfReview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Performance Review Item
     * <p>service: createPerfReviewItem  entities: PerfReviewItem  auth: true
     */
    @PostMapping("/humanres/control/createPerfReviewItem")
    public ResponseEntity<Map<String, Object>> createPerfReviewItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Performance Note
     * <p>service: createPerformanceNote  entities: PerformanceNote  auth: true
     */
    @PostMapping("/humanres/control/createPerformanceNote")
    public ResponseEntity<Map<String, Object>> createPerformanceNote(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createPublicHoliday  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/createPublicHoliday")
    public ResponseEntity<Map<String, Object>> createPublicHoliday(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid ResponsibilityType
     * <p>service: createResponsibilityType  entities: ResponsibilityType  auth: true
     */
    @PostMapping("/humanres/control/createResponsibilityType")
    public ResponseEntity<Map<String, Object>> createResponsibilityType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Salary Step
     * <p>service: createSalaryStep  entities: SalaryStep  auth: true
     */
    @PostMapping("/humanres/control/createSalaryStep")
    public ResponseEntity<Map<String, Object>> createSalaryStep(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid SkillType
     * <p>service: createSkillType  entities: SkillType  auth: true
     */
    @PostMapping("/humanres/control/createSkillType")
    public ResponseEntity<Map<String, Object>> createSkillType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Termination Reason
     * <p>service: createTerminationReason  entities: TerminationReason  auth: true
     */
    @PostMapping("/humanres/control/createTerminationReason")
    public ResponseEntity<Map<String, Object>> createTerminationReason(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid TerminationType
     * <p>service: createTerminationType  entities: TerminationType  auth: true
     */
    @PostMapping("/humanres/control/createTerminationType")
    public ResponseEntity<Map<String, Object>> createTerminationType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffort Entity and assign to a party
     * <p>service: createWorkEffortAndPartyAssign  entities: WorkEffort  auth: true
     */
    @PostMapping("/humanres/control/createTrainingCalendar")
    public ResponseEntity<Map<String, Object>> createWorkEffortAndPartyAssign(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a New Training type
     * <p>service: createTrainingTypes  entities: TrainingClassType  auth: true
     */
    @PostMapping("/humanres/control/createTrainingTypes")
    public ResponseEntity<Map<String, Object>> createTrainingTypes(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Unemployment Claim
     * <p>service: createUnemploymentClaim  entities: UnemploymentClaim  auth: true
     */
    @PostMapping("/humanres/control/createUnemploymentClaim")
    public ResponseEntity<Map<String, Object>> createUnemploymentClaim(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid Responsibility
     * <p>service: createValidResponsibility  entities: ValidResponsibility  auth: true
     */
    @PostMapping("/humanres/control/createValidResponsibility")
    public ResponseEntity<Map<String, Object>> createValidResponsibility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete AgreementEmploymentAppl
     * <p>service: deleteAgreementEmploymentAppl  entities: AgreementEmploymentAppl  auth: true
     */
    @PostMapping("/humanres/control/deleteAgreementEmploymentAppl")
    public ResponseEntity<Map<String, Object>> deleteAgreementEmploymentAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete AgreementEmploymentAppl
     * <p>service: deleteEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplLeave")
    public ResponseEntity<Map<String, Object>> deleteEmplLeave(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid Leave Reason Type
     * <p>service: deleteEmplLeaveReasonType  entities: EmplLeaveReasonType  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplLeaveReasonType")
    public ResponseEntity<Map<String, Object>> deleteEmplLeaveReasonType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid LeaveType
     * <p>service: deleteEmplLeaveType  entities: EmplLeaveType  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplLeaveType")
    public ResponseEntity<Map<String, Object>> deleteEmplLeaveType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Employee Position
     * <p>service: deleteEmplPosition  entities: EmplPosition  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPosition")
    public ResponseEntity<Map<String, Object>> deleteEmplPosition(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Employee Position Fulfillment
     * <p>service: deleteEmplPositionFulfillment  entities: EmplPositionFulfillment  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionFulfillment")
    public ResponseEntity<Map<String, Object>> deleteEmplPositionFulfillment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Employee Position Reporting Structure
     * <p>service: deleteEmplPositionReportingStruct  entities: EmplPositionReportingStruct  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionReportingStruct")
    public ResponseEntity<Map<String, Object>> deleteEmplPositionReportingStruct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Employee Position Responsibility
     * <p>service: deleteEmplPositionResponsibility  entities: EmplPositionResponsibility  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionResponsibility")
    public ResponseEntity<Map<String, Object>> deleteEmplPositionResponsibility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete EmplPositionType
     * <p>service: deleteEmplPositionType  entities: EmplPositionType  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionType")
    public ResponseEntity<Map<String, Object>> deleteEmplPositionType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid EmplPositionTypeRate
     * <p>service: deleteEmplPositionTypeRate  entities: EmplPositionTypeRate  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionTypeRate")
    public ResponseEntity<Map<String, Object>> deleteEmplPositionTypeRate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Qualification of Party
     * <p>service: deletePartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/deleteEmployeeQualification")
    public ResponseEntity<Map<String, Object>> deletePartyQual(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a PartySkill
     * <p>service: deletePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/deleteEmployeeSkill")
    public ResponseEntity<Map<String, Object>> deletePartySkill(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Employment
     * <p>service: deleteEmployment  entities: Employment  auth: true
     */
    @PostMapping("/humanres/control/deleteEmployment")
    public ResponseEntity<Map<String, Object>> deleteEmployment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Employment Application
     * <p>service: deleteEmploymentApp  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/deleteEmploymentApp")
    public ResponseEntity<Map<String, Object>> deleteEmploymentApp(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Internal Job Posting
     * <p>service: deleteInternalJobPosting  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/deleteInternalJobPosting")
    public ResponseEntity<Map<String, Object>> deleteInternalJobPosting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Job Interview
     * <p>service: deleteJobInterview  entities: JobInterview  auth: true
     */
    @PostMapping("/humanres/control/deleteJobInterview")
    public ResponseEntity<Map<String, Object>> deleteJobInterview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Interview Type
     * <p>service: deleteJobInterviewType  entities: JobInterviewType  auth: true
     */
    @PostMapping("/humanres/control/deleteJobInterviewType")
    public ResponseEntity<Map<String, Object>> deleteJobInterviewType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Job Requisition
     * <p>service: deleteJobRequisition  entities: JobRequisition  auth: true
     */
    @PostMapping("/humanres/control/deleteJobRequisition")
    public ResponseEntity<Map<String, Object>> deleteJobRequisition(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Party Benefit
     * <p>service: deletePartyBenefit  entities: PartyBenefit  auth: true
     */
    @PostMapping("/humanres/control/deletePartyBenefit")
    public ResponseEntity<Map<String, Object>> deletePartyBenefit(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Qualification of Party
     * <p>service: deletePartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/deletePartyQual")
    public ResponseEntity<Map<String, Object>> deletePartyQualDeletePartyQual(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Resume of Party
     * <p>service: deletePartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/humanres/control/deletePartyResume")
    public ResponseEntity<Map<String, Object>> deletePartyResume(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a PartySkill
     * <p>service: deletePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/deletePartySkill")
    public ResponseEntity<Map<String, Object>> deletePartySkillDeletePartySkill(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Pay Grade
     * <p>service: deletePayGrade  entities: PayGrade  auth: true
     */
    @PostMapping("/humanres/control/deletePayGrade")
    public ResponseEntity<Map<String, Object>> deletePayGrade(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Pay History
     * <p>service: deletePayHistory  entities: PayHistory  auth: true
     */
    @PostMapping("/humanres/control/deletePayHistory")
    public ResponseEntity<Map<String, Object>> deletePayHistory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Payroll Preference
     * <p>service: deletePayrollPreference  entities: PayrollPreference  auth: true
     */
    @PostMapping("/humanres/control/deletePayrollPreference")
    public ResponseEntity<Map<String, Object>> deletePayrollPreference(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Performance Review
     * <p>service: deletePerfReview  entities: PerfReview  auth: true
     */
    @PostMapping("/humanres/control/deletePerfReview")
    public ResponseEntity<Map<String, Object>> deletePerfReview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Performance Review Item
     * <p>service: deletePerfReviewItem  entities: PerfReviewItem  auth: true
     */
    @PostMapping("/humanres/control/deletePerfReviewItem")
    public ResponseEntity<Map<String, Object>> deletePerfReviewItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a WorkEffort Entity
     * <p>service: deleteWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/humanres/control/deletePublicHoliday")
    public ResponseEntity<Map<String, Object>> deleteWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid ResponsibilityTrype
     * <p>service: deleteResponsibilityType  entities: ResponsibilityType  auth: true
     */
    @PostMapping("/humanres/control/deleteResponsibilityType")
    public ResponseEntity<Map<String, Object>> deleteResponsibilityType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Salary Step
     * <p>service: deleteSalaryStep  entities: SalaryStep  auth: true
     */
    @PostMapping("/humanres/control/deleteSalaryStep")
    public ResponseEntity<Map<String, Object>> deleteSalaryStep(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid SkillType
     * <p>service: deleteSkillType  entities: SkillType  auth: true
     */
    @PostMapping("/humanres/control/deleteSkillType")
    public ResponseEntity<Map<String, Object>> deleteSkillType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Termination Reason
     * <p>service: deleteTerminationReason  entities: TerminationReason  auth: true
     */
    @PostMapping("/humanres/control/deleteTerminationReason")
    public ResponseEntity<Map<String, Object>> deleteTerminationReason(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid TerminationType
     * <p>service: deleteTerminationType  entities: TerminationType  auth: true
     */
    @PostMapping("/humanres/control/deleteTerminationType")
    public ResponseEntity<Map<String, Object>> deleteTerminationType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Training Type
     * <p>service: deleteTrainingTypes  entities: TrainingClassType  auth: true
     */
    @PostMapping("/humanres/control/deleteTrainingTypes")
    public ResponseEntity<Map<String, Object>> deleteTrainingTypes(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Unemployment Claim
     * <p>service: deleteUnemploymentClaim  entities: UnemploymentClaim  auth: true
     */
    @PostMapping("/humanres/control/deleteUnemploymentClaim")
    public ResponseEntity<Map<String, Object>> deleteUnemploymentClaim(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid Responsibility
     * <p>service: deleteValidResponsibility  entities: ValidResponsibility  auth: true
     */
    @PostMapping("/humanres/control/deleteValidResponsibility")
    public ResponseEntity<Map<String, Object>> deleteValidResponsibility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire Pay History
     * <p>service: expirePayHistory  entities: PayHistory  auth: true
     */
    @PostMapping("/humanres/control/expirePayHistory")
    public ResponseEntity<Map<String, Object>> expirePayHistory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getChildHRCategoryTree  entities: unknown  auth: false
     */
    @GetMapping("/humanres/control/getHRChild")
    public ResponseEntity<Map<String, Object>> getChildHRCategoryTree(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removeInternalOrg  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/removeInternalOrg")
    public ResponseEntity<Map<String, Object>> removeInternalOrg(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateAgreementEmploymentAppl  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateAgreementEmploymentAppl")
    public ResponseEntity<Map<String, Object>> updateAgreementEmploymentAppl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Approval Status
     * <p>service: updateApprovalStatus  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/updateApprovalStatus")
    public ResponseEntity<Map<String, Object>> updateApprovalStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid Employee Leave
     * <p>service: updateEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/updateEmplLeave")
    public ResponseEntity<Map<String, Object>> updateEmplLeave(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid Employee Leave
     * <p>service: updateEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/updateEmplLeaveExt")
    public ResponseEntity<Map<String, Object>> updateEmplLeaveUpdateEmplLeaveExt(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateEmplLeaveReasonType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateEmplLeaveReasonType")
    public ResponseEntity<Map<String, Object>> updateEmplLeaveReasonType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Leave Approval Status
     * <p>service: updateEmplLeaveStatus  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/updateEmplLeaveStatus")
    public ResponseEntity<Map<String, Object>> updateEmplLeaveStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateEmplLeaveType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateEmplLeaveType")
    public ResponseEntity<Map<String, Object>> updateEmplLeaveType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Employee Position
     * <p>service: updateEmplPosition  entities: EmplPosition  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPosition")
    public ResponseEntity<Map<String, Object>> updateEmplPosition(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Employee Position Fulfillment
     * <p>service: updateEmplPositionFulfillment  entities: EmplPositionFulfillment  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionFulfillment")
    public ResponseEntity<Map<String, Object>> updateEmplPositionFulfillment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Employee Position Reporting Structure
     * <p>service: updateEmplPositionReportingStruct  entities: EmplPositionReportingStruct  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionReportingStruct")
    public ResponseEntity<Map<String, Object>> updateEmplPositionReportingStruct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Employee Position Responsibility
     * <p>service: updateEmplPositionResponsibility  entities: EmplPositionResponsibility  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionResponsibility")
    public ResponseEntity<Map<String, Object>> updateEmplPositionResponsibility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid PositionType
     * <p>service: updateEmplPositionType  entities: EmplPositionType  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionType")
    public ResponseEntity<Map<String, Object>> updateEmplPositionType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid EmplPositionTypeRate
     * <p>service: updateEmplPositionTypeRate  entities: EmplPositionTypeRate  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionTypeRate")
    public ResponseEntity<Map<String, Object>> updateEmplPositionTypeRate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Qualification of Party
     * <p>service: updatePartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/updateEmployeeQualification")
    public ResponseEntity<Map<String, Object>> updatePartyQual(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a PartySkill
     * <p>service: updatePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/updateEmployeeSkill")
    public ResponseEntity<Map<String, Object>> updatePartySkill(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Employment
     * <p>service: updateEmployment  entities: Employment  auth: true
     */
    @PostMapping("/humanres/control/updateEmployment")
    public ResponseEntity<Map<String, Object>> updateEmployment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateEmploymentApp  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateEmploymentApp")
    public ResponseEntity<Map<String, Object>> updateEmploymentApp(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateEmploymentApp  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateEmploymentAppExt")
    public ResponseEntity<Map<String, Object>> updateEmploymentAppUpdateEmploymentAppExt(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Internal Job Posting
     * <p>service: updateInternalJobPosting  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/updateInternalJobPosting")
    public ResponseEntity<Map<String, Object>> updateInternalJobPosting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Job Interview
     * <p>service: updateJobInterview  entities: JobInterview  auth: true
     */
    @PostMapping("/humanres/control/updateJobInterview")
    public ResponseEntity<Map<String, Object>> updateJobInterview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateJobInterviewType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateJobInterviewType")
    public ResponseEntity<Map<String, Object>> updateJobInterviewType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Job Requisition
     * <p>service: updateJobRequisition  entities: JobRequisition  auth: true
     */
    @PostMapping("/humanres/control/updateJobRequisition")
    public ResponseEntity<Map<String, Object>> updateJobRequisition(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePartyBenefit  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updatePartyBenefit")
    public ResponseEntity<Map<String, Object>> updatePartyBenefit(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePartyQual  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updatePartyQual")
    public ResponseEntity<Map<String, Object>> updatePartyQualUpdatePartyQual(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePartyQual  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updatePartyQualExt")
    public ResponseEntity<Map<String, Object>> updatePartyQualUpdatePartyQualExt(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Resume of Party
     * <p>service: updatePartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/humanres/control/updatePartyResume")
    public ResponseEntity<Map<String, Object>> updatePartyResume(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a PartySkill
     * <p>service: updatePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/updatePartySkill")
    public ResponseEntity<Map<String, Object>> updatePartySkillUpdatePartySkill(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a PartySkill
     * <p>service: updatePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/updatePartySkillExt")
    public ResponseEntity<Map<String, Object>> updatePartySkillUpdatePartySkillExt(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Pay Grade
     * <p>service: updatePayGrade  entities: PayGrade  auth: true
     */
    @PostMapping("/humanres/control/updatePayGrade")
    public ResponseEntity<Map<String, Object>> updatePayGrade(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Pay History
     * <p>service: updatePayHistory  entities: PayHistory  auth: true
     */
    @PostMapping("/humanres/control/updatePayHistory")
    public ResponseEntity<Map<String, Object>> updatePayHistory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePayrollPreference  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updatePayrollPreference")
    public ResponseEntity<Map<String, Object>> updatePayrollPreference(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Performance Review
     * <p>service: updatePerfReview  entities: PerfReview  auth: true
     */
    @PostMapping("/humanres/control/updatePerfReview")
    public ResponseEntity<Map<String, Object>> updatePerfReview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Performance Review Item
     * <p>service: updatePerfReviewItem  entities: PerfReviewItem  auth: true
     */
    @PostMapping("/humanres/control/updatePerfReviewItem")
    public ResponseEntity<Map<String, Object>> updatePerfReviewItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/humanres/control/updatePublicHoliday")
    public ResponseEntity<Map<String, Object>> updateWorkEffort(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateResponsibilityType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateResponsibilityType")
    public ResponseEntity<Map<String, Object>> updateResponsibilityType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateSalaryStep  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateSalaryStep")
    public ResponseEntity<Map<String, Object>> updateSalaryStep(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateSkillType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateSkillType")
    public ResponseEntity<Map<String, Object>> updateSkillType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateTerminationReason  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateTerminationReason")
    public ResponseEntity<Map<String, Object>> updateTerminationReason(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateTerminationType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateTerminationType")
    public ResponseEntity<Map<String, Object>> updateTerminationType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort Entity
     * <p>service: updateWorkEffort  entities: WorkEffort  auth: true
     */
    @PostMapping("/humanres/control/updateTrainingCalendar")
    public ResponseEntity<Map<String, Object>> updateWorkEffortUpdateTrainingCalendar(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Training Status
     * <p>service: updateTrainingStatus  entities: PersonTraining  auth: true
     */
    @PostMapping("/humanres/control/updateTrainingStatus")
    public ResponseEntity<Map<String, Object>> updateTrainingStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateTrainingTypes  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateTrainingTypes")
    public ResponseEntity<Map<String, Object>> updateTrainingTypes(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateUnemploymentClaim  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateUnemploymentClaim")
    public ResponseEntity<Map<String, Object>> updateUnemploymentClaim(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid Responsibility
     * <p>service: updateValidResponsibility  entities: ValidResponsibility  auth: true
     */
    @PostMapping("/humanres/control/updateValidResponsibility")
    public ResponseEntity<Map<String, Object>> updateValidResponsibility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
