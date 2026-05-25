package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_store_shipment_meth_view")
public class ProductStoreShipmentMethView {
    @ReadOnly
    @Column(name = "product_store_ship_meth_id")
    private String productStoreShipMethId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "company_party_id")
    private String companyPartyId;

    @ReadOnly
    @Column(name = "min_size")
    private double minSize;

    @ReadOnly
    @Column(name = "max_size")
    private double maxSize;

    @ReadOnly
    @Column(name = "min_total")
    private double minTotal;

    @ReadOnly
    @Column(name = "max_total")
    private double maxTotal;

    @ReadOnly
    @Column(name = "min_weight")
    private double minWeight;

    @ReadOnly
    @Column(name = "max_weight")
    private double maxWeight;

    @ReadOnly
    @Column(name = "allow_usps_addr")
    private String allowUspsAddr;

    @ReadOnly
    @Column(name = "require_usps_addr")
    private String requireUspsAddr;

    @ReadOnly
    @Column(name = "allow_company_addr")
    private String allowCompanyAddr;

    @ReadOnly
    @Column(name = "require_company_addr")
    private String requireCompanyAddr;

    @ReadOnly
    @Column(name = "include_no_charge_items")
    private String includeNoChargeItems;

    @ReadOnly
    @Column(name = "include_geo_id")
    private String includeGeoId;

    @ReadOnly
    @Column(name = "exclude_geo_id")
    private String excludeGeoId;

    @ReadOnly
    @Column(name = "include_feature_group")
    private String includeFeatureGroup;

    @ReadOnly
    @Column(name = "exclude_feature_group")
    private String excludeFeatureGroup;

    @ReadOnly
    @Column(name = "service_name")
    private String serviceName;

    @ReadOnly
    @Column(name = "config_props")
    private String configProps;

    @ReadOnly
    @Column(name = "shipment_custom_method_id")
    private String shipmentCustomMethodId;

    @ReadOnly
    @Column(name = "shipment_gateway_config_id")
    private String shipmentGatewayConfigId;

    @ReadOnly
    @Column(name = "sequence_number")
    private double sequenceNumber;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
