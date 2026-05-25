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
@Table(name = "product_store_telecom_setting")
public class ProductStoreTelecomSetting {
    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Id
    @Column(name = "telecom_method_type_id")
    private String telecomMethodTypeId;

    @Id
    @Column(name = "telecom_msg_type_enum_id")
    private String telecomMsgTypeEnumId;

    @Column(name = "telecom_custom_method_id")
    private String telecomCustomMethodId;

    @Column(name = "telecom_gateway_config_id")
    private String telecomGatewayConfigId;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("telecomMethodTypeId=TelecomMethodType.telecomMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TelecomMethodType telecomMethodType;

    @JoinedBy("telecomMsgTypeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("telecomGatewayConfigId=TelecomGatewayConfig.telecomGatewayConfigId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TelecomGatewayConfig telecomGatewayConfig;

    @JoinedBy("telecomCustomMethodId=CustomMethod.customMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomMethod customMethod;
}
