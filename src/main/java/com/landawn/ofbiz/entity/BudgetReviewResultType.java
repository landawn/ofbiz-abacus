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
@Table(name = "budget_review_result_type")
public class BudgetReviewResultType {
    @Id
    @Column(name = "budget_review_result_type_id")
    private String budgetReviewResultTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "comments")
    private String comments;
}
