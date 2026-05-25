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
@Table(name = "country_tele_code")
public class CountryTeleCode {
    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "tele_code")
    private String teleCode;

    @JoinedBy("countryCode=CountryCode.countryCode")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CountryCode countryCodeCountryCode;
}
