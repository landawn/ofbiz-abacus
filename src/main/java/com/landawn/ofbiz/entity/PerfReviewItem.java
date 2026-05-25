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
@Table(name = "perf_review_item")
public class PerfReviewItem {
    @Id
    @Column(name = "employee_party_id")
    private String employeePartyId;

    @Id
    @Column(name = "employee_role_type_id")
    private String employeeRoleTypeId;

    @Id
    @Column(name = "perf_review_id")
    private String perfReviewId;

    @Id
    @Column(name = "perf_review_item_seq_id")
    private String perfReviewItemSeqId;

    @Column(name = "perf_review_item_type_id")
    private String perfReviewItemTypeId;

    @Column(name = "perf_rating_type_id")
    private String perfRatingTypeId;

    @Column(name = "comments")
    private String comments;

    @JoinedBy("employeePartyId=PerfReview.employeePartyId, employeeRoleTypeId=PerfReview.employeeRoleTypeId, perfReviewId=PerfReview.perfReviewId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PerfReview perfReview;

    @JoinedBy("employeePartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("employeePartyId=PartyRole.partyId, employeeRoleTypeId=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyRole;
}
