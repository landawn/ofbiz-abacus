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
@Table(name = "fixed_asset_maint_order")
public class FixedAssetMaintOrder {
    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Id
    @Column(name = "maint_hist_seq_id")
    private String maintHistSeqId;

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;
}
