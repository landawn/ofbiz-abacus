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
@Table(name = "work_effort_fixed_asset_std")
public class WorkEffortFixedAssetStd {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "fixed_asset_type_id")
    private String fixedAssetTypeId;

    @Column(name = "estimated_quantity")
    private Double estimatedQuantity;

    @Column(name = "estimated_duration")
    private Double estimatedDuration;

    @Column(name = "estimated_cost")
    private double estimatedCost;
}
