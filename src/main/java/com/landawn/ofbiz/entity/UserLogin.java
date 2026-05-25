package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "user_login")
public class UserLogin {
    @Id
    @Column(name = "user_login_id")
    private String userLoginId;

    @Column(name = "current_password")
    private String currentPassword;

    @Column(name = "password_hint")
    private String passwordHint;

    @Column(name = "is_system")
    private String isSystem;

    @Column(name = "enabled")
    private String enabled;

    @Column(name = "has_logged_out")
    private String hasLoggedOut;

    @Column(name = "require_password_change")
    private String requirePasswordChange;

    @Column(name = "last_currency_uom")
    private String lastCurrencyUom;

    @Column(name = "last_locale")
    private String lastLocale;

    @Column(name = "last_time_zone")
    private String lastTimeZone;

    @Column(name = "disabled_date_time")
    private Timestamp disabledDateTime;

    @Column(name = "successive_failed_logins")
    private double successiveFailedLogins;

    @Column(name = "external_auth_id")
    private String externalAuthId;

    @Column(name = "user_ldap_dn")
    private String userLdapDn;

    @Column(name = "disabled_by")
    private String disabledBy;

    @Column(name = "party_id")
    private String partyId;
}
