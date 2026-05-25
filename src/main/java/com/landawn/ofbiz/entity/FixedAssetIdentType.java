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
@Table(name = "fixed_asset_ident_type")
public class FixedAssetIdentType {
    @Id
    @Column(name = "fixed_asset_ident_type_id")
    private String fixedAssetIdentTypeId;

    @Column(name = "description")
    private String description;
}
