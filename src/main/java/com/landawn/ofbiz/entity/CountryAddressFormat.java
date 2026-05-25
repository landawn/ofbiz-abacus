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
@Table(name = "country_address_format")
public class CountryAddressFormat {
    @Id
    @Column(name = "geo_id")
    private String geoId;

    @Column(name = "geo_assoc_type_id")
    private String geoAssocTypeId;

    @Column(name = "require_state_province_id")
    private String requireStateProvinceId;

    @Column(name = "require_postal_code")
    private String requirePostalCode;

    @Column(name = "postal_code_regex")
    private String postalCodeRegex;

    @Column(name = "has_postal_code_ext")
    private String hasPostalCodeExt;

    @Column(name = "require_postal_code_ext")
    private String requirePostalCodeExt;

    @Column(name = "address_format")
    private String addressFormat;

    @JoinedBy("geoId=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geo;

    @JoinedBy("geoAssocTypeId=GeoAssocType.geoAssocTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GeoAssocType geoAssocType;
}
