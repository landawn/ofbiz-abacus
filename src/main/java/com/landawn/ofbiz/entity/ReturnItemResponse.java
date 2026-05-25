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
@Table(name = "return_item_response")
public class ReturnItemResponse {
    @Id
    @Column(name = "return_item_response_id")
    private String returnItemResponseId;

    @Column(name = "order_payment_preference_id")
    private String orderPaymentPreferenceId;

    @Column(name = "replacement_order_id")
    private String replacementOrderId;

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "billing_account_id")
    private String billingAccountId;

    @Column(name = "fin_account_trans_id")
    private String finAccountTransId;

    @Column(name = "response_amount")
    private double responseAmount;

    @Column(name = "response_date")
    private Timestamp responseDate;

    @JoinedBy("orderPaymentPreferenceId=OrderPaymentPreference.orderPaymentPreferenceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderPaymentPreference orderPaymentPreference;

    @JoinedBy("replacementOrderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("paymentId=Payment.paymentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Payment payment;

    @JoinedBy("billingAccountId=BillingAccount.billingAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BillingAccount billingAccount;

    @JoinedBy("finAccountTransId=FinAccountTrans.finAccountTransId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccountTrans finAccountTrans;
}
