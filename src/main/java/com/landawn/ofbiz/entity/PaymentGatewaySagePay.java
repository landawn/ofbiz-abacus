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
@Table(name = "payment_gateway_sage_pay")
public class PaymentGatewaySagePay {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "production_host")
    private String productionHost;

    @Column(name = "testing_host")
    private String testingHost;

    @Column(name = "sage_pay_mode")
    private String sagePayMode;

    @Column(name = "protocol_version")
    private String protocolVersion;

    @Column(name = "authentication_trans_type")
    private String authenticationTransType;

    @Column(name = "authentication_url")
    private String authenticationUrl;

    @Column(name = "authorise_trans_type")
    private String authoriseTransType;

    @Column(name = "authorise_url")
    private String authoriseUrl;

    @Column(name = "release_trans_type")
    private String releaseTransType;

    @Column(name = "release_url")
    private String releaseUrl;

    @Column(name = "void_url")
    private String voidUrl;

    @Column(name = "refund_url")
    private String refundUrl;
}
