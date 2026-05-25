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
@Table(name = "budget_status")
public class BudgetStatus {
    @Id
    @Column(name = "budget_id")
    private String budgetId;

    @Id
    @Column(name = "status_id")
    private String statusId;

    @Column(name = "status_date")
    private Timestamp statusDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;

    @JoinedBy("budgetId=Budget.budgetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Budget budget;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("changeByUserLoginId=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;
}
