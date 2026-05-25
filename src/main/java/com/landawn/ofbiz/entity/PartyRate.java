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
@Table(name = "party_rate")
public class PartyRate {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "rate_type_id")
    private String rateTypeId;

    @Column(name = "default_rate")
    private String defaultRate;

    @Column(name = "percentage_used")
    private Double percentageUsed;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
