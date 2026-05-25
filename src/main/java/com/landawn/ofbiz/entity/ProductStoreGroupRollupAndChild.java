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
@Table(name = "product_store_group_rollup_and_child")
public class ProductStoreGroupRollupAndChild {
    @ReadOnly
    @Column(name = "product_store_group_id")
    private String productStoreGroupId;

    @ReadOnly
    @Column(name = "product_store_group_type_id")
    private String productStoreGroupTypeId;

    @ReadOnly
    @Column(name = "primary_parent_group_id")
    private String primaryParentGroupId;

    @ReadOnly
    @Column(name = "product_store_group_name")
    private String productStoreGroupName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "parent_group_id")
    private String parentGroupId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;
}
