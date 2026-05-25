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
@Table(name = "work_effort_inv_res_and_item")
public class WorkEffortInvResAndItem {
    @ReadOnly
    @Column(name = "inventory_product_id")
    private String inventoryProductId;

    @ReadOnly
    @Column(name = "work_effort_parent_id")
    private String workEffortParentId;

    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "reserve_order_enum_id")
    private String reserveOrderEnumId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "quantity_not_available")
    private double quantityNotAvailable;

    @ReadOnly
    @Column(name = "reserved_datetime")
    private Timestamp reservedDatetime;

    @ReadOnly
    @Column(name = "created_datetime")
    private Timestamp createdDatetime;

    @ReadOnly
    @Column(name = "promised_datetime")
    private Timestamp promisedDatetime;

    @ReadOnly
    @Column(name = "current_promised_date")
    private Timestamp currentPromisedDate;

    @ReadOnly
    @Column(name = "sequence_id")
    private String sequenceId;

    @ReadOnly
    @Column(name = "inventory_item_type_id")
    private String inventoryItemTypeId;

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
    @Column(name = "unit_cost")
    private double unitCost;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;
}
