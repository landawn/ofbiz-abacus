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
@Table(name = "payment_gateway_clear_commerce")
public class PaymentGatewayClearCommerce {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "source_id")
    private String sourceId;

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "username")
    private String username;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "user_alias")
    private String userAlias;

    @Column(name = "effective_alias")
    private String effectiveAlias;

    @Column(name = "process_mode")
    private String processMode;

    @Column(name = "server_url")
    private String serverUrl;

    @Column(name = "enable_cvm")
    private String enableCvm;

    @JoinedBy("paymentGatewayConfigId=PaymentGatewayConfig.paymentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentGatewayConfig paymentGatewayConfig;
}
