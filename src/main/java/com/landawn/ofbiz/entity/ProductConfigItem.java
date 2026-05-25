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
@Table(name = "product_config_item")
public class ProductConfigItem {
    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Column(name = "config_item_type_id")
    private String configItemTypeId;

    @Column(name = "config_item_name")
    private String configItemName;

    @Column(name = "description")
    private String description;

    @Column(name = "long_description")
    private String longDescription;

    @Column(name = "image_url")
    private String imageUrl;
}
