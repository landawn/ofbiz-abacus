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
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    @Column(name = "payment_method_type_id")
    private String paymentMethodTypeId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "gl_account_id")
    private String glAccountId;

    @Column(name = "fin_account_id")
    private String finAccountId;

    @Column(name = "description")
    private String description;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("paymentMethodTypeId=PaymentMethodType.paymentMethodTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentMethodType paymentMethodType;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("glAccountId=GlAccount.glAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccount glAccount;

    @JoinedBy("finAccountId=FinAccount.finAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccount finAccount;
}
