package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;
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
@Table(name = "fixed_asset")
public class FixedAsset {
    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "fixed_asset_type_id")
    private String fixedAssetTypeId;

    @Column(name = "parent_fixed_asset_id")
    private String parentFixedAssetId;

    @Column(name = "instance_of_product_id")
    private String instanceOfProductId;

    @Column(name = "class_enum_id")
    private String classEnumId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "fixed_asset_name")
    private String fixedAssetName;

    @Column(name = "acquire_order_id")
    private String acquireOrderId;

    @Column(name = "acquire_order_item_seq_id")
    private String acquireOrderItemSeqId;

    @Column(name = "date_acquired")
    private Timestamp dateAcquired;

    @Column(name = "date_last_serviced")
    private Timestamp dateLastServiced;

    @Column(name = "date_next_service")
    private Timestamp dateNextService;

    @Column(name = "expected_end_of_life")
    private Date expectedEndOfLife;

    @Column(name = "actual_end_of_life")
    private Date actualEndOfLife;

    @Column(name = "production_capacity")
    private double productionCapacity;

    @Column(name = "uom_id")
    private String uomId;

    @Column(name = "calendar_id")
    private String calendarId;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "located_at_facility_id")
    private String locatedAtFacilityId;

    @Column(name = "located_at_location_seq_id")
    private String locatedAtLocationSeqId;

    @Column(name = "salvage_value")
    private double salvageValue;

    @Column(name = "depreciation")
    private double depreciation;

    @Column(name = "purchase_cost")
    private double purchaseCost;

    @Column(name = "purchase_cost_uom_id")
    private String purchaseCostUomId;

    @JoinedBy("fixedAssetTypeId=FixedAssetType.fixedAssetTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAssetType fixedAssetType;

    @JoinedBy("parentFixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;

    @JoinedBy("instanceOfProductId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("classEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("roleTypeId=RoleType.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RoleType roleType;

    @JoinedBy("acquireOrderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("acquireOrderId=OrderItem.orderId, acquireOrderItemSeqId=OrderItem.orderItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderItem orderItem;

    @JoinedBy("uomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("calendarId=TechDataCalendar.calendarId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TechDataCalendar techDataCalendar;

    @JoinedBy("locatedAtFacilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;
}
