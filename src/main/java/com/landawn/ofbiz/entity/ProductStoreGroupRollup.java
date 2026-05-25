package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_store_group_rollup")
public class ProductStoreGroupRollup {
    @Id
    @Column(name = "product_store_group_id")
    private String productStoreGroupId;

    @Id
    @Column(name = "parent_group_id")
    private String parentGroupId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @JoinedBy("productStoreGroupId=ProductStoreGroup.productStoreGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStoreGroup productStoreGroup;

    @JoinedBy("parentGroupId=ProductStoreGroup.productStoreGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStoreGroup parentGroup;
}
