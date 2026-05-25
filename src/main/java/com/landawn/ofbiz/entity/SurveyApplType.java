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
@Table(name = "survey_appl_type")
public class SurveyApplType {
    @Id
    @Column(name = "survey_appl_type_id")
    private String surveyApplTypeId;

    @Column(name = "description")
    private String description;
}
