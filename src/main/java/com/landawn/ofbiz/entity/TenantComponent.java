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
@Table(name = "tenant_component")
public class TenantComponent {
    @Id
    @Column(name = "tenant_id")
    private String tenantId;

    @Id
    @Column(name = "component_name")
    private String componentName;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
