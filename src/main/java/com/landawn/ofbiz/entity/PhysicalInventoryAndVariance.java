package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "physical_inventory_and_variance")
public class PhysicalInventoryAndVariance {
    @ReadOnly
    @Column(name = "physical_inventory_id")
    private String physicalInventoryId;

    @ReadOnly
    @Column(name = "physical_inventory_date")
    private Timestamp physicalInventoryDate;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "general_comments")
    private String generalComments;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "variance_reason_id")
    private String varianceReasonId;

    @ReadOnly
    @Column(name = "available_to_promise_var")
    private double availableToPromiseVar;

    @ReadOnly
    @Column(name = "quantity_on_hand_var")
    private double quantityOnHandVar;

    @ReadOnly
    @Column(name = "comments")
    private String comments;
}
