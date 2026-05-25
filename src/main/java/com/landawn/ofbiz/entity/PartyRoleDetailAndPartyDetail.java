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
@Table(name = "party_role_detail_and_party_detail")
public class PartyRoleDetailAndPartyDetail {
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
}
