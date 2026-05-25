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
@Table(name = "product_facility_location_view")
public class ProductFacilityLocationView {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @ReadOnly
    @Column(name = "minimum_stock")
    private double minimumStock;

    @ReadOnly
    @Column(name = "move_quantity")
    private double moveQuantity;

    @ReadOnly
    @Column(name = "location_type_enum_id")
    private String locationTypeEnumId;

    @ReadOnly
    @Column(name = "area_id")
    private String areaId;

    @ReadOnly
    @Column(name = "aisle_id")
    private String aisleId;

    @ReadOnly
    @Column(name = "section_id")
    private String sectionId;

    @ReadOnly
    @Column(name = "level_id")
    private String levelId;

    @ReadOnly
    @Column(name = "position_id")
    private String positionId;

    @ReadOnly
    @Column(name = "geo_point_id")
    private String geoPointId;
}
