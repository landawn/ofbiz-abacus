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
@Table(name = "tenant_data_source")
public class TenantDataSource {
    @Id
    @Column(name = "tenant_id")
    private String tenantId;

    @Id
    @Column(name = "entity_group_name")
    private String entityGroupName;

    @Column(name = "jdbc_uri")
    private String jdbcUri;

    @Column(name = "jdbc_username")
    private String jdbcUsername;

    @Column(name = "jdbc_password")
    private String jdbcPassword;

    @JoinedBy("tenantId=Tenant.tenantId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Tenant tenant;
}
