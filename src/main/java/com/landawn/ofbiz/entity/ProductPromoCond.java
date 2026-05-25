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
@Table(name = "product_promo_cond")
public class ProductPromoCond {
    @Id
    @Column(name = "product_promo_id")
    private String productPromoId;

    @Id
    @Column(name = "product_promo_rule_id")
    private String productPromoRuleId;

    @Id
    @Column(name = "product_promo_cond_seq_id")
    private String productPromoCondSeqId;

    @Column(name = "custom_method_id")
    private String customMethodId;

    @Column(name = "input_param_enum_id")
    private String inputParamEnumId;

    @Column(name = "operator_enum_id")
    private String operatorEnumId;

    @Column(name = "cond_value")
    private String condValue;

    @Column(name = "other_value")
    private String otherValue;

    @JoinedBy("productPromoId=ProductPromo.productPromoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPromo productPromo;

    @JoinedBy("productPromoId=ProductPromoRule.productPromoId, productPromoRuleId=ProductPromoRule.productPromoRuleId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPromoRule productPromoRule;

    @JoinedBy("customMethodId=CustomMethod.customMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomMethod customMethod;

    @JoinedBy("inputParamEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration inputParamEnum;

    @JoinedBy("operatorEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration operatorEnum;
}
