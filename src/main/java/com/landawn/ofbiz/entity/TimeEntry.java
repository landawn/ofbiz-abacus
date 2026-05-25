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
@Table(name = "time_entry")
public class TimeEntry {
    @Id
    @Column(name = "time_entry_id")
    private String timeEntryId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "rate_type_id")
    private String rateTypeId;

    @Column(name = "work_effort_id")
    private String workEffortId;

    @Column(name = "timesheet_id")
    private String timesheetId;

    @Column(name = "invoice_id")
    private String invoiceId;

    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Column(name = "hours")
    private Double hours;

    @Column(name = "comments")
    private String comments;
}
