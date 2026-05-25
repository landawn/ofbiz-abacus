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
@Table(name = "survey_question")
public class SurveyQuestion {
    @Id
    @Column(name = "survey_question_id")
    private String surveyQuestionId;

    @Column(name = "survey_question_category_id")
    private String surveyQuestionCategoryId;

    @Column(name = "survey_question_type_id")
    private String surveyQuestionTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "question")
    private String question;

    @Column(name = "hint")
    private String hint;

    @Column(name = "enum_type_id")
    private String enumTypeId;

    @Column(name = "geo_id")
    private String geoId;

    @Column(name = "format_string")
    private String formatString;

    @JoinedBy("surveyQuestionTypeId=SurveyQuestionType.surveyQuestionTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SurveyQuestionType surveyQuestionType;

    @JoinedBy("surveyQuestionCategoryId=SurveyQuestionCategory.surveyQuestionCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SurveyQuestionCategory surveyQuestionCategory;

    @JoinedBy("geoId=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geo;
}
