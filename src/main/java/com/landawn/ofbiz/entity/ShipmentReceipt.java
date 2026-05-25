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
@Table(name = "shipment_receipt")
public class ShipmentReceipt {
    @Id
    @Column(name = "receipt_id")
    private String receiptId;

    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "shipment_id")
    private String shipmentId;

    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "return_id")
    private String returnId;

    @Column(name = "return_item_seq_id")
    private String returnItemSeqId;

    @Column(name = "rejection_id")
    private String rejectionId;

    @Column(name = "received_by_user_login_id")
    private String receivedByUserLoginId;

    @Column(name = "datetime_received")
    private Timestamp datetimeReceived;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "quantity_accepted")
    private double quantityAccepted;

    @Column(name = "quantity_rejected")
    private double quantityRejected;
}
