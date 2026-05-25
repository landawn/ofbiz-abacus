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
@Table(name = "budget_scenario_application")
public class BudgetScenarioApplication {
    @Id
    @Column(name = "budget_scenario_applic_id")
    private String budgetScenarioApplicId;

    @Id
    @Column(name = "budget_scenario_id")
    private String budgetScenarioId;

    @Column(name = "budget_id")
    private String budgetId;

    @Column(name = "budget_item_seq_id")
    private String budgetItemSeqId;

    @Column(name = "amount_change")
    private double amountChange;

    @Column(name = "percentage_change")
    private double percentageChange;
}
