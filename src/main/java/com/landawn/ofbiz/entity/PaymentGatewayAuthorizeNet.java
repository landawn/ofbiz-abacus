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
@Table(name = "payment_gateway_authorize_net")
public class PaymentGatewayAuthorizeNet {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "transaction_url")
    private String transactionUrl;

    @Column(name = "certificate_alias")
    private String certificateAlias;

    @Column(name = "api_version")
    private String apiVersion;

    @Column(name = "delimited_data")
    private String delimitedData;

    @Column(name = "delimiter_char")
    private String delimiterChar;

    @Column(name = "cp_version")
    private String cpVersion;

    @Column(name = "cp_market_type")
    private String cpMarketType;

    @Column(name = "cp_device_type")
    private String cpDeviceType;

    @Column(name = "method")
    private String method;

    @Column(name = "email_customer")
    private String emailCustomer;

    @Column(name = "email_merchant")
    private String emailMerchant;

    @Column(name = "test_mode")
    private String testMode;

    @Column(name = "relay_response")
    private String relayResponse;

    @Column(name = "tran_key")
    private String tranKey;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "trans_description")
    private String transDescription;

    @Column(name = "duplicate_window")
    private double duplicateWindow;

    @JoinedBy("paymentGatewayConfigId=PaymentGatewayConfig.paymentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentGatewayConfig paymentGatewayConfig;
}
