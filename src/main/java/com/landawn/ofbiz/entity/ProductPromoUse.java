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
@Table(name = "product_promo_use")
public class ProductPromoUse {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "promo_sequence_id")
    private String promoSequenceId;

    @Column(name = "product_promo_id")
    private String productPromoId;

    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "total_discount_amount")
    private double totalDiscountAmount;

    @Column(name = "quantity_left_in_actions")
    private double quantityLeftInActions;

    @JoinedBy("productPromoId=ProductPromo.productPromoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPromo productPromo;

    @JoinedBy("productPromoCodeId=ProductPromoCode.productPromoCodeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPromoCode productPromoCode;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;
}
