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
@Table(name = "empl_position_type_rate")
public class EmplPositionTypeRate {
    @Id
    @Column(name = "empl_position_type_id")
    private String emplPositionTypeId;

    @Id
    @Column(name = "rate_type_id")
    private String rateTypeId;

    @Column(name = "pay_grade_id")
    private String payGradeId;

    @Column(name = "salary_step_seq_id")
    private String salaryStepSeqId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("emplPositionTypeId=EmplPositionType.emplPositionTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private EmplPositionType emplPositionType;
}
