package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_item_and_ship_grp_inv_res_and_item_sum")
public class OrderItemAndShipGrpInvResAndItemSum {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "inventory_product_id")
    private String inventoryProductId;

    @ReadOnly
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @ReadOnly
    @Column(name = "quantity_ordered")
    private String quantityOrdered;

    @ReadOnly
    @Column(name = "tot_quantity_reserved")
    private String totQuantityReserved;

    @ReadOnly
    @Column(name = "tot_quantity_not_available")
    private String totQuantityNotAvailable;

    @ReadOnly
    @Column(name = "tot_quantity_available")
    private String totQuantityAvailable;
}
