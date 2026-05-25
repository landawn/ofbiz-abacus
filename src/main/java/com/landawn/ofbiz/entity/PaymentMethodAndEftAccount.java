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
@Table(name = "payment_method_and_eft_account")
public class PaymentMethodAndEftAccount {
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
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "bank_name")
    private String bankName;

    @ReadOnly
    @Column(name = "routing_number")
    private String routingNumber;

    @ReadOnly
    @Column(name = "account_type")
    private String accountType;

    @ReadOnly
    @Column(name = "account_number")
    private String accountNumber;

    @ReadOnly
    @Column(name = "name_on_account")
    private String nameOnAccount;

    @ReadOnly
    @Column(name = "company_name_on_account")
    private String companyNameOnAccount;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "years_at_bank")
    private double yearsAtBank;
}
