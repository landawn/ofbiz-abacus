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

    @JoinedBy("custRequestId=CustRequest.custRequestId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustRequest custRequest;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;
}
