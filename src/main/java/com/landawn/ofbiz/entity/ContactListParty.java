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
}
