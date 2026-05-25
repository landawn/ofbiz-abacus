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
@Table(name = "order_header")
public class OrderHeader {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_type_id")
    private String orderTypeId;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @Column(name = "priority")
    private String priority;

    @Column(name = "entry_date")
    private Timestamp entryDate;

    @Column(name = "pick_sheet_printed_date")
    private Timestamp pickSheetPrintedDate;

    @Column(name = "visit_id")
    private String visitId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "first_attempt_order_id")
    private String firstAttemptOrderId;

    @Column(name = "currency_uom")
    private String currencyUom;

    @Column(name = "sync_status_id")
    private String syncStatusId;

    @Column(name = "billing_account_id")
    private String billingAccountId;

    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @Column(name = "web_site_id")
    private String webSiteId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "agreement_id")
    private String agreementId;

    @Column(name = "terminal_id")
    private String terminalId;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "auto_order_shopping_list_id")
    private String autoOrderShoppingListId;

    @Column(name = "needs_inventory_issuance")
    private String needsInventoryIssuance;

    @Column(name = "is_rush_order")
    private String isRushOrder;

    @Column(name = "internal_code")
    private String internalCode;

    @Column(name = "remaining_sub_total")
    private double remainingSubTotal;

    @Column(name = "grand_total")
    private double grandTotal;

    @Column(name = "is_viewed")
    private String isViewed;

    @Column(name = "invoice_per_shipment")
    private String invoicePerShipment;
}
