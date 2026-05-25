package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_interview")
public class JobInterview {
    @Id
    @Column(name = "job_interview_id")
    private String jobInterviewId;

    @Column(name = "job_interviewee_party_id")
    private String jobIntervieweePartyId;

    @Column(name = "job_requisition_id")
    private String jobRequisitionId;

    @Column(name = "job_interviewer_party_id")
    private String jobInterviewerPartyId;

    @Column(name = "job_interview_type_id")
    private String jobInterviewTypeId;

    @Column(name = "grade_secured_enum_id")
    private String gradeSecuredEnumId;

    @Column(name = "job_interview_result")
    private String jobInterviewResult;

    @Column(name = "job_interview_date")
    private Date jobInterviewDate;
}
