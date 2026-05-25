package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "facility_calendar")
public class FacilityCalendar {
    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "calendar_id")
    private String calendarId;

    @Id
    @Column(name = "facility_calendar_type_id")
    private String facilityCalendarTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("facilityId=Facility.facilityId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Facility facility;

    @JoinedBy("facilityCalendarTypeId=FacilityCalendarType.facilityCalendarTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FacilityCalendarType facilityCalendarType;
}
