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
@Table(name = "settlement_term")
public class SettlementTerm {
    @Id
    @Column(name = "settlement_term_id")
    private String settlementTermId;

    @Column(name = "term_name")
    private String termName;

    @Column(name = "term_value")
    private double termValue;

    @Column(name = "uom_id")
    private String uomId;
}
