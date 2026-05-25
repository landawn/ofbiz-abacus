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
@Table(name = "contact_list_party")
public class ContactListParty {
    @Id
    @Column(name = "contact_list_id")
    private String contactListId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "preferred_contact_mech_id")
    private String preferredContactMechId;

    @JoinedBy("contactListId=ContactList.contactListId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactList contactList;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("preferredContactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;
}
