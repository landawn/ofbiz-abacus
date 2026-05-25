package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "order_item_ship_group")
public class OrderItemShipGroup {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "ship_group_seq_id")
    private String shipGroupSeqId;

    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Column(name = "supplier_party_id")
    private String supplierPartyId;

    @Column(name = "supplier_agreement_id")
    private String supplierAgreementId;

    @Column(name = "vendor_party_id")
    private String vendorPartyId;

    @Column(name = "carrier_party_id")
    private String carrierPartyId;

    @Column(name = "carrier_role_type_id")
    private String carrierRoleTypeId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "telecom_contact_mech_id")
    private String telecomContactMechId;

    @Column(name = "tracking_number")
    private String trackingNumber;

    @Column(name = "shipping_instructions")
    private String shippingInstructions;

    @Column(name = "may_split")
    private String maySplit;

    @Column(name = "gift_message")
    private String giftMessage;

    @Column(name = "is_gift")
    private String isGift;

    @Column(name = "ship_after_date")
    private Timestamp shipAfterDate;

    @Column(name = "ship_by_date")
    private Timestamp shipByDate;

    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @Column(name = "estimated_delivery_date")
    private Timestamp estimatedDeliveryDate;
}
