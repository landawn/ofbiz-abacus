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
@Table(name = "telecom_gateway_config")
public class TelecomGatewayConfig {
    @Id
    @Column(name = "telecom_gateway_config_id")
    private String telecomGatewayConfigId;

    @Column(name = "description")
    private String description;
}
