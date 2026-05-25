package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "invoice_item_assoc")
public class InvoiceItemAssoc {
    @Id
    @Column(name = "invoice_id_from")
    private String invoiceIdFrom;

    @Id
    @Column(name = "invoice_item_seq_id_from")
    private String invoiceItemSeqIdFrom;

    @Id
    @Column(name = "invoice_id_to")
    private String invoiceIdTo;

    @Id
    @Column(name = "invoice_item_seq_id_to")
    private String invoiceItemSeqIdTo;

    @Id
    @Column(name = "invoice_item_assoc_type_id")
    private String invoiceItemAssocTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Column(name = "party_id_to")
    private String partyIdTo;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "amount")
    private double amount;
}
