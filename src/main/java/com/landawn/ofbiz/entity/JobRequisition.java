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
@Table(name = "job_requisition")
public class JobRequisition {
    @Id
    @Column(name = "job_requisition_id")
    private String jobRequisitionId;

    @Column(name = "duration_months")
    private double durationMonths;

    @Column(name = "age")
    private double age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "experience_months")
    private double experienceMonths;

    @Column(name = "experience_years")
    private double experienceYears;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "job_location")
    private String jobLocation;

    @Column(name = "skill_type_id")
    private String skillTypeId;

    @Column(name = "no_of_resources")
    private double noOfResources;

    @Column(name = "job_posting_type_enum_id")
    private String jobPostingTypeEnumId;

    @Column(name = "job_requisition_date")
    private Date jobRequisitionDate;

    @Column(name = "exam_type_enum_id")
    private String examTypeEnumId;

    @Column(name = "required_on_date")
    private Date requiredOnDate;

    @JoinedBy("skillTypeId=SkillType.skillTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SkillType skillType;

    @JoinedBy("examTypeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration examTypeEnum;

    @JoinedBy("jobPostingTypeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration jobPostingTypeEnum;
}
