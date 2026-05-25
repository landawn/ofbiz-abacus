package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "work_effort_cost_calc")
public class WorkEffortCostCalc {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "cost_component_type_id")
    private String costComponentTypeId;

    @Column(name = "cost_component_calc_id")
    private String costComponentCalcId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("costComponentTypeId=CostComponentType.costComponentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CostComponentType costComponentType;

    @JoinedBy("costComponentCalcId=CostComponentCalc.costComponentCalcId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CostComponentCalc costComponentCalc;
}
