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
@Table(name = "order_product_promo_code")
public class OrderProductPromoCode {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("productPromoCodeId=ProductPromoCode.productPromoCodeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPromoCode productPromoCode;
}
