package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_config")
public class ProductConfig {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "sequence_num")
    private double sequenceNum;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "description")
    private String description;

    @Column(name = "long_description")
    private String longDescription;

    @Column(name = "config_type_id")
    private String configTypeId;

    @Column(name = "default_config_option_id")
    private String defaultConfigOptionId;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "is_mandatory")
    private String isMandatory;
}
