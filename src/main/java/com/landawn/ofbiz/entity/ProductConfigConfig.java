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
@Table(name = "product_config_config")
public class ProductConfigConfig {
    @Id
    @Column(name = "config_id")
    private String configId;

    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "sequence_num")
    private double sequenceNum;

    @Id
    @Column(name = "config_option_id")
    private String configOptionId;

    @Column(name = "description")
    private String description;
}
