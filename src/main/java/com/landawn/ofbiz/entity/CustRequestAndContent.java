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
@Table(name = "cust_request_and_content")
public class CustRequestAndContent {
    @ReadOnly
    @Column(name = "cust_request_id")
    private String custRequestId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "content_id")
    private String contentId;

    @ReadOnly
    @Column(name = "content_type_id")
    private String contentTypeId;

    @ReadOnly
    @Column(name = "owner_content_id")
    private String ownerContentId;

    @ReadOnly
    @Column(name = "decorator_content_id")
    private String decoratorContentId;

    @ReadOnly
    @Column(name = "instance_of_content_id")
    private String instanceOfContentId;

    @ReadOnly
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @ReadOnly
    @Column(name = "template_data_resource_id")
    private String templateDataResourceId;

    @ReadOnly
    @Column(name = "data_source_id")
    private String dataSourceId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "privilege_enum_id")
    private String privilegeEnumId;

    @ReadOnly
    @Column(name = "service_name")
    private String serviceName;

    @ReadOnly
    @Column(name = "custom_method_id")
    private String customMethodId;

    @ReadOnly
    @Column(name = "content_name")
    private String contentName;

    @ReadOnly
    @Column(name = "description")
    private String description;

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
    @Column(name = "child_leaf_count")
    private double childLeafCount;

    @ReadOnly
    @Column(name = "child_branch_count")
    private double childBranchCount;

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
}
