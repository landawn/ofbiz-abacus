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
@Table(name = "inventory_item_detail")
public class InventoryItemDetail {
    @Id
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Id
    @Column(name = "inventory_item_detail_seq_id")
    private String inventoryItemDetailSeqId;

    @Column(name = "effective_date")
    private Timestamp effectiveDate;

    @Column(name = "quantity_on_hand_diff")
    private double quantityOnHandDiff;

    @Column(name = "available_to_promise_diff")
    private double availableToPromiseDiff;

    @Column(name = "accounting_quantity_diff")
    private double accountingQuantityDiff;

    @Column(name = "unit_cost")
    private double unitCost;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Column(name = "shipment_id")
    private String shipmentId;

    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Column(name = "return_id")
    private String returnId;

    @Column(name = "return_item_seq_id")
    private String returnItemSeqId;

    @Column(name = "work_effort_id")
    private String workEffortId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "maint_hist_seq_id")
    private String maintHistSeqId;

    @Column(name = "item_issuance_id")
    private String itemIssuanceId;

    @Column(name = "receipt_id")
    private String receiptId;

    @Column(name = "physical_inventory_id")
    private String physicalInventoryId;

    @Column(name = "reason_enum_id")
    private String reasonEnumId;

    @Column(name = "description")
    private String description;
}
