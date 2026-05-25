package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

    @JoinedBy("physicalInventoryId=PhysicalInventory.physicalInventoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PhysicalInventory physicalInventory;

    @JoinedBy("varianceReasonId=VarianceReason.varianceReasonId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private VarianceReason varianceReason;

    @JoinedBy("inventoryItemId=InventoryItem.inventoryItemId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItem inventoryItem;
}
