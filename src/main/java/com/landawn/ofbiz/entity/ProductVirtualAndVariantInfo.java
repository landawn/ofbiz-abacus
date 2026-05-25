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
@Table(name = "product_virtual_and_variant_info")
public class ProductVirtualAndVariantInfo {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_name")
    private String productName;

    @ReadOnly
    @Column(name = "internal_name")
    private String internalName;

    @ReadOnly
    @Column(name = "product_assoc_type_id")
    private String productAssocTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "variant_product_id")
    private String variantProductId;

    @ReadOnly
    @Column(name = "product_feature_appl_type_id")
    private String productFeatureApplTypeId;

    @ReadOnly
    @Column(name = "variant_feature_appl_from_date")
    private String variantFeatureApplFromDate;

    @ReadOnly
    @Column(name = "variant_feature_appl_thru_date")
    private String variantFeatureApplThruDate;

    @ReadOnly
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @ReadOnly
    @Column(name = "product_feature_type_id")
    private String productFeatureTypeId;

    @ReadOnly
    @Column(name = "product_feature_category_id")
    private String productFeatureCategoryId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "variant_price_type_id")
    private String variantPriceTypeId;

    @ReadOnly
    @Column(name = "variant_currency_uom_id")
    private String variantCurrencyUomId;

    @ReadOnly
    @Column(name = "variant_product_store_group_id")
    private String variantProductStoreGroupId;

    @ReadOnly
    @Column(name = "variant_price_from_date")
    private String variantPriceFromDate;

    @ReadOnly
    @Column(name = "variant_price_thru_date")
    private String variantPriceThruDate;

    @ReadOnly
    @Column(name = "variant_price")
    private String variantPrice;
}
