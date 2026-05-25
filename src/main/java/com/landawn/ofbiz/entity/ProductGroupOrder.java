package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "product_group_order")
public class ProductGroupOrder {
    @Id
    @Column(name = "group_order_id")
    private String groupOrderId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "req_order_qty")
    private double reqOrderQty;

    @Column(name = "sold_order_qty")
    private double soldOrderQty;

    @Column(name = "job_id")
    private String jobId;
}
