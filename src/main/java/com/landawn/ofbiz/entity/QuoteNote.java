package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "quote_note")
public class QuoteNote {
    @Id
    @Column(name = "quote_id")
    private String quoteId;

    @Id
    @Column(name = "note_id")
    private String noteId;

    @JoinedBy("quoteId=Quote.quoteId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Quote quote;

    @JoinedBy("noteId=NoteData.noteId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private NoteData noteData;
}
