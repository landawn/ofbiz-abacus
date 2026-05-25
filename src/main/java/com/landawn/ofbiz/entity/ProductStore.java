package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_store")
public class ProductStore {
    @Id
    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "primary_store_group_id")
    private String primaryStoreGroupId;

    @Column(name = "store_name")
    private String storeName;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "pay_to_party_id")
    private String payToPartyId;

    @Column(name = "days_to_cancel_non_pay")
    private double daysToCancelNonPay;

    @Column(name = "manual_auth_is_capture")
    private String manualAuthIsCapture;

    @Column(name = "prorate_shipping")
    private String prorateShipping;

    @Column(name = "prorate_taxes")
    private String prorateTaxes;

    @Column(name = "view_cart_on_add")
    private String viewCartOnAdd;

    @Column(name = "auto_save_cart")
    private String autoSaveCart;

    @Column(name = "auto_approve_reviews")
    private String autoApproveReviews;

    @Column(name = "is_demo_store")
    private String isDemoStore;

    @Column(name = "is_immediately_fulfilled")
    private String isImmediatelyFulfilled;

    @Column(name = "inventory_facility_id")
    private String inventoryFacilityId;

    @Column(name = "one_inventory_facility")
    private String oneInventoryFacility;

    @Column(name = "check_inventory")
    private String checkInventory;

    @Column(name = "reserve_inventory")
    private String reserveInventory;

    @Column(name = "reserve_order_enum_id")
    private String reserveOrderEnumId;

    @Column(name = "require_inventory")
    private String requireInventory;

    @Column(name = "balance_res_on_order_creation")
    private String balanceResOnOrderCreation;

    @Column(name = "requirement_method_enum_id")
    private String requirementMethodEnumId;

    @Column(name = "order_number_prefix")
    private String orderNumberPrefix;

    @Column(name = "default_locale_string")
    private String defaultLocaleString;

    @Column(name = "default_currency_uom_id")
    private String defaultCurrencyUomId;

    @Column(name = "default_time_zone_string")
    private String defaultTimeZoneString;

    @Column(name = "default_sales_channel_enum_id")
    private String defaultSalesChannelEnumId;

    @Column(name = "allow_password")
    private String allowPassword;

    @Column(name = "default_password")
    private String defaultPassword;

    @Column(name = "explode_order_items")
    private String explodeOrderItems;

    @Column(name = "check_gc_balance")
    private String checkGcBalance;

    @Column(name = "retry_failed_auths")
    private String retryFailedAuths;

    @Column(name = "header_approved_status")
    private String headerApprovedStatus;

    @Column(name = "item_approved_status")
    private String itemApprovedStatus;

    @Column(name = "digital_item_approved_status")
    private String digitalItemApprovedStatus;

    @Column(name = "header_declined_status")
    private String headerDeclinedStatus;

    @Column(name = "item_declined_status")
    private String itemDeclinedStatus;

    @Column(name = "header_cancel_status")
    private String headerCancelStatus;

    @Column(name = "item_cancel_status")
    private String itemCancelStatus;

    @Column(name = "auth_declined_message")
    private String authDeclinedMessage;

    @Column(name = "auth_fraud_message")
    private String authFraudMessage;

    @Column(name = "auth_error_message")
    private String authErrorMessage;

    @Column(name = "visual_theme_id")
    private String visualThemeId;

    @Column(name = "store_credit_account_enum_id")
    private String storeCreditAccountEnumId;

    @Column(name = "use_primary_email_username")
    private String usePrimaryEmailUsername;

    @Column(name = "require_customer_role")
    private String requireCustomerRole;

    @Column(name = "auto_invoice_digital_items")
    private String autoInvoiceDigitalItems;

    @Column(name = "req_ship_addr_for_dig_items")
    private String reqShipAddrForDigItems;

    @Column(name = "show_checkout_gift_options")
    private String showCheckoutGiftOptions;

    @Column(name = "select_payment_type_per_item")
    private String selectPaymentTypePerItem;

    @Column(name = "show_prices_with_vat_tax")
    private String showPricesWithVatTax;

    @Column(name = "show_tax_is_exempt")
    private String showTaxIsExempt;

    @Column(name = "vat_tax_auth_geo_id")
    private String vatTaxAuthGeoId;

    @Column(name = "vat_tax_auth_party_id")
    private String vatTaxAuthPartyId;

    @Column(name = "enable_auto_suggestion_list")
    private String enableAutoSuggestionList;

    @Column(name = "enable_dig_prod_upload")
    private String enableDigProdUpload;

    @Column(name = "prod_search_exclude_variants")
    private String prodSearchExcludeVariants;

    @Column(name = "dig_prod_upload_category_id")
    private String digProdUploadCategoryId;

    @Column(name = "auto_order_cc_try_exp")
    private String autoOrderCcTryExp;

    @Column(name = "auto_order_cc_try_other_cards")
    private String autoOrderCcTryOtherCards;

    @Column(name = "auto_order_cc_try_later_nsf")
    private String autoOrderCcTryLaterNsf;

    @Column(name = "auto_order_cc_try_later_max")
    private double autoOrderCcTryLaterMax;

    @Column(name = "store_credit_valid_days")
    private double storeCreditValidDays;

    @Column(name = "auto_approve_invoice")
    private String autoApproveInvoice;

    @Column(name = "auto_approve_order")
    private String autoApproveOrder;

    @Column(name = "ship_if_capture_fails")
    private String shipIfCaptureFails;

    @Column(name = "set_owner_upon_issuance")
    private String setOwnerUponIssuance;

    @Column(name = "req_return_inventory_receive")
    private String reqReturnInventoryReceive;

    @Column(name = "add_to_cart_remove_incompat")
    private String addToCartRemoveIncompat;

    @Column(name = "add_to_cart_replace_upsell")
    private String addToCartReplaceUpsell;

    @Column(name = "split_pay_pref_per_shp_grp")
    private String splitPayPrefPerShpGrp;

    @Column(name = "managed_by_lot")
    private String managedByLot;

    @Column(name = "show_out_of_stock_products")
    private String showOutOfStockProducts;

    @Column(name = "order_decimal_quantity")
    private String orderDecimalQuantity;

    @Column(name = "allow_comment")
    private String allowComment;

    @Column(name = "allocate_inventory")
    private String allocateInventory;

    @JoinedBy("primaryStoreGroupId=ProductStoreGroup.productStoreGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStoreGroup productStoreGroup;

    @JoinedBy("inventoryFacilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("reserveOrderEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration reserveOrderEnum;

    @JoinedBy("requirementMethodEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration requirementMethodEnum;

    @JoinedBy("payToPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("defaultCurrencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("defaultSalesChannelEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration defaultSalesChannelEnum;

    @JoinedBy("headerApprovedStatus=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem headerApprovedStatusStatusItem;

    @JoinedBy("itemApprovedStatus=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem itemApprovedStatusStatusItem;

    @JoinedBy("digitalItemApprovedStatus=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem digitalItemApprovedStatusStatusItem;

    @JoinedBy("headerDeclinedStatus=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem headerDeclinedStatusStatusItem;

    @JoinedBy("itemDeclinedStatus=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem itemDeclinedStatusStatusItem;

    @JoinedBy("headerCancelStatus=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem headerCancelStatusStatusItem;

    @JoinedBy("itemCancelStatus=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem itemCancelStatusStatusItem;

    @JoinedBy("vatTaxAuthGeoId=TaxAuthority.taxAuthGeoId, vatTaxAuthPartyId=TaxAuthority.taxAuthPartyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TaxAuthority taxAuthority;

    @JoinedBy("storeCreditAccountEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration storeCreditAccountEnum;
}
