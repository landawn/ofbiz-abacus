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
@Table(name = "segment_group_type")
public class SegmentGroupType {
    @Id
    @Column(name = "segment_group_type_id")
    private String segmentGroupTypeId;

    @Column(name = "description")
    private String description;
}
