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
@Table(name = "user_login_and_security_group")
public class UserLoginAndSecurityGroup {
    @ReadOnly
    @Column(name = "user_login_id")
    private String userLoginId;

    @ReadOnly
    @Column(name = "group_id")
    private String groupId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "current_password")
    private String currentPassword;

    @ReadOnly
    @Column(name = "password_hint")
    private String passwordHint;

    @ReadOnly
    @Column(name = "is_system")
    private String isSystem;

    @ReadOnly
    @Column(name = "enabled")
    private String enabled;

    @ReadOnly
    @Column(name = "has_logged_out")
    private String hasLoggedOut;

    @ReadOnly
    @Column(name = "require_password_change")
    private String requirePasswordChange;

    @ReadOnly
    @Column(name = "last_currency_uom")
    private String lastCurrencyUom;

    @ReadOnly
    @Column(name = "last_locale")
    private String lastLocale;

    @ReadOnly
    @Column(name = "last_time_zone")
    private String lastTimeZone;

    @ReadOnly
    @Column(name = "disabled_date_time")
    private Timestamp disabledDateTime;

    @ReadOnly
    @Column(name = "successive_failed_logins")
    private double successiveFailedLogins;

    @ReadOnly
    @Column(name = "external_auth_id")
    private String externalAuthId;

    @ReadOnly
    @Column(name = "user_ldap_dn")
    private String userLdapDn;

    @ReadOnly
    @Column(name = "disabled_by")
    private String disabledBy;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;
}
