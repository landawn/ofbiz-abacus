package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tax_authority_category_view")
public class TaxAuthorityCategoryView {
    @ReadOnly
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @ReadOnly
    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @ReadOnly
    @Column(name = "product_category_id")
    private String productCategoryId;

    @ReadOnly
    @Column(name = "product_category_type_id")
    private String productCategoryTypeId;

    @ReadOnly
    @Column(name = "primary_parent_category_id")
    private String primaryParentCategoryId;

    @ReadOnly
    @Column(name = "category_name")
    private String categoryName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "long_description")
    private String longDescription;

    @ReadOnly
    @Column(name = "category_image_url")
    private String categoryImageUrl;

    @ReadOnly
    @Column(name = "link_one_image_url")
    private String linkOneImageUrl;

    @ReadOnly
    @Column(name = "link_two_image_url")
    private String linkTwoImageUrl;

    @ReadOnly
    @Column(name = "detail_screen")
    private String detailScreen;

    @ReadOnly
    @Column(name = "show_in_select")
    private String showInSelect;
}
