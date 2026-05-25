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
@Table(name = "product_promo_action")
public class ProductPromoAction {
    @Id
    @Column(name = "product_promo_id")
    private String productPromoId;

    @Id
    @Column(name = "product_promo_rule_id")
    private String productPromoRuleId;

    @Id
    @Column(name = "product_promo_action_seq_id")
    private String productPromoActionSeqId;

    @Column(name = "product_promo_action_enum_id")
    private String productPromoActionEnumId;

    @Column(name = "custom_method_id")
    private String customMethodId;

    @Column(name = "order_adjustment_type_id")
    private String orderAdjustmentTypeId;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "amount")
    private double amount;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "use_cart_quantity")
    private String useCartQuantity;
}
