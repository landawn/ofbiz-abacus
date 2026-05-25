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
@Table(name = "order_header_note")
public class OrderHeaderNote {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "note_id")
    private String noteId;

    @Column(name = "internal_note")
    private String internalNote;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("noteId=NoteData.noteId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private NoteData noteData;
}
