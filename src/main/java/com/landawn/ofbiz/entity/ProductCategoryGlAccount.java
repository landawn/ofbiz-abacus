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
@Table(name = "product_category_gl_account")
public class ProductCategoryGlAccount {
    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @Id
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Id
    @Column(name = "gl_account_type_id")
    private String glAccountTypeId;

    @Column(name = "gl_account_id")
    private String glAccountId;
}
