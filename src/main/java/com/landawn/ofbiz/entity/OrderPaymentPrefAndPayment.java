package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_payment_pref_and_payment")
public class OrderPaymentPrefAndPayment {
    @ReadOnly
    @Column(name = "order_payment_preference_id")
    private String orderPaymentPreferenceId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "payment_id")
    private String paymentId;

    @ReadOnly
    @Column(name = "payment_type_id")
    private String paymentTypeId;

    @ReadOnly
    @Column(name = "amount")
    private double amount;
}
