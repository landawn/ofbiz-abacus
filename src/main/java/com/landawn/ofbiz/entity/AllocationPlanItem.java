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
@Table(name = "allocation_plan_item")
public class AllocationPlanItem {
    @Id
    @Column(name = "plan_id")
    private String planId;

    @Id
    @Column(name = "plan_item_seq_id")
    private String planItemSeqId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "plan_method_enum_id")
    private String planMethodEnumId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "allocated_quantity")
    private double allocatedQuantity;

    @Column(name = "priority_seq_id")
    private String prioritySeqId;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
