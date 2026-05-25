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
@Table(name = "shipment")
public class Shipment {
    @Id
    @Column(name = "shipment_id")
    private String shipmentId;

    @Column(name = "shipment_type_id")
    private String shipmentTypeId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "primary_order_id")
    private String primaryOrderId;

    @Column(name = "primary_return_id")
    private String primaryReturnId;

    @Column(name = "primary_ship_group_seq_id")
    private String primaryShipGroupSeqId;

    @Column(name = "picklist_bin_id")
    private String picklistBinId;

    @Column(name = "estimated_ready_date")
    private Timestamp estimatedReadyDate;

    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @Column(name = "estimated_ship_work_eff_id")
    private String estimatedShipWorkEffId;

    @Column(name = "estimated_arrival_date")
    private Timestamp estimatedArrivalDate;

    @Column(name = "estimated_arrival_work_eff_id")
    private String estimatedArrivalWorkEffId;

    @Column(name = "latest_cancel_date")
    private Timestamp latestCancelDate;

    @Column(name = "estimated_ship_cost")
    private double estimatedShipCost;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "handling_instructions")
    private String handlingInstructions;

    @Column(name = "origin_facility_id")
    private String originFacilityId;

    @Column(name = "destination_facility_id")
    private String destinationFacilityId;

    @Column(name = "origin_contact_mech_id")
    private String originContactMechId;

    @Column(name = "origin_telecom_number_id")
    private String originTelecomNumberId;

    @Column(name = "destination_contact_mech_id")
    private String destinationContactMechId;

    @Column(name = "destination_telecom_number_id")
    private String destinationTelecomNumberId;

    @Column(name = "party_id_to")
    private String partyIdTo;

    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Column(name = "additional_shipping_charge")
    private double additionalShippingCharge;

    @Column(name = "addtl_shipping_charge_desc")
    private String addtlShippingChargeDesc;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("shipmentTypeId=ShipmentType.shipmentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentType shipmentType;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("estimatedShipWorkEffId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort estimatedShipWorkEff;

    @JoinedBy("estimatedArrivalWorkEffId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort estimatedArrivalWorkEff;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("originFacilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility originFacility;

    @JoinedBy("destinationFacilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility destinationFacility;

    @JoinedBy("originContactMechId=PostalAddress.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PostalAddress originContactMech;

    @JoinedBy("originTelecomNumberId=TelecomNumber.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TelecomNumber originTelecomNumber;

    @JoinedBy("destinationContactMechId=PostalAddress.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PostalAddress destinationContactMech;

    @JoinedBy("destinationTelecomNumberId=TelecomNumber.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TelecomNumber destinationTelecomNumber;

    @JoinedBy("primaryOrderId=OrderHeader.orderId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderHeader orderHeader;

    @JoinedBy("primaryReturnId=ReturnHeader.returnId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ReturnHeader returnHeader;

    @JoinedBy("picklistBinId=PicklistBin.picklistBinId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PicklistBin picklistBin;

    @JoinedBy("partyIdTo=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party partyTo;

    @JoinedBy("partyIdFrom=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party partyFrom;
}
