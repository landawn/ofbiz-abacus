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

    @JoinedBy("finAccountId=FinAccount.finAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccount finAccount;
}
