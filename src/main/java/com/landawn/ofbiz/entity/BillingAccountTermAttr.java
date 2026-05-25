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
@Table(name = "billing_account_term_attr")
public class BillingAccountTermAttr {
    @Id
    @Column(name = "billing_account_term_id")
    private String billingAccountTermId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;
}
