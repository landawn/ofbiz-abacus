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
@Table(name = "contact_mech_detail")
public class ContactMechDetail {
    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @ReadOnly
    @Column(name = "info_string")
    private String infoString;

    @ReadOnly
    @Column(name = "pa_to_name")
    private String paToName;

    @ReadOnly
    @Column(name = "pa_attn_name")
    private String paAttnName;

    @ReadOnly
    @Column(name = "pa_address1")
    private String paAddress1;

    @ReadOnly
    @Column(name = "pa_address2")
    private String paAddress2;

    @ReadOnly
    @Column(name = "pa_house_number")
    private String paHouseNumber;

    @ReadOnly
    @Column(name = "pa_house_number_ext")
    private String paHouseNumberExt;

    @ReadOnly
    @Column(name = "pa_directions")
    private String paDirections;

    @ReadOnly
    @Column(name = "pa_city")
    private String paCity;

    @ReadOnly
    @Column(name = "pa_city_geo_id")
    private String paCityGeoId;

    @ReadOnly
    @Column(name = "pa_postal_code")
    private String paPostalCode;

    @ReadOnly
    @Column(name = "pa_postal_code_ext")
    private String paPostalCodeExt;

    @ReadOnly
    @Column(name = "pa_country_geo_id")
    private String paCountryGeoId;

    @ReadOnly
    @Column(name = "pa_state_province_geo_id")
    private String paStateProvinceGeoId;

    @ReadOnly
    @Column(name = "pa_county_geo_id")
    private String paCountyGeoId;

    @ReadOnly
    @Column(name = "pa_municipality_geo_id")
    private String paMunicipalityGeoId;

    @ReadOnly
    @Column(name = "pa_postal_code_geo_id")
    private String paPostalCodeGeoId;

    @ReadOnly
    @Column(name = "pa_geo_point_id")
    private String paGeoPointId;

    @ReadOnly
    @Column(name = "tn_country_code")
    private String tnCountryCode;

    @ReadOnly
    @Column(name = "tn_area_code")
    private String tnAreaCode;

    @ReadOnly
    @Column(name = "tn_contact_number")
    private String tnContactNumber;

    @ReadOnly
    @Column(name = "tn_ask_for_name")
    private String tnAskForName;

    @ReadOnly
    @Column(name = "fa_hostname")
    private String faHostname;

    @ReadOnly
    @Column(name = "fa_port")
    private String faPort;

    @ReadOnly
    @Column(name = "fa_username")
    private String faUsername;

    @ReadOnly
    @Column(name = "fa_ftp_password")
    private String faFtpPassword;

    @ReadOnly
    @Column(name = "fa_binary_transfer")
    private String faBinaryTransfer;

    @ReadOnly
    @Column(name = "fa_file_path")
    private String faFilePath;

    @ReadOnly
    @Column(name = "fa_zip_file")
    private String faZipFile;

    @ReadOnly
    @Column(name = "fa_passive_mode")
    private String faPassiveMode;

    @ReadOnly
    @Column(name = "fa_default_timeout")
    private String faDefaultTimeout;
}
