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
@Table(name = "security_group_permission")
public class SecurityGroupPermission {
    @Id
    @Column(name = "group_id")
    private String groupId;

    @Id
    @Column(name = "permission_id")
    private String permissionId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("groupId=SecurityGroup.groupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SecurityGroup securityGroup;
}
