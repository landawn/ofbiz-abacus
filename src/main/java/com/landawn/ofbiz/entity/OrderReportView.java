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
@Table(name = "order_report_view")
public class OrderReportView {
    @ReadOnly
    @Column(name = "group_name")
    private String groupName;

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
    @Column(name = "order_status")
    private String orderStatus;

    @ReadOnly
    @Column(name = "payment_method")
    private String paymentMethod;

    @ReadOnly
    @Column(name = "visit_id")
    private String visitId;

    @ReadOnly
    @Column(name = "currency_uom")
    private String currencyUom;

    @ReadOnly
    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @ReadOnly
    @Column(name = "web_site_id")
    private String webSiteId;

    @ReadOnly
    @Column(name = "grand_total")
    private double grandTotal;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "item_description")
    private String itemDescription;

    @ReadOnly
    @Column(name = "item_status")
    private String itemStatus;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "unit_price")
    private double unitPrice;
}
