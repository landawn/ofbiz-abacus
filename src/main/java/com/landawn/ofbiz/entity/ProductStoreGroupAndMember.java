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
@Table(name = "product_store_group_and_member")
public class ProductStoreGroupAndMember {
    @ReadOnly
    @Column(name = "product_store_group_id")
    private String productStoreGroupId;

    @ReadOnly
    @Column(name = "product_store_group_type_id")
    private String productStoreGroupTypeId;

    @ReadOnly
    @Column(name = "primary_parent_group_id")
    private String primaryParentGroupId;

    @ReadOnly
    @Column(name = "product_store_group_name")
    private String productStoreGroupName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "primary_store_group_id")
    private String primaryStoreGroupId;

    @ReadOnly
    @Column(name = "store_name")
    private String storeName;

    @ReadOnly
    @Column(name = "company_name")
    private String companyName;

    @ReadOnly
    @Column(name = "title")
    private String title;

    @ReadOnly
    @Column(name = "subtitle")
    private String subtitle;

    @ReadOnly
    @Column(name = "pay_to_party_id")
    private String payToPartyId;

    @ReadOnly
    @Column(name = "days_to_cancel_non_pay")
    private double daysToCancelNonPay;

    @ReadOnly
    @Column(name = "manual_auth_is_capture")
    private String manualAuthIsCapture;

    @ReadOnly
    @Column(name = "prorate_shipping")
    private String prorateShipping;

    @ReadOnly
    @Column(name = "prorate_taxes")
    private String prorateTaxes;

    @ReadOnly
    @Column(name = "view_cart_on_add")
    private String viewCartOnAdd;

    @ReadOnly
    @Column(name = "auto_save_cart")
    private String autoSaveCart;

    @ReadOnly
    @Column(name = "auto_approve_reviews")
    private String autoApproveReviews;

    @ReadOnly
    @Column(name = "is_demo_store")
    private String isDemoStore;

    @ReadOnly
    @Column(name = "is_immediately_fulfilled")
    private String isImmediatelyFulfilled;

    @ReadOnly
    @Column(name = "inventory_facility_id")
    private String inventoryFacilityId;

    @ReadOnly
    @Column(name = "one_inventory_facility")
    private String oneInventoryFacility;

    @ReadOnly
    @Column(name = "check_inventory")
    private String checkInventory;

    @ReadOnly
    @Column(name = "reserve_inventory")
    private String reserveInventory;

    @ReadOnly
    @Column(name = "reserve_order_enum_id")
    private String reserveOrderEnumId;

    @ReadOnly
    @Column(name = "require_inventory")
    private String requireInventory;

    @ReadOnly
    @Column(name = "balance_res_on_order_creation")
    private String balanceResOnOrderCreation;

    @ReadOnly
    @Column(name = "requirement_method_enum_id")
    private String requirementMethodEnumId;

    @ReadOnly
    @Column(name = "order_number_prefix")
    private String orderNumberPrefix;

    @ReadOnly
    @Column(name = "default_locale_string")
    private String defaultLocaleString;

    @ReadOnly
    @Column(name = "default_currency_uom_id")
    private String defaultCurrencyUomId;

    @ReadOnly
    @Column(name = "default_time_zone_string")
    private String defaultTimeZoneString;

    @ReadOnly
    @Column(name = "default_sales_channel_enum_id")
    private String defaultSalesChannelEnumId;

    @ReadOnly
    @Column(name = "allow_password")
    private String allowPassword;

    @ReadOnly
    @Column(name = "default_password")
    private String defaultPassword;

    @ReadOnly
    @Column(name = "explode_order_items")
    private String explodeOrderItems;

    @ReadOnly
    @Column(name = "check_gc_balance")
    private String checkGcBalance;

    @ReadOnly
    @Column(name = "retry_failed_auths")
    private String retryFailedAuths;

    @ReadOnly
    @Column(name = "header_approved_status")
    private String headerApprovedStatus;

    @ReadOnly
    @Column(name = "item_approved_status")
    private String itemApprovedStatus;

    @ReadOnly
    @Column(name = "digital_item_approved_status")
    private String digitalItemApprovedStatus;

    @ReadOnly
    @Column(name = "header_declined_status")
    private String headerDeclinedStatus;

    @ReadOnly
    @Column(name = "item_declined_status")
    private String itemDeclinedStatus;

    @ReadOnly
    @Column(name = "header_cancel_status")
    private String headerCancelStatus;

    @ReadOnly
    @Column(name = "item_cancel_status")
    private String itemCancelStatus;

    @ReadOnly
    @Column(name = "auth_declined_message")
    private String authDeclinedMessage;

    @ReadOnly
    @Column(name = "auth_fraud_message")
    private String authFraudMessage;

    @ReadOnly
    @Column(name = "auth_error_message")
    private String authErrorMessage;

    @ReadOnly
    @Column(name = "visual_theme_id")
    private String visualThemeId;

    @ReadOnly
    @Column(name = "store_credit_account_enum_id")
    private String storeCreditAccountEnumId;

    @ReadOnly
    @Column(name = "use_primary_email_username")
    private String usePrimaryEmailUsername;

    @ReadOnly
    @Column(name = "require_customer_role")
    private String requireCustomerRole;

    @ReadOnly
    @Column(name = "auto_invoice_digital_items")
    private String autoInvoiceDigitalItems;

    @ReadOnly
    @Column(name = "req_ship_addr_for_dig_items")
    private String reqShipAddrForDigItems;

    @ReadOnly
    @Column(name = "show_checkout_gift_options")
    private String showCheckoutGiftOptions;

    @ReadOnly
    @Column(name = "select_payment_type_per_item")
    private String selectPaymentTypePerItem;

    @ReadOnly
    @Column(name = "show_prices_with_vat_tax")
    private String showPricesWithVatTax;

    @ReadOnly
    @Column(name = "show_tax_is_exempt")
    private String showTaxIsExempt;

    @ReadOnly
    @Column(name = "vat_tax_auth_geo_id")
    private String vatTaxAuthGeoId;

    @ReadOnly
    @Column(name = "vat_tax_auth_party_id")
    private String vatTaxAuthPartyId;

    @ReadOnly
    @Column(name = "enable_auto_suggestion_list")
    private String enableAutoSuggestionList;

    @ReadOnly
    @Column(name = "enable_dig_prod_upload")
    private String enableDigProdUpload;

    @ReadOnly
    @Column(name = "prod_search_exclude_variants")
    private String prodSearchExcludeVariants;

    @ReadOnly
    @Column(name = "dig_prod_upload_category_id")
    private String digProdUploadCategoryId;

    @ReadOnly
    @Column(name = "auto_order_cc_try_exp")
    private String autoOrderCcTryExp;

    @ReadOnly
    @Column(name = "auto_order_cc_try_other_cards")
    private String autoOrderCcTryOtherCards;

    @ReadOnly
    @Column(name = "auto_order_cc_try_later_nsf")
    private String autoOrderCcTryLaterNsf;

    @ReadOnly
    @Column(name = "auto_order_cc_try_later_max")
    private double autoOrderCcTryLaterMax;

    @ReadOnly
    @Column(name = "store_credit_valid_days")
    private double storeCreditValidDays;

    @ReadOnly
    @Column(name = "auto_approve_invoice")
    private String autoApproveInvoice;

    @ReadOnly
    @Column(name = "auto_approve_order")
    private String autoApproveOrder;

    @ReadOnly
    @Column(name = "ship_if_capture_fails")
    private String shipIfCaptureFails;

    @ReadOnly
    @Column(name = "set_owner_upon_issuance")
    private String setOwnerUponIssuance;

    @ReadOnly
    @Column(name = "req_return_inventory_receive")
    private String reqReturnInventoryReceive;

    @ReadOnly
    @Column(name = "add_to_cart_remove_incompat")
    private String addToCartRemoveIncompat;

    @ReadOnly
    @Column(name = "add_to_cart_replace_upsell")
    private String addToCartReplaceUpsell;

    @ReadOnly
    @Column(name = "split_pay_pref_per_shp_grp")
    private String splitPayPrefPerShpGrp;

    @ReadOnly
    @Column(name = "managed_by_lot")
    private String managedByLot;

    @ReadOnly
    @Column(name = "show_out_of_stock_products")
    private String showOutOfStockProducts;

    @ReadOnly
    @Column(name = "order_decimal_quantity")
    private String orderDecimalQuantity;

    @ReadOnly
    @Column(name = "allow_comment")
    private String allowComment;

    @ReadOnly
    @Column(name = "allocate_inventory")
    private String allocateInventory;
}
