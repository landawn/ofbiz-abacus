package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "payroll_preference")
public class PayrollPreference {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "payroll_preference_seq_id")
    private String payrollPreferenceSeqId;

    @Column(name = "deduction_type_id")
    private String deductionTypeId;

    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Column(name = "period_type_id")
    private String periodTypeId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "percentage")
    private Double percentage;

    @Column(name = "flat_amount")
    private double flatAmount;

    @Column(name = "routing_number")
    private String routingNumber;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "bank_name")
    private String bankName;
}
