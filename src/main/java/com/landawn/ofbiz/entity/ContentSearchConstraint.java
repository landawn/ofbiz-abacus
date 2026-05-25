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
@Table(name = "content_search_constraint")
public class ContentSearchConstraint {
    @Id
    @Column(name = "content_search_result_id")
    private String contentSearchResultId;

    @Id
    @Column(name = "constraint_seq_id")
    private String constraintSeqId;

    @Column(name = "constraint_name")
    private String constraintName;

    @Column(name = "info_string")
    private String infoString;

    @Column(name = "include_sub_categories")
    private String includeSubCategories;

    @Column(name = "is_and")
    private String isAnd;

    @Column(name = "any_prefix")
    private String anyPrefix;

    @Column(name = "any_suffix")
    private String anySuffix;

    @Column(name = "remove_stems")
    private String removeStems;

    @Column(name = "low_value")
    private String lowValue;

    @Column(name = "high_value")
    private String highValue;
}
