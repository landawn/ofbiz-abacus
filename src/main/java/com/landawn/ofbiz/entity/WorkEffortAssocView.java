package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "work_effort_assoc_view")
public class WorkEffortAssocView {
    @ReadOnly
    @Column(name = "work_effort_to_name")
    private String workEffortToName;

    @ReadOnly
    @Column(name = "work_effort_to_setup")
    private String workEffortToSetup;

    @ReadOnly
    @Column(name = "work_effort_to_run")
    private String workEffortToRun;

    @ReadOnly
    @Column(name = "work_effort_to_parent_id")
    private String workEffortToParentId;

    @ReadOnly
    @Column(name = "work_effort_to_current_status_id")
    private String workEffortToCurrentStatusId;

    @ReadOnly
    @Column(name = "work_effort_to_work_effort_purpose_type_id")
    private String workEffortToWorkEffortPurposeTypeId;

    @ReadOnly
    @Column(name = "work_effort_to_estimated_start_date")
    private String workEffortToEstimatedStartDate;

    @ReadOnly
    @Column(name = "work_effort_to_estimated_completion_date")
    private String workEffortToEstimatedCompletionDate;

    @ReadOnly
    @Column(name = "work_effort_to_actual_start_date")
    private String workEffortToActualStartDate;

    @ReadOnly
    @Column(name = "work_effort_to_actual_completion_date")
    private String workEffortToActualCompletionDate;

    @ReadOnly
    @Column(name = "work_effort_id_from")
    private String workEffortIdFrom;

    @ReadOnly
    @Column(name = "work_effort_id_to")
    private String workEffortIdTo;

    @ReadOnly
    @Column(name = "work_effort_assoc_type_id")
    private String workEffortAssocTypeId;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;
}
