package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "container_geo_point")
public class ContainerGeoPoint {
    @Id
    @Column(name = "container_id")
    private String containerId;

    @Id
    @Column(name = "geo_point_id")
    private String geoPointId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("containerId=Container.containerId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Container container;

    @JoinedBy("geoPointId=GeoPoint.geoPointId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GeoPoint geoPoint;
}
