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
@Table(name = "fixed_asset_maint")
public class FixedAssetMaint {
    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Id
    @Column(name = "maint_hist_seq_id")
    private String maintHistSeqId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "product_maint_type_id")
    private String productMaintTypeId;

    @Column(name = "product_maint_seq_id")
    private String productMaintSeqId;

    @Column(name = "schedule_work_effort_id")
    private String scheduleWorkEffortId;

    @Column(name = "interval_quantity")
    private double intervalQuantity;

    @Column(name = "interval_uom_id")
    private String intervalUomId;

    @Column(name = "interval_meter_type_id")
    private String intervalMeterTypeId;

    @Column(name = "purchase_order_id")
    private String purchaseOrderId;
}
