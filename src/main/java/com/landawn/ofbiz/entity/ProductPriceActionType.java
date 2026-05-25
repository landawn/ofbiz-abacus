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
@Table(name = "product_price_action_type")
public class ProductPriceActionType {
    @Id
    @Column(name = "product_price_action_type_id")
    private String productPriceActionTypeId;

    @Column(name = "description")
    private String description;
}
