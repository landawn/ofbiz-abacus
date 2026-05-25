package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "product_store_group")
public class ProductStoreGroup {
    @Id
    @Column(name = "product_store_group_id")
    private String productStoreGroupId;

    @Column(name = "product_store_group_type_id")
    private String productStoreGroupTypeId;

    @Column(name = "primary_parent_group_id")
    private String primaryParentGroupId;

    @Column(name = "product_store_group_name")
    private String productStoreGroupName;

    @Column(name = "description")
    private String description;

    @JoinedBy("productStoreGroupTypeId=ProductStoreGroupType.productStoreGroupTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStoreGroupType productStoreGroupType;

    @JoinedBy("primaryParentGroupId=ProductStoreGroup.productStoreGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStoreGroup productStoreGroup;
}
