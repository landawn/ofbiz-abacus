package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inventory_item_status_for_count")
public class InventoryItemStatusForCount {
    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "inventory_item_type_id")
    private String inventoryItemTypeId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "status_datetime")
    private Timestamp statusDatetime;

    @ReadOnly
    @Column(name = "status_end_datetime")
    private Timestamp statusEndDatetime;
}
