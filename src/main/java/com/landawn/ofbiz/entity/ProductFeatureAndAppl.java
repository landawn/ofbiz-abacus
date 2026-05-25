package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_feature_and_appl")
public class ProductFeatureAndAppl {
    @ReadOnly
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @ReadOnly
    @Column(name = "product_feature_type_id")
    private String productFeatureTypeId;

    @ReadOnly
    @Column(name = "product_feature_category_id")
    private String productFeatureCategoryId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "uom_id")
    private String uomId;

    @ReadOnly
    @Column(name = "number_specified")
    private double numberSpecified;

    @ReadOnly
    @Column(name = "default_amount")
    private double defaultAmount;

    @ReadOnly
    @Column(name = "default_sequence_num")
    private double defaultSequenceNum;

    @ReadOnly
    @Column(name = "abbrev")
    private String abbrev;

    @ReadOnly
    @Column(name = "id_code")
    private String idCode;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_feature_appl_type_id")
    private String productFeatureApplTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "amount")
    private double amount;

    @ReadOnly
    @Column(name = "recurring_amount")
    private double recurringAmount;
}
