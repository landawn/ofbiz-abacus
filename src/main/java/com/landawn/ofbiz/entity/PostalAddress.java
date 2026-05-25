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
@Table(name = "postal_address")
public class PostalAddress {
    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "to_name")
    private String toName;

    @Column(name = "attn_name")
    private String attnName;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "house_number")
    private double houseNumber;

    @Column(name = "house_number_ext")
    private String houseNumberExt;

    @Column(name = "directions")
    private String directions;

    @Column(name = "city")
    private String city;

    @Column(name = "city_geo_id")
    private String cityGeoId;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "postal_code_ext")
    private String postalCodeExt;

    @Column(name = "country_geo_id")
    private String countryGeoId;

    @Column(name = "state_province_geo_id")
    private String stateProvinceGeoId;

    @Column(name = "county_geo_id")
    private String countyGeoId;

    @Column(name = "municipality_geo_id")
    private String municipalityGeoId;

    @Column(name = "postal_code_geo_id")
    private String postalCodeGeoId;

    @Column(name = "geo_point_id")
    private String geoPointId;
}
