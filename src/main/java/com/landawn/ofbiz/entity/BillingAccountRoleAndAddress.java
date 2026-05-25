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
@Table(name = "billing_account_role_and_address")
public class BillingAccountRoleAndAddress {
    @ReadOnly
    @Column(name = "pcm_from_date")
    private String pcmFromDate;

    @ReadOnly
    @Column(name = "pcm_thru_date")
    private String pcmThruDate;

    @ReadOnly
    @Column(name = "billing_account_id")
    private String billingAccountId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

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
