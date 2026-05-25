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
@Table(name = "segment_group_view_related_parties")
public class SegmentGroupViewRelatedParties {
    @ReadOnly
    @Column(name = "sgr_segment_group_id")
    private String sgrSegmentGroupId;

    @ReadOnly
    @Column(name = "sgr_party_id")
    private String sgrPartyId;

    @ReadOnly
    @Column(name = "sgr_role_type_id")
    private String sgrRoleTypeId;

    @ReadOnly
    @Column(name = "sgr_to_segment_group_id")
    private String sgrToSegmentGroupId;

    @ReadOnly
    @Column(name = "sgr_to_party_id")
    private String sgrToPartyId;

    @ReadOnly
    @Column(name = "sgr_to_role_type_id")
    private String sgrToRoleTypeId;

    @ReadOnly
    @Column(name = "pr_sgr_party_id_from")
    private String prSgrPartyIdFrom;

    @ReadOnly
    @Column(name = "pr_sgr_party_id_to")
    private String prSgrPartyIdTo;

    @ReadOnly
    @Column(name = "pr_sgr_role_type_id_from")
    private String prSgrRoleTypeIdFrom;

    @ReadOnly
    @Column(name = "pr_sgr_role_type_id_to")
    private String prSgrRoleTypeIdTo;

    @ReadOnly
    @Column(name = "pr_sgr_from_date")
    private String prSgrFromDate;

    @ReadOnly
    @Column(name = "pr_sgr_thru_date")
    private String prSgrThruDate;

    @ReadOnly
    @Column(name = "pr_sgr_status_id")
    private String prSgrStatusId;

    @ReadOnly
    @Column(name = "pr_sgr_relationship_name")
    private String prSgrRelationshipName;

    @ReadOnly
    @Column(name = "pr_sgr_security_group_id")
    private String prSgrSecurityGroupId;

    @ReadOnly
    @Column(name = "pr_sgr_priority_type_id")
    private String prSgrPriorityTypeId;

    @ReadOnly
    @Column(name = "pr_sgr_party_relationship_type_id")
    private String prSgrPartyRelationshipTypeId;

    @ReadOnly
    @Column(name = "pr_sgr_permissions_enum_id")
    private String prSgrPermissionsEnumId;

    @ReadOnly
    @Column(name = "pr_sgr_position_title")
    private String prSgrPositionTitle;

    @ReadOnly
    @Column(name = "pr_sgr_comments")
    private String prSgrComments;

    @ReadOnly
    @Column(name = "sgc_segment_group_id")
    private String sgcSegmentGroupId;

    @ReadOnly
    @Column(name = "sgc_party_classification_group_id")
    private String sgcPartyClassificationGroupId;

    @ReadOnly
    @Column(name = "pc_party_id")
    private String pcPartyId;

    @ReadOnly
    @Column(name = "pc_party_classification_group_id")
    private String pcPartyClassificationGroupId;

    @ReadOnly
    @Column(name = "pc_from_date")
    private String pcFromDate;

    @ReadOnly
    @Column(name = "pc_thru_date")
    private String pcThruDate;

    @ReadOnly
    @Column(name = "pr_pc_party_id_from")
    private String prPcPartyIdFrom;

    @ReadOnly
    @Column(name = "pr_pc_party_id_to")
    private String prPcPartyIdTo;

    @ReadOnly
    @Column(name = "pr_pc_role_type_id_from")
    private String prPcRoleTypeIdFrom;

    @ReadOnly
    @Column(name = "pr_pc_role_type_id_to")
    private String prPcRoleTypeIdTo;

    @ReadOnly
    @Column(name = "pr_pc_from_date")
    private String prPcFromDate;

    @ReadOnly
    @Column(name = "pr_pc_thru_date")
    private String prPcThruDate;

    @ReadOnly
    @Column(name = "pr_pc_status_id")
    private String prPcStatusId;

    @ReadOnly
    @Column(name = "pr_pc_relationship_name")
    private String prPcRelationshipName;

    @ReadOnly
    @Column(name = "pr_pc_security_group_id")
    private String prPcSecurityGroupId;

    @ReadOnly
    @Column(name = "pr_pc_priority_type_id")
    private String prPcPriorityTypeId;

    @ReadOnly
    @Column(name = "pr_pc_party_relationship_type_id")
    private String prPcPartyRelationshipTypeId;

    @ReadOnly
    @Column(name = "pr_pc_permissions_enum_id")
    private String prPcPermissionsEnumId;

    @ReadOnly
    @Column(name = "pr_pc_position_title")
    private String prPcPositionTitle;

    @ReadOnly
    @Column(name = "pr_pc_comments")
    private String prPcComments;
}
