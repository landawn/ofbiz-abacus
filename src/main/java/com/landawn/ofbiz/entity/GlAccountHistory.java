package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "gl_account_history")
public class GlAccountHistory {
    @Id
    @Column(name = "gl_account_id")
    private String glAccountId;

    @Id
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Id
    @Column(name = "custom_time_period_id")
    private String customTimePeriodId;

    @Column(name = "opening_balance")
    private double openingBalance;

    @Column(name = "posted_debits")
    private double postedDebits;

    @Column(name = "posted_credits")
    private double postedCredits;

    @Column(name = "ending_balance")
    private double endingBalance;

    @JoinedBy("glAccountId=GlAccount.glAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccount glAccount;

    @JoinedBy("organizationPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("customTimePeriodId=CustomTimePeriod.customTimePeriodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomTimePeriod customTimePeriod;
}
