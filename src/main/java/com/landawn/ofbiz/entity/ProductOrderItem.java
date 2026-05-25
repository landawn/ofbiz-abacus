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
@Table(name = "product_order_item")
public class ProductOrderItem {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "engagement_id")
    private String engagementId;

    @Id
    @Column(name = "engagement_item_seq_id")
    private String engagementItemSeqId;

    @Column(name = "product_id")
    private String productId;
}
