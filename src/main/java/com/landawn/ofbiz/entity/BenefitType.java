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
@Table(name = "benefit_type")
public class BenefitType {
    @Id
    @Column(name = "benefit_type_id")
    private String benefitTypeId;

    @Column(name = "benefit_name")
    private String benefitName;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;

    @Column(name = "employer_paid_percentage")
    private Double employerPaidPercentage;

    @JoinedBy("parentTypeId=BenefitType.benefitTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BenefitType benefitType;
}
