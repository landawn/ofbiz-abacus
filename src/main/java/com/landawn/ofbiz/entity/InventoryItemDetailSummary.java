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
@Table(name = "inventory_item_detail_summary")
public class InventoryItemDetailSummary {
    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "available_to_promise_total")
    private double availableToPromiseTotal;

    @ReadOnly
    @Column(name = "quantity_on_hand_total")
    private double quantityOnHandTotal;

    @ReadOnly
    @Column(name = "accounting_quantity_total")
    private double accountingQuantityTotal;
}
