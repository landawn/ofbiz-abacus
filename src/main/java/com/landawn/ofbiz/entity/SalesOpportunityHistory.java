package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "sales_opportunity_history")
public class SalesOpportunityHistory {
    @Id
    @Column(name = "sales_opportunity_history_id")
    private String salesOpportunityHistoryId;

    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

    @Column(name = "description")
    private String description;

    @Column(name = "next_step")
    private String nextStep;

    @Column(name = "estimated_amount")
    private double estimatedAmount;

    @Column(name = "estimated_probability")
    private double estimatedProbability;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "estimated_close_date")
    private Timestamp estimatedCloseDate;

    @Column(name = "opportunity_stage_id")
    private String opportunityStageId;

    @Column(name = "change_note")
    private String changeNote;

    @Column(name = "modified_by_user_login")
    private String modifiedByUserLogin;

    @Column(name = "modified_timestamp")
    private Timestamp modifiedTimestamp;
}
