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
@Table(name = "survey_question_option")
public class SurveyQuestionOption {
    @Id
    @Column(name = "survey_question_id")
    private String surveyQuestionId;

    @Id
    @Column(name = "survey_option_seq_id")
    private String surveyOptionSeqId;

    @Column(name = "description")
    private String description;

    @Column(name = "sequence_num")
    private double sequenceNum;

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
}
