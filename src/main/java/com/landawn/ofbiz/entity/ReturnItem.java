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
@Table(name = "return_item")
public class ReturnItem {
    @Id
    @Column(name = "return_id")
    private String returnId;

    @Id
    @Column(name = "return_item_seq_id")
    private String returnItemSeqId;

    @Column(name = "return_reason_id")
    private String returnReasonId;

    @Column(name = "return_type_id")
    private String returnTypeId;

    @Column(name = "return_item_type_id")
    private String returnItemTypeId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "description")
    private String description;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "expected_item_status")
    private String expectedItemStatus;

    @Column(name = "return_quantity")
    private double returnQuantity;

    @Column(name = "received_quantity")
    private double receivedQuantity;

    @Column(name = "return_price")
    private double returnPrice;

    @Column(name = "return_item_response_id")
    private String returnItemResponseId;
}
