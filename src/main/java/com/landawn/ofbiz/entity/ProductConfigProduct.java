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
@Table(name = "product_config_product")
public class ProductConfigProduct {
    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "config_option_id")
    private String configOptionId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @JoinedBy("configItemId=ProductConfigItem.configItemId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigItem productConfigItem;

    @JoinedBy("configItemId=ProductConfigOption.configItemId, configOptionId=ProductConfigOption.configOptionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigOption productConfigOption;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;
}
