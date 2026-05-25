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
@Table(name = "work_effort_assoc")
public class WorkEffortAssoc {
    @Id
    @Column(name = "work_effort_id_from")
    private String workEffortIdFrom;

    @Id
    @Column(name = "work_effort_id_to")
    private String workEffortIdTo;

    @Id
    @Column(name = "work_effort_assoc_type_id")
    private String workEffortAssocTypeId;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
