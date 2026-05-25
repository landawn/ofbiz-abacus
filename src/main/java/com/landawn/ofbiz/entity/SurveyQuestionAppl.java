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
@Table(name = "survey_question_appl")
public class SurveyQuestionAppl {
    @Id
    @Column(name = "survey_id")
    private String surveyId;

    @Id
    @Column(name = "survey_question_id")
    private String surveyQuestionId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "survey_page_seq_id")
    private String surveyPageSeqId;

    @Column(name = "survey_multi_resp_id")
    private String surveyMultiRespId;

    @Column(name = "survey_multi_resp_col_id")
    private String surveyMultiRespColId;

    @Column(name = "required_field")
    private String requiredField;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "external_field_ref")
    private String externalFieldRef;

    @Column(name = "with_survey_question_id")
    private String withSurveyQuestionId;

    @Column(name = "with_survey_option_seq_id")
    private String withSurveyOptionSeqId;
}
