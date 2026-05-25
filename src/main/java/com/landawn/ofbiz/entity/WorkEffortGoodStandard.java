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
@Table(name = "work_effort_good_standard")
public class WorkEffortGoodStandard {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "work_effort_good_std_type_id")
    private String workEffortGoodStdTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "estimated_quantity")
    private Double estimatedQuantity;

    @Column(name = "estimated_cost")
    private double estimatedCost;
}
