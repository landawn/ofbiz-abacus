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
@Table(name = "product_price_cond")
public class ProductPriceCond {
    @Id
    @Column(name = "product_price_rule_id")
    private String productPriceRuleId;

    @Id
    @Column(name = "product_price_cond_seq_id")
    private String productPriceCondSeqId;

    @Column(name = "input_param_enum_id")
    private String inputParamEnumId;

    @Column(name = "operator_enum_id")
    private String operatorEnumId;

    @Column(name = "cond_value")
    private String condValue;

    @JoinedBy("productPriceRuleId=ProductPriceRule.productPriceRuleId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPriceRule productPriceRule;

    @JoinedBy("inputParamEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration inputParamEnum;

    @JoinedBy("operatorEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration operatorEnum;
}
