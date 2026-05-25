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
@Table(name = "survey_page")
public class SurveyPage {
    @Id
    @Column(name = "survey_id")
    private String surveyId;

    @Id
    @Column(name = "survey_page_seq_id")
    private String surveyPageSeqId;

    @Column(name = "page_name")
    private String pageName;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @JoinedBy("surveyId=Survey.surveyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Survey survey;
}
