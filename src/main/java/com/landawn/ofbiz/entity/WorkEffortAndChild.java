package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "work_effort_and_child")
public class WorkEffortAndChild {
    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "work_effort_name")
    private String workEffortName;

    @ReadOnly
    @Column(name = "work_effort_type_id")
    private String workEffortTypeId;

    @ReadOnly
    @Column(name = "work_effort_parent_id")
    private String workEffortParentId;

    @ReadOnly
    @Column(name = "current_status_id")
    private String currentStatusId;

    @ReadOnly
    @Column(name = "child_work_effort_id")
    private String childWorkEffortId;

    @ReadOnly
    @Column(name = "child_work_effort_name")
    private String childWorkEffortName;

    @ReadOnly
    @Column(name = "child_work_effort_type_id")
    private String childWorkEffortTypeId;

    @ReadOnly
    @Column(name = "child_current_status_id")
    private String childCurrentStatusId;
}
