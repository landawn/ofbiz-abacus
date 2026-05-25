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
@Table(name = "work_effort_deliverable_prod")
public class WorkEffortDeliverableProd {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "deliverable_id")
    private String deliverableId;
}
