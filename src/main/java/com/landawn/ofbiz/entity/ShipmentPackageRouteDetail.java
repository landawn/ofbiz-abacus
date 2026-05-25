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
@Table(name = "shipment_package_route_detail")
public class ShipmentPackageRouteDetail {
    @ReadOnly
    @Column(name = "shipment_id")
    private String shipmentId;

    @ReadOnly
    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @ReadOnly
    @Column(name = "shipment_route_segment_id")
    private String shipmentRouteSegmentId;

    @ReadOnly
    @Column(name = "label_printed")
    private String labelPrinted;

    @ReadOnly
    @Column(name = "tracking_code")
    private String trackingCode;

    @ReadOnly
    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @ReadOnly
    @Column(name = "carrier_service_status_id")
    private String carrierServiceStatusId;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "primary_order_id")
    private String primaryOrderId;
}
