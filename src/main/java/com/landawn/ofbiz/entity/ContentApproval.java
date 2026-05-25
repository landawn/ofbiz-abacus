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
@Table(name = "content_approval")
public class ContentApproval {
    @Id
    @Column(name = "content_approval_id")
    private String contentApprovalId;

    @Column(name = "content_id")
    private String contentId;

    @Column(name = "content_revision_seq_id")
    private String contentRevisionSeqId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "approval_status_id")
    private String approvalStatusId;

    @Column(name = "approval_date")
    private Timestamp approvalDate;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "comments")
    private String comments;
}
