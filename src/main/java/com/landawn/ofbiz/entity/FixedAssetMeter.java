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
@Table(name = "fixed_asset_meter")
public class FixedAssetMeter {
    @Id
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Id
    @Column(name = "product_meter_type_id")
    private String productMeterTypeId;

    @Id
    @Column(name = "reading_date")
    private Timestamp readingDate;

    @Column(name = "meter_value")
    private double meterValue;

    @Column(name = "reading_reason_enum_id")
    private String readingReasonEnumId;

    @Column(name = "maint_hist_seq_id")
    private String maintHistSeqId;

    @Column(name = "work_effort_id")
    private String workEffortId;
}
