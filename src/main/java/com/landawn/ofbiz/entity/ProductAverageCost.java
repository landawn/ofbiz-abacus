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
@Table(name = "product_average_cost")
public class ProductAverageCost {
    @Id
    @Column(name = "product_average_cost_type_id")
    private String productAverageCostTypeId;

    @Id
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "average_cost")
    private double averageCost;
}
