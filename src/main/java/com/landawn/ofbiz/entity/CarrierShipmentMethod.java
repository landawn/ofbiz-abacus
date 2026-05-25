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
@Table(name = "carrier_shipment_method")
public class CarrierShipmentMethod {
    @Id
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "sequence_number")
    private double sequenceNumber;

    @Column(name = "carrier_service_code")
    private String carrierServiceCode;
}
