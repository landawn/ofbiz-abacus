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
@Table(name = "deduction")
public class Deduction {
    @Id
    @Column(name = "deduction_id")
    private String deductionId;

    @Column(name = "deduction_type_id")
    private String deductionTypeId;

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "amount")
    private double amount;
}
