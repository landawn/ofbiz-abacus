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
@Table(name = "item_issuance")
public class ItemIssuance {
    @Id
    @Column(name = "item_issuance_id")
    private String itemIssuanceId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "shipment_id")
    private String shipmentId;

    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "maint_hist_seq_id")
    private String maintHistSeqId;

    @Column(name = "issued_date_time")
    private Timestamp issuedDateTime;

    @Column(name = "issued_by_user_login_id")
    private String issuedByUserLoginId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "cancel_quantity")
    private double cancelQuantity;

    @JoinedBy("inventoryItemId=InventoryItem.inventoryItemId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItem inventoryItem;

    @JoinedBy("shipmentId=ShipmentItem.shipmentId, shipmentItemSeqId=ShipmentItem.shipmentItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentItem shipmentItem;

    @JoinedBy("fixedAssetId=FixedAssetMaint.fixedAssetId, maintHistSeqId=FixedAssetMaint.maintHistSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAssetMaint fixedAssetMaint;

    @JoinedBy("orderId=OrderItem.orderId, orderItemSeqId=OrderItem.orderItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderItem orderItem;

    @JoinedBy("issuedByUserLoginId=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;
}
