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
@Table(name = "payment_gateway_secure_pay")
public class PaymentGatewaySecurePay {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "server_url")
    private String serverUrl;

    @Column(name = "process_timeout")
    private double processTimeout;

    @Column(name = "enable_amount_round")
    private String enableAmountRound;

    @JoinedBy("paymentGatewayConfigId=PaymentGatewayConfig.paymentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentGatewayConfig paymentGatewayConfig;
}
