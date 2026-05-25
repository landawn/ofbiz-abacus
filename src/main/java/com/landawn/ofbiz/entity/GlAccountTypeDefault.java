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
@Table(name = "gl_account_type_default")
public class GlAccountTypeDefault {
    @Id
    @Column(name = "gl_account_type_id")
    private String glAccountTypeId;

    @Id
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "gl_account_id")
    private String glAccountId;
}
