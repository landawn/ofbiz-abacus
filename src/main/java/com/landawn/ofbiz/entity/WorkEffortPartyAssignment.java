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
@Table(name = "work_effort_party_assignment")
public class WorkEffortPartyAssignment {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "assigned_by_user_login_id")
    private String assignedByUserLoginId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "status_date_time")
    private Timestamp statusDateTime;

    @Column(name = "expectation_enum_id")
    private String expectationEnumId;

    @Column(name = "delegate_reason_enum_id")
    private String delegateReasonEnumId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "must_rsvp")
    private String mustRsvp;

    @Column(name = "availability_status_id")
    private String availabilityStatusId;
}
