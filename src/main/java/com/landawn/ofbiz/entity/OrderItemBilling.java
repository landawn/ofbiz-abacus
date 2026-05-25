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
@Table(name = "order_item_billing")
public class OrderItemBilling {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Column(name = "item_issuance_id")
    private String itemIssuanceId;

    @Column(name = "shipment_receipt_id")
    private String shipmentReceiptId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "amount")
    private double amount;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("orderId=OrderItem.orderId, orderItemSeqId=OrderItem.orderItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderItem orderItem;

    @JoinedBy("invoiceId=InvoiceItem.invoiceId, invoiceItemSeqId=InvoiceItem.invoiceItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InvoiceItem invoiceItem;

    @JoinedBy("shipmentReceiptId=ShipmentReceipt.receiptId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentReceipt shipmentReceipt;

    @JoinedBy("itemIssuanceId=ItemIssuance.itemIssuanceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ItemIssuance itemIssuance;
}
