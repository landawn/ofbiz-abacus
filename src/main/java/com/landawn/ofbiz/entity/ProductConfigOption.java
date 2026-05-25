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
@Table(name = "product_config_option")
public class ProductConfigOption {
    @Id
    @Column(name = "config_item_id")
    private String configItemId;

    @Id
    @Column(name = "config_option_id")
    private String configOptionId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "config_option_name")
    private String configOptionName;

    @Column(name = "description")
    private String description;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
