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
@Table(name = "order_header_and_payment_pref")
public class OrderHeaderAndPaymentPref {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ReadOnly
    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "terminal_id")
    private String terminalId;

    @ReadOnly
    @Column(name = "web_site_id")
    private String webSiteId;

    @ReadOnly
    @Column(name = "currency_uom")
    private String currencyUom;

    @ReadOnly
    @Column(name = "order_payment_preference_id")
    private String orderPaymentPreferenceId;

    @ReadOnly
    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @ReadOnly
    @Column(name = "order_status_id")
    private String orderStatusId;

    @ReadOnly
    @Column(name = "payment_status_id")
    private String paymentStatusId;

    @ReadOnly
    @Column(name = "max_amount")
    private double maxAmount;
}
