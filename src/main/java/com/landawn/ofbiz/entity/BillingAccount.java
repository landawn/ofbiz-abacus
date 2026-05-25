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
@Table(name = "billing_account")
public class BillingAccount {
    @Id
    @Column(name = "billing_account_id")
    private String billingAccountId;

    @Column(name = "account_limit")
    private double accountLimit;

    @Column(name = "account_currency_uom_id")
    private String accountCurrencyUomId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "description")
    private String description;

    @Column(name = "external_account_id")
    private String externalAccountId;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;

    @JoinedBy("accountCurrencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("contactMechId=PostalAddress.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PostalAddress postalAddress;
}
