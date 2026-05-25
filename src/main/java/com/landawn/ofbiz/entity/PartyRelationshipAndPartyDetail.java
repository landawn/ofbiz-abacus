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
@Table(name = "party_relationship_and_party_detail")
public class PartyRelationshipAndPartyDetail {
    @ReadOnly
    @Column(name = "rel_parent_type_id")
    private String relParentTypeId;

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
    @Column(name = "to_first_name")
    private String toFirstName;

    @ReadOnly
    @Column(name = "to_middle_name")
    private String toMiddleName;

    @ReadOnly
    @Column(name = "to_last_name")
    private String toLastName;

    @ReadOnly
    @Column(name = "tofirst_name_local")
    private String tofirstNameLocal;

    @ReadOnly
    @Column(name = "to_last_name_local")
    private String toLastNameLocal;

    @ReadOnly
    @Column(name = "to_personal_title")
    private String toPersonalTitle;

    @ReadOnly
    @Column(name = "to_suffix")
    private String toSuffix;

    @ReadOnly
    @Column(name = "to_group_name")
    private String toGroupName;

    @ReadOnly
    @Column(name = "to_group_name_local")
    private String toGroupNameLocal;

    @ReadOnly
    @Column(name = "from_first_name")
    private String fromFirstName;

    @ReadOnly
    @Column(name = "from_middle_name")
    private String fromMiddleName;

    @ReadOnly
    @Column(name = "from_last_name")
    private String fromLastName;

    @ReadOnly
    @Column(name = "fromfirst_name_local")
    private String fromfirstNameLocal;

    @ReadOnly
    @Column(name = "from_last_name_local")
    private String fromLastNameLocal;

    @ReadOnly
    @Column(name = "from_personal_title")
    private String fromPersonalTitle;

    @ReadOnly
    @Column(name = "from_suffix")
    private String fromSuffix;

    @ReadOnly
    @Column(name = "from_group_name")
    private String fromGroupName;

    @ReadOnly
    @Column(name = "from_group_name_local")
    private String fromGroupNameLocal;

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
