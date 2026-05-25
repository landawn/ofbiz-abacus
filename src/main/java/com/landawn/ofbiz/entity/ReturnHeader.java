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
@Table(name = "return_header")
public class ReturnHeader {
    @Id
    @Column(name = "return_id")
    private String returnId;

    @Column(name = "return_header_type_id")
    private String returnHeaderTypeId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "from_party_id")
    private String fromPartyId;

    @Column(name = "to_party_id")
    private String toPartyId;

    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "fin_account_id")
    private String finAccountId;

    @Column(name = "billing_account_id")
    private String billingAccountId;

    @Column(name = "entry_date")
    private Timestamp entryDate;

    @Column(name = "origin_contact_mech_id")
    private String originContactMechId;

    @Column(name = "destination_facility_id")
    private String destinationFacilityId;

    @Column(name = "needs_inventory_receive")
    private String needsInventoryReceive;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "supplier_rma_id")
    private String supplierRmaId;
}
