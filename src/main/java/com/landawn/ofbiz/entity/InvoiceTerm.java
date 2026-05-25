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
@Table(name = "invoice_term")
public class InvoiceTerm {
    @Id
    @Column(name = "invoice_term_id")
    private String invoiceTermId;

    @Column(name = "term_type_id")
    private String termTypeId;

    @Column(name = "invoice_id")
    private String invoiceId;

    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Column(name = "term_value")
    private double termValue;

    @Column(name = "term_days")
    private double termDays;

    @Column(name = "text_value")
    private String textValue;

    @Column(name = "description")
    private String description;

    @Column(name = "uom_id")
    private String uomId;

    @JoinedBy("termTypeId=TermType.termTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TermType termType;

    @JoinedBy("invoiceId=Invoice.invoiceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Invoice invoice;
}
