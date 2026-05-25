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
@Table(name = "sales_forecast_and_custom_time_period")
public class SalesForecastAndCustomTimePeriod {
    @ReadOnly
    @Column(name = "sales_forecast_id")
    private String salesForecastId;

    @ReadOnly
    @Column(name = "parent_sales_forecast_id")
    private String parentSalesForecastId;

    @ReadOnly
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @ReadOnly
    @Column(name = "internal_party_id")
    private String internalPartyId;

    @ReadOnly
    @Column(name = "custom_time_period_id")
    private String customTimePeriodId;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "quota_amount")
    private double quotaAmount;

    @ReadOnly
    @Column(name = "forecast_amount")
    private double forecastAmount;

    @ReadOnly
    @Column(name = "best_case_amount")
    private double bestCaseAmount;

    @ReadOnly
    @Column(name = "closed_amount")
    private double closedAmount;

    @ReadOnly
    @Column(name = "percent_of_quota_forecast")
    private double percentOfQuotaForecast;

    @ReadOnly
    @Column(name = "percent_of_quota_closed")
    private double percentOfQuotaClosed;

    @ReadOnly
    @Column(name = "pipeline_amount")
    private double pipelineAmount;

    @ReadOnly
    @Column(name = "created_by_user_login_id")
    private String createdByUserLoginId;

    @ReadOnly
    @Column(name = "modified_by_user_login_id")
    private String modifiedByUserLoginId;

    @ReadOnly
    @Column(name = "parent_period_id")
    private String parentPeriodId;

    @ReadOnly
    @Column(name = "period_type_id")
    private String periodTypeId;

    @ReadOnly
    @Column(name = "period_num")
    private double periodNum;

    @ReadOnly
    @Column(name = "period_name")
    private String periodName;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "is_closed")
    private String isClosed;
}
