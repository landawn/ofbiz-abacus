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
@Table(name = "work_effort_survey_appl")
public class WorkEffortSurveyAppl {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "survey_id")
    private String surveyId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("surveyId=Survey.surveyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Survey survey;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;

    @JoinedBy("surveyId=ProductStoreSurveyAppl.productStoreSurveyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStoreSurveyAppl productStoreSurveyAppl;
}
