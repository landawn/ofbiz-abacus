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
@Table(name = "custom_time_period")
public class CustomTimePeriod {
    @Id
    @Column(name = "custom_time_period_id")
    private String customTimePeriodId;

    @Column(name = "parent_period_id")
    private String parentPeriodId;

    @Column(name = "period_type_id")
    private String periodTypeId;

    @Column(name = "period_num")
    private double periodNum;

    @Column(name = "period_name")
    private String periodName;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "is_closed")
    private String isClosed;

    @Column(name = "organization_party_id")
    private String organizationPartyId;
}
