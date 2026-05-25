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
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "payment_type_id")
    private String paymentTypeId;

    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "payment_gateway_response_id")
    private String paymentGatewayResponseId;

    @Column(name = "payment_preference_id")
    private String paymentPreferenceId;

    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Column(name = "party_id_to")
    private String partyIdTo;

    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "effective_date")
    private Timestamp effectiveDate;

    @Column(name = "payment_ref_num")
    private String paymentRefNum;

    @Column(name = "amount")
    private double amount;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "fin_account_trans_id")
    private String finAccountTransId;

    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @Column(name = "actual_currency_amount")
    private double actualCurrencyAmount;

    @Column(name = "actual_currency_uom_id")
    private String actualCurrencyUomId;
}
