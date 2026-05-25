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
@Table(name = "vendor")
public class Vendor {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "manifest_company_name")
    private String manifestCompanyName;

    @Column(name = "manifest_company_title")
    private String manifestCompanyTitle;

    @Column(name = "manifest_logo_url")
    private String manifestLogoUrl;

    @Column(name = "manifest_policies")
    private String manifestPolicies;
}
