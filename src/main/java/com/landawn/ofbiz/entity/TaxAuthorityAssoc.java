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
@Table(name = "tax_authority_assoc")
public class TaxAuthorityAssoc {
    @Id
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Id
    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @Id
    @Column(name = "to_tax_auth_geo_id")
    private String toTaxAuthGeoId;

    @Id
    @Column(name = "to_tax_auth_party_id")
    private String toTaxAuthPartyId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "tax_authority_assoc_type_id")
    private String taxAuthorityAssocTypeId;

    @JoinedBy("taxAuthGeoId=TaxAuthority.taxAuthGeoId, taxAuthPartyId=TaxAuthority.taxAuthPartyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TaxAuthority taxAuthGeo;

    @JoinedBy("toTaxAuthGeoId=TaxAuthority.taxAuthGeoId, toTaxAuthPartyId=TaxAuthority.taxAuthPartyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TaxAuthority toTaxAuthGeo;

    @JoinedBy("taxAuthorityAssocTypeId=TaxAuthorityAssocType.taxAuthorityAssocTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TaxAuthorityAssocType taxAuthorityAssocType;
}
