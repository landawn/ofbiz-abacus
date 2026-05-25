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
@Table(name = "contact_list_party_status")
public class ContactListPartyStatus {
    @Id
    @Column(name = "contact_list_id")
    private String contactListId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Id
    @Column(name = "status_date")
    private Timestamp statusDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "set_by_user_login_id")
    private String setByUserLoginId;

    @Column(name = "opt_in_verify_code")
    private String optInVerifyCode;

    @JoinedBy("contactListId=ContactListParty.contactListId, partyId=ContactListParty.partyId, fromDate=ContactListParty.fromDate")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactListParty contactListParty;
}
