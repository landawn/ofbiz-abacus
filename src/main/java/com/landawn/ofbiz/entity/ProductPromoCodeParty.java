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
@Table(name = "product_promo_code_party")
public class ProductPromoCodeParty {
    @Id
    @Column(name = "product_promo_code_id")
    private String productPromoCodeId;

    @Id
    @Column(name = "party_id")
    private String partyId;
}
