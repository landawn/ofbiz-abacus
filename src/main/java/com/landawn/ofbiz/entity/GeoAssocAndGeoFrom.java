package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "geo_assoc_and_geo_from")
public class GeoAssocAndGeoFrom {
    @ReadOnly
    @Column(name = "geo_id_to")
    private String geoIdTo;

    @ReadOnly
    @Column(name = "geo_assoc_type_id")
    private String geoAssocTypeId;

    @ReadOnly
    @Column(name = "geo_id")
    private String geoId;

    @ReadOnly
    @Column(name = "geo_type_id")
    private String geoTypeId;

    @ReadOnly
    @Column(name = "geo_name")
    private String geoName;

    @ReadOnly
    @Column(name = "geo_code")
    private String geoCode;

    @ReadOnly
    @Column(name = "geo_sec_code")
    private String geoSecCode;

    @ReadOnly
    @Column(name = "abbreviation")
    private String abbreviation;

    @ReadOnly
    @Column(name = "well_known_text")
    private String wellKnownText;
}
