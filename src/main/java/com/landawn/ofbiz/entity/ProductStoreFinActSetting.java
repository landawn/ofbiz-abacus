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
@Table(name = "product_store_fin_act_setting")
public class ProductStoreFinActSetting {
    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Id
    @Column(name = "fin_account_type_id")
    private String finAccountTypeId;

    @Column(name = "require_pin_code")
    private String requirePinCode;

    @Column(name = "validate_gcfin_acct")
    private String validateGcfinAcct;

    @Column(name = "account_code_length")
    private double accountCodeLength;

    @Column(name = "pin_code_length")
    private double pinCodeLength;

    @Column(name = "account_valid_days")
    private double accountValidDays;

    @Column(name = "auth_valid_days")
    private double authValidDays;

    @Column(name = "purchase_survey_id")
    private String purchaseSurveyId;

    @Column(name = "purch_survey_send_to")
    private String purchSurveySendTo;

    @Column(name = "purch_survey_copy_me")
    private String purchSurveyCopyMe;

    @Column(name = "allow_auth_to_negative")
    private String allowAuthToNegative;

    @Column(name = "min_balance")
    private double minBalance;

    @Column(name = "replenish_threshold")
    private double replenishThreshold;

    @Column(name = "replenish_method_enum_id")
    private String replenishMethodEnumId;
}
