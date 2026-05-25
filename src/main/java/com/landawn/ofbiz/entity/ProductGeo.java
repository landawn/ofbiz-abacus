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
@Table(name = "product_geo")
public class ProductGeo {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "geo_id")
    private String geoId;

    @Column(name = "product_geo_enum_id")
    private String productGeoEnumId;

    @Column(name = "description")
    private String description;
}
