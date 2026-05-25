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
@Table(name = "shipment_method_type")
public class ShipmentMethodType {
    @Id
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
