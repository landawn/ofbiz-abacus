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
@Table(name = "fixed_asset_type_attr")
public class FixedAssetTypeAttr {
    @Id
    @Column(name = "fixed_asset_type_id")
    private String fixedAssetTypeId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "description")
    private String description;

    @JoinedBy("fixedAssetTypeId=FixedAssetType.fixedAssetTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAssetType fixedAssetType;
}
