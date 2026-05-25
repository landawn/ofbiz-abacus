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
@Table(name = "accommodation_map")
public class AccommodationMap {
    @Id
    @Column(name = "accommodation_map_id")
    private String accommodationMapId;

    @Column(name = "accommodation_class_id")
    private String accommodationClassId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "accommodation_map_type_id")
    private String accommodationMapTypeId;

    @Column(name = "number_of_spaces")
    private double numberOfSpaces;
}
