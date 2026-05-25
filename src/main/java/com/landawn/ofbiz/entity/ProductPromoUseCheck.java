package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_promo_use_check")
public class ProductPromoUseCheck {
    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "promo_sequence_id")
    private String promoSequenceId;

    @ReadOnly
    @Column(name = "product_promo_id")
    private String productPromoId;

    @ReadOnly
    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "total_discount_amount")
    private double totalDiscountAmount;

    @ReadOnly
    @Column(name = "quantity_left_in_actions")
    private double quantityLeftInActions;
}
