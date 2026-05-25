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
@Table(name = "budget_item")
public class BudgetItem {
    @Id
    @Column(name = "budget_id")
    private String budgetId;

    @Id
    @Column(name = "budget_item_seq_id")
    private String budgetItemSeqId;

    @Column(name = "budget_item_type_id")
    private String budgetItemTypeId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "justification")
    private String justification;
}
