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
@Table(name = "empl_leave")
public class EmplLeave {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "leave_type_id")
    private String leaveTypeId;

    @Column(name = "empl_leave_reason_type_id")
    private String emplLeaveReasonTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "approver_party_id")
    private String approverPartyId;

    @Column(name = "leave_status")
    private String leaveStatus;

    @Column(name = "description")
    private String description;
}
