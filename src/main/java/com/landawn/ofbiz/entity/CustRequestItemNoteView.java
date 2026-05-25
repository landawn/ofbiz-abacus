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
@Table(name = "cust_request_item_note_view")
public class CustRequestItemNoteView {
    @ReadOnly
    @Column(name = "cust_request_id")
    private String custRequestId;

    @ReadOnly
    @Column(name = "cust_request_item_seq_id")
    private String custRequestItemSeqId;

    @ReadOnly
    @Column(name = "note_id")
    private String noteId;

    @ReadOnly
    @Column(name = "note_name")
    private String noteName;

    @ReadOnly
    @Column(name = "note_info")
    private String noteInfo;

    @ReadOnly
    @Column(name = "note_date_time")
    private Timestamp noteDateTime;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "first_name")
    private String firstName;

    @ReadOnly
    @Column(name = "last_name")
    private String lastName;
}
