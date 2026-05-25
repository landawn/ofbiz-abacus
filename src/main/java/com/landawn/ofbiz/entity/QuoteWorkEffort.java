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
@Table(name = "quote_work_effort")
public class QuoteWorkEffort {
    @Id
    @Column(name = "quote_id")
    private String quoteId;

    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;
}
