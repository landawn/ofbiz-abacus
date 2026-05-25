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
@Table(name = "quote_term")
public class QuoteTerm {
    @Id
    @Column(name = "term_type_id")
    private String termTypeId;

    @Id
    @Column(name = "quote_id")
    private String quoteId;

    @Id
    @Column(name = "quote_item_seq_id")
    private String quoteItemSeqId;

    @Column(name = "term_value")
    private double termValue;

    @Column(name = "uom_id")
    private String uomId;

    @Column(name = "term_days")
    private double termDays;

    @Column(name = "text_value")
    private String textValue;

    @Column(name = "description")
    private String description;
}
