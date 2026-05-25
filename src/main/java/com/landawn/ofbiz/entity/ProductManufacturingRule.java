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
@Table(name = "product_manufacturing_rule")
public class ProductManufacturingRule {
    @Id
    @Column(name = "rule_id")
    private String ruleId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_id_for")
    private String productIdFor;

    @Column(name = "product_id_in")
    private String productIdIn;

    @Column(name = "rule_seq_id")
    private String ruleSeqId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "product_id_in_subst")
    private String productIdInSubst;

    @Column(name = "product_feature")
    private String productFeature;

    @Column(name = "rule_operator")
    private String ruleOperator;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "description")
    private String description;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("productIdFor=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product productFor;

    @JoinedBy("productIdIn=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product productIn;

    @JoinedBy("productIdInSubst=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product productInSubst;

    @JoinedBy("productFeature=ProductFeature.productFeatureId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductFeature productFeatureProductFeature;
}
