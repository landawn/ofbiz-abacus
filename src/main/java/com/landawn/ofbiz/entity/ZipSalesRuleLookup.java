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
@Table(name = "zip_sales_rule_lookup")
public class ZipSalesRuleLookup {
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

    @Column(name = "id_code")
    private String idCode;

    @Column(name = "taxable")
    private String taxable;

    @Column(name = "ship_cond")
    private String shipCond;
}
