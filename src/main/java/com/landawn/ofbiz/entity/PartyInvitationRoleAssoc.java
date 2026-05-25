package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "party_invitation_role_assoc")
public class PartyInvitationRoleAssoc {
    @Id
    @Column(name = "party_invitation_id")
    private String partyInvitationId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;
}
