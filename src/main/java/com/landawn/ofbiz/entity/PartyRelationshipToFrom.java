package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "party_relationship_to_from")
public class PartyRelationshipToFrom {
    @ReadOnly
    @Column(name = "one_party_id_from")
    private String onePartyIdFrom;

    @ReadOnly
    @Column(name = "one_party_id_to")
    private String onePartyIdTo;

    @ReadOnly
    @Column(name = "one_role_type_id_from")
    private String oneRoleTypeIdFrom;

    @ReadOnly
    @Column(name = "one_role_type_id_to")
    private String oneRoleTypeIdTo;

    @ReadOnly
    @Column(name = "one_from_date")
    private String oneFromDate;

    @ReadOnly
    @Column(name = "one_thru_date")
    private String oneThruDate;

    @ReadOnly
    @Column(name = "one_status_id")
    private String oneStatusId;

    @ReadOnly
    @Column(name = "one_relationship_name")
    private String oneRelationshipName;

    @ReadOnly
    @Column(name = "one_security_group_id")
    private String oneSecurityGroupId;

    @ReadOnly
    @Column(name = "one_priority_type_id")
    private String onePriorityTypeId;

    @ReadOnly
    @Column(name = "one_party_relationship_type_id")
    private String onePartyRelationshipTypeId;

    @ReadOnly
    @Column(name = "one_permissions_enum_id")
    private String onePermissionsEnumId;

    @ReadOnly
    @Column(name = "one_position_title")
    private String onePositionTitle;

    @ReadOnly
    @Column(name = "one_comments")
    private String oneComments;

    @ReadOnly
    @Column(name = "two_party_id_from")
    private String twoPartyIdFrom;

    @ReadOnly
    @Column(name = "two_party_id_to")
    private String twoPartyIdTo;

    @ReadOnly
    @Column(name = "two_role_type_id_from")
    private String twoRoleTypeIdFrom;

    @ReadOnly
    @Column(name = "two_role_type_id_to")
    private String twoRoleTypeIdTo;

    @ReadOnly
    @Column(name = "two_from_date")
    private String twoFromDate;

    @ReadOnly
    @Column(name = "two_thru_date")
    private String twoThruDate;

    @ReadOnly
    @Column(name = "two_status_id")
    private String twoStatusId;

    @ReadOnly
    @Column(name = "two_relationship_name")
    private String twoRelationshipName;

    @ReadOnly
    @Column(name = "two_security_group_id")
    private String twoSecurityGroupId;

    @ReadOnly
    @Column(name = "two_priority_type_id")
    private String twoPriorityTypeId;

    @ReadOnly
    @Column(name = "two_party_relationship_type_id")
    private String twoPartyRelationshipTypeId;

    @ReadOnly
    @Column(name = "two_permissions_enum_id")
    private String twoPermissionsEnumId;

    @ReadOnly
    @Column(name = "two_position_title")
    private String twoPositionTitle;

    @ReadOnly
    @Column(name = "two_comments")
    private String twoComments;
}
