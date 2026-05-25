package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "agreement_term")
public class AgreementTerm {
    @Id
    @Column(name = "agreement_term_id")
    private String agreementTermId;

    @Column(name = "term_type_id")
    private String termTypeId;

    @Column(name = "agreement_id")
    private String agreementId;

    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @Column(name = "invoice_item_type_id")
    private String invoiceItemTypeId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "term_value")
    private double termValue;

    @Column(name = "term_days")
    private double termDays;

    @Column(name = "text_value")
    private String textValue;

    @Column(name = "min_quantity")
    private Double minQuantity;

    @Column(name = "max_quantity")
    private Double maxQuantity;

    @Column(name = "description")
    private String description;

    @JoinedBy("termTypeId=TermType.termTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TermType termType;

    @JoinedBy("agreementId=Agreement.agreementId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Agreement agreement;

    @JoinedBy("agreementId=AgreementItem.agreementId, agreementItemSeqId=AgreementItem.agreementItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AgreementItem agreementItem;

    @JoinedBy("invoiceItemTypeId=InvoiceItemType.invoiceItemTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InvoiceItemType invoiceItemType;
}
