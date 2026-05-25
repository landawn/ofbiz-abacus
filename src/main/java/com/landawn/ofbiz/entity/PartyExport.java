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
@Table(name = "party_export")
public class PartyExport {
    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "preferred_currency_uom_id")
    private String preferredCurrencyUomId;

    @ReadOnly
    @Column(name = "group_name")
    private String groupName;

    @ReadOnly
    @Column(name = "first_name")
    private String firstName;

    @ReadOnly
    @Column(name = "middle_name")
    private String middleName;

    @ReadOnly
    @Column(name = "last_name")
    private String lastName;

    @ReadOnly
    @Column(name = "company_party_id")
    private String companyPartyId;

    @ReadOnly
    @Column(name = "company_name")
    private String companyName;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @ReadOnly
    @Column(name = "contact_mech_purpose_type_id")
    private String contactMechPurposeTypeId;

    @ReadOnly
    @Column(name = "email_address")
    private String emailAddress;

    @ReadOnly
    @Column(name = "tel_country_code")
    private String telCountryCode;

    @ReadOnly
    @Column(name = "tel_area_code")
    private String telAreaCode;

    @ReadOnly
    @Column(name = "tel_contact_number")
    private String telContactNumber;

    @ReadOnly
    @Column(name = "address1")
    private String address1;

    @ReadOnly
    @Column(name = "address2")
    private String address2;

    @ReadOnly
    @Column(name = "city")
    private String city;

    @ReadOnly
    @Column(name = "state_province_geo_id")
    private String stateProvinceGeoId;

    @ReadOnly
    @Column(name = "postal_code")
    private String postalCode;

    @ReadOnly
    @Column(name = "country_geo_id")
    private String countryGeoId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;
}
