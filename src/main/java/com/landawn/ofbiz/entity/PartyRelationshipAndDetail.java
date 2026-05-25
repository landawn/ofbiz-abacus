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
@Table(name = "party_relationship_and_detail")
public class PartyRelationshipAndDetail {
    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "party_type_id")
    private String partyTypeId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "party_status_id")
    private String partyStatusId;

    @ReadOnly
    @Column(name = "first_name")
    private String firstName;

    @ReadOnly
    @Column(name = "middle_name")
    private String middleName;

    @ReadOnly
    @Column(name = "last_name")
    private String lastName;

    @ReadOnly
    @Column(name = "first_name_local")
    private String firstNameLocal;

    @ReadOnly
    @Column(name = "last_name_local")
    private String lastNameLocal;

    @ReadOnly
    @Column(name = "personal_title")
    private String personalTitle;

    @ReadOnly
    @Column(name = "suffix")
    private String suffix;

    @ReadOnly
    @Column(name = "group_name")
    private String groupName;

    @ReadOnly
    @Column(name = "group_name_local")
    private String groupNameLocal;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @ReadOnly
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "relationship_name")
    private String relationshipName;

    @ReadOnly
    @Column(name = "security_group_id")
    private String securityGroupId;

    @ReadOnly
    @Column(name = "priority_type_id")
    private String priorityTypeId;

    @ReadOnly
    @Column(name = "party_relationship_type_id")
    private String partyRelationshipTypeId;

    @ReadOnly
    @Column(name = "permissions_enum_id")
    private String permissionsEnumId;

    @ReadOnly
    @Column(name = "position_title")
    private String positionTitle;

    @ReadOnly
    @Column(name = "comments")
    private String comments;
}
