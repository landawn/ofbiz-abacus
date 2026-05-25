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
@Table(name = "shipment_box_type")
public class ShipmentBoxType {
    @Id
    @Column(name = "shipment_box_type_id")
    private String shipmentBoxTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "dimension_uom_id")
    private String dimensionUomId;

    @Column(name = "box_length")
    private double boxLength;

    @Column(name = "box_width")
    private double boxWidth;

    @Column(name = "box_height")
    private double boxHeight;

    @Column(name = "weight_uom_id")
    private String weightUomId;

    @Column(name = "box_weight")
    private double boxWeight;

    @JoinedBy("dimensionUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom dimensionUom;

    @JoinedBy("weightUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom weightUom;
}
