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
@Table(name = "fin_account_auth")
public class FinAccountAuth {
    @Id
    @Column(name = "fin_account_auth_id")
    private String finAccountAuthId;

    @Column(name = "fin_account_id")
    private String finAccountId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "authorization_date")
    private Timestamp authorizationDate;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
