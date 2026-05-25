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
@Table(name = "shipment_contact_mech")
public class ShipmentContactMech {
    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_contact_mech_type_id")
    private String shipmentContactMechTypeId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @JoinedBy("shipmentId=Shipment.shipmentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Shipment shipment;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;

    @JoinedBy("shipmentContactMechTypeId=ShipmentContactMechType.shipmentContactMechTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentContactMechType shipmentContactMechType;
}
