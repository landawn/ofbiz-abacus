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
@Table(name = "order_item_and_ship_group_assoc")
public class OrderItemAndShipGroupAssoc {
    @ReadOnly
    @Column(name = "order_item_quantity")
    private String orderItemQuantity;

    @ReadOnly
    @Column(name = "order_item_cancel_quantity")
    private String orderItemCancelQuantity;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "external_id")
    private String externalId;

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
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "sync_status_id")
    private String syncStatusId;

    @ReadOnly
    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @ReadOnly
    @Column(name = "estimated_delivery_date")
    private Timestamp estimatedDeliveryDate;

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
    @Column(name = "ship_before_date")
    private Timestamp shipBeforeDate;

    @ReadOnly
    @Column(name = "ship_after_date")
    private Timestamp shipAfterDate;

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

    @ReadOnly
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "cancel_quantity")
    private double cancelQuantity;
}
