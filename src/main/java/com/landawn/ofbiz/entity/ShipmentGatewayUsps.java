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
@Table(name = "shipment_gateway_usps")
public class ShipmentGatewayUsps {
    @Id
    @Column(name = "shipment_gateway_config_id")
    private String shipmentGatewayConfigId;

    @Column(name = "connect_url")
    private String connectUrl;

    @Column(name = "connect_url_labels")
    private String connectUrlLabels;

    @Column(name = "connect_timeout")
    private double connectTimeout;

    @Column(name = "access_user_id")
    private String accessUserId;

    @Column(name = "access_password")
    private String accessPassword;

    @Column(name = "max_estimate_weight")
    private double maxEstimateWeight;

    @Column(name = "test")
    private String test;
}
