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
@Table(name = "product_config_option_iactn")
public class ProductConfigOptionIactn {
    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "config_option_id")
    private String configOptionId;

    @Id
    @Column(name = "config_item_id_to")
    private String configItemIdTo;

    @Id
    @Column(name = "config_option_id_to")
    private String configOptionIdTo;

    @Id
    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "config_iactn_type_id")
    private String configIactnTypeId;

    @Column(name = "description")
    private String description;

    @JoinedBy("configItemId=ProductConfigItem.configItemId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigItem configItem;

    @JoinedBy("configItemId=ProductConfigOption.configItemId, configOptionId=ProductConfigOption.configOptionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigOption configItemProductConfigOption;

    @JoinedBy("configItemIdTo=ProductConfigItem.configItemId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigItem configItemTo;

    @JoinedBy("configItemIdTo=ProductConfigOption.configItemId, configOptionIdTo=ProductConfigOption.configOptionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductConfigOption configItemToProductConfigOption;
}
