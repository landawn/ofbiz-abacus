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
@Table(name = "geo_assoc")
public class GeoAssoc {
    @Id
    @Column(name = "geo_id")
    private String geoId;

    @Id
    @Column(name = "geo_id_to")
    private String geoIdTo;

    @Column(name = "geo_assoc_type_id")
    private String geoAssocTypeId;

    @JoinedBy("geoId=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geo;

    @JoinedBy("geoIdTo=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geoTo;

    @JoinedBy("geoAssocTypeId=GeoAssocType.geoAssocTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GeoAssocType geoAssocType;
}
