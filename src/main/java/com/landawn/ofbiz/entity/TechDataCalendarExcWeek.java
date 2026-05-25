package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tech_data_calendar_exc_week")
public class TechDataCalendarExcWeek {
    @Id
    @Column(name = "calendar_id")
    private String calendarId;

    @Id
    @Column(name = "exception_date_start")
    private Date exceptionDateStart;

    @Column(name = "calendar_week_id")
    private String calendarWeekId;

    @Column(name = "description")
    private String description;

    @JoinedBy("calendarId=TechDataCalendar.calendarId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TechDataCalendar techDataCalendar;

    @JoinedBy("calendarWeekId=TechDataCalendarWeek.calendarWeekId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TechDataCalendarWeek techDataCalendarWeek;
}
