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
@Table(name = "inventory_item_and_location")
public class InventoryItemAndLocation {
    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "inventory_item_type_id")
    private String inventoryItemTypeId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "datetime_received")
    private Timestamp datetimeReceived;

    @ReadOnly
    @Column(name = "datetime_manufactured")
    private Timestamp datetimeManufactured;

    @ReadOnly
    @Column(name = "expire_date")
    private String expireDate;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "container_id")
    private String containerId;

    @ReadOnly
    @Column(name = "lot_id")
    private String lotId;

    @ReadOnly
    @Column(name = "uom_id")
    private String uomId;

    @ReadOnly
    @Column(name = "bin_number")
    private String binNumber;

    @ReadOnly
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @ReadOnly
    @Column(name = "quantity_on_hand_total")
    private double quantityOnHandTotal;

    @ReadOnly
    @Column(name = "available_to_promise_total")
    private double availableToPromiseTotal;

    @ReadOnly
    @Column(name = "accounting_quantity_total")
    private double accountingQuantityTotal;

    @ReadOnly
    @Column(name = "serial_number")
    private String serialNumber;

    @ReadOnly
    @Column(name = "soft_identifier")
    private String softIdentifier;

    @ReadOnly
    @Column(name = "activation_number")
    private String activationNumber;

    @ReadOnly
    @Column(name = "activation_valid_thru")
    private Timestamp activationValidThru;

    @ReadOnly
    @Column(name = "unit_cost")
    private double unitCost;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

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
    @Column(name = "description")
    private String description;

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

    @ReadOnly
    @Column(name = "location_type_enum_id")
    private String locationTypeEnumId;

    @ReadOnly
    @Column(name = "area_id")
    private String areaId;

    @ReadOnly
    @Column(name = "aisle_id")
    private String aisleId;

    @ReadOnly
    @Column(name = "section_id")
    private String sectionId;

    @ReadOnly
    @Column(name = "level_id")
    private String levelId;

    @ReadOnly
    @Column(name = "position_id")
    private String positionId;

    @ReadOnly
    @Column(name = "geo_point_id")
    private String geoPointId;
}
