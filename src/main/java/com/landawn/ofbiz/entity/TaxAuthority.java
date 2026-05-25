package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tax_authority")
public class TaxAuthority {
    @Id
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Id
    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @Column(name = "require_tax_id_for_exemption")
    private String requireTaxIdForExemption;

    @Column(name = "tax_id_format_pattern")
    private String taxIdFormatPattern;

    @Column(name = "include_tax_in_price")
    private String includeTaxInPrice;
}
