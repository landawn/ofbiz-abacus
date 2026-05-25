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
@Table(name = "segment_group_classification")
public class SegmentGroupClassification {
    @Id
    @Column(name = "segment_group_id")
    private String segmentGroupId;

    @Id
    @Column(name = "party_classification_group_id")
    private String partyClassificationGroupId;
}
