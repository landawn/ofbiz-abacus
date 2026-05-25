package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "facility")
public class Facility {
    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "facility_type_id")
    private String facilityTypeId;

    @Column(name = "parent_facility_id")
    private String parentFacilityId;

    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @Column(name = "default_inventory_item_type_id")
    private String defaultInventoryItemTypeId;

    @Column(name = "facility_name")
    private String facilityName;

    @Column(name = "primary_facility_group_id")
    private String primaryFacilityGroupId;

    @Column(name = "facility_size")
    private double facilitySize;

    @Column(name = "facility_size_uom_id")
    private String facilitySizeUomId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "default_days_to_ship")
    private double defaultDaysToShip;

    @Column(name = "opened_date")
    private Timestamp openedDate;

    @Column(name = "closed_date")
    private Timestamp closedDate;

    @Column(name = "description")
    private String description;

    @Column(name = "default_dimension_uom_id")
    private String defaultDimensionUomId;

    @Column(name = "default_weight_uom_id")
    private String defaultWeightUomId;

    @Column(name = "geo_point_id")
    private String geoPointId;

    @Column(name = "facility_level")
    private double facilityLevel;

    @Column(name = "auto_reserve_prun")
    private String autoReservePrun;

    @Column(name = "allow_inventory_reallocation")
    private String allowInventoryReallocation;

    @Column(name = "reconcile_prun_backorders")
    private String reconcilePrunBackorders;

    @JoinedBy("facilityTypeId=FacilityType.facilityTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FacilityType facilityType;

    @JoinedBy("parentFacilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("primaryFacilityGroupId=FacilityGroup.facilityGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FacilityGroup facilityGroup;

    @JoinedBy("ownerPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("defaultInventoryItemTypeId=InventoryItemType.inventoryItemTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItemType inventoryItemType;

    @JoinedBy("defaultDimensionUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom defaultDimensionUom;

    @JoinedBy("defaultWeightUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom defaultWeightUom;

    @JoinedBy("geoPointId=GeoPoint.geoPointId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GeoPoint geoPoint;

    @JoinedBy("facilitySizeUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom facilitySizeUom;
}
