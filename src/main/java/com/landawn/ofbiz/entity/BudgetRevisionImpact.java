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
@Table(name = "budget_revision_impact")
public class BudgetRevisionImpact {
    @Id
    @Column(name = "budget_id")
    private String budgetId;

    @Id
    @Column(name = "budget_item_seq_id")
    private String budgetItemSeqId;

    @Id
    @Column(name = "revision_seq_id")
    private String revisionSeqId;

    @Column(name = "revised_amount")
    private double revisedAmount;

    @Column(name = "add_delete_flag")
    private String addDeleteFlag;

    @Column(name = "revision_reason")
    private String revisionReason;
}
