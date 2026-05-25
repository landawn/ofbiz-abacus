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
@Table(name = "country_code")
public class CountryCode {
    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_abbr")
    private String countryAbbr;

    @Column(name = "country_number")
    private String countryNumber;

    @Column(name = "country_name")
    private String countryName;
}
