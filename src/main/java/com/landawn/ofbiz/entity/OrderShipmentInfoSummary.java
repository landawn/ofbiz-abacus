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
@Table(name = "order_shipment_info_summary")
public class OrderShipmentInfoSummary {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "shipment_id")
    private String shipmentId;

    @ReadOnly
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @ReadOnly
    @Column(name = "shipment_route_segment_id")
    private String shipmentRouteSegmentId;

    @ReadOnly
    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @ReadOnly
    @Column(name = "actual_start_date")
    private Timestamp actualStartDate;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @ReadOnly
    @Column(name = "tracking_code")
    private String trackingCode;

    @ReadOnly
    @Column(name = "box_number")
    private String boxNumber;
}
