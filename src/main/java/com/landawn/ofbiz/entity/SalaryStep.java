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
@Table(name = "salary_step")
public class SalaryStep {
    @Id
    @Column(name = "salary_step_seq_id")
    private String salaryStepSeqId;

    @Id
    @Column(name = "pay_grade_id")
    private String payGradeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "date_modified")
    private Timestamp dateModified;

    @Column(name = "amount")
    private double amount;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("payGradeId=PayGrade.payGradeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PayGrade payGrade;
}
