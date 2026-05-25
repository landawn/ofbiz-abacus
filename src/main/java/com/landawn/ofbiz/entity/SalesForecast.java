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
@Table(name = "sales_forecast")
public class SalesForecast {
    @Id
    @Column(name = "sales_forecast_id")
    private String salesForecastId;

    @Column(name = "parent_sales_forecast_id")
    private String parentSalesForecastId;

    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "internal_party_id")
    private String internalPartyId;

    @Column(name = "custom_time_period_id")
    private String customTimePeriodId;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "quota_amount")
    private double quotaAmount;

    @Column(name = "forecast_amount")
    private double forecastAmount;

    @Column(name = "best_case_amount")
    private double bestCaseAmount;

    @Column(name = "closed_amount")
    private double closedAmount;

    @Column(name = "percent_of_quota_forecast")
    private double percentOfQuotaForecast;

    @Column(name = "percent_of_quota_closed")
    private double percentOfQuotaClosed;

    @Column(name = "pipeline_amount")
    private double pipelineAmount;

    @Column(name = "created_by_user_login_id")
    private String createdByUserLoginId;

    @Column(name = "modified_by_user_login_id")
    private String modifiedByUserLoginId;
}
