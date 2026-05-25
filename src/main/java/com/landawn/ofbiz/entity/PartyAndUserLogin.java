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
@Table(name = "party_and_user_login")
public class PartyAndUserLogin {
    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "party_type_id")
    private String partyTypeId;

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
}
