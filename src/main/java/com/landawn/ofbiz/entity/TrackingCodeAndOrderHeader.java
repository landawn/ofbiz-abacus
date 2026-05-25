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
@Table(name = "tracking_code_and_order_header")
public class TrackingCodeAndOrderHeader {
    @ReadOnly
    @Column(name = "grand_total")
    private double grandTotal;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ReadOnly
    @Column(name = "tracking_code_id")
    private String trackingCodeId;
}
