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
@Table(name = "product_config_option_iactn")
public class ProductConfigOptionIactn {
    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "config_option_id")
    private String configOptionId;

    @Id
    @Column(name = "config_item_id_to")
    private String configItemIdTo;

    @Id
    @Column(name = "config_option_id_to")
    private String configOptionIdTo;

    @Id
    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "config_iactn_type_id")
    private String configIactnTypeId;

    @Column(name = "description")
    private String description;
}
