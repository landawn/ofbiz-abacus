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
@Table(name = "fixed_asset_ident")
public class FixedAssetIdent {
    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Id
    @Column(name = "fixed_asset_ident_type_id")
    private String fixedAssetIdentTypeId;

    @Column(name = "id_value")
    private String idValue;

    @JoinedBy("fixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;

    @JoinedBy("fixedAssetIdentTypeId=FixedAssetIdentType.fixedAssetIdentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAssetIdentType fixedAssetIdentType;
}
