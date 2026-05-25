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
@Table(name = "recurrence_rule")
public class RecurrenceRule {
    @Id
    @Column(name = "recurrence_rule_id")
    private String recurrenceRuleId;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "until_date_time")
    private Timestamp untilDateTime;

    @Column(name = "count_number")
    private double countNumber;

    @Column(name = "interval_number")
    private double intervalNumber;

    @Column(name = "by_second_list")
    private String bySecondList;

    @Column(name = "by_minute_list")
    private String byMinuteList;

    @Column(name = "by_hour_list")
    private String byHourList;

    @Column(name = "by_day_list")
    private String byDayList;

    @Column(name = "by_month_day_list")
    private String byMonthDayList;

    @Column(name = "by_year_day_list")
    private String byYearDayList;

    @Column(name = "by_week_no_list")
    private String byWeekNoList;

    @Column(name = "by_month_list")
    private String byMonthList;

    @Column(name = "by_set_pos_list")
    private String bySetPosList;

    @Column(name = "week_start")
    private String weekStart;

    @Column(name = "x_name")
    private String xName;
}
