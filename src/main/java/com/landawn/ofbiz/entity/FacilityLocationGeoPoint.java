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
@Table(name = "facility_location_geo_point")
public class FacilityLocationGeoPoint {
    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @Id
    @Column(name = "geo_point_id")
    private String geoPointId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
