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
@Table(name = "product_promo_category")
public class ProductPromoCategory {
    @Id
    @Column(name = "product_promo_id")
    private String productPromoId;

    @Id
    @Column(name = "product_promo_rule_id")
    private String productPromoRuleId;

    @Id
    @Column(name = "product_promo_action_seq_id")
    private String productPromoActionSeqId;

    @Id
    @Column(name = "product_promo_cond_seq_id")
    private String productPromoCondSeqId;

    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @Id
    @Column(name = "and_group_id")
    private String andGroupId;

    @Column(name = "product_promo_appl_enum_id")
    private String productPromoApplEnumId;

    @Column(name = "include_sub_categories")
    private String includeSubCategories;
}
