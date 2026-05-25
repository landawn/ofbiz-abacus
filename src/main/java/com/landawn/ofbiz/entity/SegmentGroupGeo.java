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
@Table(name = "segment_group_geo")
public class SegmentGroupGeo {
    @Id
    @Column(name = "segment_group_id")
    private String segmentGroupId;

    @Id
    @Column(name = "geo_id")
    private String geoId;

    @JoinedBy("segmentGroupId=SegmentGroup.segmentGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SegmentGroup segmentGroup;

    @JoinedBy("geoId=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geo;
}
