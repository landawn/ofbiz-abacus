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
@Table(name = "geo_point")
public class GeoPoint {
    @Id
    @Column(name = "geo_point_id")
    private String geoPointId;

    @Column(name = "geo_point_type_enum_id")
    private String geoPointTypeEnumId;

    @Column(name = "description")
    private String description;

    @Column(name = "data_source_id")
    private String dataSourceId;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "elevation")
    private double elevation;

    @Column(name = "elevation_uom_id")
    private String elevationUomId;

    @Column(name = "information")
    private String information;
}
