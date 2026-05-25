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
@Table(name = "invoice")
public class Invoice {
    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Column(name = "invoice_type_id")
    private String invoiceTypeId;

    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "billing_account_id")
    private String billingAccountId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "invoice_date")
    private Timestamp invoiceDate;

    @Column(name = "due_date")
    private Timestamp dueDate;

    @Column(name = "paid_date")
    private Timestamp paidDate;

    @Column(name = "invoice_message")
    private String invoiceMessage;

    @Column(name = "reference_number")
    private String referenceNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;
}
