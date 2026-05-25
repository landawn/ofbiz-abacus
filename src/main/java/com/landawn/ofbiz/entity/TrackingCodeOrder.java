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
@Table(name = "tracking_code_order")
public class TrackingCodeOrder {
    @Id
    @Column(name = "order_id")
    private String orderId;

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

    @JoinedBy("orderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("trackingCodeId=TrackingCode.trackingCodeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TrackingCode trackingCode;

    @JoinedBy("trackingCodeTypeId=TrackingCodeType.trackingCodeTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TrackingCodeType trackingCodeType;
}
