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
@Table(name = "employment_app")
public class EmploymentApp {
    @Id
    @Column(name = "application_id")
    private String applicationId;

    @Column(name = "empl_position_id")
    private String emplPositionId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "employment_app_source_type_id")
    private String employmentAppSourceTypeId;

    @Column(name = "applying_party_id")
    private String applyingPartyId;

    @Column(name = "referred_by_party_id")
    private String referredByPartyId;

    @Column(name = "application_date")
    private Timestamp applicationDate;

    @Column(name = "approver_party_id")
    private String approverPartyId;

    @Column(name = "job_requisition_id")
    private String jobRequisitionId;

    @JoinedBy("approverPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("jobRequisitionId=JobRequisition.jobRequisitionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private JobRequisition jobRequisition;
}
