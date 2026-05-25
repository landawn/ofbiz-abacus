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
@Table(name = "shipment_package_route_seg")
public class ShipmentPackageRouteSeg {
    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @Id
    @Column(name = "shipment_route_segment_id")
    private String shipmentRouteSegmentId;

    @Column(name = "tracking_code")
    private String trackingCode;

    @Column(name = "box_number")
    private String boxNumber;

    @Column(name = "label_image")
    private byte[] labelImage;

    @Column(name = "label_intl_sign_image")
    private byte[] labelIntlSignImage;

    @Column(name = "label_html")
    private String labelHtml;

    @Column(name = "label_printed")
    private String labelPrinted;

    @Column(name = "international_invoice")
    private byte[] internationalInvoice;

    @Column(name = "package_transport_cost")
    private double packageTransportCost;

    @Column(name = "package_service_cost")
    private double packageServiceCost;

    @Column(name = "package_other_cost")
    private double packageOtherCost;

    @Column(name = "cod_amount")
    private double codAmount;

    @Column(name = "insured_amount")
    private double insuredAmount;

    @Column(name = "currency_uom_id")
    private String currencyUomId;
}
