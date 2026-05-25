package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_item_billing_and_invoice_and_item")
public class OrderItemBillingAndInvoiceAndItem {
    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "invoice_id")
    private String invoiceId;

    @ReadOnly
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @ReadOnly
    @Column(name = "item_issuance_id")
    private String itemIssuanceId;

    @ReadOnly
    @Column(name = "shipment_receipt_id")
    private String shipmentReceiptId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "amount")
    private double amount;
}
