package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "work_effort_assoc_type_attr")
public class WorkEffortAssocTypeAttr {
    @Id
    @Column(name = "work_effort_assoc_type_id")
    private String workEffortAssocTypeId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "description")
    private String description;

    @JoinedBy("workEffortAssocTypeId=WorkEffortAssocType.workEffortAssocTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffortAssocType workEffortAssocType;
}
