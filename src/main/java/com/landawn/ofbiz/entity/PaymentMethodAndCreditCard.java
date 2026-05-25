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
@Table(name = "payment_method_and_credit_card")
public class PaymentMethodAndCreditCard {
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
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "card_type")
    private String cardType;

    @ReadOnly
    @Column(name = "card_number")
    private String cardNumber;

    @ReadOnly
    @Column(name = "expire_date")
    private String expireDate;

    @ReadOnly
    @Column(name = "company_name_on_card")
    private String companyNameOnCard;

    @ReadOnly
    @Column(name = "title_on_card")
    private String titleOnCard;

    @ReadOnly
    @Column(name = "first_name_on_card")
    private String firstNameOnCard;

    @ReadOnly
    @Column(name = "last_name_on_card")
    private String lastNameOnCard;

    @ReadOnly
    @Column(name = "suffix_on_card")
    private String suffixOnCard;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;
}
