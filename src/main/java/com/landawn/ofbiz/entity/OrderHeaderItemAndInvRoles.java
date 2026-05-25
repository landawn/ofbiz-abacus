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
@Table(name = "order_header_item_and_inv_roles")
public class OrderHeaderItemAndInvRoles {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "order_type_id")
    private String orderTypeId;

    @ReadOnly
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ReadOnly
    @Column(name = "entry_date")
    private Timestamp entryDate;

    @ReadOnly
    @Column(name = "visit_id")
    private String visitId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "created_by")
    private String createdBy;

    @ReadOnly
    @Column(name = "first_attempt_order_id")
    private String firstAttemptOrderId;

    @ReadOnly
    @Column(name = "currency_uom")
    private String currencyUom;

    @ReadOnly
    @Column(name = "sync_status_id")
    private String syncStatusId;

    @ReadOnly
    @Column(name = "billing_account_id")
    private String billingAccountId;

    @ReadOnly
    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "web_site_id")
    private String webSiteId;

    @ReadOnly
    @Column(name = "grand_total")
    private double grandTotal;

    @ReadOnly
    @Column(name = "remaining_sub_total")
    private double remainingSubTotal;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "unit_price")
    private double unitPrice;

    @ReadOnly
    @Column(name = "unit_list_price")
    private double unitListPrice;

    @ReadOnly
    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @ReadOnly
    @Column(name = "auto_cancel_date")
    private Timestamp autoCancelDate;

    @ReadOnly
    @Column(name = "corresponding_po_id")
    private String correspondingPoId;

    @ReadOnly
    @Column(name = "quantity_not_available")
    private double quantityNotAvailable;
}
