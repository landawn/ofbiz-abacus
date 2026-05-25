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
@Table(name = "order_delivery_schedule")
public class OrderDeliverySchedule {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "estimated_ready_date")
    private Timestamp estimatedReadyDate;

    @Column(name = "cartons")
    private double cartons;

    @Column(name = "skids_pallets")
    private double skidsPallets;

    @Column(name = "units_pieces")
    private double unitsPieces;

    @Column(name = "total_cubic_size")
    private double totalCubicSize;

    @Column(name = "total_cubic_uom_id")
    private String totalCubicUomId;

    @Column(name = "total_weight")
    private double totalWeight;

    @Column(name = "total_weight_uom_id")
    private String totalWeightUomId;

    @Column(name = "status_id")
    private String statusId;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("totalCubicUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom totalCubicUom;

    @JoinedBy("totalWeightUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom totalWeightUom;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;
}
