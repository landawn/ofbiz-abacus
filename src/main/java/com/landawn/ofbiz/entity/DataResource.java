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
@Table(name = "data_resource")
public class DataResource {
    @Id
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @Column(name = "data_resource_type_id")
    private String dataResourceTypeId;

    @Column(name = "data_template_type_id")
    private String dataTemplateTypeId;

    @Column(name = "data_category_id")
    private String dataCategoryId;

    @Column(name = "data_source_id")
    private String dataSourceId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "data_resource_name")
    private String dataResourceName;

    @Column(name = "locale_string")
    private String localeString;

    @Column(name = "mime_type_id")
    private String mimeTypeId;

    @Column(name = "character_set_id")
    private String characterSetId;

    @Column(name = "object_info")
    private String objectInfo;

    @Column(name = "survey_id")
    private String surveyId;

    @Column(name = "survey_response_id")
    private String surveyResponseId;

    @Column(name = "related_detail_id")
    private String relatedDetailId;

    @Column(name = "is_public")
    private String isPublic;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
