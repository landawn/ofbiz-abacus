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
@Table(name = "sales_opportunity")
public class SalesOpportunity {
    @Id
    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

    @Column(name = "opportunity_name")
    private String opportunityName;

    @Column(name = "description")
    private String description;

    @Column(name = "next_step")
    private String nextStep;

    @Column(name = "next_step_date")
    private Timestamp nextStepDate;

    @Column(name = "estimated_amount")
    private double estimatedAmount;

    @Column(name = "estimated_probability")
    private double estimatedProbability;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "marketing_campaign_id")
    private String marketingCampaignId;

    @Column(name = "data_source_id")
    private String dataSourceId;

    @Column(name = "estimated_close_date")
    private Timestamp estimatedCloseDate;

    @Column(name = "opportunity_stage_id")
    private String opportunityStageId;

    @Column(name = "type_enum_id")
    private String typeEnumId;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("opportunityStageId=SalesOpportunityStage.opportunityStageId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SalesOpportunityStage salesOpportunityStage;

    @JoinedBy("typeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("marketingCampaignId=MarketingCampaign.marketingCampaignId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private MarketingCampaign marketingCampaign;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;

    @JoinedBy("dataSourceId=DataSource.dataSourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataSource dataSource;
}
