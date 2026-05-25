package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "budget_revision")
public class BudgetRevision {
    @Id
    @Column(name = "budget_id")
    private String budgetId;

    @Id
    @Column(name = "revision_seq_id")
    private String revisionSeqId;

    @Column(name = "date_revised")
    private Timestamp dateRevised;
}
