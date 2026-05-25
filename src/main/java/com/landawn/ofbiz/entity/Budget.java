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
@Table(name = "budget")
public class Budget {
    @Id
    @Column(name = "budget_id")
    private String budgetId;

    @Column(name = "budget_type_id")
    private String budgetTypeId;

    @Column(name = "custom_time_period_id")
    private String customTimePeriodId;

    @Column(name = "comments")
    private String comments;

    @JoinedBy("budgetTypeId=BudgetType.budgetTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BudgetType budgetType;

    @JoinedBy("customTimePeriodId=CustomTimePeriod.customTimePeriodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomTimePeriod customTimePeriod;
}
