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
@Table(name = "pay_history")
public class PayHistory {
    @Id
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @Id
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @Id
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Id
    @Column(name = "party_id_to")
    private String partyIdTo;

    @Id
    @Column(name = "empl_from_date")
    private Timestamp emplFromDate;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "salary_step_seq_id")
    private String salaryStepSeqId;

    @Column(name = "pay_grade_id")
    private String payGradeId;

    @Column(name = "period_type_id")
    private String periodTypeId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "comments")
    private String comments;

    @JoinedBy("roleTypeIdFrom=Employment.roleTypeIdFrom, roleTypeIdTo=Employment.roleTypeIdTo, partyIdFrom=Employment.partyIdFrom, partyIdTo=Employment.partyIdTo, emplFromDate=Employment.fromDate")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Employment employment;

    @JoinedBy("payGradeId=PayGrade.payGradeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PayGrade payGrade;

    @JoinedBy("periodTypeId=PeriodType.periodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PeriodType periodType;
}
