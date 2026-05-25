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
@Table(name = "user_login_and_party_details")
public class UserLoginAndPartyDetails {
    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "party_type_id")
    private String partyTypeId;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "group_name")
    private String groupName;

    @ReadOnly
    @Column(name = "user_login_id")
    private String userLoginId;

    @ReadOnly
    @Column(name = "current_password")
    private String currentPassword;

    @ReadOnly
    @Column(name = "password_hint")
    private String passwordHint;

    @ReadOnly
    @Column(name = "enabled")
    private String enabled;

    @ReadOnly
    @Column(name = "disabled_date_time")
    private Timestamp disabledDateTime;

    @ReadOnly
    @Column(name = "successive_failed_logins")
    private double successiveFailedLogins;

    @ReadOnly
    @Column(name = "last_name")
    private String lastName;

    @ReadOnly
    @Column(name = "middle_name")
    private String middleName;

    @ReadOnly
    @Column(name = "first_name")
    private String firstName;
}
