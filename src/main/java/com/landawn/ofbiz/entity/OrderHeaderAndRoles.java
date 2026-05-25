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
@Table(name = "order_header_and_roles")
public class OrderHeaderAndRoles {
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
    @Column(name = "order_name")
    private String orderName;

    @ReadOnly
    @Column(name = "external_id")
    private String externalId;

    @ReadOnly
    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @ReadOnly
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ReadOnly
    @Column(name = "priority")
    private double priority;

    @ReadOnly
    @Column(name = "entry_date")
    private Timestamp entryDate;

    @ReadOnly
    @Column(name = "pick_sheet_printed_date")
    private Timestamp pickSheetPrintedDate;

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
    @Column(name = "web_site_id")
    private String webSiteId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "agreement_id")
    private String agreementId;

    @ReadOnly
    @Column(name = "terminal_id")
    private String terminalId;

    @ReadOnly
    @Column(name = "transaction_id")
    private String transactionId;

    @ReadOnly
    @Column(name = "auto_order_shopping_list_id")
    private String autoOrderShoppingListId;

    @ReadOnly
    @Column(name = "needs_inventory_issuance")
    private String needsInventoryIssuance;

    @ReadOnly
    @Column(name = "is_rush_order")
    private String isRushOrder;

    @ReadOnly
    @Column(name = "internal_code")
    private String internalCode;

    @ReadOnly
    @Column(name = "remaining_sub_total")
    private double remainingSubTotal;

    @ReadOnly
    @Column(name = "grand_total")
    private double grandTotal;

    @ReadOnly
    @Column(name = "is_viewed")
    private String isViewed;

    @ReadOnly
    @Column(name = "invoice_per_shipment")
    private String invoicePerShipment;
}
