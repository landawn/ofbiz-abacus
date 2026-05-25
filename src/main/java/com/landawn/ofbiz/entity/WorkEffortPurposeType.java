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
@Table(name = "work_effort_purpose_type")
public class WorkEffortPurposeType {
    @Id
    @Column(name = "work_effort_purpose_type_id")
    private String workEffortPurposeTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "description")
    private String description;
}
