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
@Table(name = "survey_multi_resp")
public class SurveyMultiResp {
    @Id
    @Column(name = "survey_id")
    private String surveyId;

    @Id
    @Column(name = "survey_multi_resp_id")
    private String surveyMultiRespId;

    @Column(name = "multi_resp_title")
    private String multiRespTitle;
}
