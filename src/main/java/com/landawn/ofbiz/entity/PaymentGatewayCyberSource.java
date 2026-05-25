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
@Table(name = "payment_gateway_cyber_source")
public class PaymentGatewayCyberSource {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "api_version")
    private String apiVersion;

    @Column(name = "production")
    private String production;

    @Column(name = "keys_dir")
    private String keysDir;

    @Column(name = "keys_file")
    private String keysFile;

    @Column(name = "log_enabled")
    private String logEnabled;

    @Column(name = "log_dir")
    private String logDir;

    @Column(name = "log_file")
    private String logFile;

    @Column(name = "log_size")
    private double logSize;

    @Column(name = "merchant_descr")
    private String merchantDescr;

    @Column(name = "merchant_contact")
    private String merchantContact;

    @Column(name = "auto_bill")
    private String autoBill;

    @Column(name = "enable_dav")
    private String enableDav;

    @Column(name = "fraud_score")
    private String fraudScore;

    @Column(name = "ignore_avs")
    private String ignoreAvs;

    @Column(name = "disable_bill_avs")
    private String disableBillAvs;

    @Column(name = "avs_decline_codes")
    private String avsDeclineCodes;

    @JoinedBy("paymentGatewayConfigId=PaymentGatewayConfig.paymentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentGatewayConfig paymentGatewayConfig;
}
