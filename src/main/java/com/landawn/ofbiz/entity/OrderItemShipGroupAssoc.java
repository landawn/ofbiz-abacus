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
@Table(name = "order_item_ship_group_assoc")
public class OrderItemShipGroupAssoc {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "cancel_quantity")
    private double cancelQuantity;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("orderId=OrderItem.orderId, orderItemSeqId=OrderItem.orderItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderItem orderItem;

    @JoinedBy("orderId=OrderItemShipGroup.orderId, shipGroupSeqId=OrderItemShipGroup.shipGroupSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderItemShipGroup orderItemShipGroup;
}
