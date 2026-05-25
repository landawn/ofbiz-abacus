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
@Table(name = "marketing_campaign")
public class MarketingCampaign {
    @Id
    @Column(name = "marketing_campaign_id")
    private String marketingCampaignId;

    @Column(name = "parent_campaign_id")
    private String parentCampaignId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "campaign_name")
    private String campaignName;

    @Column(name = "campaign_summary")
    private String campaignSummary;

    @Column(name = "budgeted_cost")
    private double budgetedCost;

    @Column(name = "actual_cost")
    private double actualCost;

    @Column(name = "estimated_cost")
    private double estimatedCost;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "converted_leads")
    private String convertedLeads;

    @Column(name = "expected_response_percent")
    private Double expectedResponsePercent;

    @Column(name = "expected_revenue")
    private double expectedRevenue;

    @Column(name = "num_sent")
    private double numSent;

    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
