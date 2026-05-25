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
@Table(name = "platform_type")
public class PlatformType {
    @Id
    @Column(name = "platform_type_id")
    private String platformTypeId;

    @Column(name = "platform_name")
    private String platformName;

    @Column(name = "platform_version")
    private String platformVersion;
}
