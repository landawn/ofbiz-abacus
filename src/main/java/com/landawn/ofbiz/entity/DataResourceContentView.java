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
@Table(name = "data_resource_content_view")
public class DataResourceContentView {
    @ReadOnly
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @ReadOnly
    @Column(name = "data_resource_type_id")
    private String dataResourceTypeId;

    @ReadOnly
    @Column(name = "data_template_type_id")
    private String dataTemplateTypeId;

    @ReadOnly
    @Column(name = "data_category_id")
    private String dataCategoryId;

    @ReadOnly
    @Column(name = "data_source_id")
    private String dataSourceId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "data_resource_name")
    private String dataResourceName;

    @ReadOnly
    @Column(name = "locale_string")
    private String localeString;

    @ReadOnly
    @Column(name = "mime_type_id")
    private String mimeTypeId;

    @ReadOnly
    @Column(name = "character_set_id")
    private String characterSetId;

    @ReadOnly
    @Column(name = "object_info")
    private String objectInfo;

    @ReadOnly
    @Column(name = "survey_id")
    private String surveyId;

    @ReadOnly
    @Column(name = "survey_response_id")
    private String surveyResponseId;

    @ReadOnly
    @Column(name = "related_detail_id")
    private String relatedDetailId;

    @ReadOnly
    @Column(name = "is_public")
    private String isPublic;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @ReadOnly
    @Column(name = "co_content_id")
    private String coContentId;

    @ReadOnly
    @Column(name = "co_content_type_id")
    private String coContentTypeId;

    @ReadOnly
    @Column(name = "co_owner_content_id")
    private String coOwnerContentId;

    @ReadOnly
    @Column(name = "co_decorator_content_id")
    private String coDecoratorContentId;

    @ReadOnly
    @Column(name = "co_instance_of_content_id")
    private String coInstanceOfContentId;

    @ReadOnly
    @Column(name = "co_data_resource_id")
    private String coDataResourceId;

    @ReadOnly
    @Column(name = "co_template_data_resource_id")
    private String coTemplateDataResourceId;

    @ReadOnly
    @Column(name = "co_data_source_id")
    private String coDataSourceId;

    @ReadOnly
    @Column(name = "co_status_id")
    private String coStatusId;

    @ReadOnly
    @Column(name = "co_privilege_enum_id")
    private String coPrivilegeEnumId;

    @ReadOnly
    @Column(name = "co_service_name")
    private String coServiceName;

    @ReadOnly
    @Column(name = "co_custom_method_id")
    private String coCustomMethodId;

    @ReadOnly
    @Column(name = "co_content_name")
    private String coContentName;

    @ReadOnly
    @Column(name = "co_description")
    private String coDescription;

    @ReadOnly
    @Column(name = "co_locale_string")
    private String coLocaleString;

    @ReadOnly
    @Column(name = "co_mime_type_id")
    private String coMimeTypeId;

    @ReadOnly
    @Column(name = "co_character_set_id")
    private String coCharacterSetId;

    @ReadOnly
    @Column(name = "co_child_leaf_count")
    private String coChildLeafCount;

    @ReadOnly
    @Column(name = "co_child_branch_count")
    private String coChildBranchCount;

    @ReadOnly
    @Column(name = "co_created_date")
    private String coCreatedDate;

    @ReadOnly
    @Column(name = "co_created_by_user_login")
    private String coCreatedByUserLogin;

    @ReadOnly
    @Column(name = "co_last_modified_date")
    private String coLastModifiedDate;

    @ReadOnly
    @Column(name = "co_last_modified_by_user_login")
    private String coLastModifiedByUserLogin;
}
