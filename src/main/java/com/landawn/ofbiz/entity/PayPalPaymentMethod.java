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
@Table(name = "pay_pal_payment_method")
public class PayPalPaymentMethod {
    @Id
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "payer_id")
    private String payerId;

    @Column(name = "express_checkout_token")
    private String expressCheckoutToken;

    @Column(name = "payer_status")
    private String payerStatus;

    @Column(name = "avs_addr")
    private String avsAddr;

    @Column(name = "avs_zip")
    private String avsZip;

    @Column(name = "correlation_id")
    private String correlationId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "transaction_id")
    private String transactionId;
}
