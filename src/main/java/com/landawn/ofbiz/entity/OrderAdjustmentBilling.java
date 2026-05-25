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
@Table(name = "order_adjustment_billing")
public class OrderAdjustmentBilling {
    @Id
    @Column(name = "order_adjustment_id")
    private String orderAdjustmentId;

    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Column(name = "amount")
    private double amount;
}
