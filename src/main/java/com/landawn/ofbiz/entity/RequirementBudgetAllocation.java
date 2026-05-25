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
@Table(name = "requirement_budget_allocation")
public class RequirementBudgetAllocation {
    @Id
    @Column(name = "budget_id")
    private String budgetId;

    @Id
    @Column(name = "budget_item_seq_id")
    private String budgetItemSeqId;

    @Id
    @Column(name = "requirement_id")
    private String requirementId;

    @Column(name = "amount")
    private double amount;

    @JoinedBy("budgetId=BudgetItem.budgetId, budgetItemSeqId=BudgetItem.budgetItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BudgetItem budgetItem;

    @JoinedBy("requirementId=Requirement.requirementId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Requirement requirement;
}
