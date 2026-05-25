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
@Table(name = "responding_party")
public class RespondingParty {
    @Id
    @Column(name = "responding_party_seq_id")
    private String respondingPartySeqId;

    @Id
    @Column(name = "cust_request_id")
    private String custRequestId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "date_sent")
    private Timestamp dateSent;
}
