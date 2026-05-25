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
@Table(name = "system_property")
public class SystemProperty {
    @Id
    @Column(name = "system_resource_id")
    private String systemResourceId;

    @Id
    @Column(name = "system_property_id")
    private String systemPropertyId;

    @Column(name = "system_property_value")
    private String systemPropertyValue;

    @Column(name = "description")
    private String description;
}
