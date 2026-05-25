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
@Table(name = "survey_multi_resp_column")
public class SurveyMultiRespColumn {
    @Id
    @Column(name = "survey_id")
    private String surveyId;

    @Id
    @Column(name = "survey_multi_resp_id")
    private String surveyMultiRespId;

    @Id
    @Column(name = "survey_multi_resp_col_id")
    private String surveyMultiRespColId;

    @Column(name = "column_title")
    private String columnTitle;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @JoinedBy("surveyId=SurveyMultiResp.surveyId, surveyMultiRespId=SurveyMultiResp.surveyMultiRespId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SurveyMultiResp surveyMultiResp;
}
