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
@Table(name = "packed_qty_vs_order_item_quantity")
public class PackedQtyVsOrderItemQuantity {
    @ReadOnly
    @Column(name = "shipment_id")
    private String shipmentId;

    @ReadOnly
    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @ReadOnly
    @Column(name = "packed_quantity")
    private String packedQuantity;

    @ReadOnly
    @Column(name = "issued_quantity")
    private String issuedQuantity;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "ordered_quantity")
    private String orderedQuantity;
}
