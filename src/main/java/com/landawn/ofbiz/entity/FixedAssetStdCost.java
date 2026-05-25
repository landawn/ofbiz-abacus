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
@Table(name = "fixed_asset_std_cost")
public class FixedAssetStdCost {
    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Id
    @Column(name = "fixed_asset_std_cost_type_id")
    private String fixedAssetStdCostTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "amount_uom_id")
    private String amountUomId;

    @Column(name = "amount")
    private double amount;

    @JoinedBy("fixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;

    @JoinedBy("fixedAssetStdCostTypeId=FixedAssetStdCostType.fixedAssetStdCostTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAssetStdCostType fixedAssetStdCostType;

    @JoinedBy("amountUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;
}
