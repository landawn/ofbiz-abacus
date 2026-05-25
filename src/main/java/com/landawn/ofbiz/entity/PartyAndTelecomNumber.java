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
@Table(name = "party_and_telecom_number")
public class PartyAndTelecomNumber {
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
}
