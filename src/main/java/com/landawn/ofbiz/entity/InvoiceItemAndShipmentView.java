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
@Table(name = "invoice_item_and_shipment_view")
public class InvoiceItemAndShipmentView {
    @ReadOnly
    @Column(name = "invoice_id")
    private String invoiceId;

    @ReadOnly
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @ReadOnly
    @Column(name = "invoice_item_type_id")
    private String invoiceItemTypeId;

    @ReadOnly
    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @ReadOnly
    @Column(name = "override_org_party_id")
    private String overrideOrgPartyId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @ReadOnly
    @Column(name = "parent_invoice_id")
    private String parentInvoiceId;

    @ReadOnly
    @Column(name = "parent_invoice_item_seq_id")
    private String parentInvoiceItemSeqId;

    @ReadOnly
    @Column(name = "uom_id")
    private String uomId;

    @ReadOnly
    @Column(name = "taxable_flag")
    private String taxableFlag;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "amount")
    private double amount;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @ReadOnly
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @ReadOnly
    @Column(name = "tax_authority_rate_seq_id")
    private String taxAuthorityRateSeqId;

    @ReadOnly
    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

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
    @Column(name = "primary_return_id")
    private String primaryReturnId;

    @ReadOnly
    @Column(name = "primary_ship_group_seq_id")
    private String primaryShipGroupSeqId;

    @ReadOnly
    @Column(name = "picklist_bin_id")
    private String picklistBinId;

    @ReadOnly
    @Column(name = "estimated_ready_date")
    private Timestamp estimatedReadyDate;

    @ReadOnly
    @Column(name = "estimated_ship_date")
    private Timestamp estimatedShipDate;

    @ReadOnly
    @Column(name = "estimated_ship_work_eff_id")
    private String estimatedShipWorkEffId;

    @ReadOnly
    @Column(name = "estimated_arrival_date")
    private Timestamp estimatedArrivalDate;

    @ReadOnly
    @Column(name = "estimated_arrival_work_eff_id")
    private String estimatedArrivalWorkEffId;

    @ReadOnly
    @Column(name = "latest_cancel_date")
    private Timestamp latestCancelDate;

    @ReadOnly
    @Column(name = "estimated_ship_cost")
    private double estimatedShipCost;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

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
    @Column(name = "origin_telecom_number_id")
    private String originTelecomNumberId;

    @ReadOnly
    @Column(name = "destination_contact_mech_id")
    private String destinationContactMechId;

    @ReadOnly
    @Column(name = "destination_telecom_number_id")
    private String destinationTelecomNumberId;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "additional_shipping_charge")
    private double additionalShippingCharge;

    @ReadOnly
    @Column(name = "addtl_shipping_charge_desc")
    private String addtlShippingChargeDesc;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
