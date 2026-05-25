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
@Table(name = "shipment_gateway_fedex")
public class ShipmentGatewayFedex {
    @Id
    @Column(name = "shipment_gateway_config_id")
    private String shipmentGatewayConfigId;

    @Column(name = "connect_url")
    private String connectUrl;

    @Column(name = "connect_soap_url")
    private String connectSoapUrl;

    @Column(name = "connect_timeout")
    private double connectTimeout;

    @Column(name = "access_account_nbr")
    private String accessAccountNbr;

    @Column(name = "access_meter_number")
    private String accessMeterNumber;

    @Column(name = "access_user_key")
    private String accessUserKey;

    @Column(name = "access_user_pwd")
    private String accessUserPwd;

    @Column(name = "label_image_type")
    private String labelImageType;

    @Column(name = "default_dropoff_type")
    private String defaultDropoffType;

    @Column(name = "default_packaging_type")
    private String defaultPackagingType;

    @Column(name = "template_shipment")
    private String templateShipment;

    @Column(name = "template_subscription")
    private String templateSubscription;

    @Column(name = "rate_estimate_template")
    private String rateEstimateTemplate;

    @JoinedBy("shipmentGatewayConfigId=ShipmentGatewayConfig.shipmentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentGatewayConfig shipmentGatewayConfig;
}
