package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "invoice_and_appl_and_payment")
public class InvoiceAndApplAndPayment {
    @ReadOnly
    @Column(name = "invoice_id")
    private String invoiceId;

    @ReadOnly
    @Column(name = "invoice_type_id")
    private String invoiceTypeId;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "billing_account_id")
    private String billingAccountId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "invoice_date")
    private Timestamp invoiceDate;

    @ReadOnly
    @Column(name = "due_date")
    private Timestamp dueDate;

    @ReadOnly
    @Column(name = "paid_date")
    private Timestamp paidDate;

    @ReadOnly
    @Column(name = "invoice_message")
    private String invoiceMessage;

    @ReadOnly
    @Column(name = "reference_number")
    private String referenceNumber;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;

    @ReadOnly
    @Column(name = "payment_application_id")
    private String paymentApplicationId;

    @ReadOnly
    @Column(name = "payment_id")
    private String paymentId;

    @ReadOnly
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @ReadOnly
    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @ReadOnly
    @Column(name = "to_payment_id")
    private String toPaymentId;

    @ReadOnly
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @ReadOnly
    @Column(name = "amount_applied")
    private double amountApplied;

    @ReadOnly
    @Column(name = "pm_payment_id")
    private String pmPaymentId;

    @ReadOnly
    @Column(name = "pm_payment_type_id")
    private String pmPaymentTypeId;

    @ReadOnly
    @Column(name = "pm_payment_method_type_id")
    private String pmPaymentMethodTypeId;

    @ReadOnly
    @Column(name = "pm_payment_method_id")
    private String pmPaymentMethodId;

    @ReadOnly
    @Column(name = "pm_payment_gateway_response_id")
    private String pmPaymentGatewayResponseId;

    @ReadOnly
    @Column(name = "pm_payment_preference_id")
    private String pmPaymentPreferenceId;

    @ReadOnly
    @Column(name = "pm_party_id_from")
    private String pmPartyIdFrom;

    @ReadOnly
    @Column(name = "pm_party_id_to")
    private String pmPartyIdTo;

    @ReadOnly
    @Column(name = "pm_role_type_id_to")
    private String pmRoleTypeIdTo;

    @ReadOnly
    @Column(name = "pm_status_id")
    private String pmStatusId;

    @ReadOnly
    @Column(name = "pm_effective_date")
    private String pmEffectiveDate;

    @ReadOnly
    @Column(name = "pm_payment_ref_num")
    private String pmPaymentRefNum;

    @ReadOnly
    @Column(name = "pm_amount")
    private String pmAmount;

    @ReadOnly
    @Column(name = "pm_currency_uom_id")
    private String pmCurrencyUomId;

    @ReadOnly
    @Column(name = "pm_comments")
    private String pmComments;

    @ReadOnly
    @Column(name = "pm_fin_account_trans_id")
    private String pmFinAccountTransId;

    @ReadOnly
    @Column(name = "pm_override_gl_account_id")
    private String pmOverrideGlAccountId;

    @ReadOnly
    @Column(name = "pm_actual_currency_amount")
    private String pmActualCurrencyAmount;

    @ReadOnly
    @Column(name = "pm_actual_currency_uom_id")
    private String pmActualCurrencyUomId;
}
