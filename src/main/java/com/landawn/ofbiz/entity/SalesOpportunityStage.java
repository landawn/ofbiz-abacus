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
@Table(name = "sales_opportunity_stage")
public class SalesOpportunityStage {
    @Id
    @Column(name = "opportunity_stage_id")
    private String opportunityStageId;

    @Column(name = "description")
    private String description;

    @Column(name = "default_probability")
    private double defaultProbability;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
