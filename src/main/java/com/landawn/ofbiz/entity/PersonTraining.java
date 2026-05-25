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
@Table(name = "person_training")
public class PersonTraining {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "training_request_id")
    private String trainingRequestId;

    @Id
    @Column(name = "training_class_type_id")
    private String trainingClassTypeId;

    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "approver_id")
    private String approverId;

    @Column(name = "approval_status")
    private String approvalStatus;

    @Column(name = "reason")
    private String reason;
}
