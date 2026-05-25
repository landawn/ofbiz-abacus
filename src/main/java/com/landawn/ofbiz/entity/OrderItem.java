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
@Table(name = "order_item")
public class OrderItem {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "order_item_type_id")
    private String orderItemTypeId;

    @Column(name = "order_item_group_seq_id")
    private String orderItemGroupSeqId;

    @Column(name = "is_item_group_primary")
    private String isItemGroupPrimary;

    @Column(name = "from_inventory_item_id")
    private String fromInventoryItemId;

    @Column(name = "budget_id")
    private String budgetId;

    @Column(name = "budget_item_seq_id")
    private String budgetItemSeqId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "supplier_product_id")
    private String supplierProductId;

    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "prod_catalog_id")
    private String prodCatalogId;

    @Column(name = "product_category_id")
    private String productCategoryId;

    @Column(name = "is_promo")
    private String isPromo;

    @Column(name = "quote_id")
    private String quoteId;

    @Column(name = "quote_item_seq_id")
    private String quoteItemSeqId;

    @Column(name = "shopping_list_id")
    private String shoppingListId;

    @Column(name = "shopping_list_item_seq_id")
    private String shoppingListItemSeqId;

    @Column(name = "subscription_id")
    private String subscriptionId;

    @Column(name = "deployment_id")
    private String deploymentId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "cancel_quantity")
    private double cancelQuantity;

    @Column(name = "selected_amount")
    private double selectedAmount;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "unit_list_price")
    private double unitListPrice;

    @Column(name = "unit_average_cost")
    private double unitAverageCost;

    @Column(name = "unit_recurring_price")
    private double unitRecurringPrice;

    @Column(name = "discount_rate")
    private double discountRate;

    @Column(name = "is_modified_price")
    private String isModifiedPrice;

    @Column(name = "recurring_freq_uom_id")
    private String recurringFreqUomId;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "comments")
    private String comments;

    @Column(name = "corresponding_po_id")
    private String correspondingPoId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "sync_status_id")
    private String syncStatusId;

    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @Column(name = "estimated_delivery_date")
    private Timestamp estimatedDeliveryDate;

    @Column(name = "auto_cancel_date")
    private Timestamp autoCancelDate;

    @Column(name = "dont_cancel_set_date")
    private Timestamp dontCancelSetDate;

    @Column(name = "dont_cancel_set_user_login")
    private String dontCancelSetUserLogin;

    @Column(name = "ship_before_date")
    private Timestamp shipBeforeDate;

    @Column(name = "ship_after_date")
    private Timestamp shipAfterDate;

    @Column(name = "reserve_after_date")
    private Timestamp reserveAfterDate;

    @Column(name = "cancel_back_order_date")
    private Timestamp cancelBackOrderDate;

    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

    @Column(name = "change_by_user_login_id")
    private String changeByUserLoginId;
}
