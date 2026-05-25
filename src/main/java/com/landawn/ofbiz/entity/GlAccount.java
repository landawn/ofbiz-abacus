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
@Table(name = "gl_account")
public class GlAccount {
    @Id
    @Column(name = "gl_account_id")
    private String glAccountId;

    @Column(name = "gl_account_type_id")
    private String glAccountTypeId;

    @Column(name = "gl_account_class_id")
    private String glAccountClassId;

    @Column(name = "gl_resource_type_id")
    private String glResourceTypeId;

    @Column(name = "gl_xbrl_class_id")
    private String glXbrlClassId;

    @Column(name = "parent_gl_account_id")
    private String parentGlAccountId;

    @Column(name = "account_code")
    private String accountCode;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "description")
    private String description;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "external_id")
    private String externalId;
}
