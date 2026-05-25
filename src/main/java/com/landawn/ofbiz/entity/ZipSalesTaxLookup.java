package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "zip_sales_tax_lookup")
public class ZipSalesTaxLookup {
    @Id
    @Column(name = "zip_code")
    private String zipCode;

    @Id
    @Column(name = "state_code")
    private String stateCode;

    @Id
    @Column(name = "city")
    private String city;

    @Id
    @Column(name = "county")
    private String county;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "county_fips")
    private String countyFips;

    @Column(name = "county_default")
    private String countyDefault;

    @Column(name = "general_default")
    private String generalDefault;

    @Column(name = "inside_city")
    private String insideCity;

    @Column(name = "geo_code")
    private String geoCode;

    @Column(name = "state_sales_tax")
    private double stateSalesTax;

    @Column(name = "city_sales_tax")
    private double citySalesTax;

    @Column(name = "city_local_sales_tax")
    private double cityLocalSalesTax;

    @Column(name = "county_sales_tax")
    private double countySalesTax;

    @Column(name = "county_local_sales_tax")
    private double countyLocalSalesTax;

    @Column(name = "combo_sales_tax")
    private double comboSalesTax;

    @Column(name = "state_use_tax")
    private double stateUseTax;

    @Column(name = "city_use_tax")
    private double cityUseTax;

    @Column(name = "city_local_use_tax")
    private double cityLocalUseTax;

    @Column(name = "county_use_tax")
    private double countyUseTax;

    @Column(name = "county_local_use_tax")
    private double countyLocalUseTax;

    @Column(name = "combo_use_tax")
    private double comboUseTax;
}
