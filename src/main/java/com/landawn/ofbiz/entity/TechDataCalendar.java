package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "tech_data_calendar")
public class TechDataCalendar {
    @Id
    @Column(name = "calendar_id")
    private String calendarId;

    @Column(name = "description")
    private String description;

    @Column(name = "calendar_week_id")
    private String calendarWeekId;

    @JoinedBy("calendarWeekId=TechDataCalendarWeek.calendarWeekId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TechDataCalendarWeek techDataCalendarWeek;
}
