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
@Table(name = "payment_method_type_gl_account")
public class PaymentMethodTypeGlAccount {
    @Id
    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Id
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "gl_account_id")
    private String glAccountId;
}
