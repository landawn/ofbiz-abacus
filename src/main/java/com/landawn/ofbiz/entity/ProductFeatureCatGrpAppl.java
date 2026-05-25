package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "product_feature_cat_grp_appl")
public class ProductFeatureCatGrpAppl {
    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @Id
    @Column(name = "product_feature_group_id")
    private String productFeatureGroupId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("productCategoryId=ProductCategory.productCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductCategory productCategory;

    @JoinedBy("productFeatureGroupId=ProductFeatureGroup.productFeatureGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductFeatureGroup productFeatureGroup;
}
