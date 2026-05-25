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
@Table(name = "party_invitation_group_assoc")
public class PartyInvitationGroupAssoc {
    @Id
    @Column(name = "party_invitation_id")
    private String partyInvitationId;

    @Id
    @Column(name = "party_id_to")
    private String partyIdTo;
}
