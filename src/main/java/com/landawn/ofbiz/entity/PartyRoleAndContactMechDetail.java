package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "party_role_and_contact_mech_detail")
public class PartyRoleAndContactMechDetail {
    @ReadOnly
    @Column(name = "person_comments")
    private String personComments;

    @ReadOnly
    @Column(name = "party_group_comments")
    private String partyGroupComments;

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
    @Column(name = "status_id")
    private String statusId;

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
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "parent_type_id")
    private String parentTypeId;

    @ReadOnly
    @Column(name = "has_table")
    private String hasTable;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "salutation")
    private String salutation;

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
    @Column(name = "personal_title")
    private String personalTitle;

    @ReadOnly
    @Column(name = "suffix")
    private String suffix;

    @ReadOnly
    @Column(name = "nickname")
    private String nickname;

    @ReadOnly
    @Column(name = "first_name_local")
    private String firstNameLocal;

    @ReadOnly
    @Column(name = "middle_name_local")
    private String middleNameLocal;

    @ReadOnly
    @Column(name = "last_name_local")
    private String lastNameLocal;

    @ReadOnly
    @Column(name = "other_local")
    private String otherLocal;

    @ReadOnly
    @Column(name = "member_id")
    private String memberId;

    @ReadOnly
    @Column(name = "gender")
    private String gender;

    @ReadOnly
    @Column(name = "birth_date")
    private Date birthDate;

    @ReadOnly
    @Column(name = "deceased_date")
    private Date deceasedDate;

    @ReadOnly
    @Column(name = "height")
    private Double height;

    @ReadOnly
    @Column(name = "weight")
    private Double weight;

    @ReadOnly
    @Column(name = "mothers_maiden_name")
    private String mothersMaidenName;

    @ReadOnly
    @Column(name = "old_marital_status_enum_id")
    private String oldMaritalStatusEnumId;

    @ReadOnly
    @Column(name = "marital_status_type_id")
    private String maritalStatusTypeId;

    @ReadOnly
    @Column(name = "social_security_number")
    private String socialSecurityNumber;

    @ReadOnly
    @Column(name = "passport_number")
    private String passportNumber;

    @ReadOnly
    @Column(name = "passport_expire_date")
    private Date passportExpireDate;

    @ReadOnly
    @Column(name = "total_years_work_experience")
    private Double totalYearsWorkExperience;

    @ReadOnly
    @Column(name = "employment_status_enum_id")
    private String employmentStatusEnumId;

    @ReadOnly
    @Column(name = "residence_status_enum_id")
    private String residenceStatusEnumId;

    @ReadOnly
    @Column(name = "occupation")
    private String occupation;

    @ReadOnly
    @Column(name = "years_with_employer")
    private double yearsWithEmployer;

    @ReadOnly
    @Column(name = "months_with_employer")
    private double monthsWithEmployer;

    @ReadOnly
    @Column(name = "existing_customer")
    private String existingCustomer;

    @ReadOnly
    @Column(name = "card_id")
    private String cardId;

    @ReadOnly
    @Column(name = "group_name")
    private String groupName;

    @ReadOnly
    @Column(name = "group_name_local")
    private String groupNameLocal;

    @ReadOnly
    @Column(name = "office_site_name")
    private String officeSiteName;

    @ReadOnly
    @Column(name = "annual_revenue")
    private double annualRevenue;

    @ReadOnly
    @Column(name = "num_employees")
    private double numEmployees;

    @ReadOnly
    @Column(name = "ticker_symbol")
    private String tickerSymbol;

    @ReadOnly
    @Column(name = "logo_image_url")
    private String logoImageUrl;

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
