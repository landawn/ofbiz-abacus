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
@Table(name = "tracking_code_order_return")
public class TrackingCodeOrderReturn {
    @Id
    @Column(name = "return_id")
    private String returnId;

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Id
    @Column(name = "tracking_code_type_id")
    private String trackingCodeTypeId;

    @Column(name = "tracking_code_id")
    private String trackingCodeId;

    @Column(name = "is_billable")
    private String isBillable;

    @Column(name = "site_id")
    private String siteId;

    @Column(name = "has_exported")
    private String hasExported;

    @Column(name = "affiliate_referred_time_stamp")
    private Timestamp affiliateReferredTimeStamp;
}
