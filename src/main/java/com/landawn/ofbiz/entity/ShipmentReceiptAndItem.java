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
@Table(name = "shipment_receipt_and_item")
public class ShipmentReceiptAndItem {
    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @ReadOnly
    @Column(name = "quantity_on_hand_total")
    private double quantityOnHandTotal;

    @ReadOnly
    @Column(name = "available_to_promise_total")
    private double availableToPromiseTotal;

    @ReadOnly
    @Column(name = "unit_cost")
    private double unitCost;

    @ReadOnly
    @Column(name = "lot_id")
    private String lotId;

    @ReadOnly
    @Column(name = "receipt_id")
    private String receiptId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "shipment_id")
    private String shipmentId;

    @ReadOnly
    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @ReadOnly
    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "return_id")
    private String returnId;

    @ReadOnly
    @Column(name = "return_item_seq_id")
    private String returnItemSeqId;

    @ReadOnly
    @Column(name = "rejection_id")
    private String rejectionId;

    @ReadOnly
    @Column(name = "received_by_user_login_id")
    private String receivedByUserLoginId;

    @ReadOnly
    @Column(name = "datetime_received")
    private Timestamp datetimeReceived;

    @ReadOnly
    @Column(name = "item_description")
    private String itemDescription;

    @ReadOnly
    @Column(name = "quantity_accepted")
    private double quantityAccepted;

    @ReadOnly
    @Column(name = "quantity_rejected")
    private double quantityRejected;
}
