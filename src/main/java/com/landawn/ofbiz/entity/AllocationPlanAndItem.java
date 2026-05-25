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
@Table(name = "allocation_plan_and_item")
public class AllocationPlanAndItem {
    @ReadOnly
    @Column(name = "plan_id")
    private String planId;

    @ReadOnly
    @Column(name = "plan_name")
    private String planName;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "plan_type_id")
    private String planTypeId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "plan_item_seq_id")
    private String planItemSeqId;

    @ReadOnly
    @Column(name = "plan_item_status_id")
    private String planItemStatusId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "plan_method_enum_id")
    private String planMethodEnumId;

    @ReadOnly
    @Column(name = "allocated_quantity")
    private double allocatedQuantity;

    @ReadOnly
    @Column(name = "priority_seq_id")
    private String prioritySeqId;
}
