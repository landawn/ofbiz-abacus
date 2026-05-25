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
}
