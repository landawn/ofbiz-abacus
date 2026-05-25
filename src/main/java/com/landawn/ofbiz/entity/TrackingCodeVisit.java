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
@Table(name = "tracking_code_visit")
public class TrackingCodeVisit {
    @Id
    @Column(name = "tracking_code_id")
    private String trackingCodeId;

    @Id
    @Column(name = "visit_id")
    private String visitId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "source_enum_id")
    private String sourceEnumId;
}
