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

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("approverId=Person.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Person person;

    @JoinedBy("trainingClassTypeId=TrainingClassType.trainingClassTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TrainingClassType trainingClassType;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("trainingRequestId=TrainingRequest.trainingRequestId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TrainingRequest trainingRequest;
}
