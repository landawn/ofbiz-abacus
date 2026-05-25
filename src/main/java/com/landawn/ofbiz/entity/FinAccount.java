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
@Table(name = "fin_account")
public class FinAccount {
    @Id
    @Column(name = "fin_account_id")
    private String finAccountId;

    @Column(name = "fin_account_type_id")
    private String finAccountTypeId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "fin_account_name")
    private String finAccountName;

    @Column(name = "fin_account_code")
    private String finAccountCode;

    @Column(name = "fin_account_pin")
    private String finAccountPin;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "owner_party_id")
    private String ownerPartyId;

    @Column(name = "post_to_gl_account_id")
    private String postToGlAccountId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "is_refundable")
    private String isRefundable;

    @Column(name = "replenish_payment_id")
    private String replenishPaymentId;

    @Column(name = "replenish_level")
    private double replenishLevel;

    @Column(name = "actual_balance")
    private double actualBalance;

    @Column(name = "available_balance")
    private double availableBalance;

    @JoinedBy("finAccountTypeId=FinAccountType.finAccountTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccountType finAccountType;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("organizationPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party organizationParty;

    @JoinedBy("ownerPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party ownerParty;

    @JoinedBy("postToGlAccountId=GlAccount.glAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlAccount glAccount;

    @JoinedBy("replenishPaymentId=PaymentMethod.paymentMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PaymentMethod paymentMethod;
}
