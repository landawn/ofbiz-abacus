package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "work_order_item_fulfillment")
public class WorkOrderItemFulfillment {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("orderId=OrderItem.orderId, orderItemSeqId=OrderItem.orderItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderItem orderItem;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;
}
