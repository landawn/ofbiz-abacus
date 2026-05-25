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
@Table(name = "perf_review")
public class PerfReview {
    @Id
    @Column(name = "employee_party_id")
    private String employeePartyId;

    @Id
    @Column(name = "employee_role_type_id")
    private String employeeRoleTypeId;

    @Id
    @Column(name = "perf_review_id")
    private String perfReviewId;

    @Column(name = "manager_party_id")
    private String managerPartyId;

    @Column(name = "manager_role_type_id")
    private String managerRoleTypeId;

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "empl_position_id")
    private String emplPositionId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "comments")
    private String comments;

    @JoinedBy("employeePartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party employeeParty;

    @JoinedBy("employeePartyId=PartyRole.partyId, employeeRoleTypeId=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyRole;

    @JoinedBy("managerPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party managerParty;

    @JoinedBy("paymentId=Payment.paymentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Payment payment;
}
