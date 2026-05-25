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
}
