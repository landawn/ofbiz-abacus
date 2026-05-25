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
@Table(name = "product_store_vendor_shipment")
public class ProductStoreVendorShipment {
    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Id
    @Column(name = "vendor_party_id")
    private String vendorPartyId;

    @Id
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Id
    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("vendorPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party vendorParty;

    @JoinedBy("shipmentMethodTypeId=ShipmentMethodType.shipmentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentMethodType shipmentMethodType;

    @JoinedBy("carrierPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party carrierParty;
}
