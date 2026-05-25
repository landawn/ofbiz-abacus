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
@Table(name = "invoice_export")
public class InvoiceExport {
    @ReadOnly
    @Column(name = "invoice_id")
    private String invoiceId;

    @ReadOnly
    @Column(name = "invoice_date")
    private Timestamp invoiceDate;

    @ReadOnly
    @Column(name = "invoice_type_id")
    private String invoiceTypeId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id_from_trans")
    private String partyIdFromTrans;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "party_id_trans")
    private String partyIdTrans;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "reference_number")
    private String referenceNumber;

    @ReadOnly
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @ReadOnly
    @Column(name = "invoice_item_type_id")
    private String invoiceItemTypeId;

    @ReadOnly
    @Column(name = "item_description")
    private String itemDescription;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_id_trans")
    private String productIdTrans;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "amount")
    private double amount;
}
