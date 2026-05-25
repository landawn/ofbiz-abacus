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
@Table(name = "invoice_note")
public class InvoiceNote {
    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "note_id")
    private String noteId;
}
