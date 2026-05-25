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
@Table(name = "order_shipment")
public class OrderShipment {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Column(name = "quantity")
    private double quantity;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("shipmentId=Shipment.shipmentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Shipment shipment;
}
