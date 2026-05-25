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
@Table(name = "inventory_item_variance")
public class InventoryItemVariance {
    @Id
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Id
    @Column(name = "physical_inventory_id")
    private String physicalInventoryId;

    @Column(name = "variance_reason_id")
    private String varianceReasonId;

    @Column(name = "available_to_promise_var")
    private double availableToPromiseVar;

    @Column(name = "quantity_on_hand_var")
    private double quantityOnHandVar;

    @Column(name = "comments")
    private String comments;
}
