package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "survey_question_and_appl")
public class SurveyQuestionAndAppl {
    @ReadOnly
    @Column(name = "survey_question_id")
    private String surveyQuestionId;

    @ReadOnly
    @Column(name = "survey_question_category_id")
    private String surveyQuestionCategoryId;

    @ReadOnly
    @Column(name = "survey_question_type_id")
    private String surveyQuestionTypeId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "question")
    private String question;

    @ReadOnly
    @Column(name = "hint")
    private String hint;

    @ReadOnly
    @Column(name = "enum_type_id")
    private String enumTypeId;

    @ReadOnly
    @Column(name = "geo_id")
    private String geoId;

    @ReadOnly
    @Column(name = "format_string")
    private String formatString;

    @ReadOnly
    @Column(name = "survey_id")
    private String surveyId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "survey_page_seq_id")
    private String surveyPageSeqId;

    @ReadOnly
    @Column(name = "survey_multi_resp_id")
    private String surveyMultiRespId;

    @ReadOnly
    @Column(name = "survey_multi_resp_col_id")
    private String surveyMultiRespColId;

    @ReadOnly
    @Column(name = "required_field")
    private String requiredField;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "external_field_ref")
    private String externalFieldRef;

    @ReadOnly
    @Column(name = "with_survey_question_id")
    private String withSurveyQuestionId;

    @ReadOnly
    @Column(name = "with_survey_option_seq_id")
    private String withSurveyOptionSeqId;
}
