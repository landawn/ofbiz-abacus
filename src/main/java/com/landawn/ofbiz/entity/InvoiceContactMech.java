package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "invoice_contact_mech")
public class InvoiceContactMech {
    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "contact_mech_purpose_type_id")
    private String contactMechPurposeTypeId;

    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;
}
