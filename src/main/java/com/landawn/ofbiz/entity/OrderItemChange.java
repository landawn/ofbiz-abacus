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
@Table(name = "order_item_change")
public class OrderItemChange {
    @Id
    @Column(name = "order_item_change_id")
    private String orderItemChangeId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "change_type_enum_id")
    private String changeTypeEnumId;

    @Column(name = "change_datetime")
    private Timestamp changeDatetime;

    @Column(name = "change_user_login")
    private String changeUserLogin;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "cancel_quantity")
    private double cancelQuantity;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "reason_enum_id")
    private String reasonEnumId;

    @Column(name = "change_comments")
    private String changeComments;
}
