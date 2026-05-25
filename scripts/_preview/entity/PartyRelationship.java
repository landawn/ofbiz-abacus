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
@Table(name = "party_relationship")
public class PartyRelationship {
    @Id
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Id
    @Column(name = "party_id_to")
    private String partyIdTo;

    @Id
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @Id
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "relationship_name")
    private String relationshipName;

    @Column(name = "security_group_id")
    private String securityGroupId;

    @Column(name = "priority_type_id")
    private String priorityTypeId;

    @Column(name = "party_relationship_type_id")
    private String partyRelationshipTypeId;

    @Column(name = "permissions_enum_id")
    private String permissionsEnumId;

    @Column(name = "position_title")
    private String positionTitle;

    @Column(name = "comments")
    private String comments;

    @JoinedBy("partyIdFrom=PartyRole.partyId, roleTypeIdFrom=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyFrom;

    @JoinedBy("partyIdTo=PartyRole.partyId, roleTypeIdTo=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyTo;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("priorityTypeId=PriorityType.priorityTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PriorityType priorityType;

    @JoinedBy("partyRelationshipTypeId=PartyRelationshipType.partyRelationshipTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRelationshipType partyRelationshipType;

    @JoinedBy("securityGroupId=SecurityGroup.groupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SecurityGroup securityGroup;
}
