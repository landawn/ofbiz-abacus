package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "inventory_item_status")
public class InventoryItemStatus {
    @Id
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Id
    @Column(name = "status_id")
    private String statusId;

    @Id
    @Column(name = "status_datetime")
    private Timestamp statusDatetime;

    @Column(name = "status_end_datetime")
    private Timestamp statusEndDatetime;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;

    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @Column(name = "product_id")
    private String productId;
}
