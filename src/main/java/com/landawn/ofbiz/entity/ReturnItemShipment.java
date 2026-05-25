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
@Table(name = "return_item_shipment")
public class ReturnItemShipment {
    @Id
    @Column(name = "return_id")
    private String returnId;

    @Id
    @Column(name = "return_item_seq_id")
    private String returnItemSeqId;

    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Column(name = "quantity")
    private double quantity;

    @JoinedBy("returnId=ReturnHeader.returnId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnHeader returnHeader;

    @JoinedBy("returnId=ReturnItem.returnId, returnItemSeqId=ReturnItem.returnItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnItem returnItem;

    @JoinedBy("shipmentId=Shipment.shipmentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Shipment shipment;

    @JoinedBy("shipmentId=ShipmentItem.shipmentId, shipmentItemSeqId=ShipmentItem.shipmentItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentItem shipmentItem;
}
