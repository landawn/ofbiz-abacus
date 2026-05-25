package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "party_and_postal_address")
public class PartyAndPostalAddress {
    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "party_type_id")
    private String partyTypeId;

    @ReadOnly
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @ReadOnly
    @Column(name = "info_string")
    private String infoString;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "extension")
    private String extension;

    @ReadOnly
    @Column(name = "allow_solicitation")
    private String allowSolicitation;

    @ReadOnly
    @Column(name = "to_name")
    private String toName;

    @ReadOnly
    @Column(name = "attn_name")
    private String attnName;

    @ReadOnly
    @Column(name = "address1")
    private String address1;

    @ReadOnly
    @Column(name = "address2")
    private String address2;

    @ReadOnly
    @Column(name = "house_number")
    private double houseNumber;

    @ReadOnly
    @Column(name = "house_number_ext")
    private String houseNumberExt;

    @ReadOnly
    @Column(name = "directions")
    private String directions;

    @ReadOnly
    @Column(name = "city")
    private String city;

    @ReadOnly
    @Column(name = "city_geo_id")
    private String cityGeoId;

    @ReadOnly
    @Column(name = "postal_code")
    private String postalCode;

    @ReadOnly
    @Column(name = "postal_code_ext")
    private String postalCodeExt;

    @ReadOnly
    @Column(name = "country_geo_id")
    private String countryGeoId;

    @ReadOnly
    @Column(name = "state_province_geo_id")
    private String stateProvinceGeoId;

    @ReadOnly
    @Column(name = "county_geo_id")
    private String countyGeoId;

    @ReadOnly
    @Column(name = "municipality_geo_id")
    private String municipalityGeoId;

    @ReadOnly
    @Column(name = "postal_code_geo_id")
    private String postalCodeGeoId;

    @ReadOnly
    @Column(name = "geo_point_id")
    private String geoPointId;
}
