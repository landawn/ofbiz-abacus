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
@Table(name = "product_feature_appl_type")
public class ProductFeatureApplType {
    @Id
    @Column(name = "product_feature_appl_type_id")
    private String productFeatureApplTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;

    @JoinedBy("parentTypeId=ProductFeatureApplType.productFeatureApplTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductFeatureApplType productFeatureApplType;
}
