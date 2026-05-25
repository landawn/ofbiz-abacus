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
@Table(name = "tracking_code_order_and_order_header")
public class TrackingCodeOrderAndOrderHeader {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "tracking_code_id")
    private String trackingCodeId;

    @ReadOnly
    @Column(name = "site_id")
    private String siteId;

    @ReadOnly
    @Column(name = "has_exported")
    private String hasExported;

    @ReadOnly
    @Column(name = "affiliate_referred_time_stamp")
    private Timestamp affiliateReferredTimeStamp;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;
}
