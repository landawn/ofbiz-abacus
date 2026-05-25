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
@Table(name = "gl_acc_org_and_acctg_trans_and_entry")
public class GlAccOrgAndAcctgTransAndEntry {
    @ReadOnly
    @Column(name = "gl_account_id")
    private String glAccountId;

    @ReadOnly
    @Column(name = "debit_credit_flag")
    private String debitCreditFlag;

    @ReadOnly
    @Column(name = "is_posted")
    private String isPosted;

    @ReadOnly
    @Column(name = "transaction_date")
    private Timestamp transactionDate;

    @ReadOnly
    @Column(name = "acctg_trans_id")
    private String acctgTransId;

    @ReadOnly
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @ReadOnly
    @Column(name = "total_amount")
    private String totalAmount;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;
}
