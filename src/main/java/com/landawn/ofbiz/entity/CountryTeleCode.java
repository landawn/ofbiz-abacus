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
@Table(name = "country_tele_code")
public class CountryTeleCode {
    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "tele_code")
    private String teleCode;
}
