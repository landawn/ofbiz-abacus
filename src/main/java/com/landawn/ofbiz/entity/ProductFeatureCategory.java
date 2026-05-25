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
@Table(name = "product_feature_category")
public class ProductFeatureCategory {
    @Id
    @Column(name = "product_feature_category_id")
    private String productFeatureCategoryId;

    @Column(name = "parent_category_id")
    private String parentCategoryId;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentCategoryId=ProductFeatureCategory.productFeatureCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductFeatureCategory productFeatureCategory;
}
