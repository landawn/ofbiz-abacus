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
@Table(name = "product_feature")
public class ProductFeature {
    @Id
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "product_feature_type_id")
    private String productFeatureTypeId;

    @Column(name = "product_feature_category_id")
    private String productFeatureCategoryId;

    @Column(name = "description")
    private String description;

    @Column(name = "uom_id")
    private String uomId;

    @Column(name = "number_specified")
    private double numberSpecified;

    @Column(name = "default_amount")
    private double defaultAmount;

    @Column(name = "default_sequence_num")
    private double defaultSequenceNum;

    @Column(name = "abbrev")
    private String abbrev;

    @Column(name = "id_code")
    private String idCode;
}
