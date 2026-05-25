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
@Table(name = "payment_gateway_config")
public class PaymentGatewayConfig {
    @Id
    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "payment_gateway_config_type_id")
    private String paymentGatewayConfigTypeId;

    @Column(name = "description")
    private String description;
}
