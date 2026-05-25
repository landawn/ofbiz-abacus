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
@Table(name = "contact_list_party_and_status")
public class ContactListPartyAndStatus {
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
    @Column(name = "status_date")
    private Timestamp statusDate;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "set_by_user_login_id")
    private String setByUserLoginId;

    @ReadOnly
    @Column(name = "opt_in_verify_code")
    private String optInVerifyCode;

    @ReadOnly
    @Column(name = "status_type_id")
    private String statusTypeId;

    @ReadOnly
    @Column(name = "status_code")
    private String statusCode;

    @ReadOnly
    @Column(name = "sequence_id")
    private String sequenceId;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
