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
@Table(name = "party_tax_auth_info")
public class PartyTaxAuthInfo {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Id
    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "party_tax_id")
    private String partyTaxId;

    @Column(name = "is_exempt")
    private String isExempt;

    @Column(name = "is_nexus")
    private String isNexus;
}
