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
@Table(name = "order_header_and_ship_groups")
public class OrderHeaderAndShipGroups {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "supplier_party_id")
    private String supplierPartyId;

    @ReadOnly
    @Column(name = "supplier_agreement_id")
    private String supplierAgreementId;

    @ReadOnly
    @Column(name = "vendor_party_id")
    private String vendorPartyId;

    @ReadOnly
    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @ReadOnly
    @Column(name = "carrier_role_type_id")
    private String carrierRoleTypeId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "telecom_contact_mech_id")
    private String telecomContactMechId;

    @ReadOnly
    @Column(name = "tracking_number")
    private String trackingNumber;

    @ReadOnly
    @Column(name = "shipping_instructions")
    private String shippingInstructions;

    @ReadOnly
    @Column(name = "may_split")
    private String maySplit;

    @ReadOnly
    @Column(name = "gift_message")
    private String giftMessage;

    @ReadOnly
    @Column(name = "is_gift")
    private String isGift;

    @ReadOnly
    @Column(name = "ship_after_date")
    private Timestamp shipAfterDate;

    @ReadOnly
    @Column(name = "ship_by_date")
    private Timestamp shipByDate;

    @ReadOnly
    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @ReadOnly
    @Column(name = "estimated_delivery_date")
    private Timestamp estimatedDeliveryDate;

    @ReadOnly
    @Column(name = "to_name")
    private String toName;

    @ReadOnly
    @Column(name = "attn_name")
    private String attnName;

    @ReadOnly
    @Column(name = "address1")
    private String address1;

    @ReadOnly
    @Column(name = "address2")
    private String address2;

    @ReadOnly
    @Column(name = "house_number")
    private double houseNumber;

    @ReadOnly
    @Column(name = "house_number_ext")
    private String houseNumberExt;

    @ReadOnly
    @Column(name = "directions")
    private String directions;

    @ReadOnly
    @Column(name = "city")
    private String city;

    @ReadOnly
    @Column(name = "city_geo_id")
    private String cityGeoId;

    @ReadOnly
    @Column(name = "postal_code")
    private String postalCode;

    @ReadOnly
    @Column(name = "postal_code_ext")
    private String postalCodeExt;

    @ReadOnly
    @Column(name = "country_geo_id")
    private String countryGeoId;

    @ReadOnly
    @Column(name = "state_province_geo_id")
    private String stateProvinceGeoId;

    @ReadOnly
    @Column(name = "county_geo_id")
    private String countyGeoId;

    @ReadOnly
    @Column(name = "municipality_geo_id")
    private String municipalityGeoId;

    @ReadOnly
    @Column(name = "postal_code_geo_id")
    private String postalCodeGeoId;

    @ReadOnly
    @Column(name = "geo_point_id")
    private String geoPointId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "order_type_id")
    private String orderTypeId;

    @ReadOnly
    @Column(name = "order_name")
    private String orderName;

    @ReadOnly
    @Column(name = "external_id")
    private String externalId;

    @ReadOnly
    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @ReadOnly
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ReadOnly
    @Column(name = "priority")
    private double priority;

    @ReadOnly
    @Column(name = "entry_date")
    private Timestamp entryDate;

    @ReadOnly
    @Column(name = "pick_sheet_printed_date")
    private Timestamp pickSheetPrintedDate;

    @ReadOnly
    @Column(name = "visit_id")
    private String visitId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "created_by")
    private String createdBy;

    @ReadOnly
    @Column(name = "first_attempt_order_id")
    private String firstAttemptOrderId;

    @ReadOnly
    @Column(name = "currency_uom")
    private String currencyUom;

    @ReadOnly
    @Column(name = "sync_status_id")
    private String syncStatusId;

    @ReadOnly
    @Column(name = "billing_account_id")
    private String billingAccountId;

    @ReadOnly
    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @ReadOnly
    @Column(name = "web_site_id")
    private String webSiteId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "agreement_id")
    private String agreementId;

    @ReadOnly
    @Column(name = "terminal_id")
    private String terminalId;

    @ReadOnly
    @Column(name = "transaction_id")
    private String transactionId;

    @ReadOnly
    @Column(name = "auto_order_shopping_list_id")
    private String autoOrderShoppingListId;

    @ReadOnly
    @Column(name = "needs_inventory_issuance")
    private String needsInventoryIssuance;

    @ReadOnly
    @Column(name = "is_rush_order")
    private String isRushOrder;

    @ReadOnly
    @Column(name = "internal_code")
    private String internalCode;

    @ReadOnly
    @Column(name = "remaining_sub_total")
    private double remainingSubTotal;

    @ReadOnly
    @Column(name = "grand_total")
    private double grandTotal;

    @ReadOnly
    @Column(name = "is_viewed")
    private String isViewed;

    @ReadOnly
    @Column(name = "invoice_per_shipment")
    private String invoicePerShipment;
}
