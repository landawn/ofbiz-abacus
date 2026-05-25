package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tech_data_calendar_week")
public class TechDataCalendarWeek {
    @Id
    @Column(name = "calendar_week_id")
    private String calendarWeekId;

    @Column(name = "description")
    private String description;

    @Column(name = "monday_start_time")
    private Time mondayStartTime;

    @Column(name = "monday_capacity")
    private Double mondayCapacity;

    @Column(name = "tuesday_start_time")
    private Time tuesdayStartTime;

    @Column(name = "tuesday_capacity")
    private Double tuesdayCapacity;

    @Column(name = "wednesday_start_time")
    private Time wednesdayStartTime;

    @Column(name = "wednesday_capacity")
    private Double wednesdayCapacity;

    @Column(name = "thursday_start_time")
    private Time thursdayStartTime;

    @Column(name = "thursday_capacity")
    private Double thursdayCapacity;

    @Column(name = "friday_start_time")
    private Time fridayStartTime;

    @Column(name = "friday_capacity")
    private Double fridayCapacity;

    @Column(name = "saturday_start_time")
    private Time saturdayStartTime;

    @Column(name = "saturday_capacity")
    private Double saturdayCapacity;

    @Column(name = "sunday_start_time")
    private Time sundayStartTime;

    @Column(name = "sunday_capacity")
    private Double sundayCapacity;
}
