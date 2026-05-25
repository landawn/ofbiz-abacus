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
@Table(name = "billing_account_and_role")
public class BillingAccountAndRole {
    @ReadOnly
    @Column(name = "billing_account_id")
    private String billingAccountId;

    @ReadOnly
    @Column(name = "account_limit")
    private double accountLimit;

    @ReadOnly
    @Column(name = "account_currency_uom_id")
    private String accountCurrencyUomId;

    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "account_from_date")
    private String accountFromDate;

    @ReadOnly
    @Column(name = "account_thru_date")
    private String accountThruDate;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;
}
