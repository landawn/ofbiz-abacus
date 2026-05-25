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
@Table(name = "browser_type")
public class BrowserType {
    @Id
    @Column(name = "browser_type_id")
    private String browserTypeId;

    @Column(name = "browser_name")
    private String browserName;

    @Column(name = "browser_version")
    private String browserVersion;
}
