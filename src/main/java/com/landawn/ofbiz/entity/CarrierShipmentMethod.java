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

    @JoinedBy("shipmentMethodTypeId=ShipmentMethodType.shipmentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentMethodType shipmentMethodType;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("partyId=PartyRole.partyId, roleTypeId=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyRole;
}
