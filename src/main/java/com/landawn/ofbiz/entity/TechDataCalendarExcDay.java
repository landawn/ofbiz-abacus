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
@Table(name = "tech_data_calendar_exc_day")
public class TechDataCalendarExcDay {
    @Id
    @Column(name = "calendar_id")
    private String calendarId;

    @Id
    @Column(name = "exception_date_start_time")
    private Timestamp exceptionDateStartTime;

    @Column(name = "exception_capacity")
    private double exceptionCapacity;

    @Column(name = "used_capacity")
    private double usedCapacity;

    @Column(name = "description")
    private String description;
}
