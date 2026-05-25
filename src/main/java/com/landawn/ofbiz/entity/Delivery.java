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
@Table(name = "delivery")
public class Delivery {
    @Id
    @Column(name = "delivery_id")
    private String deliveryId;

    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @Column(name = "dest_facility_id")
    private String destFacilityId;

    @Column(name = "actual_start_date")
    private Timestamp actualStartDate;

    @Column(name = "actual_arrival_date")
    private Timestamp actualArrivalDate;

    @Column(name = "estimated_start_date")
    private Timestamp estimatedStartDate;

    @Column(name = "estimated_arrival_date")
    private Timestamp estimatedArrivalDate;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "start_mileage")
    private double startMileage;

    @Column(name = "end_mileage")
    private double endMileage;

    @Column(name = "fuel_used")
    private double fuelUsed;
}
