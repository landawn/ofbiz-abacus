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
@Table(name = "timesheet")
public class Timesheet {
    @Id
    @Column(name = "timesheet_id")
    private String timesheetId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "client_party_id")
    private String clientPartyId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "approved_by_user_login_id")
    private String approvedByUserLoginId;

    @Column(name = "comments")
    private String comments;
}
