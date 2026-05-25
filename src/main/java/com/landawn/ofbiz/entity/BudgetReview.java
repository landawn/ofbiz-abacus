package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "budget_review")
public class BudgetReview {
    @Id
    @Column(name = "budget_id")
    private String budgetId;

    @Id
    @Column(name = "budget_review_id")
    private String budgetReviewId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "budget_review_result_type_id")
    private String budgetReviewResultTypeId;

    @Column(name = "review_date")
    private Timestamp reviewDate;

    @JoinedBy("budgetId=Budget.budgetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Budget budget;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("budgetReviewResultTypeId=BudgetReviewResultType.budgetReviewResultTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BudgetReviewResultType budgetReviewResultType;
}
