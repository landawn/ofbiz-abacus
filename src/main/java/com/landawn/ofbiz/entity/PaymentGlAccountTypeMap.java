package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "payment_gl_account_type_map")
public class PaymentGlAccountTypeMap {
    @Id
    @Column(name = "payment_type_id")
    private String paymentTypeId;

    @Id
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "gl_account_type_id")
    private String glAccountTypeId;

    @JoinedBy("paymentTypeId=PaymentType.paymentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentType paymentType;

    @JoinedBy("organizationPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("glAccountTypeId=GlAccountType.glAccountTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccountType glAccountType;
}
