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
@Table(name = "fixed_asset_type_gl_account")
public class FixedAssetTypeGlAccount {
    @Id
    @Column(name = "fixed_asset_type_id")
    private String fixedAssetTypeId;

    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Id
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "asset_gl_account_id")
    private String assetGlAccountId;

    @Column(name = "acc_dep_gl_account_id")
    private String accDepGlAccountId;

    @Column(name = "dep_gl_account_id")
    private String depGlAccountId;

    @Column(name = "profit_gl_account_id")
    private String profitGlAccountId;

    @Column(name = "loss_gl_account_id")
    private String lossGlAccountId;
}
