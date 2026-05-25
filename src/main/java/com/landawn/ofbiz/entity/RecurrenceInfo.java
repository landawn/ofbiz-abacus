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
@Table(name = "recurrence_info")
public class RecurrenceInfo {
    @Id
    @Column(name = "recurrence_info_id")
    private String recurrenceInfoId;

    @Column(name = "start_date_time")
    private Timestamp startDateTime;

    @Column(name = "exception_date_times")
    private String exceptionDateTimes;

    @Column(name = "recurrence_date_times")
    private String recurrenceDateTimes;

    @Column(name = "exception_rule_id")
    private String exceptionRuleId;

    @Column(name = "recurrence_rule_id")
    private String recurrenceRuleId;

    @Column(name = "recurrence_count")
    private double recurrenceCount;
}
