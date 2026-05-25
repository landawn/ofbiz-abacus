package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "fixed_asset_and_geo_point")
public class FixedAssetAndGeoPoint {
    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "geo_point_id")
    private String geoPointId;

    @ReadOnly
    @Column(name = "geo_point_type_enum_id")
    private String geoPointTypeEnumId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "data_source_id")
    private String dataSourceId;

    @ReadOnly
    @Column(name = "latitude")
    private double latitude;

    @ReadOnly
    @Column(name = "longitude")
    private double longitude;

    @ReadOnly
    @Column(name = "elevation")
    private double elevation;

    @ReadOnly
    @Column(name = "elevation_uom_id")
    private String elevationUomId;

    @ReadOnly
    @Column(name = "information")
    private String information;
}
