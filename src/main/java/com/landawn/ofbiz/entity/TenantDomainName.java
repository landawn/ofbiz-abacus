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
@Table(name = "tenant_domain_name")
public class TenantDomainName {
    @Column(name = "tenant_id")
    private String tenantId;

    @Id
    @Column(name = "domain_name")
    private String domainName;
}
