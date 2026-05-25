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
@Table(name = "work_effort_billing")
public class WorkEffortBilling {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Column(name = "percentage")
    private Double percentage;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("invoiceId=InvoiceItem.invoiceId, invoiceItemSeqId=InvoiceItem.invoiceItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InvoiceItem invoiceItem;
}
