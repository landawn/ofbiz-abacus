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
@Table(name = "shipment_package_content")
public class ShipmentPackageContent {
    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @Id
    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "sub_product_id")
    private String subProductId;

    @Column(name = "sub_product_quantity")
    private double subProductQuantity;

    @JoinedBy("shipmentId=ShipmentPackage.shipmentId, shipmentPackageSeqId=ShipmentPackage.shipmentPackageSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentPackage shipmentPackage;

    @JoinedBy("shipmentId=ShipmentItem.shipmentId, shipmentItemSeqId=ShipmentItem.shipmentItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentItem shipmentItem;

    @JoinedBy("subProductId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;
}
