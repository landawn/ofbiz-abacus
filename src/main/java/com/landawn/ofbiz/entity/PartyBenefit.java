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
@Table(name = "party_benefit")
public class PartyBenefit {
    @Id
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @Id
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @Id
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Id
    @Column(name = "party_id_to")
    private String partyIdTo;

    @Id
    @Column(name = "benefit_type_id")
    private String benefitTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "period_type_id")
    private String periodTypeId;

    @Column(name = "cost")
    private double cost;

    @Column(name = "actual_employer_paid_percent")
    private Double actualEmployerPaidPercent;

    @Column(name = "available_time")
    private double availableTime;

    @JoinedBy("partyIdTo=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party partyTo;

    @JoinedBy("partyIdTo=PartyRole.partyId, roleTypeIdTo=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyToPartyRole;

    @JoinedBy("partyIdFrom=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party partyFrom;

    @JoinedBy("partyIdFrom=PartyRole.partyId, roleTypeIdFrom=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyFromPartyRole;

    @JoinedBy("benefitTypeId=BenefitType.benefitTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BenefitType benefitType;
}
