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
}
