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
@Table(name = "gl_account_organization_and_class")
public class GlAccountOrganizationAndClass {
    @ReadOnly
    @Column(name = "gl_account_id")
    private String glAccountId;

    @ReadOnly
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "gl_account_type_id")
    private String glAccountTypeId;

    @ReadOnly
    @Column(name = "gl_account_class_id")
    private String glAccountClassId;

    @ReadOnly
    @Column(name = "gl_resource_type_id")
    private String glResourceTypeId;

    @ReadOnly
    @Column(name = "gl_xbrl_class_id")
    private String glXbrlClassId;

    @ReadOnly
    @Column(name = "parent_gl_account_id")
    private String parentGlAccountId;

    @ReadOnly
    @Column(name = "account_code")
    private String accountCode;

    @ReadOnly
    @Column(name = "account_name")
    private String accountName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "external_id")
    private String externalId;
}
