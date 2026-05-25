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
@Table(name = "fixed_asset_product")
public class FixedAssetProduct {
    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "fixed_asset_product_type_id")
    private String fixedAssetProductTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "quantity_uom_id")
    private String quantityUomId;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("fixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;

    @JoinedBy("fixedAssetProductTypeId=FixedAssetProductType.fixedAssetProductTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAssetProductType fixedAssetProductType;

    @JoinedBy("quantityUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;
}
