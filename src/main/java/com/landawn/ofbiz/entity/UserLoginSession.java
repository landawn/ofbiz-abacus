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
@Table(name = "user_login_session")
public class UserLoginSession {
    @Id
    @Column(name = "user_login_id")
    private String userLoginId;

    @Column(name = "saved_date")
    private Timestamp savedDate;

    @Column(name = "session_data")
    private String sessionData;
}
