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
@Table(name = "budget_scenario_rule")
public class BudgetScenarioRule {
    @Id
    @Column(name = "budget_scenario_id")
    private String budgetScenarioId;

    @Id
    @Column(name = "budget_item_type_id")
    private String budgetItemTypeId;

    @Column(name = "amount_change")
    private double amountChange;

    @Column(name = "percentage_change")
    private double percentageChange;

    @JoinedBy("budgetScenarioId=BudgetScenario.budgetScenarioId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BudgetScenario budgetScenario;

    @JoinedBy("budgetItemTypeId=BudgetItemType.budgetItemTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BudgetItemType budgetItemType;
}
