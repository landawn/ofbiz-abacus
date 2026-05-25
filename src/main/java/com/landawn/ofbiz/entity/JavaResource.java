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
@Table(name = "java_resource")
public class JavaResource {
    @Id
    @Column(name = "resource_name")
    private String resourceName;

    @Column(name = "resource_value")
    private byte[] resourceValue;
}
