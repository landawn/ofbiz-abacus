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
@Table(name = "product_price_purpose")
public class ProductPricePurpose {
    @Id
    @Column(name = "product_price_purpose_id")
    private String productPricePurposeId;

    @Column(name = "description")
    private String description;
}
