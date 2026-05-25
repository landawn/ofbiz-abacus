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
@Table(name = "inventory_transfer")
public class InventoryTransfer {
    @Id
    @Column(name = "inventory_transfer_id")
    private String inventoryTransferId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "location_seq_id")
    private String locationSeqId;

    @Column(name = "container_id")
    private String containerId;

    @Column(name = "facility_id_to")
    private String facilityIdTo;

    @Column(name = "location_seq_id_to")
    private String locationSeqIdTo;

    @Column(name = "container_id_to")
    private String containerIdTo;

    @Column(name = "item_issuance_id")
    private String itemIssuanceId;

    @Column(name = "send_date")
    private Timestamp sendDate;

    @Column(name = "receive_date")
    private Timestamp receiveDate;

    @Column(name = "comments")
    private String comments;

    @JoinedBy("inventoryItemId=InventoryItem.inventoryItemId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItem inventoryItem;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("containerId=Container.containerId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Container container;

    @JoinedBy("facilityIdTo=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facilityTo;

    @JoinedBy("containerIdTo=Container.containerId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Container containerTo;

    @JoinedBy("itemIssuanceId=ItemIssuance.itemIssuanceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ItemIssuance itemIssuance;
}
