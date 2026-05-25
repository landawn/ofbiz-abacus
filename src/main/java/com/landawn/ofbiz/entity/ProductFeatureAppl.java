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
@Table(name = "product_feature_appl")
public class ProductFeatureAppl {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "product_feature_appl_type_id")
    private String productFeatureApplTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "amount")
    private double amount;

    @Column(name = "recurring_amount")
    private double recurringAmount;
}
