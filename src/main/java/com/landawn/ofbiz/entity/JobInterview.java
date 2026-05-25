package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

    @JoinedBy("jobIntervieweePartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party jobIntervieweeParty;

    @JoinedBy("jobInterviewerPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party jobInterviewerParty;

    @JoinedBy("jobInterviewTypeId=JobInterviewType.jobInterviewTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private JobInterviewType jobInterviewType;

    @JoinedBy("jobRequisitionId=JobRequisition.jobRequisitionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private JobRequisition jobRequisition;

    @JoinedBy("gradeSecuredEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;
}
