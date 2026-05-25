package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "prod_fea_grp_app_and_prod_fea_app")
public class ProdFeaGrpAppAndProdFeaApp {
    @ReadOnly
    @Column(name = "product_feature_group_id")
    private String productFeatureGroupId;

    @ReadOnly
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @ReadOnly
    @Column(name = "group_from_date")
    private String groupFromDate;

    @ReadOnly
    @Column(name = "group_thru_date")
    private String groupThruDate;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_feature_appl_type_id")
    private String productFeatureApplTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "amount")
    private double amount;

    @ReadOnly
    @Column(name = "recurring_amount")
    private double recurringAmount;
}
