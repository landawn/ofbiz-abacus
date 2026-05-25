package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "picklist_item_and_bin")
public class PicklistItemAndBin {
    @ReadOnly
    @Column(name = "picklist_bin_id")
    private String picklistBinId;

    @ReadOnly
    @Column(name = "picklist_id")
    private String picklistId;

    @ReadOnly
    @Column(name = "bin_location_number")
    private double binLocationNumber;

    @ReadOnly
    @Column(name = "primary_order_id")
    private String primaryOrderId;

    @ReadOnly
    @Column(name = "primary_ship_group_seq_id")
    private String primaryShipGroupSeqId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "item_status_id")
    private String itemStatusId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;
}
