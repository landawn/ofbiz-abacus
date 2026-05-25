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
@Table(name = "facility_location")
public class FacilityLocation {
    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @Column(name = "location_type_enum_id")
    private String locationTypeEnumId;

    @Column(name = "area_id")
    private String areaId;

    @Column(name = "aisle_id")
    private String aisleId;

    @Column(name = "section_id")
    private String sectionId;

    @Column(name = "level_id")
    private String levelId;

    @Column(name = "position_id")
    private String positionId;

    @Column(name = "geo_point_id")
    private String geoPointId;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("locationTypeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("geoPointId=GeoPoint.geoPointId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GeoPoint geoPoint;
}
