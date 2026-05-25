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
@Table(name = "tax_authority_category")
public class TaxAuthorityCategory {
    @Id
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Id
    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @JoinedBy("taxAuthGeoId=TaxAuthority.taxAuthGeoId, taxAuthPartyId=TaxAuthority.taxAuthPartyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TaxAuthority taxAuthority;

    @JoinedBy("productCategoryId=ProductCategory.productCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductCategory productCategory;
}
