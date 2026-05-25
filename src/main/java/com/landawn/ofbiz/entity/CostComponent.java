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
@Table(name = "cost_component")
public class CostComponent {
    @Id
    @Column(name = "cost_component_id")
    private String costComponentId;

    @Column(name = "cost_component_type_id")
    private String costComponentTypeId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "geo_id")
    private String geoId;

    @Column(name = "work_effort_id")
    private String workEffortId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "cost_component_calc_id")
    private String costComponentCalcId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "cost")
    private double cost;

    @Column(name = "cost_uom_id")
    private String costUomId;

    @JoinedBy("costComponentTypeId=CostComponentType.costComponentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CostComponentType costComponentType;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("productFeatureId=ProductFeature.productFeatureId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductFeature productFeature;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("geoId=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geo;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("fixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;

    @JoinedBy("costComponentCalcId=CostComponentCalc.costComponentCalcId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CostComponentCalc costComponentCalc;

    @JoinedBy("costUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;
}
