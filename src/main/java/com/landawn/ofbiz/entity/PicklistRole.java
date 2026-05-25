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
@Table(name = "picklist_role")
public class PicklistRole {
    @Id
    @Column(name = "picklist_id")
    private String picklistId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("picklistId=Picklist.picklistId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Picklist picklist;

    @JoinedBy("partyId=PartyRole.partyId, roleTypeId=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyRole;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin createdByUserLoginRef;

    @JoinedBy("lastModifiedByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin lastModifiedByUserLoginRef;
}
