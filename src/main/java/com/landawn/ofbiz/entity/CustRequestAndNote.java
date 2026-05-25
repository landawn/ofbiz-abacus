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
@Table(name = "cust_request_and_note")
public class CustRequestAndNote {
    @ReadOnly
    @Column(name = "cust_request_id")
    private String custRequestId;

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
    @Column(name = "more_info_url")
    private String moreInfoUrl;

    @ReadOnly
    @Column(name = "more_info_item_id")
    private String moreInfoItemId;

    @ReadOnly
    @Column(name = "more_info_item_name")
    private String moreInfoItemName;

    @ReadOnly
    @Column(name = "note_party")
    private String noteParty;
}
