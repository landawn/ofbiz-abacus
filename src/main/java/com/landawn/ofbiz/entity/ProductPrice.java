package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "product_price_type_id")
    private String productPriceTypeId;

    @Id
    @Column(name = "product_price_purpose_id")
    private String productPricePurposeId;

    @Id
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Id
    @Column(name = "product_store_group_id")
    private String productStoreGroupId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "price")
    private double price;

    @Column(name = "term_uom_id")
    private String termUomId;

    @Column(name = "custom_price_calc_service")
    private String customPriceCalcService;

    @Column(name = "price_without_tax")
    private double priceWithoutTax;

    @Column(name = "price_with_tax")
    private double priceWithTax;

    @Column(name = "tax_amount")
    private double taxAmount;

    @Column(name = "tax_percentage")
    private double taxPercentage;

    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Column(name = "tax_in_price")
    private String taxInPrice;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
