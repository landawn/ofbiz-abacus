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
@Table(name = "party_contact_detail_by_purpose")
public class PartyContactDetailByPurpose {
    @ReadOnly
    @Column(name = "contact_mech_purpose_type_id")
    private String contactMechPurposeTypeId;

    @ReadOnly
    @Column(name = "purpose_from_date")
    private String purposeFromDate;

    @ReadOnly
    @Column(name = "purpose_thru_date")
    private String purposeThruDate;

    @ReadOnly
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @ReadOnly
    @Column(name = "info_string")
    private String infoString;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "allow_solicitation")
    private String allowSolicitation;

    @ReadOnly
    @Column(name = "extension")
    private String extension;

    @ReadOnly
    @Column(name = "verified")
    private String verified;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "years_with_contact_mech")
    private double yearsWithContactMech;

    @ReadOnly
    @Column(name = "months_with_contact_mech")
    private double monthsWithContactMech;

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

    @ReadOnly
    @Column(name = "country_code")
    private String countryCode;

    @ReadOnly
    @Column(name = "area_code")
    private String areaCode;

    @ReadOnly
    @Column(name = "contact_number")
    private String contactNumber;

    @ReadOnly
    @Column(name = "ask_for_name")
    private String askForName;

    @ReadOnly
    @Column(name = "state_geo_id")
    private String stateGeoId;

    @ReadOnly
    @Column(name = "state_geo_type_id")
    private String stateGeoTypeId;

    @ReadOnly
    @Column(name = "state_geo_name")
    private String stateGeoName;

    @ReadOnly
    @Column(name = "state_geo_code")
    private String stateGeoCode;

    @ReadOnly
    @Column(name = "state_geo_sec_code")
    private String stateGeoSecCode;

    @ReadOnly
    @Column(name = "state_abbreviation")
    private String stateAbbreviation;

    @ReadOnly
    @Column(name = "state_well_known_text")
    private String stateWellKnownText;

    @ReadOnly
    @Column(name = "county_geo_type_id")
    private String countyGeoTypeId;

    @ReadOnly
    @Column(name = "county_geo_name")
    private String countyGeoName;

    @ReadOnly
    @Column(name = "county_geo_code")
    private String countyGeoCode;

    @ReadOnly
    @Column(name = "county_geo_sec_code")
    private String countyGeoSecCode;

    @ReadOnly
    @Column(name = "county_abbreviation")
    private String countyAbbreviation;

    @ReadOnly
    @Column(name = "county_well_known_text")
    private String countyWellKnownText;

    @ReadOnly
    @Column(name = "country_geo_type_id")
    private String countryGeoTypeId;

    @ReadOnly
    @Column(name = "country_geo_name")
    private String countryGeoName;

    @ReadOnly
    @Column(name = "country_geo_code")
    private String countryGeoCode;

    @ReadOnly
    @Column(name = "country_geo_sec_code")
    private String countryGeoSecCode;

    @ReadOnly
    @Column(name = "country_abbreviation")
    private String countryAbbreviation;

    @ReadOnly
    @Column(name = "country_well_known_text")
    private String countryWellKnownText;
}
