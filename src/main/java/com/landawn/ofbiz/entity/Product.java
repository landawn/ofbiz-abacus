package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_type_id")
    private String productTypeId;

    @Column(name = "primary_product_category_id")
    private String primaryProductCategoryId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "introduction_date")
    private Timestamp introductionDate;

    @Column(name = "release_date")
    private Timestamp releaseDate;

    @Column(name = "support_discontinuation_date")
    private Timestamp supportDiscontinuationDate;

    @Column(name = "sales_discontinuation_date")
    private Timestamp salesDiscontinuationDate;

    @Column(name = "sales_disc_when_not_avail")
    private String salesDiscWhenNotAvail;

    @Column(name = "internal_name")
    private String internalName;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "comments")
    private String comments;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "long_description")
    private String longDescription;

    @Column(name = "price_detail_text")
    private String priceDetailText;

    @Column(name = "small_image_url")
    private String smallImageUrl;

    @Column(name = "medium_image_url")
    private String mediumImageUrl;

    @Column(name = "large_image_url")
    private String largeImageUrl;

    @Column(name = "detail_image_url")
    private String detailImageUrl;

    @Column(name = "original_image_url")
    private String originalImageUrl;

    @Column(name = "detail_screen")
    private String detailScreen;

    @Column(name = "inventory_message")
    private String inventoryMessage;

    @Column(name = "inventory_item_type_id")
    private String inventoryItemTypeId;

    @Column(name = "require_inventory")
    private String requireInventory;

    @Column(name = "quantity_uom_id")
    private String quantityUomId;

    @Column(name = "quantity_included")
    private double quantityIncluded;

    @Column(name = "pieces_included")
    private double piecesIncluded;

    @Column(name = "require_amount")
    private String requireAmount;

    @Column(name = "fixed_amount")
    private double fixedAmount;

    @Column(name = "amount_uom_type_id")
    private String amountUomTypeId;

    @Column(name = "weight_uom_id")
    private String weightUomId;

    @Column(name = "shipping_weight")
    private double shippingWeight;

    @Column(name = "product_weight")
    private double productWeight;

    @Column(name = "height_uom_id")
    private String heightUomId;

    @Column(name = "product_height")
    private double productHeight;

    @Column(name = "shipping_height")
    private double shippingHeight;

    @Column(name = "width_uom_id")
    private String widthUomId;

    @Column(name = "product_width")
    private double productWidth;

    @Column(name = "shipping_width")
    private double shippingWidth;

    @Column(name = "depth_uom_id")
    private String depthUomId;

    @Column(name = "product_depth")
    private double productDepth;

    @Column(name = "shipping_depth")
    private double shippingDepth;

    @Column(name = "diameter_uom_id")
    private String diameterUomId;

    @Column(name = "product_diameter")
    private double productDiameter;

    @Column(name = "product_rating")
    private double productRating;

    @Column(name = "rating_type_enum")
    private String ratingTypeEnum;

    @Column(name = "returnable")
    private String returnable;

    @Column(name = "taxable")
    private String taxable;

    @Column(name = "charge_shipping")
    private String chargeShipping;

    @Column(name = "auto_create_keywords")
    private String autoCreateKeywords;

    @Column(name = "include_in_promotions")
    private String includeInPromotions;

    @Column(name = "is_virtual")
    private String isVirtual;

    @Column(name = "is_variant")
    private String isVariant;

    @Column(name = "virtual_variant_method_enum")
    private String virtualVariantMethodEnum;

    @Column(name = "origin_geo_id")
    private String originGeoId;

    @Column(name = "requirement_method_enum_id")
    private String requirementMethodEnumId;

    @Column(name = "bill_of_material_level")
    private double billOfMaterialLevel;

    @Column(name = "reserv_max_persons")
    private double reservMaxPersons;

    @Column(name = "reserv2nd_ppperc")
    private double reserv2ndPpperc;

    @Column(name = "reserv_nth_ppperc")
    private double reservNthPpperc;

    @Column(name = "config_id")
    private String configId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @Column(name = "in_shipping_box")
    private String inShippingBox;

    @Column(name = "default_shipment_box_type_id")
    private String defaultShipmentBoxTypeId;

    @Column(name = "lot_id_filled_in")
    private String lotIdFilledIn;

    @Column(name = "order_decimal_quantity")
    private String orderDecimalQuantity;

    @JoinedBy("productTypeId=ProductType.productTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductType productType;

    @JoinedBy("primaryProductCategoryId=ProductCategory.productCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductCategory productCategory;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("quantityUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom quantityUom;

    @JoinedBy("amountUomTypeId=UomType.uomTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UomType uomType;

    @JoinedBy("weightUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom weightUom;

    @JoinedBy("heightUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom heightUom;

    @JoinedBy("widthUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom widthUom;

    @JoinedBy("depthUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom depthUom;

    @JoinedBy("diameterUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom diameterUom;

    @JoinedBy("virtualVariantMethodEnum=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration virtualVariantMethodEnumEnumeration;

    @JoinedBy("ratingTypeEnum=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration ratingTypeEnumEnumeration;

    @JoinedBy("requirementMethodEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration requirementMethodEnum;

    @JoinedBy("originGeoId=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geo;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin createdByUserLoginRef;

    @JoinedBy("lastModifiedByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin lastModifiedByUserLoginRef;

    @JoinedBy("defaultShipmentBoxTypeId=ShipmentBoxType.shipmentBoxTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentBoxType shipmentBoxType;

    @JoinedBy("inventoryItemTypeId=InventoryItemType.inventoryItemTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItemType inventoryItemType;
}
