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
@Table(name = "shipment_gateway_dhl")
public class ShipmentGatewayDhl {
    @Id
    @Column(name = "shipment_gateway_config_id")
    private String shipmentGatewayConfigId;

    @Column(name = "connect_url")
    private String connectUrl;

    @Column(name = "connect_timeout")
    private double connectTimeout;

    @Column(name = "head_version")
    private String headVersion;

    @Column(name = "head_action")
    private String headAction;

    @Column(name = "access_user_id")
    private String accessUserId;

    @Column(name = "access_password")
    private String accessPassword;

    @Column(name = "access_account_nbr")
    private String accessAccountNbr;

    @Column(name = "access_shipping_key")
    private String accessShippingKey;

    @Column(name = "label_image_format")
    private String labelImageFormat;

    @Column(name = "rate_estimate_template")
    private String rateEstimateTemplate;
}
