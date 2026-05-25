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
@Table(name = "rate_amount")
public class RateAmount {
    @Id
    @Column(name = "rate_type_id")
    private String rateTypeId;

    @Id
    @Column(name = "rate_currency_uom_id")
    private String rateCurrencyUomId;

    @Id
    @Column(name = "period_type_id")
    private String periodTypeId;

    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "empl_position_type_id")
    private String emplPositionTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "rate_amount")
    private double rateAmount;
}
