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
@Table(name = "order_header_item_and_ship_group")
public class OrderHeaderItemAndShipGroup {
    @ReadOnly
    @Column(name = "oi_quantity")
    private String oiQuantity;

    @ReadOnly
    @Column(name = "oi_cancel_quantity")
    private String oiCancelQuantity;

    @ReadOnly
    @Column(name = "oi_ship_after_date")
    private String oiShipAfterDate;

    @ReadOnly
    @Column(name = "oi_ship_before_date")
    private String oiShipBeforeDate;

    @ReadOnly
    @Column(name = "oi_estimated_ship_date")
    private String oiEstimatedShipDate;

    @ReadOnly
    @Column(name = "oi_estimated_delivery_date")
    private String oiEstimatedDeliveryDate;

    @ReadOnly
    @Column(name = "oi_status_id")
    private String oiStatusId;

    @ReadOnly
    @Column(name = "oi_external_id")
    private String oiExternalId;

    @ReadOnly
    @Column(name = "oi_sync_status_id")
    private String oiSyncStatusId;

    @ReadOnly
    @Column(name = "reserved_quantity")
    private String reservedQuantity;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

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

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "cancel_quantity")
    private double cancelQuantity;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "supplier_party_id")
    private String supplierPartyId;

    @ReadOnly
    @Column(name = "supplier_agreement_id")
    private String supplierAgreementId;

    @ReadOnly
    @Column(name = "vendor_party_id")
    private String vendorPartyId;

    @ReadOnly
    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @ReadOnly
    @Column(name = "carrier_role_type_id")
    private String carrierRoleTypeId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "telecom_contact_mech_id")
    private String telecomContactMechId;

    @ReadOnly
    @Column(name = "tracking_number")
    private String trackingNumber;

    @ReadOnly
    @Column(name = "shipping_instructions")
    private String shippingInstructions;

    @ReadOnly
    @Column(name = "may_split")
    private String maySplit;

    @ReadOnly
    @Column(name = "gift_message")
    private String giftMessage;

    @ReadOnly
    @Column(name = "is_gift")
    private String isGift;

    @ReadOnly
    @Column(name = "ship_after_date")
    private Timestamp shipAfterDate;

    @ReadOnly
    @Column(name = "ship_by_date")
    private Timestamp shipByDate;

    @ReadOnly
    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @ReadOnly
    @Column(name = "estimated_delivery_date")
    private Timestamp estimatedDeliveryDate;

    @ReadOnly
    @Column(name = "order_item_type_id")
    private String orderItemTypeId;

    @ReadOnly
    @Column(name = "order_item_group_seq_id")
    private String orderItemGroupSeqId;

    @ReadOnly
    @Column(name = "is_item_group_primary")
    private String isItemGroupPrimary;

    @ReadOnly
    @Column(name = "from_inventory_item_id")
    private String fromInventoryItemId;

    @ReadOnly
    @Column(name = "budget_id")
    private String budgetId;

    @ReadOnly
    @Column(name = "budget_item_seq_id")
    private String budgetItemSeqId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "supplier_product_id")
    private String supplierProductId;

    @ReadOnly
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @ReadOnly
    @Column(name = "prod_catalog_id")
    private String prodCatalogId;

    @ReadOnly
    @Column(name = "product_category_id")
    private String productCategoryId;

    @ReadOnly
    @Column(name = "is_promo")
    private String isPromo;

    @ReadOnly
    @Column(name = "quote_id")
    private String quoteId;

    @ReadOnly
    @Column(name = "quote_item_seq_id")
    private String quoteItemSeqId;

    @ReadOnly
    @Column(name = "shopping_list_id")
    private String shoppingListId;

    @ReadOnly
    @Column(name = "shopping_list_item_seq_id")
    private String shoppingListItemSeqId;

    @ReadOnly
    @Column(name = "subscription_id")
    private String subscriptionId;

    @ReadOnly
    @Column(name = "deployment_id")
    private String deploymentId;

    @ReadOnly
    @Column(name = "selected_amount")
    private double selectedAmount;

    @ReadOnly
    @Column(name = "unit_price")
    private double unitPrice;

    @ReadOnly
    @Column(name = "unit_list_price")
    private double unitListPrice;

    @ReadOnly
    @Column(name = "unit_average_cost")
    private double unitAverageCost;

    @ReadOnly
    @Column(name = "unit_recurring_price")
    private double unitRecurringPrice;

    @ReadOnly
    @Column(name = "discount_rate")
    private double discountRate;

    @ReadOnly
    @Column(name = "is_modified_price")
    private String isModifiedPrice;

    @ReadOnly
    @Column(name = "recurring_freq_uom_id")
    private String recurringFreqUomId;

    @ReadOnly
    @Column(name = "item_description")
    private String itemDescription;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "corresponding_po_id")
    private String correspondingPoId;

    @ReadOnly
    @Column(name = "auto_cancel_date")
    private Timestamp autoCancelDate;

    @ReadOnly
    @Column(name = "dont_cancel_set_date")
    private Timestamp dontCancelSetDate;

    @ReadOnly
    @Column(name = "dont_cancel_set_user_login")
    private String dontCancelSetUserLogin;

    @ReadOnly
    @Column(name = "reserve_after_date")
    private Timestamp reserveAfterDate;

    @ReadOnly
    @Column(name = "cancel_back_order_date")
    private Timestamp cancelBackOrderDate;

    @ReadOnly
    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @ReadOnly
    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

    @ReadOnly
    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;
}
