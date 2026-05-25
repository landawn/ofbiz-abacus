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
@Table(name = "application_sandbox")
public class ApplicationSandbox {
    @Id
    @Column(name = "application_id")
    private String applicationId;

    @Column(name = "work_effort_id")
    private String workEffortId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "runtime_data_id")
    private String runtimeDataId;

    @JoinedBy("workEffortId=WorkEffortPartyAssignment.workEffortId, partyId=WorkEffortPartyAssignment.partyId, roleTypeId=WorkEffortPartyAssignment.roleTypeId, fromDate=WorkEffortPartyAssignment.fromDate")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffortPartyAssignment workEffortPartyAssignment;

    @JoinedBy("runtimeDataId=RuntimeData.runtimeDataId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RuntimeData runtimeData;
}
