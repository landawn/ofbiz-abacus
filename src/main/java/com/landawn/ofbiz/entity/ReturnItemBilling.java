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
@Table(name = "return_item_billing")
public class ReturnItemBilling {
    @Id
    @Column(name = "return_id")
    private String returnId;

    @Id
    @Column(name = "return_item_seq_id")
    private String returnItemSeqId;

    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Column(name = "shipment_receipt_id")
    private String shipmentReceiptId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "amount")
    private double amount;

    @JoinedBy("returnId=ReturnHeader.returnId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnHeader returnHeader;

    @JoinedBy("returnId=ReturnItem.returnId, returnItemSeqId=ReturnItem.returnItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnItem returnItem;

    @JoinedBy("invoiceId=InvoiceItem.invoiceId, invoiceItemSeqId=InvoiceItem.invoiceItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InvoiceItem invoiceItem;

    @JoinedBy("shipmentReceiptId=ShipmentReceipt.receiptId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentReceipt shipmentReceipt;
}
