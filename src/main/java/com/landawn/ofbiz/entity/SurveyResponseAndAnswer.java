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
@Table(name = "survey_response_and_answer")
public class SurveyResponseAndAnswer {
    @ReadOnly
    @Column(name = "survey_response_id")
    private String surveyResponseId;

    @ReadOnly
    @Column(name = "survey_id")
    private String surveyId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "response_date")
    private Timestamp responseDate;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "reference_id")
    private String referenceId;

    @ReadOnly
    @Column(name = "general_feedback")
    private String generalFeedback;

    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "survey_question_id")
    private String surveyQuestionId;

    @ReadOnly
    @Column(name = "survey_multi_resp_col_id")
    private String surveyMultiRespColId;

    @ReadOnly
    @Column(name = "survey_multi_resp_id")
    private String surveyMultiRespId;

    @ReadOnly
    @Column(name = "boolean_response")
    private String booleanResponse;

    @ReadOnly
    @Column(name = "currency_response")
    private double currencyResponse;

    @ReadOnly
    @Column(name = "float_response")
    private Double floatResponse;

    @ReadOnly
    @Column(name = "numeric_response")
    private double numericResponse;

    @ReadOnly
    @Column(name = "text_response")
    private String textResponse;

    @ReadOnly
    @Column(name = "survey_option_seq_id")
    private String surveyOptionSeqId;

    @ReadOnly
    @Column(name = "content_id")
    private String contentId;

    @ReadOnly
    @Column(name = "answered_date")
    private Timestamp answeredDate;

    @ReadOnly
    @Column(name = "amount_base")
    private double amountBase;

    @ReadOnly
    @Column(name = "amount_base_uom_id")
    private String amountBaseUomId;

    @ReadOnly
    @Column(name = "weight_factor")
    private Double weightFactor;

    @ReadOnly
    @Column(name = "duration")
    private double duration;

    @ReadOnly
    @Column(name = "duration_uom_id")
    private String durationUomId;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;
}
