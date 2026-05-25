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
@Table(name = "work_effort_skill_standard")
public class WorkEffortSkillStandard {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "skill_type_id")
    private String skillTypeId;

    @Column(name = "estimated_num_people")
    private Double estimatedNumPeople;

    @Column(name = "estimated_duration")
    private Double estimatedDuration;

    @Column(name = "estimated_cost")
    private double estimatedCost;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("skillTypeId=SkillType.skillTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SkillType skillType;
}
