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
@Table(name = "order_item_assoc")
public class OrderItemAssoc {
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
    @Column(name = "to_order_id")
    private String toOrderId;

    @Id
    @Column(name = "to_order_item_seq_id")
    private String toOrderItemSeqId;

    @Id
    @Column(name = "to_ship_group_seq_id")
    private String toShipGroupSeqId;

    @Id
    @Column(name = "order_item_assoc_type_id")
    private String orderItemAssocTypeId;

    @Column(name = "quantity")
    private double quantity;
}
