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
@Table(name = "segment_group_classification")
public class SegmentGroupClassification {
    @Id
    @Column(name = "segment_group_id")
    private String segmentGroupId;

    @Id
    @Column(name = "party_classification_group_id")
    private String partyClassificationGroupId;

    @JoinedBy("segmentGroupId=SegmentGroup.segmentGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SegmentGroup segmentGroup;

    @JoinedBy("partyClassificationGroupId=PartyClassificationGroup.partyClassificationGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyClassificationGroup partyClassificationGroup;
}
