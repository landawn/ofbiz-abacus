package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "party_invitation")
public class PartyInvitation {
    @Id
    @Column(name = "party_invitation_id")
    private String partyInvitationId;

    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "to_name")
    private String toName;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "last_invite_date")
    private Timestamp lastInviteDate;
}
