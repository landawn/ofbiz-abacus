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
@Table(name = "shipment_and_item")
public class ShipmentAndItem {
    @ReadOnly
    @Column(name = "shipment_id")
    private String shipmentId;

    @ReadOnly
    @Column(name = "shipment_type_id")
    private String shipmentTypeId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "primary_order_id")
    private String primaryOrderId;

    @ReadOnly
    @Column(name = "estimated_ready_date")
    private Timestamp estimatedReadyDate;

    @ReadOnly
    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @ReadOnly
    @Column(name = "estimated_arrival_date")
    private Timestamp estimatedArrivalDate;

    @ReadOnly
    @Column(name = "latest_cancel_date")
    private Timestamp latestCancelDate;

    @ReadOnly
    @Column(name = "estimated_ship_cost")
    private double estimatedShipCost;

    @ReadOnly
    @Column(name = "handling_instructions")
    private String handlingInstructions;

    @ReadOnly
    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @ReadOnly
    @Column(name = "destination_facility_id")
    private String destinationFacilityId;

    @ReadOnly
    @Column(name = "origin_contact_mech_id")
    private String originContactMechId;

    @ReadOnly
    @Column(name = "destination_contact_mech_id")
    private String destinationContactMechId;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

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
}
