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
@Table(name = "party_relationship_and_contact_mech_detail")
public class PartyRelationshipAndContactMechDetail {
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
    @Column(name = "first_name_local")
    private String firstNameLocal;

    @ReadOnly
    @Column(name = "last_name_local")
    private String lastNameLocal;

    @ReadOnly
    @Column(name = "personal_title")
    private String personalTitle;

    @ReadOnly
    @Column(name = "suffix")
    private String suffix;

    @ReadOnly
    @Column(name = "group_name")
    private String groupName;

    @ReadOnly
    @Column(name = "group_name_local")
    private String groupNameLocal;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "party_status_id")
    private String partyStatusId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "party_type_id")
    private String partyTypeId;

    @ReadOnly
    @Column(name = "external_id")
    private String externalId;

    @ReadOnly
    @Column(name = "preferred_currency_uom_id")
    private String preferredCurrencyUomId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @ReadOnly
    @Column(name = "data_source_id")
    private String dataSourceId;

    @ReadOnly
    @Column(name = "is_unread")
    private String isUnread;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @ReadOnly
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "relationship_name")
    private String relationshipName;

    @ReadOnly
    @Column(name = "security_group_id")
    private String securityGroupId;

    @ReadOnly
    @Column(name = "priority_type_id")
    private String priorityTypeId;

    @ReadOnly
    @Column(name = "party_relationship_type_id")
    private String partyRelationshipTypeId;

    @ReadOnly
    @Column(name = "permissions_enum_id")
    private String permissionsEnumId;

    @ReadOnly
    @Column(name = "position_title")
    private String positionTitle;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @ReadOnly
    @Column(name = "info_string")
    private String infoString;

    @ReadOnly
    @Column(name = "pa_contact_mech_id")
    private String paContactMechId;

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
    @Column(name = "tn_contact_mech_id")
    private String tnContactMechId;

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
}
