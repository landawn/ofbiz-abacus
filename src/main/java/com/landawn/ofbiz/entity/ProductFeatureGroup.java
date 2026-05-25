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
@Table(name = "product_feature_group")
public class ProductFeatureGroup {
    @Id
    @Column(name = "product_feature_group_id")
    private String productFeatureGroupId;

    @Column(name = "description")
    private String description;
}
