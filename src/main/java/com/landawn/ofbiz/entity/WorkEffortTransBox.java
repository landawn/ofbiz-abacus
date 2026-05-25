package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "work_effort_trans_box")
public class WorkEffortTransBox {
    @Id
    @Column(name = "process_work_effort_id")
    private String processWorkEffortId;

    @Id
    @Column(name = "to_activity_id")
    private String toActivityId;

    @Id
    @Column(name = "transition_id")
    private String transitionId;
}
