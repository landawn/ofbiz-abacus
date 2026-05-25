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
@Table(name = "sales_opportunity_and_role")
public class SalesOpportunityAndRole {
    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

    @ReadOnly
    @Column(name = "opportunity_name")
    private String opportunityName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "next_step")
    private String nextStep;

    @ReadOnly
    @Column(name = "next_step_date")
    private Timestamp nextStepDate;

    @ReadOnly
    @Column(name = "estimated_amount")
    private double estimatedAmount;

    @ReadOnly
    @Column(name = "estimated_probability")
    private double estimatedProbability;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "marketing_campaign_id")
    private String marketingCampaignId;

    @ReadOnly
    @Column(name = "data_source_id")
    private String dataSourceId;

    @ReadOnly
    @Column(name = "estimated_close_date")
    private Timestamp estimatedCloseDate;

    @ReadOnly
    @Column(name = "opportunity_stage_id")
    private String opportunityStageId;

    @ReadOnly
    @Column(name = "type_enum_id")
    private String typeEnumId;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;
}
