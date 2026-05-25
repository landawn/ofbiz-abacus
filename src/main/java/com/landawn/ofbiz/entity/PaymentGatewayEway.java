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
@Table(name = "payment_gateway_eway")
public class PaymentGatewayEway {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "refund_pwd")
    private String refundPwd;

    @Column(name = "test_mode")
    private String testMode;

    @Column(name = "enable_cvn")
    private String enableCvn;

    @Column(name = "enable_beagle")
    private String enableBeagle;

    @JoinedBy("paymentGatewayConfigId=PaymentGatewayConfig.paymentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentGatewayConfig paymentGatewayConfig;
}
