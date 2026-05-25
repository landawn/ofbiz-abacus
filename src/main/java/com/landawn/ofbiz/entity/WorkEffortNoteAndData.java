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
@Table(name = "work_effort_note_and_data")
public class WorkEffortNoteAndData {
    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

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
    @Column(name = "note_party")
    private String noteParty;

    @ReadOnly
    @Column(name = "note_date_time")
    private Timestamp noteDateTime;
}
