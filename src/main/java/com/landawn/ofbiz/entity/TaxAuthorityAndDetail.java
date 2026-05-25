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
@Table(name = "tax_authority_and_detail")
public class TaxAuthorityAndDetail {
    @ReadOnly
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @ReadOnly
    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @ReadOnly
    @Column(name = "require_tax_id_for_exemption")
    private String requireTaxIdForExemption;

    @ReadOnly
    @Column(name = "tax_id_format_pattern")
    private String taxIdFormatPattern;

    @ReadOnly
    @Column(name = "include_tax_in_price")
    private String includeTaxInPrice;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "group_name")
    private String groupName;

    @ReadOnly
    @Column(name = "group_name_local")
    private String groupNameLocal;

    @ReadOnly
    @Column(name = "office_site_name")
    private String officeSiteName;

    @ReadOnly
    @Column(name = "annual_revenue")
    private double annualRevenue;

    @ReadOnly
    @Column(name = "num_employees")
    private double numEmployees;

    @ReadOnly
    @Column(name = "ticker_symbol")
    private String tickerSymbol;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "logo_image_url")
    private String logoImageUrl;

    @ReadOnly
    @Column(name = "geo_id")
    private String geoId;

    @ReadOnly
    @Column(name = "geo_type_id")
    private String geoTypeId;

    @ReadOnly
    @Column(name = "geo_name")
    private String geoName;

    @ReadOnly
    @Column(name = "geo_code")
    private String geoCode;

    @ReadOnly
    @Column(name = "geo_sec_code")
    private String geoSecCode;

    @ReadOnly
    @Column(name = "abbreviation")
    private String abbreviation;

    @ReadOnly
    @Column(name = "well_known_text")
    private String wellKnownText;
}
