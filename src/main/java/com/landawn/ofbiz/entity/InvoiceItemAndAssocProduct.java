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
@Table(name = "invoice_item_and_assoc_product")
public class InvoiceItemAndAssocProduct {
    @ReadOnly
    @Column(name = "term_amount")
    private String termAmount;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_name")
    private String productName;

    @ReadOnly
    @Column(name = "amount")
    private double amount;

    @ReadOnly
    @Column(name = "invoice_id_from")
    private String invoiceIdFrom;

    @ReadOnly
    @Column(name = "invoice_item_seq_id_from")
    private String invoiceItemSeqIdFrom;

    @ReadOnly
    @Column(name = "invoice_id_to")
    private String invoiceIdTo;

    @ReadOnly
    @Column(name = "invoice_item_seq_id_to")
    private String invoiceItemSeqIdTo;

    @ReadOnly
    @Column(name = "invoice_item_assoc_type_id")
    private String invoiceItemAssocTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;
}
