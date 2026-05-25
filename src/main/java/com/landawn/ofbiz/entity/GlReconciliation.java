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
@Table(name = "gl_reconciliation")
public class GlReconciliation {
    @Id
    @Column(name = "gl_reconciliation_id")
    private String glReconciliationId;

    @Column(name = "gl_reconciliation_name")
    private String glReconciliationName;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @Column(name = "gl_account_id")
    private String glAccountId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "reconciled_balance")
    private double reconciledBalance;

    @Column(name = "opening_balance")
    private double openingBalance;

    @Column(name = "reconciled_date")
    private Timestamp reconciledDate;

    @JoinedBy("glAccountId=GlAccount.glAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccount glAccount;

    @JoinedBy("organizationPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;
}
