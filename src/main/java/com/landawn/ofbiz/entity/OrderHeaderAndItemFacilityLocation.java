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
@Table(name = "order_header_and_item_facility_location")
public class OrderHeaderAndItemFacilityLocation {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @ReadOnly
    @Column(name = "location_type_enum_id")
    private String locationTypeEnumId;

    @ReadOnly
    @Column(name = "area_id")
    private String areaId;
}
