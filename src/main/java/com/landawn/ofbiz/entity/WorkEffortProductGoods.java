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
@Table(name = "work_effort_product_goods")
public class WorkEffortProductGoods {
    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "work_effort_type_id")
    private String workEffortTypeId;

    @ReadOnly
    @Column(name = "current_status_id")
    private String currentStatusId;

    @ReadOnly
    @Column(name = "last_status_update")
    private Timestamp lastStatusUpdate;

    @ReadOnly
    @Column(name = "work_effort_purpose_type_id")
    private String workEffortPurposeTypeId;

    @ReadOnly
    @Column(name = "work_effort_parent_id")
    private String workEffortParentId;

    @ReadOnly
    @Column(name = "scope_enum_id")
    private String scopeEnumId;

    @ReadOnly
    @Column(name = "priority")
    private double priority;

    @ReadOnly
    @Column(name = "percent_complete")
    private double percentComplete;

    @ReadOnly
    @Column(name = "work_effort_name")
    private String workEffortName;

    @ReadOnly
    @Column(name = "show_as_enum_id")
    private String showAsEnumId;

    @ReadOnly
    @Column(name = "send_notification_email")
    private String sendNotificationEmail;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "location_desc")
    private String locationDesc;

    @ReadOnly
    @Column(name = "estimated_start_date")
    private Timestamp estimatedStartDate;

    @ReadOnly
    @Column(name = "estimated_completion_date")
    private Timestamp estimatedCompletionDate;

    @ReadOnly
    @Column(name = "actual_start_date")
    private Timestamp actualStartDate;

    @ReadOnly
    @Column(name = "actual_completion_date")
    private Timestamp actualCompletionDate;

    @ReadOnly
    @Column(name = "estimated_milli_seconds")
    private Double estimatedMilliSeconds;

    @ReadOnly
    @Column(name = "estimated_setup_millis")
    private Double estimatedSetupMillis;

    @ReadOnly
    @Column(name = "estimate_calc_method")
    private String estimateCalcMethod;

    @ReadOnly
    @Column(name = "actual_milli_seconds")
    private Double actualMilliSeconds;

    @ReadOnly
    @Column(name = "actual_setup_millis")
    private Double actualSetupMillis;

    @ReadOnly
    @Column(name = "total_milli_seconds_allowed")
    private Double totalMilliSecondsAllowed;

    @ReadOnly
    @Column(name = "total_money_allowed")
    private double totalMoneyAllowed;

    @ReadOnly
    @Column(name = "money_uom_id")
    private String moneyUomId;

    @ReadOnly
    @Column(name = "special_terms")
    private String specialTerms;

    @ReadOnly
    @Column(name = "time_transparency")
    private double timeTransparency;

    @ReadOnly
    @Column(name = "universal_id")
    private String universalId;

    @ReadOnly
    @Column(name = "source_reference_id")
    private String sourceReferenceId;

    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "info_url")
    private String infoUrl;

    @ReadOnly
    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;

    @ReadOnly
    @Column(name = "temp_expr_id")
    private String tempExprId;

    @ReadOnly
    @Column(name = "runtime_data_id")
    private String runtimeDataId;

    @ReadOnly
    @Column(name = "note_id")
    private String noteId;

    @ReadOnly
    @Column(name = "service_loader_name")
    private String serviceLoaderName;

    @ReadOnly
    @Column(name = "quantity_to_produce")
    private double quantityToProduce;

    @ReadOnly
    @Column(name = "quantity_produced")
    private double quantityProduced;

    @ReadOnly
    @Column(name = "quantity_rejected")
    private double quantityRejected;

    @ReadOnly
    @Column(name = "reserv_persons")
    private double reservPersons;

    @ReadOnly
    @Column(name = "reserv2nd_ppperc")
    private double reserv2ndPpperc;

    @ReadOnly
    @Column(name = "reserv_nth_ppperc")
    private double reservNthPpperc;

    @ReadOnly
    @Column(name = "accommodation_map_id")
    private String accommodationMapId;

    @ReadOnly
    @Column(name = "accommodation_spot_id")
    private String accommodationSpotId;

    @ReadOnly
    @Column(name = "revision_number")
    private double revisionNumber;

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
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "work_effort_good_std_type_id")
    private String workEffortGoodStdTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "estimated_quantity")
    private Double estimatedQuantity;

    @ReadOnly
    @Column(name = "estimated_cost")
    private double estimatedCost;

    @ReadOnly
    @Column(name = "product_type_id")
    private String productTypeId;

    @ReadOnly
    @Column(name = "primary_product_category_id")
    private String primaryProductCategoryId;

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
