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
@Table(name = "old_product_promo_code_email")
public class OldProductPromoCodeEmail {
    @Id
    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;

    @Id
    @Column(name = "email_address")
    private String emailAddress;

    @JoinedBy("productPromoCodeId=ProductPromoCode.productPromoCodeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPromoCode productPromoCode;
}
