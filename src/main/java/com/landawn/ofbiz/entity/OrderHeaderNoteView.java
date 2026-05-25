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
@Table(name = "order_header_note_view")
public class OrderHeaderNoteView {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "internal_note")
    private String internalNote;

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
    @Column(name = "note_party")
    private String noteParty;
}
