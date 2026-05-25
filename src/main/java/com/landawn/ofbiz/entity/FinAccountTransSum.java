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
@Table(name = "fin_account_trans_sum")
public class FinAccountTransSum {
    @ReadOnly
    @Column(name = "fin_account_id")
    private String finAccountId;

    @ReadOnly
    @Column(name = "fin_account_trans_type_id")
    private String finAccountTransTypeId;

    @ReadOnly
    @Column(name = "transaction_date")
    private Timestamp transactionDate;

    @ReadOnly
    @Column(name = "amount")
    private double amount;
}
