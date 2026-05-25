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
@Table(name = "payment_and_type")
public class PaymentAndType {
    @ReadOnly
    @Column(name = "payment_id")
    private String paymentId;

    @ReadOnly
    @Column(name = "payment_type_id")
    private String paymentTypeId;

    @ReadOnly
    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @ReadOnly
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @ReadOnly
    @Column(name = "payment_gateway_response_id")
    private String paymentGatewayResponseId;

    @ReadOnly
    @Column(name = "payment_preference_id")
    private String paymentPreferenceId;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "effective_date")
    private Timestamp effectiveDate;

    @ReadOnly
    @Column(name = "payment_ref_num")
    private String paymentRefNum;

    @ReadOnly
    @Column(name = "amount")
    private double amount;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "fin_account_trans_id")
    private String finAccountTransId;

    @ReadOnly
    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @ReadOnly
    @Column(name = "actual_currency_amount")
    private double actualCurrencyAmount;

    @ReadOnly
    @Column(name = "actual_currency_uom_id")
    private String actualCurrencyUomId;

    @ReadOnly
    @Column(name = "parent_type_id")
    private String parentTypeId;

    @ReadOnly
    @Column(name = "has_table")
    private String hasTable;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
