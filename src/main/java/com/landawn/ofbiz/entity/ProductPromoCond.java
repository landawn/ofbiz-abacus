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
}
