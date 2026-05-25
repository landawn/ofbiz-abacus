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
@Table(name = "content_purpose")
public class ContentPurpose {
    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "content_purpose_type_id")
    private String contentPurposeTypeId;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
