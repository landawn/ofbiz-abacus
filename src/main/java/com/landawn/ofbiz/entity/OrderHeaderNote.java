package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
