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
@Table(name = "survey_question_type")
public class SurveyQuestionType {
    @Id
    @Column(name = "survey_question_type_id")
    private String surveyQuestionTypeId;

    @Column(name = "description")
    private String description;
}
