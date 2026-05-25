package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_login_security_group")
public class UserLoginSecurityGroup {
    @Id
    @Column(name = "user_login_id")
    private String userLoginId;

    @Id
    @Column(name = "group_id")
    private String groupId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("userLoginId=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;

    @JoinedBy("groupId=SecurityGroup.groupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SecurityGroup securityGroup;
}
