package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "work_requirement_fulfillment")
public class WorkRequirementFulfillment {
    @Id
    @Column(name = "requirement_id")
    private String requirementId;

    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Column(name = "work_req_fulf_type_id")
    private String workReqFulfTypeId;

    @JoinedBy("requirementId=Requirement.requirementId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Requirement requirement;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("workReqFulfTypeId=WorkReqFulfType.workReqFulfTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkReqFulfType workReqFulfType;
}
