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
@Table(name = "shipment_gateway_config")
public class ShipmentGatewayConfig {
    @Id
    @Column(name = "shipment_gateway_config_id")
    private String shipmentGatewayConfigId;

    @Column(name = "shipment_gateway_conf_type_id")
    private String shipmentGatewayConfTypeId;

    @Column(name = "description")
    private String description;
}
