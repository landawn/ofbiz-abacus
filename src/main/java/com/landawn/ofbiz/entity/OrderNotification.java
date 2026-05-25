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
@Table(name = "order_notification")
public class OrderNotification {
    @Id
    @Column(name = "order_notification_id")
    private String orderNotificationId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "email_type")
    private String emailType;

    @Column(name = "comments")
    private String comments;

    @Column(name = "notification_date")
    private Timestamp notificationDate;
}
