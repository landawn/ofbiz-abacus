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
@Table(name = "content_keyword")
public class ContentKeyword {
    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "keyword")
    private String keyword;

    @Column(name = "relevancy_weight")
    private double relevancyWeight;
}
