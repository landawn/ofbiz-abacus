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
@Table(name = "prod_promo_code_contact_mech")
public class ProdPromoCodeContactMech {
    @Id
    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;

    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @JoinedBy("productPromoCodeId=ProductPromoCode.productPromoCodeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductPromoCode productPromoCode;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;
}
