package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "country_tele_code_and_name")
public class CountryTeleCodeAndName {
    @ReadOnly
    @Column(name = "tele_code")
    private String teleCode;

    @ReadOnly
    @Column(name = "country_code")
    private String countryCode;

    @ReadOnly
    @Column(name = "country_name")
    private String countryName;
}
