package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shipment_cost_estimate")
public class ShipmentCostEstimate {
    @Id
    @Column(name = "shipment_cost_estimate_id")
    private String shipmentCostEstimateId;

    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @Column(name = "carrier_role_type_id")
    private String carrierRoleTypeId;

    @Column(name = "product_store_ship_meth_id")
    private String productStoreShipMethId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "geo_id_to")
    private String geoIdTo;

    @Column(name = "geo_id_from")
    private String geoIdFrom;

    @Column(name = "weight_break_id")
    private String weightBreakId;

    @Column(name = "weight_uom_id")
    private String weightUomId;

    @Column(name = "weight_unit_price")
    private double weightUnitPrice;

    @Column(name = "quantity_break_id")
    private String quantityBreakId;

    @Column(name = "quantity_uom_id")
    private String quantityUomId;

    @Column(name = "quantity_unit_price")
    private double quantityUnitPrice;

    @Column(name = "price_break_id")
    private String priceBreakId;

    @Column(name = "price_uom_id")
    private String priceUomId;

    @Column(name = "price_unit_price")
    private double priceUnitPrice;

    @Column(name = "order_flat_price")
    private double orderFlatPrice;

    @Column(name = "order_price_percent")
    private double orderPricePercent;

    @Column(name = "order_item_flat_price")
    private double orderItemFlatPrice;

    @Column(name = "shipping_price_percent")
    private double shippingPricePercent;

    @Column(name = "product_feature_group_id")
    private String productFeatureGroupId;

    @Column(name = "oversize_unit")
    private double oversizeUnit;

    @Column(name = "oversize_price")
    private double oversizePrice;

    @Column(name = "feature_percent")
    private double featurePercent;

    @Column(name = "feature_price")
    private double featurePrice;
}
