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
@Table(name = "work_effort_fixed_asset_assign")
public class WorkEffortFixedAssetAssign {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "status_id")
    private String statusId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "availability_status_id")
    private String availabilityStatusId;

    @Column(name = "allocated_cost")
    private double allocatedCost;

    @Column(name = "comments")
    private String comments;
}
