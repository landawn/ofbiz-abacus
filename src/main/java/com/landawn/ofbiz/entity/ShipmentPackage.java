package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "shipment_package")
public class ShipmentPackage {
    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @Column(name = "shipment_box_type_id")
    private String shipmentBoxTypeId;

    @Column(name = "date_created")
    private Timestamp dateCreated;

    @Column(name = "box_length")
    private double boxLength;

    @Column(name = "box_height")
    private double boxHeight;

    @Column(name = "box_width")
    private double boxWidth;

    @Column(name = "dimension_uom_id")
    private String dimensionUomId;

    @Column(name = "weight")
    private double weight;

    @Column(name = "weight_uom_id")
    private String weightUomId;

    @Column(name = "insured_value")
    private double insuredValue;

    @JoinedBy("shipmentId=Shipment.shipmentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Shipment shipment;

    @JoinedBy("shipmentBoxTypeId=ShipmentBoxType.shipmentBoxTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentBoxType shipmentBoxType;

    @JoinedBy("dimensionUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom dimensionUom;

    @JoinedBy("weightUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom weightUom;
}
