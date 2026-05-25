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
@Table(name = "payment_application")
public class PaymentApplication {
    @Id
    @Column(name = "payment_application_id")
    private String paymentApplicationId;

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "invoice_id")
    private String invoiceId;

    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Column(name = "billing_account_id")
    private String billingAccountId;

    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @Column(name = "to_payment_id")
    private String toPaymentId;

    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Column(name = "amount_applied")
    private double amountApplied;

    @JoinedBy("paymentId=Payment.paymentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Payment payment;

    @JoinedBy("invoiceId=Invoice.invoiceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Invoice invoice;

    @JoinedBy("billingAccountId=BillingAccount.billingAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BillingAccount billingAccount;

    @JoinedBy("toPaymentId=Payment.paymentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Payment toPayment;

    @JoinedBy("taxAuthGeoId=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geo;

    @JoinedBy("overrideGlAccountId=GlAccount.glAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccount glAccount;
}
