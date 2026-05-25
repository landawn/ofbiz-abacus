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
@Table(name = "inventory_item_detail_for_sum")
public class InventoryItemDetailForSum {
    @ReadOnly
    @Column(name = "quantity_on_hand_sum")
    private String quantityOnHandSum;

    @ReadOnly
    @Column(name = "accounting_quantity_sum")
    private String accountingQuantitySum;

    @ReadOnly
    @Column(name = "inventory_item_type_id")
    private String inventoryItemTypeId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "unit_cost")
    private double unitCost;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "effective_date")
    private Timestamp effectiveDate;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @ReadOnly
    @Column(name = "quantity_on_hand_diff")
    private double quantityOnHandDiff;

    @ReadOnly
    @Column(name = "accounting_quantity_diff")
    private double accountingQuantityDiff;
}
