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
@Table(name = "country_capital")
public class CountryCapital {
    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_capital")
    private String countryCapital;

    @JoinedBy("countryCode=CountryCode.countryCode")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CountryCode countryCodeCountryCode;
}
