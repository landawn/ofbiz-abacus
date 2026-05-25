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
@Table(name = "shipment_route_segment")
public class ShipmentRouteSegment {
    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Id
    @Column(name = "shipment_route_segment_id")
    private String shipmentRouteSegmentId;

    @Column(name = "delivery_id")
    private String deliveryId;

    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @Column(name = "dest_facility_id")
    private String destFacilityId;

    @Column(name = "origin_contact_mech_id")
    private String originContactMechId;

    @Column(name = "origin_telecom_number_id")
    private String originTelecomNumberId;

    @Column(name = "dest_contact_mech_id")
    private String destContactMechId;

    @Column(name = "dest_telecom_number_id")
    private String destTelecomNumberId;

    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Column(name = "carrier_service_status_id")
    private String carrierServiceStatusId;

    @Column(name = "carrier_delivery_zone")
    private String carrierDeliveryZone;

    @Column(name = "carrier_restriction_codes")
    private String carrierRestrictionCodes;

    @Column(name = "carrier_restriction_desc")
    private String carrierRestrictionDesc;

    @Column(name = "billing_weight")
    private double billingWeight;

    @Column(name = "billing_weight_uom_id")
    private String billingWeightUomId;

    @Column(name = "actual_transport_cost")
    private double actualTransportCost;

    @Column(name = "actual_service_cost")
    private double actualServiceCost;

    @Column(name = "actual_other_cost")
    private double actualOtherCost;

    @Column(name = "actual_cost")
    private double actualCost;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "actual_start_date")
    private Timestamp actualStartDate;

    @Column(name = "actual_arrival_date")
    private Timestamp actualArrivalDate;

    @Column(name = "estimated_start_date")
    private Timestamp estimatedStartDate;

    @Column(name = "estimated_arrival_date")
    private Timestamp estimatedArrivalDate;

    @Column(name = "tracking_id_number")
    private String trackingIdNumber;

    @Column(name = "tracking_digest")
    private String trackingDigest;

    @Column(name = "updated_by_user_login_id")
    private String updatedByUserLoginId;

    @Column(name = "last_updated_date")
    private Timestamp lastUpdatedDate;

    @Column(name = "home_delivery_type")
    private String homeDeliveryType;

    @Column(name = "home_delivery_date")
    private Timestamp homeDeliveryDate;

    @Column(name = "third_party_account_number")
    private String thirdPartyAccountNumber;

    @Column(name = "third_party_postal_code")
    private String thirdPartyPostalCode;

    @Column(name = "third_party_country_geo_code")
    private String thirdPartyCountryGeoCode;

    @Column(name = "ups_high_value_report")
    private byte[] upsHighValueReport;

    @JoinedBy("shipmentId=Shipment.shipmentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Shipment shipment;

    @JoinedBy("deliveryId=Delivery.deliveryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Delivery delivery;

    @JoinedBy("carrierPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("shipmentMethodTypeId=ShipmentMethodType.shipmentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentMethodType shipmentMethodType;

    @JoinedBy("originFacilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility originFacility;

    @JoinedBy("destFacilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility destFacility;

    @JoinedBy("originContactMechId=PostalAddress.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PostalAddress originContactMech;

    @JoinedBy("originTelecomNumberId=TelecomNumber.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TelecomNumber originTelecomNumber;

    @JoinedBy("destContactMechId=PostalAddress.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PostalAddress destContactMech;

    @JoinedBy("destTelecomNumberId=TelecomNumber.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TelecomNumber destTelecomNumber;

    @JoinedBy("carrierServiceStatusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom currencyUom;

    @JoinedBy("billingWeightUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom billingWeightUom;
}
