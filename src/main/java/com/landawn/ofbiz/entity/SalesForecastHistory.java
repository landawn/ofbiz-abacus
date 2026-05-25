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
@Table(name = "sales_forecast_history")
public class SalesForecastHistory {
    @Id
    @Column(name = "sales_forecast_history_id")
    private String salesForecastHistoryId;

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

    @Column(name = "change_note")
    private String changeNote;

    @Column(name = "modified_by_user_login_id")
    private String modifiedByUserLoginId;

    @Column(name = "modified_timestamp")
    private Timestamp modifiedTimestamp;

    @JoinedBy("salesForecastId=SalesForecast.salesForecastId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SalesForecast salesForecast;

    @JoinedBy("organizationPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party organizationParty;

    @JoinedBy("internalPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party internalParty;

    @JoinedBy("customTimePeriodId=CustomTimePeriod.customTimePeriodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomTimePeriod customTimePeriod;

    @JoinedBy("currencyUomId=Uom.uomId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Uom uom;

    @JoinedBy("modifiedByUserLoginId=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;
}
