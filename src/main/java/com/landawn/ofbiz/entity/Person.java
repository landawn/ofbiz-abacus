package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "salutation")
    private String salutation;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "personal_title")
    private String personalTitle;

    @Column(name = "suffix")
    private String suffix;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "first_name_local")
    private String firstNameLocal;

    @Column(name = "middle_name_local")
    private String middleNameLocal;

    @Column(name = "last_name_local")
    private String lastNameLocal;

    @Column(name = "other_local")
    private String otherLocal;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "deceased_date")
    private Date deceasedDate;

    @Column(name = "height")
    private Double height;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "mothers_maiden_name")
    private String mothersMaidenName;

    @Column(name = "old_marital_status_enum_id")
    private String oldMaritalStatusEnumId;

    @Column(name = "marital_status_type_id")
    private String maritalStatusTypeId;

    @Column(name = "social_security_number")
    private String socialSecurityNumber;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "passport_expire_date")
    private Date passportExpireDate;

    @Column(name = "total_years_work_experience")
    private Double totalYearsWorkExperience;

    @Column(name = "comments")
    private String comments;

    @Column(name = "employment_status_enum_id")
    private String employmentStatusEnumId;

    @Column(name = "residence_status_enum_id")
    private String residenceStatusEnumId;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "years_with_employer")
    private double yearsWithEmployer;

    @Column(name = "months_with_employer")
    private double monthsWithEmployer;

    @Column(name = "existing_customer")
    private String existingCustomer;

    @Column(name = "card_id")
    private String cardId;
}
