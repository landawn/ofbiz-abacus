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
@Table(name = "fin_account_type_gl_account")
public class FinAccountTypeGlAccount {
    @Id
    @Column(name = "fin_account_type_id")
    private String finAccountTypeId;

    @Id
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "gl_account_id")
    private String glAccountId;

    @JoinedBy("finAccountTypeId=FinAccountType.finAccountTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccountType finAccountType;

    @JoinedBy("organizationPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("glAccountId=GlAccount.glAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccount glAccount;
}
