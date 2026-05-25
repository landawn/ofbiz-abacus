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
@Table(name = "shipment_manifest_view")
public class ShipmentManifestView {
    @ReadOnly
    @Column(name = "shipment_id")
    private String shipmentId;

    @ReadOnly
    @Column(name = "shipment_item_seq_id")
    private String shipmentItemSeqId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "shipment_content_description")
    private String shipmentContentDescription;

    @ReadOnly
    @Column(name = "internal_name")
    private String internalName;

    @ReadOnly
    @Column(name = "item_issuance_id")
    private String itemIssuanceId;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "issued_date_time")
    private Timestamp issuedDateTime;

    @ReadOnly
    @Column(name = "issued_by_user_login_id")
    private String issuedByUserLoginId;

    @ReadOnly
    @Column(name = "issued_quantity")
    private String issuedQuantity;

    @ReadOnly
    @Column(name = "package_quantity")
    private String packageQuantity;

    @ReadOnly
    @Column(name = "shipment_package_seq_id")
    private String shipmentPackageSeqId;

    @ReadOnly
    @Column(name = "package_date_created")
    private String packageDateCreated;

    @ReadOnly
    @Column(name = "weight")
    private Double weight;

    @ReadOnly
    @Column(name = "weight_uom_abbreviation")
    private String weightUomAbbreviation;

    @ReadOnly
    @Column(name = "weight_uom_description")
    private String weightUomDescription;

    @ReadOnly
    @Column(name = "tracking_code")
    private String trackingCode;

    @ReadOnly
    @Column(name = "box_number")
    private String boxNumber;

    @ReadOnly
    @Column(name = "shipment_route_segment_id")
    private String shipmentRouteSegmentId;

    @ReadOnly
    @Column(name = "delivery_id")
    private String deliveryId;

    @ReadOnly
    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @ReadOnly
    @Column(name = "dest_facility_id")
    private String destFacilityId;

    @ReadOnly
    @Column(name = "origin_contact_mech_id")
    private String originContactMechId;

    @ReadOnly
    @Column(name = "origin_telecom_number_id")
    private String originTelecomNumberId;

    @ReadOnly
    @Column(name = "dest_contact_mech_id")
    private String destContactMechId;

    @ReadOnly
    @Column(name = "dest_telecom_number_id")
    private String destTelecomNumberId;

    @ReadOnly
    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "actual_cost")
    private double actualCost;

    @ReadOnly
    @Column(name = "actual_start_date")
    private Timestamp actualStartDate;

    @ReadOnly
    @Column(name = "actual_arrival_date")
    private Timestamp actualArrivalDate;

    @ReadOnly
    @Column(name = "estimated_start_date")
    private Timestamp estimatedStartDate;

    @ReadOnly
    @Column(name = "estimated_arrival_date")
    private Timestamp estimatedArrivalDate;

    @ReadOnly
    @Column(name = "origin_facility_name")
    private String originFacilityName;

    @ReadOnly
    @Column(name = "dest_facility_name")
    private String destFacilityName;

    @ReadOnly
    @Column(name = "origin_to_name")
    private String originToName;

    @ReadOnly
    @Column(name = "origin_attn_name")
    private String originAttnName;

    @ReadOnly
    @Column(name = "origin_address1")
    private String originAddress1;

    @ReadOnly
    @Column(name = "origin_address2")
    private String originAddress2;

    @ReadOnly
    @Column(name = "origin_directions")
    private String originDirections;

    @ReadOnly
    @Column(name = "origin_city")
    private String originCity;

    @ReadOnly
    @Column(name = "origin_postal_code")
    private String originPostalCode;

    @ReadOnly
    @Column(name = "origin_country_geo_id")
    private String originCountryGeoId;

    @ReadOnly
    @Column(name = "origin_state_province_geo_id")
    private String originStateProvinceGeoId;

    @ReadOnly
    @Column(name = "origin_postal_code_geo_id")
    private String originPostalCodeGeoId;

    @ReadOnly
    @Column(name = "origin_country_code")
    private String originCountryCode;

    @ReadOnly
    @Column(name = "origin_area_code")
    private String originAreaCode;

    @ReadOnly
    @Column(name = "origin_contact_number")
    private String originContactNumber;

    @ReadOnly
    @Column(name = "dest_to_name")
    private String destToName;

    @ReadOnly
    @Column(name = "dest_attn_name")
    private String destAttnName;

    @ReadOnly
    @Column(name = "dest_address1")
    private String destAddress1;

    @ReadOnly
    @Column(name = "dest_address2")
    private String destAddress2;

    @ReadOnly
    @Column(name = "dest_directions")
    private String destDirections;

    @ReadOnly
    @Column(name = "dest_city")
    private String destCity;

    @ReadOnly
    @Column(name = "dest_postal_code")
    private String destPostalCode;

    @ReadOnly
    @Column(name = "dest_country_geo_id")
    private String destCountryGeoId;

    @ReadOnly
    @Column(name = "dest_state_province_geo_id")
    private String destStateProvinceGeoId;

    @ReadOnly
    @Column(name = "dest_postal_code_geo_id")
    private String destPostalCodeGeoId;

    @ReadOnly
    @Column(name = "dest_country_code")
    private String destCountryCode;

    @ReadOnly
    @Column(name = "dest_area_code")
    private String destAreaCode;

    @ReadOnly
    @Column(name = "dest_contact_number")
    private String destContactNumber;

    @ReadOnly
    @Column(name = "carrier_first_name")
    private String carrierFirstName;

    @ReadOnly
    @Column(name = "carrier_last_name")
    private String carrierLastName;

    @ReadOnly
    @Column(name = "carrier_group_name")
    private String carrierGroupName;

    @ReadOnly
    @Column(name = "shipment_method_description")
    private String shipmentMethodDescription;
}
