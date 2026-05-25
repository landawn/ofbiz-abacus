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
@Table(name = "tax_authority_rate_product")
public class TaxAuthorityRateProduct {
    @Id
    @Column(name = "tax_authority_rate_seq_id")
    private String taxAuthorityRateSeqId;

    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @Column(name = "tax_authority_rate_type_id")
    private String taxAuthorityRateTypeId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "product_category_id")
    private String productCategoryId;

    @Column(name = "title_transfer_enum_id")
    private String titleTransferEnumId;

    @Column(name = "min_item_price")
    private double minItemPrice;

    @Column(name = "min_purchase")
    private double minPurchase;

    @Column(name = "tax_shipping")
    private String taxShipping;

    @Column(name = "tax_percentage")
    private double taxPercentage;

    @Column(name = "tax_promotions")
    private String taxPromotions;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "description")
    private String description;

    @Column(name = "is_tax_in_shipping_price")
    private String isTaxInShippingPrice;

    @JoinedBy("taxAuthGeoId=TaxAuthority.taxAuthGeoId, taxAuthPartyId=TaxAuthority.taxAuthPartyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TaxAuthority taxAuthority;

    @JoinedBy("taxAuthorityRateTypeId=TaxAuthorityRateType.taxAuthorityRateTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TaxAuthorityRateType taxAuthorityRateType;

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("productCategoryId=ProductCategory.productCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductCategory productCategory;
}
