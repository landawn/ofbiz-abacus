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
@Table(name = "order_status")
public class OrderStatus {
    @Id
    @Column(name = "order_status_id")
    private String orderStatusId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "order_payment_preference_id")
    private String orderPaymentPreferenceId;

    @Column(name = "status_datetime")
    private Timestamp statusDatetime;

    @Column(name = "status_user_login")
    private String statusUserLogin;

    @Column(name = "change_reason")
    private String changeReason;
}
