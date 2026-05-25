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
@Table(name = "invoice_and_role")
public class InvoiceAndRole {
    @ReadOnly
    @Column(name = "invoice_role_party_id")
    private String invoiceRolePartyId;

    @ReadOnly
    @Column(name = "invoice_role_type_id")
    private String invoiceRoleTypeId;

    @ReadOnly
    @Column(name = "invoice_id")
    private String invoiceId;

    @ReadOnly
    @Column(name = "invoice_type_id")
    private String invoiceTypeId;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "billing_account_id")
    private String billingAccountId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "invoice_date")
    private Timestamp invoiceDate;

    @ReadOnly
    @Column(name = "due_date")
    private Timestamp dueDate;

    @ReadOnly
    @Column(name = "paid_date")
    private Timestamp paidDate;

    @ReadOnly
    @Column(name = "invoice_message")
    private String invoiceMessage;

    @ReadOnly
    @Column(name = "reference_number")
    private String referenceNumber;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;
}
