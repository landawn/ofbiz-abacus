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
@Table(name = "user_login_history")
public class UserLoginHistory {
    @Id
    @Column(name = "user_login_id")
    private String userLoginId;

    @Column(name = "visit_id")
    private String visitId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "password_used")
    private String passwordUsed;

    @Column(name = "successful_login")
    private String successfulLogin;

    @Column(name = "origin_user_login_id")
    private String originUserLoginId;

    @Column(name = "party_id")
    private String partyId;
}
