package com.landawn.ofbiz.controller;

import com.landawn.ofbiz.model.ResponseBase;
import com.landawn.ofbiz.model.humanres.ApplyTrainingRequest;
import com.landawn.ofbiz.model.humanres.ApplyTrainingResponse;
import com.landawn.ofbiz.model.humanres.AssignTrainingRequest;
import com.landawn.ofbiz.model.humanres.AssignTrainingResponse;
import com.landawn.ofbiz.model.humanres.CreateAgreementEmploymentApplRequest;
import com.landawn.ofbiz.model.humanres.CreateAgreementEmploymentApplResponse;
import com.landawn.ofbiz.model.humanres.CreateEmplLeaveReasonTypeRequest;
import com.landawn.ofbiz.model.humanres.CreateEmplLeaveReasonTypeResponse;
import com.landawn.ofbiz.model.humanres.CreateEmplLeaveRequest;
import com.landawn.ofbiz.model.humanres.CreateEmplLeaveResponse;
import com.landawn.ofbiz.model.humanres.CreateEmplLeaveTypeRequest;
import com.landawn.ofbiz.model.humanres.CreateEmplLeaveTypeResponse;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionFulfillmentRequest;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionFulfillmentResponse;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionReportingStructRequest;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionReportingStructResponse;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionRequest;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionResponse;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionResponsibilityRequest;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionResponsibilityResponse;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionTypeRequest;
import com.landawn.ofbiz.model.humanres.CreateEmplPositionTypeResponse;
import com.landawn.ofbiz.model.humanres.CreateEmployeeRequest;
import com.landawn.ofbiz.model.humanres.CreateEmployeeResponse;
import com.landawn.ofbiz.model.humanres.CreateEmploymentAppRequest;
import com.landawn.ofbiz.model.humanres.CreateEmploymentAppResponse;
import com.landawn.ofbiz.model.humanres.CreateEmploymentRequest;
import com.landawn.ofbiz.model.humanres.CreateEmploymentResponse;
import com.landawn.ofbiz.model.humanres.CreateInternalJobPostingRequest;
import com.landawn.ofbiz.model.humanres.CreateInternalJobPostingResponse;
import com.landawn.ofbiz.model.humanres.CreateJobInterviewRequest;
import com.landawn.ofbiz.model.humanres.CreateJobInterviewResponse;
import com.landawn.ofbiz.model.humanres.CreateJobInterviewTypeRequest;
import com.landawn.ofbiz.model.humanres.CreateJobInterviewTypeResponse;
import com.landawn.ofbiz.model.humanres.CreateJobRequisitionRequest;
import com.landawn.ofbiz.model.humanres.CreateJobRequisitionResponse;
import com.landawn.ofbiz.model.humanres.CreatePartyBenefitRequest;
import com.landawn.ofbiz.model.humanres.CreatePartyBenefitResponse;
import com.landawn.ofbiz.model.humanres.CreatePartyQualRequest;
import com.landawn.ofbiz.model.humanres.CreatePartyQualResponse;
import com.landawn.ofbiz.model.humanres.CreatePartyResumeRequest;
import com.landawn.ofbiz.model.humanres.CreatePartyResumeResponse;
import com.landawn.ofbiz.model.humanres.CreatePartySkillRequest;
import com.landawn.ofbiz.model.humanres.CreatePartySkillResponse;
import com.landawn.ofbiz.model.humanres.CreatePayGradeRequest;
import com.landawn.ofbiz.model.humanres.CreatePayGradeResponse;
import com.landawn.ofbiz.model.humanres.CreatePayrollPreferenceRequest;
import com.landawn.ofbiz.model.humanres.CreatePayrollPreferenceResponse;
import com.landawn.ofbiz.model.humanres.CreatePerfReviewItemRequest;
import com.landawn.ofbiz.model.humanres.CreatePerfReviewItemResponse;
import com.landawn.ofbiz.model.humanres.CreatePerfReviewRequest;
import com.landawn.ofbiz.model.humanres.CreatePerfReviewResponse;
import com.landawn.ofbiz.model.humanres.CreatePerformanceNoteRequest;
import com.landawn.ofbiz.model.humanres.CreatePerformanceNoteResponse;
import com.landawn.ofbiz.model.humanres.CreateResponsibilityTypeRequest;
import com.landawn.ofbiz.model.humanres.CreateResponsibilityTypeResponse;
import com.landawn.ofbiz.model.humanres.CreateSalaryStepRequest;
import com.landawn.ofbiz.model.humanres.CreateSalaryStepResponse;
import com.landawn.ofbiz.model.humanres.CreateSkillTypeRequest;
import com.landawn.ofbiz.model.humanres.CreateSkillTypeResponse;
import com.landawn.ofbiz.model.humanres.CreateTerminationReasonRequest;
import com.landawn.ofbiz.model.humanres.CreateTerminationReasonResponse;
import com.landawn.ofbiz.model.humanres.CreateTerminationTypeRequest;
import com.landawn.ofbiz.model.humanres.CreateTerminationTypeResponse;
import com.landawn.ofbiz.model.humanres.CreateTrainingTypesRequest;
import com.landawn.ofbiz.model.humanres.CreateTrainingTypesResponse;
import com.landawn.ofbiz.model.humanres.CreateUnemploymentClaimRequest;
import com.landawn.ofbiz.model.humanres.CreateUnemploymentClaimResponse;
import com.landawn.ofbiz.model.humanres.CreateValidResponsibilityRequest;
import com.landawn.ofbiz.model.humanres.CreateValidResponsibilityResponse;
import com.landawn.ofbiz.model.humanres.DeleteAgreementEmploymentApplRequest;
import com.landawn.ofbiz.model.humanres.DeleteAgreementEmploymentApplResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplLeaveReasonTypeRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplLeaveReasonTypeResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplLeaveRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplLeaveResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplLeaveTypeRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplLeaveTypeResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionFulfillmentRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionFulfillmentResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionReportingStructRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionReportingStructResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionResponsibilityRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionResponsibilityResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionTypeRateRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionTypeRateResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionTypeRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmplPositionTypeResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmploymentAppRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmploymentAppResponse;
import com.landawn.ofbiz.model.humanres.DeleteEmploymentRequest;
import com.landawn.ofbiz.model.humanres.DeleteEmploymentResponse;
import com.landawn.ofbiz.model.humanres.DeleteInternalJobPostingRequest;
import com.landawn.ofbiz.model.humanres.DeleteInternalJobPostingResponse;
import com.landawn.ofbiz.model.humanres.DeleteJobInterviewRequest;
import com.landawn.ofbiz.model.humanres.DeleteJobInterviewResponse;
import com.landawn.ofbiz.model.humanres.DeleteJobInterviewTypeRequest;
import com.landawn.ofbiz.model.humanres.DeleteJobInterviewTypeResponse;
import com.landawn.ofbiz.model.humanres.DeleteJobRequisitionRequest;
import com.landawn.ofbiz.model.humanres.DeleteJobRequisitionResponse;
import com.landawn.ofbiz.model.humanres.DeletePartyBenefitRequest;
import com.landawn.ofbiz.model.humanres.DeletePartyBenefitResponse;
import com.landawn.ofbiz.model.humanres.DeletePartyQualRequest;
import com.landawn.ofbiz.model.humanres.DeletePartyQualResponse;
import com.landawn.ofbiz.model.humanres.DeletePartyResumeRequest;
import com.landawn.ofbiz.model.humanres.DeletePartyResumeResponse;
import com.landawn.ofbiz.model.humanres.DeletePartySkillRequest;
import com.landawn.ofbiz.model.humanres.DeletePartySkillResponse;
import com.landawn.ofbiz.model.humanres.DeletePayGradeRequest;
import com.landawn.ofbiz.model.humanres.DeletePayGradeResponse;
import com.landawn.ofbiz.model.humanres.DeletePayHistoryRequest;
import com.landawn.ofbiz.model.humanres.DeletePayHistoryResponse;
import com.landawn.ofbiz.model.humanres.DeletePayrollPreferenceRequest;
import com.landawn.ofbiz.model.humanres.DeletePayrollPreferenceResponse;
import com.landawn.ofbiz.model.humanres.DeletePerfReviewItemRequest;
import com.landawn.ofbiz.model.humanres.DeletePerfReviewItemResponse;
import com.landawn.ofbiz.model.humanres.DeletePerfReviewRequest;
import com.landawn.ofbiz.model.humanres.DeletePerfReviewResponse;
import com.landawn.ofbiz.model.humanres.DeleteResponsibilityTypeRequest;
import com.landawn.ofbiz.model.humanres.DeleteResponsibilityTypeResponse;
import com.landawn.ofbiz.model.humanres.DeleteSalaryStepRequest;
import com.landawn.ofbiz.model.humanres.DeleteSalaryStepResponse;
import com.landawn.ofbiz.model.humanres.DeleteSkillTypeRequest;
import com.landawn.ofbiz.model.humanres.DeleteSkillTypeResponse;
import com.landawn.ofbiz.model.humanres.DeleteTerminationReasonRequest;
import com.landawn.ofbiz.model.humanres.DeleteTerminationReasonResponse;
import com.landawn.ofbiz.model.humanres.DeleteTerminationTypeRequest;
import com.landawn.ofbiz.model.humanres.DeleteTerminationTypeResponse;
import com.landawn.ofbiz.model.humanres.DeleteTrainingTypesRequest;
import com.landawn.ofbiz.model.humanres.DeleteTrainingTypesResponse;
import com.landawn.ofbiz.model.humanres.DeleteUnemploymentClaimRequest;
import com.landawn.ofbiz.model.humanres.DeleteUnemploymentClaimResponse;
import com.landawn.ofbiz.model.humanres.DeleteValidResponsibilityRequest;
import com.landawn.ofbiz.model.humanres.DeleteValidResponsibilityResponse;
import com.landawn.ofbiz.model.humanres.ExpirePayHistoryRequest;
import com.landawn.ofbiz.model.humanres.ExpirePayHistoryResponse;
import com.landawn.ofbiz.model.humanres.UpdateAgreementEmploymentApplResponse;
import com.landawn.ofbiz.model.humanres.UpdateApprovalStatusRequest;
import com.landawn.ofbiz.model.humanres.UpdateApprovalStatusResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplLeaveReasonTypeResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplLeaveRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmplLeaveResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplLeaveStatusRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmplLeaveStatusResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplLeaveTypeResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionFulfillmentRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionFulfillmentResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionReportingStructRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionReportingStructResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionResponsibilityRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionResponsibilityResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionTypeRateRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionTypeRateResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionTypeRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmplPositionTypeResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmploymentAppResponse;
import com.landawn.ofbiz.model.humanres.UpdateEmploymentRequest;
import com.landawn.ofbiz.model.humanres.UpdateEmploymentResponse;
import com.landawn.ofbiz.model.humanres.UpdateInternalJobPostingRequest;
import com.landawn.ofbiz.model.humanres.UpdateInternalJobPostingResponse;
import com.landawn.ofbiz.model.humanres.UpdateJobInterviewRequest;
import com.landawn.ofbiz.model.humanres.UpdateJobInterviewResponse;
import com.landawn.ofbiz.model.humanres.UpdateJobInterviewTypeResponse;
import com.landawn.ofbiz.model.humanres.UpdateJobRequisitionRequest;
import com.landawn.ofbiz.model.humanres.UpdateJobRequisitionResponse;
import com.landawn.ofbiz.model.humanres.UpdatePartyBenefitResponse;
import com.landawn.ofbiz.model.humanres.UpdatePartyQualRequest;
import com.landawn.ofbiz.model.humanres.UpdatePartyQualResponse;
import com.landawn.ofbiz.model.humanres.UpdatePartyResumeRequest;
import com.landawn.ofbiz.model.humanres.UpdatePartyResumeResponse;
import com.landawn.ofbiz.model.humanres.UpdatePartySkillRequest;
import com.landawn.ofbiz.model.humanres.UpdatePartySkillResponse;
import com.landawn.ofbiz.model.humanres.UpdatePayGradeRequest;
import com.landawn.ofbiz.model.humanres.UpdatePayGradeResponse;
import com.landawn.ofbiz.model.humanres.UpdatePayHistoryRequest;
import com.landawn.ofbiz.model.humanres.UpdatePayHistoryResponse;
import com.landawn.ofbiz.model.humanres.UpdatePayrollPreferenceResponse;
import com.landawn.ofbiz.model.humanres.UpdatePerfReviewItemRequest;
import com.landawn.ofbiz.model.humanres.UpdatePerfReviewItemResponse;
import com.landawn.ofbiz.model.humanres.UpdatePerfReviewRequest;
import com.landawn.ofbiz.model.humanres.UpdatePerfReviewResponse;
import com.landawn.ofbiz.model.humanres.UpdateResponsibilityTypeResponse;
import com.landawn.ofbiz.model.humanres.UpdateSalaryStepResponse;
import com.landawn.ofbiz.model.humanres.UpdateSkillTypeResponse;
import com.landawn.ofbiz.model.humanres.UpdateTerminationReasonResponse;
import com.landawn.ofbiz.model.humanres.UpdateTerminationTypeResponse;
import com.landawn.ofbiz.model.humanres.UpdateTrainingStatusRequest;
import com.landawn.ofbiz.model.humanres.UpdateTrainingStatusResponse;
import com.landawn.ofbiz.model.humanres.UpdateTrainingTypesResponse;
import com.landawn.ofbiz.model.humanres.UpdateUnemploymentClaimResponse;
import com.landawn.ofbiz.model.humanres.UpdateValidResponsibilityRequest;
import com.landawn.ofbiz.model.humanres.UpdateValidResponsibilityResponse;
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

    /** 200/400 routing decided by the response DTO's envelope state. */
    private static <T extends ResponseBase> ResponseEntity<T> wrap(T result) {
        return com.landawn.ofbiz.service.ServiceResponse.isError(result)
                ? ResponseEntity.status(org.springframework.http.HttpStatus.BAD_REQUEST).body(result)
                : ResponseEntity.ok(result);
    }

    /**
     * Create Training Request
     * <p>service: applyTraining  entities: PersonTraining  auth: true
     */
    @PostMapping("/humanres/control/applyTraining")
    public ResponseEntity<ApplyTrainingResponse> applyTraining(@RequestBody ApplyTrainingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Training Request
     * <p>service: assignTraining  entities: PersonTraining  auth: true
     */
    @PostMapping("/humanres/control/assignTraining")
    public ResponseEntity<AssignTrainingResponse> assignTraining(@RequestBody AssignTrainingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Agreement Employment Appl
     * <p>service: createAgreementEmploymentAppl  entities: AgreementEmploymentAppl  auth: true
     */
    @PostMapping("/humanres/control/createAgreementEmploymentAppl")
    public ResponseEntity<CreateAgreementEmploymentApplResponse> createAgreementEmploymentAppl(@RequestBody CreateAgreementEmploymentApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Leave
     * <p>service: createEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/createEmplLeave")
    public ResponseEntity<CreateEmplLeaveResponse> createEmplLeave(@RequestBody CreateEmplLeaveRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Leave
     * <p>service: createEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/createEmplLeaveExt")
    public ResponseEntity<CreateEmplLeaveResponse> createEmplLeaveCreateEmplLeaveExt(@RequestBody CreateEmplLeaveRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid Leave Reason Type
     * <p>service: createEmplLeaveReasonType  entities: EmplLeaveReasonType  auth: true
     */
    @PostMapping("/humanres/control/createEmplLeaveReasonType")
    public ResponseEntity<CreateEmplLeaveReasonTypeResponse> createEmplLeaveReasonType(@RequestBody CreateEmplLeaveReasonTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid LeaveType
     * <p>service: createEmplLeaveType  entities: EmplLeaveType  auth: true
     */
    @PostMapping("/humanres/control/createEmplLeaveType")
    public ResponseEntity<CreateEmplLeaveTypeResponse> createEmplLeaveType(@RequestBody CreateEmplLeaveTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Employee Position
     * <p>service: createEmplPosition  entities: EmplPosition  auth: true
     */
    @PostMapping("/humanres/control/createEmplPosition")
    public ResponseEntity<CreateEmplPositionResponse> createEmplPosition(@RequestBody CreateEmplPositionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Position Fulfillment
     * <p>service: createEmplPositionFulfillment  entities: EmplPositionFulfillment  auth: true
     */
    @PostMapping("/humanres/control/createEmplPositionFulfillment")
    public ResponseEntity<CreateEmplPositionFulfillmentResponse> createEmplPositionFulfillment(@RequestBody CreateEmplPositionFulfillmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Position Reporting Structure
     * <p>service: createEmplPositionReportingStruct  entities: EmplPositionReportingStruct  auth: true
     */
    @PostMapping("/humanres/control/createEmplPositionReportingStruct")
    public ResponseEntity<CreateEmplPositionReportingStructResponse> createEmplPositionReportingStruct(@RequestBody CreateEmplPositionReportingStructRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employee Position Responsibility
     * <p>service: createEmplPositionResponsibility  entities: EmplPositionResponsibility  auth: true
     */
    @PostMapping("/humanres/control/createEmplPositionResponsibility")
    public ResponseEntity<CreateEmplPositionResponsibilityResponse> createEmplPositionResponsibility(@RequestBody CreateEmplPositionResponsibilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid PositionType
     * <p>service: createEmplPositionType  entities: EmplPositionType  auth: true
     */
    @PostMapping("/humanres/control/createEmplPositionType")
    public ResponseEntity<CreateEmplPositionTypeResponse> createEmplPositionType(@RequestBody CreateEmplPositionTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Employee its role and contact details
     * <p>service: createEmployee  entities: Person, PostalAddress, TelecomNumber  auth: true
     */
    @PostMapping("/humanres/control/createEmployee")
    public ResponseEntity<CreateEmployeeResponse> createEmployee(@RequestBody CreateEmployeeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Party Qualification entry
     * <p>service: createPartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/createEmployeeQualification")
    public ResponseEntity<CreatePartyQualResponse> createPartyQual(@RequestBody CreatePartyQualRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Skill for a Party
     * <p>service: createPartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/createEmployeeSkill")
    public ResponseEntity<CreatePartySkillResponse> createPartySkill(@RequestBody CreatePartySkillRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Employment and first record in PayHistory
     * <p>service: createEmployment  entities: Employment  auth: true
     */
    @PostMapping("/humanres/control/createEmployment")
    public ResponseEntity<CreateEmploymentResponse> createEmployment(@RequestBody CreateEmploymentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Employment Application
     * <p>service: createEmploymentApp  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/createEmploymentApp")
    public ResponseEntity<CreateEmploymentAppResponse> createEmploymentApp(@RequestBody CreateEmploymentAppRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Employment Application
     * <p>service: createEmploymentApp  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/createEmploymentAppExt")
    public ResponseEntity<CreateEmploymentAppResponse> createEmploymentAppCreateEmploymentAppExt(@RequestBody CreateEmploymentAppRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a New Internal Job Posting
     * <p>service: createInternalJobPosting  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/createInternalJobPosting")
    public ResponseEntity<CreateInternalJobPostingResponse> createInternalJobPosting(@RequestBody CreateInternalJobPostingRequest request) {
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
    public ResponseEntity<CreateJobInterviewResponse> createJobInterview(@RequestBody CreateJobInterviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a New Interview Type
     * <p>service: createJobInterviewType  entities: JobInterviewType  auth: true
     */
    @PostMapping("/humanres/control/createJobInterviewType")
    public ResponseEntity<CreateJobInterviewTypeResponse> createJobInterviewType(@RequestBody CreateJobInterviewTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new Job Requisition
     * <p>service: createJobRequisition  entities: JobRequisition  auth: true
     */
    @PostMapping("/humanres/control/createJobRequisition")
    public ResponseEntity<CreateJobRequisitionResponse> createJobRequisition(@RequestBody CreateJobRequisitionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Party Benefit
     * <p>service: createPartyBenefit  entities: PartyBenefit  auth: true
     */
    @PostMapping("/humanres/control/createPartyBenefit")
    public ResponseEntity<CreatePartyBenefitResponse> createPartyBenefit(@RequestBody CreatePartyBenefitRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Party Qualification entry
     * <p>service: createPartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/createPartyQual")
    public ResponseEntity<CreatePartyQualResponse> createPartyQualCreatePartyQual(@RequestBody CreatePartyQualRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Party Qualification entry
     * <p>service: createPartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/createPartyQualExt")
    public ResponseEntity<CreatePartyQualResponse> createPartyQualCreatePartyQualExt(@RequestBody CreatePartyQualRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Resume for a Party
     * <p>service: createPartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/humanres/control/createPartyResume")
    public ResponseEntity<CreatePartyResumeResponse> createPartyResume(@RequestBody CreatePartyResumeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Skill for a Party
     * <p>service: createPartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/createPartySkill")
    public ResponseEntity<CreatePartySkillResponse> createPartySkillCreatePartySkill(@RequestBody CreatePartySkillRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Skill for a Party
     * <p>service: createPartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/createPartySkillExt")
    public ResponseEntity<CreatePartySkillResponse> createPartySkillCreatePartySkillExt(@RequestBody CreatePartySkillRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Pay Grade
     * <p>service: createPayGrade  entities: PayGrade  auth: true
     */
    @PostMapping("/humanres/control/createPayGrade")
    public ResponseEntity<CreatePayGradeResponse> createPayGrade(@RequestBody CreatePayGradeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Payroll Preference
     * <p>service: createPayrollPreference  entities: PayrollPreference  auth: true
     */
    @PostMapping("/humanres/control/createPayrollPreference")
    public ResponseEntity<CreatePayrollPreferenceResponse> createPayrollPreference(@RequestBody CreatePayrollPreferenceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Performance Review
     * <p>service: createPerfReview  entities: PerfReview  auth: true
     */
    @PostMapping("/humanres/control/createPerfReview")
    public ResponseEntity<CreatePerfReviewResponse> createPerfReview(@RequestBody CreatePerfReviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Performance Review Item
     * <p>service: createPerfReviewItem  entities: PerfReviewItem  auth: true
     */
    @PostMapping("/humanres/control/createPerfReviewItem")
    public ResponseEntity<CreatePerfReviewItemResponse> createPerfReviewItem(@RequestBody CreatePerfReviewItemRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Performance Note
     * <p>service: createPerformanceNote  entities: PerformanceNote  auth: true
     */
    @PostMapping("/humanres/control/createPerformanceNote")
    public ResponseEntity<CreatePerformanceNoteResponse> createPerformanceNote(@RequestBody CreatePerformanceNoteRequest request) {
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
    public ResponseEntity<CreateResponsibilityTypeResponse> createResponsibilityType(@RequestBody CreateResponsibilityTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Salary Step
     * <p>service: createSalaryStep  entities: SalaryStep  auth: true
     */
    @PostMapping("/humanres/control/createSalaryStep")
    public ResponseEntity<CreateSalaryStepResponse> createSalaryStep(@RequestBody CreateSalaryStepRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid SkillType
     * <p>service: createSkillType  entities: SkillType  auth: true
     */
    @PostMapping("/humanres/control/createSkillType")
    public ResponseEntity<CreateSkillTypeResponse> createSkillType(@RequestBody CreateSkillTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Termination Reason
     * <p>service: createTerminationReason  entities: TerminationReason  auth: true
     */
    @PostMapping("/humanres/control/createTerminationReason")
    public ResponseEntity<CreateTerminationReasonResponse> createTerminationReason(@RequestBody CreateTerminationReasonRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid TerminationType
     * <p>service: createTerminationType  entities: TerminationType  auth: true
     */
    @PostMapping("/humanres/control/createTerminationType")
    public ResponseEntity<CreateTerminationTypeResponse> createTerminationType(@RequestBody CreateTerminationTypeRequest request) {
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
    public ResponseEntity<CreateTrainingTypesResponse> createTrainingTypes(@RequestBody CreateTrainingTypesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Unemployment Claim
     * <p>service: createUnemploymentClaim  entities: UnemploymentClaim  auth: true
     */
    @PostMapping("/humanres/control/createUnemploymentClaim")
    public ResponseEntity<CreateUnemploymentClaimResponse> createUnemploymentClaim(@RequestBody CreateUnemploymentClaimRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Valid Responsibility
     * <p>service: createValidResponsibility  entities: ValidResponsibility  auth: true
     */
    @PostMapping("/humanres/control/createValidResponsibility")
    public ResponseEntity<CreateValidResponsibilityResponse> createValidResponsibility(@RequestBody CreateValidResponsibilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete AgreementEmploymentAppl
     * <p>service: deleteAgreementEmploymentAppl  entities: AgreementEmploymentAppl  auth: true
     */
    @PostMapping("/humanres/control/deleteAgreementEmploymentAppl")
    public ResponseEntity<DeleteAgreementEmploymentApplResponse> deleteAgreementEmploymentAppl(@RequestBody DeleteAgreementEmploymentApplRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete AgreementEmploymentAppl
     * <p>service: deleteEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplLeave")
    public ResponseEntity<DeleteEmplLeaveResponse> deleteEmplLeave(@RequestBody DeleteEmplLeaveRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid Leave Reason Type
     * <p>service: deleteEmplLeaveReasonType  entities: EmplLeaveReasonType  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplLeaveReasonType")
    public ResponseEntity<DeleteEmplLeaveReasonTypeResponse> deleteEmplLeaveReasonType(@RequestBody DeleteEmplLeaveReasonTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid LeaveType
     * <p>service: deleteEmplLeaveType  entities: EmplLeaveType  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplLeaveType")
    public ResponseEntity<DeleteEmplLeaveTypeResponse> deleteEmplLeaveType(@RequestBody DeleteEmplLeaveTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Employee Position
     * <p>service: deleteEmplPosition  entities: EmplPosition  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPosition")
    public ResponseEntity<DeleteEmplPositionResponse> deleteEmplPosition(@RequestBody DeleteEmplPositionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Employee Position Fulfillment
     * <p>service: deleteEmplPositionFulfillment  entities: EmplPositionFulfillment  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionFulfillment")
    public ResponseEntity<DeleteEmplPositionFulfillmentResponse> deleteEmplPositionFulfillment(@RequestBody DeleteEmplPositionFulfillmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Employee Position Reporting Structure
     * <p>service: deleteEmplPositionReportingStruct  entities: EmplPositionReportingStruct  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionReportingStruct")
    public ResponseEntity<DeleteEmplPositionReportingStructResponse> deleteEmplPositionReportingStruct(@RequestBody DeleteEmplPositionReportingStructRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Employee Position Responsibility
     * <p>service: deleteEmplPositionResponsibility  entities: EmplPositionResponsibility  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionResponsibility")
    public ResponseEntity<DeleteEmplPositionResponsibilityResponse> deleteEmplPositionResponsibility(@RequestBody DeleteEmplPositionResponsibilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete EmplPositionType
     * <p>service: deleteEmplPositionType  entities: EmplPositionType  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionType")
    public ResponseEntity<DeleteEmplPositionTypeResponse> deleteEmplPositionType(@RequestBody DeleteEmplPositionTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid EmplPositionTypeRate
     * <p>service: deleteEmplPositionTypeRate  entities: EmplPositionTypeRate  auth: true
     */
    @PostMapping("/humanres/control/deleteEmplPositionTypeRate")
    public ResponseEntity<DeleteEmplPositionTypeRateResponse> deleteEmplPositionTypeRate(@RequestBody DeleteEmplPositionTypeRateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Qualification of Party
     * <p>service: deletePartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/deleteEmployeeQualification")
    public ResponseEntity<DeletePartyQualResponse> deletePartyQual(@RequestBody DeletePartyQualRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a PartySkill
     * <p>service: deletePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/deleteEmployeeSkill")
    public ResponseEntity<DeletePartySkillResponse> deletePartySkill(@RequestBody DeletePartySkillRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Employment
     * <p>service: deleteEmployment  entities: Employment  auth: true
     */
    @PostMapping("/humanres/control/deleteEmployment")
    public ResponseEntity<DeleteEmploymentResponse> deleteEmployment(@RequestBody DeleteEmploymentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Employment Application
     * <p>service: deleteEmploymentApp  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/deleteEmploymentApp")
    public ResponseEntity<DeleteEmploymentAppResponse> deleteEmploymentApp(@RequestBody DeleteEmploymentAppRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Internal Job Posting
     * <p>service: deleteInternalJobPosting  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/deleteInternalJobPosting")
    public ResponseEntity<DeleteInternalJobPostingResponse> deleteInternalJobPosting(@RequestBody DeleteInternalJobPostingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Job Interview
     * <p>service: deleteJobInterview  entities: JobInterview  auth: true
     */
    @PostMapping("/humanres/control/deleteJobInterview")
    public ResponseEntity<DeleteJobInterviewResponse> deleteJobInterview(@RequestBody DeleteJobInterviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Interview Type
     * <p>service: deleteJobInterviewType  entities: JobInterviewType  auth: true
     */
    @PostMapping("/humanres/control/deleteJobInterviewType")
    public ResponseEntity<DeleteJobInterviewTypeResponse> deleteJobInterviewType(@RequestBody DeleteJobInterviewTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Job Requisition
     * <p>service: deleteJobRequisition  entities: JobRequisition  auth: true
     */
    @PostMapping("/humanres/control/deleteJobRequisition")
    public ResponseEntity<DeleteJobRequisitionResponse> deleteJobRequisition(@RequestBody DeleteJobRequisitionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Party Benefit
     * <p>service: deletePartyBenefit  entities: PartyBenefit  auth: true
     */
    @PostMapping("/humanres/control/deletePartyBenefit")
    public ResponseEntity<DeletePartyBenefitResponse> deletePartyBenefit(@RequestBody DeletePartyBenefitRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Qualification of Party
     * <p>service: deletePartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/deletePartyQual")
    public ResponseEntity<DeletePartyQualResponse> deletePartyQualDeletePartyQual(@RequestBody DeletePartyQualRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Resume of Party
     * <p>service: deletePartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/humanres/control/deletePartyResume")
    public ResponseEntity<DeletePartyResumeResponse> deletePartyResume(@RequestBody DeletePartyResumeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a PartySkill
     * <p>service: deletePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/deletePartySkill")
    public ResponseEntity<DeletePartySkillResponse> deletePartySkillDeletePartySkill(@RequestBody DeletePartySkillRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Pay Grade
     * <p>service: deletePayGrade  entities: PayGrade  auth: true
     */
    @PostMapping("/humanres/control/deletePayGrade")
    public ResponseEntity<DeletePayGradeResponse> deletePayGrade(@RequestBody DeletePayGradeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Pay History
     * <p>service: deletePayHistory  entities: PayHistory  auth: true
     */
    @PostMapping("/humanres/control/deletePayHistory")
    public ResponseEntity<DeletePayHistoryResponse> deletePayHistory(@RequestBody DeletePayHistoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Payroll Preference
     * <p>service: deletePayrollPreference  entities: PayrollPreference  auth: true
     */
    @PostMapping("/humanres/control/deletePayrollPreference")
    public ResponseEntity<DeletePayrollPreferenceResponse> deletePayrollPreference(@RequestBody DeletePayrollPreferenceRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Performance Review
     * <p>service: deletePerfReview  entities: PerfReview  auth: true
     */
    @PostMapping("/humanres/control/deletePerfReview")
    public ResponseEntity<DeletePerfReviewResponse> deletePerfReview(@RequestBody DeletePerfReviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Performance Review Item
     * <p>service: deletePerfReviewItem  entities: PerfReviewItem  auth: true
     */
    @PostMapping("/humanres/control/deletePerfReviewItem")
    public ResponseEntity<DeletePerfReviewItemResponse> deletePerfReviewItem(@RequestBody DeletePerfReviewItemRequest request) {
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
    public ResponseEntity<DeleteResponsibilityTypeResponse> deleteResponsibilityType(@RequestBody DeleteResponsibilityTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Salary Step
     * <p>service: deleteSalaryStep  entities: SalaryStep  auth: true
     */
    @PostMapping("/humanres/control/deleteSalaryStep")
    public ResponseEntity<DeleteSalaryStepResponse> deleteSalaryStep(@RequestBody DeleteSalaryStepRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid SkillType
     * <p>service: deleteSkillType  entities: SkillType  auth: true
     */
    @PostMapping("/humanres/control/deleteSkillType")
    public ResponseEntity<DeleteSkillTypeResponse> deleteSkillType(@RequestBody DeleteSkillTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Termination Reason
     * <p>service: deleteTerminationReason  entities: TerminationReason  auth: true
     */
    @PostMapping("/humanres/control/deleteTerminationReason")
    public ResponseEntity<DeleteTerminationReasonResponse> deleteTerminationReason(@RequestBody DeleteTerminationReasonRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid TerminationType
     * <p>service: deleteTerminationType  entities: TerminationType  auth: true
     */
    @PostMapping("/humanres/control/deleteTerminationType")
    public ResponseEntity<DeleteTerminationTypeResponse> deleteTerminationType(@RequestBody DeleteTerminationTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Training Type
     * <p>service: deleteTrainingTypes  entities: TrainingClassType  auth: true
     */
    @PostMapping("/humanres/control/deleteTrainingTypes")
    public ResponseEntity<DeleteTrainingTypesResponse> deleteTrainingTypes(@RequestBody DeleteTrainingTypesRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an Unemployment Claim
     * <p>service: deleteUnemploymentClaim  entities: UnemploymentClaim  auth: true
     */
    @PostMapping("/humanres/control/deleteUnemploymentClaim")
    public ResponseEntity<DeleteUnemploymentClaimResponse> deleteUnemploymentClaim(@RequestBody DeleteUnemploymentClaimRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Valid Responsibility
     * <p>service: deleteValidResponsibility  entities: ValidResponsibility  auth: true
     */
    @PostMapping("/humanres/control/deleteValidResponsibility")
    public ResponseEntity<DeleteValidResponsibilityResponse> deleteValidResponsibility(@RequestBody DeleteValidResponsibilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire Pay History
     * <p>service: expirePayHistory  entities: PayHistory  auth: true
     */
    @PostMapping("/humanres/control/expirePayHistory")
    public ResponseEntity<ExpirePayHistoryResponse> expirePayHistory(@RequestBody ExpirePayHistoryRequest request) {
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
    public ResponseEntity<UpdateAgreementEmploymentApplResponse> updateAgreementEmploymentAppl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Approval Status
     * <p>service: updateApprovalStatus  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/updateApprovalStatus")
    public ResponseEntity<UpdateApprovalStatusResponse> updateApprovalStatus(@RequestBody UpdateApprovalStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid Employee Leave
     * <p>service: updateEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/updateEmplLeave")
    public ResponseEntity<UpdateEmplLeaveResponse> updateEmplLeave(@RequestBody UpdateEmplLeaveRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid Employee Leave
     * <p>service: updateEmplLeave  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/updateEmplLeaveExt")
    public ResponseEntity<UpdateEmplLeaveResponse> updateEmplLeaveUpdateEmplLeaveExt(@RequestBody UpdateEmplLeaveRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateEmplLeaveReasonType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateEmplLeaveReasonType")
    public ResponseEntity<UpdateEmplLeaveReasonTypeResponse> updateEmplLeaveReasonType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Leave Approval Status
     * <p>service: updateEmplLeaveStatus  entities: EmplLeave  auth: true
     */
    @PostMapping("/humanres/control/updateEmplLeaveStatus")
    public ResponseEntity<UpdateEmplLeaveStatusResponse> updateEmplLeaveStatus(@RequestBody UpdateEmplLeaveStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateEmplLeaveType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateEmplLeaveType")
    public ResponseEntity<UpdateEmplLeaveTypeResponse> updateEmplLeaveType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Employee Position
     * <p>service: updateEmplPosition  entities: EmplPosition  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPosition")
    public ResponseEntity<UpdateEmplPositionResponse> updateEmplPosition(@RequestBody UpdateEmplPositionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Employee Position Fulfillment
     * <p>service: updateEmplPositionFulfillment  entities: EmplPositionFulfillment  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionFulfillment")
    public ResponseEntity<UpdateEmplPositionFulfillmentResponse> updateEmplPositionFulfillment(@RequestBody UpdateEmplPositionFulfillmentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Employee Position Reporting Structure
     * <p>service: updateEmplPositionReportingStruct  entities: EmplPositionReportingStruct  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionReportingStruct")
    public ResponseEntity<UpdateEmplPositionReportingStructResponse> updateEmplPositionReportingStruct(@RequestBody UpdateEmplPositionReportingStructRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Employee Position Responsibility
     * <p>service: updateEmplPositionResponsibility  entities: EmplPositionResponsibility  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionResponsibility")
    public ResponseEntity<UpdateEmplPositionResponsibilityResponse> updateEmplPositionResponsibility(@RequestBody UpdateEmplPositionResponsibilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid PositionType
     * <p>service: updateEmplPositionType  entities: EmplPositionType  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionType")
    public ResponseEntity<UpdateEmplPositionTypeResponse> updateEmplPositionType(@RequestBody UpdateEmplPositionTypeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid EmplPositionTypeRate
     * <p>service: updateEmplPositionTypeRate  entities: EmplPositionTypeRate  auth: true
     */
    @PostMapping("/humanres/control/updateEmplPositionTypeRate")
    public ResponseEntity<UpdateEmplPositionTypeRateResponse> updateEmplPositionTypeRate(@RequestBody UpdateEmplPositionTypeRateRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Qualification of Party
     * <p>service: updatePartyQual  entities: PartyQual  auth: true
     */
    @PostMapping("/humanres/control/updateEmployeeQualification")
    public ResponseEntity<UpdatePartyQualResponse> updatePartyQual(@RequestBody UpdatePartyQualRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a PartySkill
     * <p>service: updatePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/updateEmployeeSkill")
    public ResponseEntity<UpdatePartySkillResponse> updatePartySkill(@RequestBody UpdatePartySkillRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Employment
     * <p>service: updateEmployment  entities: Employment  auth: true
     */
    @PostMapping("/humanres/control/updateEmployment")
    public ResponseEntity<UpdateEmploymentResponse> updateEmployment(@RequestBody UpdateEmploymentRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateEmploymentApp  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateEmploymentApp")
    public ResponseEntity<UpdateEmploymentAppResponse> updateEmploymentApp(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateEmploymentApp  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateEmploymentAppExt")
    public ResponseEntity<UpdateEmploymentAppResponse> updateEmploymentAppUpdateEmploymentAppExt(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Internal Job Posting
     * <p>service: updateInternalJobPosting  entities: EmploymentApp  auth: true
     */
    @PostMapping("/humanres/control/updateInternalJobPosting")
    public ResponseEntity<UpdateInternalJobPostingResponse> updateInternalJobPosting(@RequestBody UpdateInternalJobPostingRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Job Interview
     * <p>service: updateJobInterview  entities: JobInterview  auth: true
     */
    @PostMapping("/humanres/control/updateJobInterview")
    public ResponseEntity<UpdateJobInterviewResponse> updateJobInterview(@RequestBody UpdateJobInterviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateJobInterviewType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateJobInterviewType")
    public ResponseEntity<UpdateJobInterviewTypeResponse> updateJobInterviewType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Job Requisition
     * <p>service: updateJobRequisition  entities: JobRequisition  auth: true
     */
    @PostMapping("/humanres/control/updateJobRequisition")
    public ResponseEntity<UpdateJobRequisitionResponse> updateJobRequisition(@RequestBody UpdateJobRequisitionRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePartyBenefit  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updatePartyBenefit")
    public ResponseEntity<UpdatePartyBenefitResponse> updatePartyBenefit(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePartyQual  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updatePartyQual")
    public ResponseEntity<UpdatePartyQualResponse> updatePartyQualUpdatePartyQual(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePartyQual  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updatePartyQualExt")
    public ResponseEntity<UpdatePartyQualResponse> updatePartyQualUpdatePartyQualExt(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Resume of Party
     * <p>service: updatePartyResume  entities: PartyResume  auth: true
     */
    @PostMapping("/humanres/control/updatePartyResume")
    public ResponseEntity<UpdatePartyResumeResponse> updatePartyResume(@RequestBody UpdatePartyResumeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a PartySkill
     * <p>service: updatePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/updatePartySkill")
    public ResponseEntity<UpdatePartySkillResponse> updatePartySkillUpdatePartySkill(@RequestBody UpdatePartySkillRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a PartySkill
     * <p>service: updatePartySkill  entities: PartySkill  auth: true
     */
    @PostMapping("/humanres/control/updatePartySkillExt")
    public ResponseEntity<UpdatePartySkillResponse> updatePartySkillUpdatePartySkillExt(@RequestBody UpdatePartySkillRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Pay Grade
     * <p>service: updatePayGrade  entities: PayGrade  auth: true
     */
    @PostMapping("/humanres/control/updatePayGrade")
    public ResponseEntity<UpdatePayGradeResponse> updatePayGrade(@RequestBody UpdatePayGradeRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Pay History
     * <p>service: updatePayHistory  entities: PayHistory  auth: true
     */
    @PostMapping("/humanres/control/updatePayHistory")
    public ResponseEntity<UpdatePayHistoryResponse> updatePayHistory(@RequestBody UpdatePayHistoryRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updatePayrollPreference  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updatePayrollPreference")
    public ResponseEntity<UpdatePayrollPreferenceResponse> updatePayrollPreference(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Performance Review
     * <p>service: updatePerfReview  entities: PerfReview  auth: true
     */
    @PostMapping("/humanres/control/updatePerfReview")
    public ResponseEntity<UpdatePerfReviewResponse> updatePerfReview(@RequestBody UpdatePerfReviewRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Performance Review Item
     * <p>service: updatePerfReviewItem  entities: PerfReviewItem  auth: true
     */
    @PostMapping("/humanres/control/updatePerfReviewItem")
    public ResponseEntity<UpdatePerfReviewItemResponse> updatePerfReviewItem(@RequestBody UpdatePerfReviewItemRequest request) {
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
    public ResponseEntity<UpdateResponsibilityTypeResponse> updateResponsibilityType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateSalaryStep  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateSalaryStep")
    public ResponseEntity<UpdateSalaryStepResponse> updateSalaryStep(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateSkillType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateSkillType")
    public ResponseEntity<UpdateSkillTypeResponse> updateSkillType(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateTerminationReason  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateTerminationReason")
    public ResponseEntity<UpdateTerminationReasonResponse> updateTerminationReason(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateTerminationType  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateTerminationType")
    public ResponseEntity<UpdateTerminationTypeResponse> updateTerminationType(@RequestParam Map<String, String> params) {
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
    public ResponseEntity<UpdateTrainingStatusResponse> updateTrainingStatus(@RequestBody UpdateTrainingStatusRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateTrainingTypes  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateTrainingTypes")
    public ResponseEntity<UpdateTrainingTypesResponse> updateTrainingTypes(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateUnemploymentClaim  entities: unknown  auth: true
     */
    @GetMapping("/humanres/control/updateUnemploymentClaim")
    public ResponseEntity<UpdateUnemploymentClaimResponse> updateUnemploymentClaim(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Valid Responsibility
     * <p>service: updateValidResponsibility  entities: ValidResponsibility  auth: true
     */
    @PostMapping("/humanres/control/updateValidResponsibility")
    public ResponseEntity<UpdateValidResponsibilityResponse> updateValidResponsibility(@RequestBody UpdateValidResponsibilityRequest request) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
