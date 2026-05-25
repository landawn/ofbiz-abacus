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
@Table(name = "product_store_shipment_meth")
public class ProductStoreShipmentMeth {
    @Id
    @Column(name = "product_store_ship_meth_id")
    private String productStoreShipMethId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "company_party_id")
    private String companyPartyId;

    @Column(name = "min_weight")
    private double minWeight;

    @Column(name = "max_weight")
    private double maxWeight;

    @Column(name = "min_size")
    private double minSize;

    @Column(name = "max_size")
    private double maxSize;

    @Column(name = "min_total")
    private double minTotal;

    @Column(name = "max_total")
    private double maxTotal;

    @Column(name = "allow_usps_addr")
    private String allowUspsAddr;

    @Column(name = "require_usps_addr")
    private String requireUspsAddr;

    @Column(name = "allow_company_addr")
    private String allowCompanyAddr;

    @Column(name = "require_company_addr")
    private String requireCompanyAddr;

    @Column(name = "include_no_charge_items")
    private String includeNoChargeItems;

    @Column(name = "include_feature_group")
    private String includeFeatureGroup;

    @Column(name = "exclude_feature_group")
    private String excludeFeatureGroup;

    @Column(name = "include_geo_id")
    private String includeGeoId;

    @Column(name = "exclude_geo_id")
    private String excludeGeoId;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "config_props")
    private String configProps;

    @Column(name = "shipment_custom_method_id")
    private String shipmentCustomMethodId;

    @Column(name = "shipment_gateway_config_id")
    private String shipmentGatewayConfigId;

    @Column(name = "sequence_number")
    private double sequenceNumber;

    @Column(name = "allowance_percent")
    private double allowancePercent;

    @Column(name = "minimum_price")
    private double minimumPrice;
}
