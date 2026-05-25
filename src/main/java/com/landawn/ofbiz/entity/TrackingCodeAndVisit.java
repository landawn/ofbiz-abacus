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
@Table(name = "tracking_code_and_visit")
public class TrackingCodeAndVisit {
    @ReadOnly
    @Column(name = "tracking_code_id")
    private String trackingCodeId;

    @ReadOnly
    @Column(name = "visit_id")
    private String visitId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;
}
