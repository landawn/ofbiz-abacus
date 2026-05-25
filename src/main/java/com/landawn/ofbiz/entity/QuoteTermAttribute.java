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
@Table(name = "quote_term_attribute")
public class QuoteTermAttribute {
    @Id
    @Column(name = "term_type_id")
    private String termTypeId;

    @Id
    @Column(name = "quote_id")
    private String quoteId;

    @Id
    @Column(name = "quote_item_seq_id")
    private String quoteItemSeqId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "attr_description")
    private String attrDescription;
}
