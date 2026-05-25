package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_item_ship_grp_inv_res")
public class OrderItemShipGrpInvRes {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "reserve_order_enum_id")
    private String reserveOrderEnumId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "quantity_not_available")
    private double quantityNotAvailable;

    @Column(name = "reserved_datetime")
    private Timestamp reservedDatetime;

    @Column(name = "created_datetime")
    private Timestamp createdDatetime;

    @Column(name = "promised_datetime")
    private Timestamp promisedDatetime;

    @Column(name = "current_promised_date")
    private Timestamp currentPromisedDate;

    @Column(name = "priority")
    private String priority;

    @Column(name = "sequence_id")
    private double sequenceId;
}
