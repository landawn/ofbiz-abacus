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
@Table(name = "product_store_payment_setting")
public class ProductStorePaymentSetting {
    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Id
    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Id
    @Column(name = "payment_service_type_enum_id")
    private String paymentServiceTypeEnumId;

    @Column(name = "payment_service")
    private String paymentService;

    @Column(name = "payment_custom_method_id")
    private String paymentCustomMethodId;

    @Column(name = "payment_gateway_config_id")
    private String paymentGatewayConfigId;

    @Column(name = "payment_properties_path")
    private String paymentPropertiesPath;

    @Column(name = "apply_to_all_products")
    private String applyToAllProducts;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("paymentMethodTypeId=PaymentMethodType.paymentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentMethodType paymentMethodType;

    @JoinedBy("paymentServiceTypeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("paymentGatewayConfigId=PaymentGatewayConfig.paymentGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentGatewayConfig paymentGatewayConfig;

    @JoinedBy("paymentCustomMethodId=CustomMethod.customMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomMethod customMethod;
}
