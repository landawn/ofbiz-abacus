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
@Table(name = "product_category_member_and_price")
public class ProductCategoryMemberAndPrice {
    @ReadOnly
    @Column(name = "product_category_id")
    private String productCategoryId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "product_product_type_id")
    private String productProductTypeId;

    @ReadOnly
    @Column(name = "product_primary_product_category_id")
    private String productPrimaryProductCategoryId;

    @ReadOnly
    @Column(name = "product_facility_id")
    private String productFacilityId;

    @ReadOnly
    @Column(name = "product_introduction_date")
    private String productIntroductionDate;

    @ReadOnly
    @Column(name = "product_release_date")
    private String productReleaseDate;

    @ReadOnly
    @Column(name = "product_support_discontinuation_date")
    private String productSupportDiscontinuationDate;

    @ReadOnly
    @Column(name = "product_sales_discontinuation_date")
    private String productSalesDiscontinuationDate;

    @ReadOnly
    @Column(name = "product_sales_disc_when_not_avail")
    private String productSalesDiscWhenNotAvail;

    @ReadOnly
    @Column(name = "product_internal_name")
    private String productInternalName;

    @ReadOnly
    @Column(name = "product_brand_name")
    private String productBrandName;

    @ReadOnly
    @Column(name = "product_comments")
    private String productComments;

    @ReadOnly
    @Column(name = "product_product_name")
    private String productProductName;

    @ReadOnly
    @Column(name = "product_description")
    private String productDescription;

    @ReadOnly
    @Column(name = "product_long_description")
    private String productLongDescription;

    @ReadOnly
    @Column(name = "product_price_detail_text")
    private String productPriceDetailText;

    @ReadOnly
    @Column(name = "product_small_image_url")
    private String productSmallImageUrl;

    @ReadOnly
    @Column(name = "product_medium_image_url")
    private String productMediumImageUrl;

    @ReadOnly
    @Column(name = "product_large_image_url")
    private String productLargeImageUrl;

    @ReadOnly
    @Column(name = "product_detail_image_url")
    private String productDetailImageUrl;

    @ReadOnly
    @Column(name = "product_original_image_url")
    private String productOriginalImageUrl;

    @ReadOnly
    @Column(name = "product_detail_screen")
    private String productDetailScreen;

    @ReadOnly
    @Column(name = "product_inventory_message")
    private String productInventoryMessage;

    @ReadOnly
    @Column(name = "product_inventory_item_type_id")
    private String productInventoryItemTypeId;

    @ReadOnly
    @Column(name = "product_require_inventory")
    private String productRequireInventory;

    @ReadOnly
    @Column(name = "product_quantity_uom_id")
    private String productQuantityUomId;

    @ReadOnly
    @Column(name = "product_quantity_included")
    private String productQuantityIncluded;

    @ReadOnly
    @Column(name = "product_pieces_included")
    private String productPiecesIncluded;

    @ReadOnly
    @Column(name = "product_require_amount")
    private String productRequireAmount;

    @ReadOnly
    @Column(name = "product_fixed_amount")
    private String productFixedAmount;

    @ReadOnly
    @Column(name = "product_amount_uom_type_id")
    private String productAmountUomTypeId;

    @ReadOnly
    @Column(name = "product_weight_uom_id")
    private String productWeightUomId;

    @ReadOnly
    @Column(name = "product_shipping_weight")
    private String productShippingWeight;

    @ReadOnly
    @Column(name = "product_product_weight")
    private String productProductWeight;

    @ReadOnly
    @Column(name = "product_height_uom_id")
    private String productHeightUomId;

    @ReadOnly
    @Column(name = "product_product_height")
    private String productProductHeight;

    @ReadOnly
    @Column(name = "product_shipping_height")
    private String productShippingHeight;

    @ReadOnly
    @Column(name = "product_width_uom_id")
    private String productWidthUomId;

    @ReadOnly
    @Column(name = "product_product_width")
    private String productProductWidth;

    @ReadOnly
    @Column(name = "product_shipping_width")
    private String productShippingWidth;

    @ReadOnly
    @Column(name = "product_depth_uom_id")
    private String productDepthUomId;

    @ReadOnly
    @Column(name = "product_product_depth")
    private String productProductDepth;

    @ReadOnly
    @Column(name = "product_shipping_depth")
    private String productShippingDepth;

    @ReadOnly
    @Column(name = "product_diameter_uom_id")
    private String productDiameterUomId;

    @ReadOnly
    @Column(name = "product_product_diameter")
    private String productProductDiameter;

    @ReadOnly
    @Column(name = "product_product_rating")
    private String productProductRating;

    @ReadOnly
    @Column(name = "product_rating_type_enum")
    private String productRatingTypeEnum;

    @ReadOnly
    @Column(name = "product_returnable")
    private String productReturnable;

    @ReadOnly
    @Column(name = "product_taxable")
    private String productTaxable;

    @ReadOnly
    @Column(name = "product_charge_shipping")
    private String productChargeShipping;

    @ReadOnly
    @Column(name = "product_auto_create_keywords")
    private String productAutoCreateKeywords;

    @ReadOnly
    @Column(name = "product_include_in_promotions")
    private String productIncludeInPromotions;

    @ReadOnly
    @Column(name = "product_is_virtual")
    private String productIsVirtual;

    @ReadOnly
    @Column(name = "product_is_variant")
    private String productIsVariant;

    @ReadOnly
    @Column(name = "product_virtual_variant_method_enum")
    private String productVirtualVariantMethodEnum;

    @ReadOnly
    @Column(name = "product_origin_geo_id")
    private String productOriginGeoId;

    @ReadOnly
    @Column(name = "product_requirement_method_enum_id")
    private String productRequirementMethodEnumId;

    @ReadOnly
    @Column(name = "product_bill_of_material_level")
    private String productBillOfMaterialLevel;

    @ReadOnly
    @Column(name = "product_reserv_max_persons")
    private String productReservMaxPersons;

    @ReadOnly
    @Column(name = "product_reserv2nd_ppperc")
    private String productReserv2ndPpperc;

    @ReadOnly
    @Column(name = "product_reserv_nth_ppperc")
    private String productReservNthPpperc;

    @ReadOnly
    @Column(name = "product_config_id")
    private String productConfigId;

    @ReadOnly
    @Column(name = "product_created_date")
    private String productCreatedDate;

    @ReadOnly
    @Column(name = "product_created_by_user_login")
    private String productCreatedByUserLogin;

    @ReadOnly
    @Column(name = "product_last_modified_date")
    private String productLastModifiedDate;

    @ReadOnly
    @Column(name = "product_last_modified_by_user_login")
    private String productLastModifiedByUserLogin;

    @ReadOnly
    @Column(name = "product_in_shipping_box")
    private String productInShippingBox;

    @ReadOnly
    @Column(name = "product_default_shipment_box_type_id")
    private String productDefaultShipmentBoxTypeId;

    @ReadOnly
    @Column(name = "product_lot_id_filled_in")
    private String productLotIdFilledIn;

    @ReadOnly
    @Column(name = "product_order_decimal_quantity")
    private String productOrderDecimalQuantity;

    @ReadOnly
    @Column(name = "price_product_price_type_id")
    private String priceProductPriceTypeId;

    @ReadOnly
    @Column(name = "price_product_price_purpose_id")
    private String priceProductPricePurposeId;

    @ReadOnly
    @Column(name = "price_currency_uom_id")
    private String priceCurrencyUomId;

    @ReadOnly
    @Column(name = "price_product_store_group_id")
    private String priceProductStoreGroupId;

    @ReadOnly
    @Column(name = "price_from_date")
    private String priceFromDate;

    @ReadOnly
    @Column(name = "price_thru_date")
    private String priceThruDate;

    @ReadOnly
    @Column(name = "price_price")
    private String pricePrice;

    @ReadOnly
    @Column(name = "price_term_uom_id")
    private String priceTermUomId;

    @ReadOnly
    @Column(name = "price_custom_price_calc_service")
    private String priceCustomPriceCalcService;

    @ReadOnly
    @Column(name = "price_price_without_tax")
    private String pricePriceWithoutTax;

    @ReadOnly
    @Column(name = "price_price_with_tax")
    private String pricePriceWithTax;

    @ReadOnly
    @Column(name = "price_tax_amount")
    private String priceTaxAmount;

    @ReadOnly
    @Column(name = "price_tax_percentage")
    private String priceTaxPercentage;

    @ReadOnly
    @Column(name = "price_tax_auth_party_id")
    private String priceTaxAuthPartyId;

    @ReadOnly
    @Column(name = "price_tax_auth_geo_id")
    private String priceTaxAuthGeoId;

    @ReadOnly
    @Column(name = "price_tax_in_price")
    private String priceTaxInPrice;

    @ReadOnly
    @Column(name = "price_created_date")
    private String priceCreatedDate;

    @ReadOnly
    @Column(name = "price_created_by_user_login")
    private String priceCreatedByUserLogin;

    @ReadOnly
    @Column(name = "price_last_modified_date")
    private String priceLastModifiedDate;

    @ReadOnly
    @Column(name = "price_last_modified_by_user_login")
    private String priceLastModifiedByUserLogin;
}
