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
@Table(name = "work_effort_and_inventory_produced")
public class WorkEffortAndInventoryProduced {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "unit_cost")
    private double unitCost;

    @ReadOnly
    @Column(name = "lot_id")
    private String lotId;

    @ReadOnly
    @Column(name = "quantity_on_hand_total")
    private double quantityOnHandTotal;

    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;
}
