package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "order_header_and_role_summary")
public class OrderHeaderAndRoleSummary {
    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_type_id")
    private String orderTypeId;

    @ReadOnly
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "total_grand_amount")
    private String totalGrandAmount;

    @ReadOnly
    @Column(name = "total_sub_remaining_amount")
    private String totalSubRemainingAmount;

    @ReadOnly
    @Column(name = "total_orders")
    private String totalOrders;
}
