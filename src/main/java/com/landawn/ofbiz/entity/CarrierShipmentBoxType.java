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
@Table(name = "carrier_shipment_box_type")
public class CarrierShipmentBoxType {
    @Id
    @Column(name = "shipment_box_type_id")
    private String shipmentBoxTypeId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "packaging_type_code")
    private String packagingTypeCode;

    @Column(name = "oversize_code")
    private String oversizeCode;
}
