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
@Table(name = "survey")
public class Survey {
    @Id
    @Column(name = "survey_id")
    private String surveyId;

    @Column(name = "survey_name")
    private String surveyName;

    @Column(name = "description")
    private String description;

    @Column(name = "comments")
    private String comments;

    @Column(name = "submit_caption")
    private String submitCaption;

    @Column(name = "response_service")
    private String responseService;

    @Column(name = "is_anonymous")
    private String isAnonymous;

    @Column(name = "allow_multiple")
    private String allowMultiple;

    @Column(name = "allow_update")
    private String allowUpdate;

    @Column(name = "acro_form_content_id")
    private String acroFormContentId;
}
