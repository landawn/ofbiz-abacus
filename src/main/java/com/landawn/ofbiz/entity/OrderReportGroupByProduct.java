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
@Table(name = "order_report_group_by_product")
public class OrderReportGroupByProduct {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ReadOnly
    @Column(name = "order_status_id")
    private String orderStatusId;

    @ReadOnly
    @Column(name = "order_item_status_id")
    private String orderItemStatusId;

    @ReadOnly
    @Column(name = "order_type_id")
    private String orderTypeId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "unit_price")
    private double unitPrice;
}
