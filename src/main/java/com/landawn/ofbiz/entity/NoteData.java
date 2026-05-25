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
@Table(name = "note_data")
public class NoteData {
    @Id
    @Column(name = "note_id")
    private String noteId;

    @Column(name = "note_name")
    private String noteName;

    @Column(name = "note_info")
    private String noteInfo;

    @Column(name = "note_date_time")
    private Timestamp noteDateTime;

    @Column(name = "more_info_url")
    private String moreInfoUrl;

    @Column(name = "more_info_item_id")
    private String moreInfoItemId;

    @Column(name = "more_info_item_name")
    private String moreInfoItemName;

    @Column(name = "note_party")
    private String noteParty;

    @JoinedBy("noteParty=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;
}
