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
@Table(name = "shipment_item_billing")
public class ShipmentItemBilling {
    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @JoinedBy("shipmentId=ShipmentItem.shipmentId, shipmentItemSeqId=ShipmentItem.shipmentItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentItem shipmentItem;

    @JoinedBy("invoiceId=InvoiceItem.invoiceId, invoiceItemSeqId=InvoiceItem.invoiceItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InvoiceItem invoiceItem;
}
