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
@Table(name = "benefit_type_and_party")
public class BenefitTypeAndParty {
    @ReadOnly
    @Column(name = "benefit_type_id")
    private String benefitTypeId;

    @ReadOnly
    @Column(name = "benefit_name")
    private String benefitName;

    @ReadOnly
    @Column(name = "parent_type_id")
    private String parentTypeId;

    @ReadOnly
    @Column(name = "has_table")
    private String hasTable;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "employer_paid_percentage")
    private Double employerPaidPercentage;

    @ReadOnly
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @ReadOnly
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "period_type_id")
    private String periodTypeId;

    @ReadOnly
    @Column(name = "cost")
    private double cost;

    @ReadOnly
    @Column(name = "actual_employer_paid_percent")
    private Double actualEmployerPaidPercent;

    @ReadOnly
    @Column(name = "available_time")
    private double availableTime;
}
