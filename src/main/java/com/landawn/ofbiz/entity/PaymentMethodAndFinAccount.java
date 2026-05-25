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
@Table(name = "payment_method_and_fin_account")
public class PaymentMethodAndFinAccount {
    @ReadOnly
    @Column(name = "fin_account_id")
    private String finAccountId;

    @ReadOnly
    @Column(name = "fin_account_type_id")
    private String finAccountTypeId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "fin_account_name")
    private String finAccountName;

    @ReadOnly
    @Column(name = "fin_account_code")
    private String finAccountCode;

    @ReadOnly
    @Column(name = "fin_account_pin")
    private String finAccountPin;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @ReadOnly
    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @ReadOnly
    @Column(name = "post_to_gl_account_id")
    private String postToGlAccountId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "is_refundable")
    private String isRefundable;

    @ReadOnly
    @Column(name = "replenish_payment_id")
    private String replenishPaymentId;

    @ReadOnly
    @Column(name = "replenish_level")
    private double replenishLevel;

    @ReadOnly
    @Column(name = "actual_balance")
    private double actualBalance;

    @ReadOnly
    @Column(name = "available_balance")
    private double availableBalance;

    @ReadOnly
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @ReadOnly
    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "gl_account_id")
    private String glAccountId;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
