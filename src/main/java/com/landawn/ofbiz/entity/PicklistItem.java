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
@Table(name = "picklist_item")
public class PicklistItem {
    @Id
    @Column(name = "picklist_bin_id")
    private String picklistBinId;

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Id
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "item_status_id")
    private String itemStatusId;

    @Column(name = "quantity")
    private double quantity;
}
