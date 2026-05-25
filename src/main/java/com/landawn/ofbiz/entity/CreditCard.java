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
@Table(name = "credit_card")
public class CreditCard {
    @Id
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "valid_from_date")
    private String validFromDate;

    @Column(name = "expire_date")
    private String expireDate;

    @Column(name = "issue_number")
    private String issueNumber;

    @Column(name = "company_name_on_card")
    private String companyNameOnCard;

    @Column(name = "title_on_card")
    private String titleOnCard;

    @Column(name = "first_name_on_card")
    private String firstNameOnCard;

    @Column(name = "middle_name_on_card")
    private String middleNameOnCard;

    @Column(name = "last_name_on_card")
    private String lastNameOnCard;

    @Column(name = "suffix_on_card")
    private String suffixOnCard;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "consecutive_failed_auths")
    private double consecutiveFailedAuths;

    @Column(name = "last_failed_auth_date")
    private Timestamp lastFailedAuthDate;

    @Column(name = "consecutive_failed_nsf")
    private double consecutiveFailedNsf;

    @Column(name = "last_failed_nsf_date")
    private Timestamp lastFailedNsfDate;
}
