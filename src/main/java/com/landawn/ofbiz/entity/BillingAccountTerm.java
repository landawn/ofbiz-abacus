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
@Table(name = "billing_account_term")
public class BillingAccountTerm {
    @Id
    @Column(name = "billing_account_term_id")
    private String billingAccountTermId;

    @Column(name = "billing_account_id")
    private String billingAccountId;

    @Column(name = "term_type_id")
    private String termTypeId;

    @Column(name = "term_value")
    private double termValue;

    @Column(name = "term_days")
    private double termDays;

    @Column(name = "uom_id")
    private String uomId;
}
