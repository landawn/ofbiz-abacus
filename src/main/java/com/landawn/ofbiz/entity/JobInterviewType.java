package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_interview_type")
public class JobInterviewType {
    @Id
    @Column(name = "job_interview_type_id")
    private String jobInterviewTypeId;

    @Column(name = "description")
    private String description;
}
