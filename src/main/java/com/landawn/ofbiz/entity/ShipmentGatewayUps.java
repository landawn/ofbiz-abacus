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
@Table(name = "shipment_gateway_ups")
public class ShipmentGatewayUps {
    @Id
    @Column(name = "shipment_gateway_config_id")
    private String shipmentGatewayConfigId;

    @Column(name = "connect_url")
    private String connectUrl;

    @Column(name = "connect_timeout")
    private double connectTimeout;

    @Column(name = "shipper_number")
    private String shipperNumber;

    @Column(name = "bill_shipper_account_number")
    private String billShipperAccountNumber;

    @Column(name = "access_license_number")
    private String accessLicenseNumber;

    @Column(name = "access_user_id")
    private String accessUserId;

    @Column(name = "access_password")
    private String accessPassword;

    @Column(name = "save_cert_info")
    private String saveCertInfo;

    @Column(name = "save_cert_path")
    private String saveCertPath;

    @Column(name = "shipper_pickup_type")
    private String shipperPickupType;

    @Column(name = "customer_classification")
    private String customerClassification;

    @Column(name = "max_estimate_weight")
    private double maxEstimateWeight;

    @Column(name = "min_estimate_weight")
    private double minEstimateWeight;

    @Column(name = "cod_allow_cod")
    private String codAllowCod;

    @Column(name = "cod_surcharge_amount")
    private double codSurchargeAmount;

    @Column(name = "cod_surcharge_currency_uom_id")
    private String codSurchargeCurrencyUomId;

    @Column(name = "cod_surcharge_apply_to_package")
    private String codSurchargeApplyToPackage;

    @Column(name = "cod_funds_code")
    private String codFundsCode;

    @Column(name = "default_return_label_memo")
    private String defaultReturnLabelMemo;

    @Column(name = "default_return_label_subject")
    private String defaultReturnLabelSubject;

    @JoinedBy("shipmentGatewayConfigId=ShipmentGatewayConfig.shipmentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentGatewayConfig shipmentGatewayConfig;
}
