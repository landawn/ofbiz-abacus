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
@Table(name = "product_feature_iactn")
public class ProductFeatureIactn {
    @Id
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Id
    @Column(name = "product_feature_id_to")
    private String productFeatureIdTo;

    @Column(name = "product_feature_iactn_type_id")
    private String productFeatureIactnTypeId;

    @Column(name = "product_id")
    private String productId;
}
