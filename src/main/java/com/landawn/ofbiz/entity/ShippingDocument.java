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
@Table(name = "shipping_document")
public class ShippingDocument {
    @Id
    @Column(name = "document_id")
    private String documentId;

    @Column(name = "shipment_id")
    private String shipmentId;

    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @Column(name = "description")
    private String description;

    @JoinedBy("documentId=Document.documentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Document document;

    @JoinedBy("shipmentId=ShipmentItem.shipmentId, shipmentItemSeqId=ShipmentItem.shipmentItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentItem shipmentItem;

    @JoinedBy("shipmentId=ShipmentPackage.shipmentId, shipmentPackageSeqId=ShipmentPackage.shipmentPackageSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentPackage shipmentPackage;
}
