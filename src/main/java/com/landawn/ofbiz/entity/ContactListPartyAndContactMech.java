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
@Table(name = "contact_list_party_and_contact_mech")
public class ContactListPartyAndContactMech {
    @ReadOnly
    @Column(name = "contact_from_date")
    private String contactFromDate;

    @ReadOnly
    @Column(name = "contact_thru_date")
    private String contactThruDate;

    @ReadOnly
    @Column(name = "contact_list_id")
    private String contactListId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

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
    @Column(name = "preferred_contact_mech_id")
    private String preferredContactMechId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @ReadOnly
    @Column(name = "info_string")
    private String infoString;
}
