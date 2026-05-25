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

    @JoinedBy("orderId=OrderItem.orderId, orderItemSeqId=OrderItem.orderItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderItem orderItem;

    @JoinedBy("changeTypeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration changeTypeEnum;

    @JoinedBy("reasonEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration reasonEnum;

    @JoinedBy("changeUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;
}
