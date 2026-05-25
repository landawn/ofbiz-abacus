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
@Table(name = "work_effort_event_reminder")
public class WorkEffortEventReminder {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "sequence_id")
    private String sequenceId;

    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "reminder_date_time")
    private Timestamp reminderDateTime;

    @Column(name = "repeat_count")
    private double repeatCount;

    @Column(name = "repeat_interval")
    private double repeatInterval;

    @Column(name = "current_count")
    private double currentCount;

    @Column(name = "reminder_offset")
    private double reminderOffset;

    @Column(name = "locale_id")
    private String localeId;

    @Column(name = "time_zone_id")
    private String timeZoneId;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;
}
