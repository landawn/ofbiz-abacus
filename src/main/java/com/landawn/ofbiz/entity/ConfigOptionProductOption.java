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
@Table(name = "config_option_product_option")
public class ConfigOptionProductOption {
    @Id
    @Column(name = "config_id")
    private String configId;

    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "sequence_num")
    private double sequenceNum;

    @Id
    @Column(name = "config_option_id")
    private String configOptionId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_option_id")
    private String productOptionId;

    @Column(name = "description")
    private String description;

    @JoinedBy("configId=ProductConfigConfig.configId, configItemId=ProductConfigConfig.configItemId, configOptionId=ProductConfigConfig.configOptionId, sequenceNum=ProductConfigConfig.sequenceNum")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigConfig productConfigConfig;

    @JoinedBy("configItemId=ProductConfigProduct.configItemId, configOptionId=ProductConfigProduct.configOptionId, productId=ProductConfigProduct.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigProduct productConfigProduct;
}
