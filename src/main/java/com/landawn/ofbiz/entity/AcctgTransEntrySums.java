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
@Table(name = "acctg_trans_entry_sums")
public class AcctgTransEntrySums {
    @ReadOnly
    @Column(name = "gl_account_id")
    private String glAccountId;

    @ReadOnly
    @Column(name = "gl_account_type_id")
    private String glAccountTypeId;

    @ReadOnly
    @Column(name = "gl_account_class_id")
    private String glAccountClassId;

    @ReadOnly
    @Column(name = "account_name")
    private String accountName;

    @ReadOnly
    @Column(name = "account_code")
    private String accountCode;

    @ReadOnly
    @Column(name = "gl_fiscal_type_id")
    private String glFiscalTypeId;

    @ReadOnly
    @Column(name = "acctg_trans_type_id")
    private String acctgTransTypeId;

    @ReadOnly
    @Column(name = "debit_credit_flag")
    private String debitCreditFlag;

    @ReadOnly
    @Column(name = "amount")
    private double amount;

    @ReadOnly
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @ReadOnly
    @Column(name = "is_posted")
    private String isPosted;

    @ReadOnly
    @Column(name = "transaction_date")
    private Timestamp transactionDate;
}
