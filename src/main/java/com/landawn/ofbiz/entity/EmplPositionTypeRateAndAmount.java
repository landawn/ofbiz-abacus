package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empl_position_type_rate_and_amount")
public class EmplPositionTypeRateAndAmount {
    @ReadOnly
    @Column(name = "rate_amount")
    private double rateAmount;

    @ReadOnly
    @Column(name = "period_type_id")
    private String periodTypeId;

    @ReadOnly
    @Column(name = "rate_currency_uom_id")
    private String rateCurrencyUomId;

    @ReadOnly
    @Column(name = "rate_amount_from_date")
    private String rateAmountFromDate;

    @ReadOnly
    @Column(name = "rate_amount_thru_date")
    private String rateAmountThruDate;

    @ReadOnly
    @Column(name = "empl_position_type_id")
    private String emplPositionTypeId;

    @ReadOnly
    @Column(name = "rate_type_id")
    private String rateTypeId;

    @ReadOnly
    @Column(name = "pay_grade_id")
    private String payGradeId;

    @ReadOnly
    @Column(name = "salary_step_seq_id")
    private String salaryStepSeqId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;
}
