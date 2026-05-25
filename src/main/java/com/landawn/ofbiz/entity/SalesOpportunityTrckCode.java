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
@Table(name = "sales_opportunity_trck_code")
public class SalesOpportunityTrckCode {
    @Id
    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;

    @Id
    @Column(name = "tracking_code_id")
    private String trackingCodeId;

    @Column(name = "received_date")
    private Timestamp receivedDate;
}
