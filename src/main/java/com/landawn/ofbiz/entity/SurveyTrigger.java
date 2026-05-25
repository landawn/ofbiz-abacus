package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "survey_trigger")
public class SurveyTrigger {
    @Id
    @Column(name = "survey_id")
    private String surveyId;

    @Id
    @Column(name = "survey_appl_type_id")
    private String surveyApplTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("surveyId=Survey.surveyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Survey survey;

    @JoinedBy("surveyApplTypeId=SurveyApplType.surveyApplTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SurveyApplType surveyApplType;
}
