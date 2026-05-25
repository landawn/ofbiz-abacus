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
@Table(name = "survey_response_answer")
public class SurveyResponseAnswer {
    @Id
    @Column(name = "survey_response_id")
    private String surveyResponseId;

    @Id
    @Column(name = "survey_question_id")
    private String surveyQuestionId;

    @Id
    @Column(name = "survey_multi_resp_col_id")
    private String surveyMultiRespColId;

    @Column(name = "survey_multi_resp_id")
    private String surveyMultiRespId;

    @Column(name = "boolean_response")
    private String booleanResponse;

    @Column(name = "currency_response")
    private double currencyResponse;

    @Column(name = "float_response")
    private Double floatResponse;

    @Column(name = "numeric_response")
    private double numericResponse;

    @Column(name = "text_response")
    private String textResponse;

    @Column(name = "survey_option_seq_id")
    private String surveyOptionSeqId;

    @Column(name = "content_id")
    private String contentId;

    @Column(name = "answered_date")
    private Timestamp answeredDate;

    @Column(name = "amount_base")
    private double amountBase;

    @Column(name = "amount_base_uom_id")
    private String amountBaseUomId;

    @Column(name = "weight_factor")
    private Double weightFactor;

    @Column(name = "duration")
    private double duration;

    @Column(name = "duration_uom_id")
    private String durationUomId;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
