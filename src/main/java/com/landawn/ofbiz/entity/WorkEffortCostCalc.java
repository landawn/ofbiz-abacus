package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
