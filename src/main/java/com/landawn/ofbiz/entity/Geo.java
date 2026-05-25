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
@Table(name = "geo")
public class Geo {
    @Id
    @Column(name = "geo_id")
    private String geoId;

    @Column(name = "geo_type_id")
    private String geoTypeId;

    @Column(name = "geo_name")
    private String geoName;

    @Column(name = "geo_code")
    private String geoCode;

    @Column(name = "geo_sec_code")
    private String geoSecCode;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "well_known_text")
    private String wellKnownText;
}
