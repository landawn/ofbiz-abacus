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
@Table(name = "sales_opportunity_quote")
public class SalesOpportunityQuote {
    @Id
    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

    @Id
    @Column(name = "quote_id")
    private String quoteId;
}
