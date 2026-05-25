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
@Table(name = "facility_carrier_shipment")
public class FacilityCarrierShipment {
    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("shipmentMethodTypeId=ShipmentMethodType.shipmentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentMethodType shipmentMethodType;

    @JoinedBy("shipmentMethodTypeId=CarrierShipmentMethod.shipmentMethodTypeId, partyId=CarrierShipmentMethod.partyId, roleTypeId=CarrierShipmentMethod.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CarrierShipmentMethod carrierShipmentMethod;
}
