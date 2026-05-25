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
@Table(name = "work_effort_assoc_attribute")
public class WorkEffortAssocAttribute {
    @Id
    @Column(name = "work_effort_id_from")
    private String workEffortIdFrom;

    @Id
    @Column(name = "work_effort_id_to")
    private String workEffortIdTo;

    @Id
    @Column(name = "work_effort_assoc_type_id")
    private String workEffortAssocTypeId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "attr_description")
    private String attrDescription;
}
