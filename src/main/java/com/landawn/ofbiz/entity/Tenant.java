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
@Table(name = "tenant")
public class Tenant {
    @Id
    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "tenant_name")
    private String tenantName;

    @Column(name = "initial_path")
    private String initialPath;

    @Column(name = "disabled")
    private String disabled;
}
