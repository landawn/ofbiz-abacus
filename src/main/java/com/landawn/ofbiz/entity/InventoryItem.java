package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "inventory_item")
public class InventoryItem {
    @Id
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "inventory_item_type_id")
    private String inventoryItemTypeId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "datetime_received")
    private Timestamp datetimeReceived;

    @Column(name = "datetime_manufactured")
    private Timestamp datetimeManufactured;

    @Column(name = "expire_date")
    private Timestamp expireDate;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "container_id")
    private String containerId;

    @Column(name = "lot_id")
    private String lotId;

    @Column(name = "uom_id")
    private String uomId;

    @Column(name = "bin_number")
    private String binNumber;

    @Column(name = "location_seq_id")
    private String locationSeqId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "quantity_on_hand_total")
    private double quantityOnHandTotal;

    @Column(name = "available_to_promise_total")
    private double availableToPromiseTotal;

    @Column(name = "accounting_quantity_total")
    private double accountingQuantityTotal;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "soft_identifier")
    private String softIdentifier;

    @Column(name = "activation_number")
    private String activationNumber;

    @Column(name = "activation_valid_thru")
    private Timestamp activationValidThru;

    @Column(name = "unit_cost")
    private double unitCost;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @JoinedBy("inventoryItemTypeId=InventoryItemType.inventoryItemTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItemType inventoryItemType;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("ownerPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party ownerParty;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("containerId=Container.containerId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Container container;

    @JoinedBy("lotId=Lot.lotId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Lot lot;

    @JoinedBy("uomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom currencyUom;

    @JoinedBy("fixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;
}
