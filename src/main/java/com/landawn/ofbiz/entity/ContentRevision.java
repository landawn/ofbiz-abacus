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
@Table(name = "content_revision")
public class ContentRevision {
    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "content_revision_seq_id")
    private String contentRevisionSeqId;

    @Column(name = "committed_by_party_id")
    private String committedByPartyId;

    @Column(name = "comments")
    private String comments;
}
