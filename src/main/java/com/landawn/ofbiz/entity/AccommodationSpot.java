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
@Table(name = "accommodation_spot")
public class AccommodationSpot {
    @Id
    @Column(name = "accommodation_spot_id")
    private String accommodationSpotId;

    @Column(name = "accommodation_class_id")
    private String accommodationClassId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "number_of_spaces")
    private double numberOfSpaces;

    @Column(name = "description")
    private String description;

    @JoinedBy("accommodationClassId=AccommodationClass.accommodationClassId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AccommodationClass accommodationClass;

    @JoinedBy("fixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;
}
