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
@Table(name = "product_config_product")
public class ProductConfigProduct {
    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "config_option_id")
    private String configOptionId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
