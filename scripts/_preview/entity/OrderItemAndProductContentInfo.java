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
@Table(name = "order_item_and_product_content_info")
public class OrderItemAndProductContentInfo {
    @ReadOnly
    @Column(name = "content_status_id")
    private String contentStatusId;

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
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "cancel_quantity")
    private double cancelQuantity;

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
    @Column(name = "content_id")
    private String contentId;

    @ReadOnly
    @Column(name = "product_content_type_id")
    private String productContentTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "purchase_from_date")
    private Timestamp purchaseFromDate;

    @ReadOnly
    @Column(name = "purchase_thru_date")
    private Timestamp purchaseThruDate;

    @ReadOnly
    @Column(name = "use_count_limit")
    private double useCountLimit;

    @ReadOnly
    @Column(name = "use_time")
    private double useTime;

    @ReadOnly
    @Column(name = "use_time_uom_id")
    private String useTimeUomId;

    @ReadOnly
    @Column(name = "use_role_type_id")
    private String useRoleTypeId;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "content_type_id")
    private String contentTypeId;

    @ReadOnly
    @Column(name = "owner_content_id")
    private String ownerContentId;

    @ReadOnly
    @Column(name = "decorator_content_id")
    private String decoratorContentId;

    @ReadOnly
    @Column(name = "instance_of_content_id")
    private String instanceOfContentId;

    @ReadOnly
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @ReadOnly
    @Column(name = "template_data_resource_id")
    private String templateDataResourceId;

    @ReadOnly
    @Column(name = "data_source_id")
    private String dataSourceId;

    @ReadOnly
    @Column(name = "privilege_enum_id")
    private String privilegeEnumId;

    @ReadOnly
    @Column(name = "service_name")
    private String serviceName;

    @ReadOnly
    @Column(name = "custom_method_id")
    private String customMethodId;

    @ReadOnly
    @Column(name = "content_name")
    private String contentName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "locale_string")
    private String localeString;

    @ReadOnly
    @Column(name = "mime_type_id")
    private String mimeTypeId;

    @ReadOnly
    @Column(name = "character_set_id")
    private String characterSetId;

    @ReadOnly
    @Column(name = "child_leaf_count")
    private double childLeafCount;

    @ReadOnly
    @Column(name = "child_branch_count")
    private double childBranchCount;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @ReadOnly
    @Column(name = "product_type_id")
    private String productTypeId;

    @ReadOnly
    @Column(name = "primary_product_category_id")
    private String primaryProductCategoryId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "introduction_date")
    private Timestamp introductionDate;

    @ReadOnly
    @Column(name = "release_date")
    private Timestamp releaseDate;

    @ReadOnly
    @Column(name = "support_discontinuation_date")
    private Timestamp supportDiscontinuationDate;

    @ReadOnly
    @Column(name = "sales_discontinuation_date")
    private Timestamp salesDiscontinuationDate;

    @ReadOnly
    @Column(name = "sales_disc_when_not_avail")
    private String salesDiscWhenNotAvail;

    @ReadOnly
    @Column(name = "internal_name")
    private String internalName;

    @ReadOnly
    @Column(name = "brand_name")
    private String brandName;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "product_name")
    private String productName;

    @ReadOnly
    @Column(name = "long_description")
    private String longDescription;

    @ReadOnly
    @Column(name = "price_detail_text")
    private String priceDetailText;

    @ReadOnly
    @Column(name = "small_image_url")
    private String smallImageUrl;

    @ReadOnly
    @Column(name = "medium_image_url")
    private String mediumImageUrl;

    @ReadOnly
    @Column(name = "large_image_url")
    private String largeImageUrl;

    @ReadOnly
    @Column(name = "detail_image_url")
    private String detailImageUrl;

    @ReadOnly
    @Column(name = "original_image_url")
    private String originalImageUrl;

    @ReadOnly
    @Column(name = "detail_screen")
    private String detailScreen;

    @ReadOnly
    @Column(name = "inventory_message")
    private String inventoryMessage;

    @ReadOnly
    @Column(name = "inventory_item_type_id")
    private String inventoryItemTypeId;

    @ReadOnly
    @Column(name = "require_inventory")
    private String requireInventory;

    @ReadOnly
    @Column(name = "quantity_uom_id")
    private String quantityUomId;

    @ReadOnly
    @Column(name = "quantity_included")
    private double quantityIncluded;

    @ReadOnly
    @Column(name = "pieces_included")
    private double piecesIncluded;

    @ReadOnly
    @Column(name = "require_amount")
    private String requireAmount;

    @ReadOnly
    @Column(name = "fixed_amount")
    private double fixedAmount;

    @ReadOnly
    @Column(name = "amount_uom_type_id")
    private String amountUomTypeId;

    @ReadOnly
    @Column(name = "weight_uom_id")
    private String weightUomId;

    @ReadOnly
    @Column(name = "shipping_weight")
    private double shippingWeight;

    @ReadOnly
    @Column(name = "product_weight")
    private double productWeight;

    @ReadOnly
    @Column(name = "height_uom_id")
    private String heightUomId;

    @ReadOnly
    @Column(name = "product_height")
    private double productHeight;

    @ReadOnly
    @Column(name = "shipping_height")
    private double shippingHeight;

    @ReadOnly
    @Column(name = "width_uom_id")
    private String widthUomId;

    @ReadOnly
    @Column(name = "product_width")
    private double productWidth;

    @ReadOnly
    @Column(name = "shipping_width")
    private double shippingWidth;

    @ReadOnly
    @Column(name = "depth_uom_id")
    private String depthUomId;

    @ReadOnly
    @Column(name = "product_depth")
    private double productDepth;

    @ReadOnly
    @Column(name = "shipping_depth")
    private double shippingDepth;

    @ReadOnly
    @Column(name = "diameter_uom_id")
    private String diameterUomId;

    @ReadOnly
    @Column(name = "product_diameter")
    private double productDiameter;

    @ReadOnly
    @Column(name = "product_rating")
    private double productRating;

    @ReadOnly
    @Column(name = "rating_type_enum")
    private String ratingTypeEnum;

    @ReadOnly
    @Column(name = "returnable")
    private String returnable;

    @ReadOnly
    @Column(name = "taxable")
    private String taxable;

    @ReadOnly
    @Column(name = "charge_shipping")
    private String chargeShipping;

    @ReadOnly
    @Column(name = "auto_create_keywords")
    private String autoCreateKeywords;

    @ReadOnly
    @Column(name = "include_in_promotions")
    private String includeInPromotions;

    @ReadOnly
    @Column(name = "is_virtual")
    private String isVirtual;

    @ReadOnly
    @Column(name = "is_variant")
    private String isVariant;

    @ReadOnly
    @Column(name = "virtual_variant_method_enum")
    private String virtualVariantMethodEnum;

    @ReadOnly
    @Column(name = "origin_geo_id")
    private String originGeoId;

    @ReadOnly
    @Column(name = "requirement_method_enum_id")
    private String requirementMethodEnumId;

    @ReadOnly
    @Column(name = "bill_of_material_level")
    private double billOfMaterialLevel;

    @ReadOnly
    @Column(name = "reserv_max_persons")
    private double reservMaxPersons;

    @ReadOnly
    @Column(name = "reserv2nd_ppperc")
    private double reserv2ndPpperc;

    @ReadOnly
    @Column(name = "reserv_nth_ppperc")
    private double reservNthPpperc;

    @ReadOnly
    @Column(name = "config_id")
    private String configId;

    @ReadOnly
    @Column(name = "in_shipping_box")
    private String inShippingBox;

    @ReadOnly
    @Column(name = "default_shipment_box_type_id")
    private String defaultShipmentBoxTypeId;

    @ReadOnly
    @Column(name = "lot_id_filled_in")
    private String lotIdFilledIn;

    @ReadOnly
    @Column(name = "order_decimal_quantity")
    private String orderDecimalQuantity;
}
