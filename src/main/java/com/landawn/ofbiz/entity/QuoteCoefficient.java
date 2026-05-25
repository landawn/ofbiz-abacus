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
@Table(name = "quote_coefficient")
public class QuoteCoefficient {
    @Id
    @Column(name = "quote_id")
    private String quoteId;

    @Id
    @Column(name = "coeff_name")
    private String coeffName;

    @Column(name = "coeff_value")
    private double coeffValue;

    @JoinedBy("quoteId=Quote.quoteId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Quote quote;
}
