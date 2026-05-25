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
@Table(name = "product_virtual_and_assoc_prices")
public class ProductVirtualAndAssocPrices {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "internal_name")
    private String internalName;

    @ReadOnly
    @Column(name = "product_name")
    private String productName;

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
    @Column(name = "assoc_product_id")
    private String assocProductId;

    @ReadOnly
    @Column(name = "assoc_product_count")
    private String assocProductCount;

    @ReadOnly
    @Column(name = "assoc_price_type_id")
    private String assocPriceTypeId;

    @ReadOnly
    @Column(name = "assoc_currency_uom_id")
    private String assocCurrencyUomId;

    @ReadOnly
    @Column(name = "assoc_product_store_group_id")
    private String assocProductStoreGroupId;

    @ReadOnly
    @Column(name = "assoc_price_from_date")
    private String assocPriceFromDate;

    @ReadOnly
    @Column(name = "assoc_price_thru_date")
    private String assocPriceThruDate;

    @ReadOnly
    @Column(name = "assoc_min_price")
    private String assocMinPrice;

    @ReadOnly
    @Column(name = "assoc_max_price")
    private String assocMaxPrice;
}
