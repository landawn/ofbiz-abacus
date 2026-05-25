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
@Table(name = "inventory_item_and_detail")
public class InventoryItemAndDetail {
    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "inventory_item_type_id")
    private String inventoryItemTypeId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "datetime_received")
    private Timestamp datetimeReceived;

    @ReadOnly
    @Column(name = "datetime_manufactured")
    private Timestamp datetimeManufactured;

    @ReadOnly
    @Column(name = "expire_date")
    private String expireDate;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "container_id")
    private String containerId;

    @ReadOnly
    @Column(name = "lot_id")
    private String lotId;

    @ReadOnly
    @Column(name = "uom_id")
    private String uomId;

    @ReadOnly
    @Column(name = "bin_number")
    private String binNumber;

    @ReadOnly
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "quantity_on_hand_total")
    private double quantityOnHandTotal;

    @ReadOnly
    @Column(name = "available_to_promise_total")
    private double availableToPromiseTotal;

    @ReadOnly
    @Column(name = "accounting_quantity_total")
    private double accountingQuantityTotal;

    @ReadOnly
    @Column(name = "serial_number")
    private String serialNumber;

    @ReadOnly
    @Column(name = "soft_identifier")
    private String softIdentifier;

    @ReadOnly
    @Column(name = "activation_number")
    private String activationNumber;

    @ReadOnly
    @Column(name = "activation_valid_thru")
    private Timestamp activationValidThru;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "inventory_item_fixed_asset_id")
    private String inventoryItemFixedAssetId;

    @ReadOnly
    @Column(name = "inventory_item_detail_seq_id")
    private String inventoryItemDetailSeqId;

    @ReadOnly
    @Column(name = "effective_date")
    private Timestamp effectiveDate;

    @ReadOnly
    @Column(name = "quantity_on_hand_diff")
    private double quantityOnHandDiff;

    @ReadOnly
    @Column(name = "available_to_promise_diff")
    private double availableToPromiseDiff;

    @ReadOnly
    @Column(name = "accounting_quantity_diff")
    private double accountingQuantityDiff;

    @ReadOnly
    @Column(name = "unit_cost")
    private double unitCost;

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
    @Column(name = "shipment_id")
    private String shipmentId;

    @ReadOnly
    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @ReadOnly
    @Column(name = "return_id")
    private String returnId;

    @ReadOnly
    @Column(name = "return_item_seq_id")
    private String returnItemSeqId;

    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @ReadOnly
    @Column(name = "maint_hist_seq_id")
    private String maintHistSeqId;

    @ReadOnly
    @Column(name = "item_issuance_id")
    private String itemIssuanceId;

    @ReadOnly
    @Column(name = "receipt_id")
    private String receiptId;

    @ReadOnly
    @Column(name = "physical_inventory_id")
    private String physicalInventoryId;

    @ReadOnly
    @Column(name = "reason_enum_id")
    private String reasonEnumId;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
