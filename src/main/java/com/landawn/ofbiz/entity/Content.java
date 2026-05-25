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
@Table(name = "content")
public class Content {
    @Id
    @Column(name = "content_id")
    private String contentId;

    @Column(name = "content_type_id")
    private String contentTypeId;

    @Column(name = "owner_content_id")
    private String ownerContentId;

    @Column(name = "decorator_content_id")
    private String decoratorContentId;

    @Column(name = "instance_of_content_id")
    private String instanceOfContentId;

    @Column(name = "data_resource_id")
    private String dataResourceId;

    @Column(name = "template_data_resource_id")
    private String templateDataResourceId;

    @Column(name = "data_source_id")
    private String dataSourceId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "privilege_enum_id")
    private String privilegeEnumId;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "custom_method_id")
    private String customMethodId;

    @Column(name = "content_name")
    private String contentName;

    @Column(name = "description")
    private String description;

    @Column(name = "locale_string")
    private String localeString;

    @Column(name = "mime_type_id")
    private String mimeTypeId;

    @Column(name = "character_set_id")
    private String characterSetId;

    @Column(name = "child_leaf_count")
    private double childLeafCount;

    @Column(name = "child_branch_count")
    private double childBranchCount;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("contentTypeId=ContentType.contentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContentType contentType;

    @JoinedBy("dataResourceId=DataResource.dataResourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataResource dataResource;

    @JoinedBy("templateDataResourceId=DataResource.dataResourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataResource templateDataResource;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("privilegeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("customMethodId=CustomMethod.customMethodId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomMethod customMethod;

    @JoinedBy("characterSetId=CharacterSet.characterSetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CharacterSet characterSet;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin createdByUserLoginRef;

    @JoinedBy("lastModifiedByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin lastModifiedByUserLoginRef;

    @JoinedBy("dataSourceId=DataSource.dataSourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataSource dataSource;

    @JoinedBy("decoratorContentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content decoratorContent;

    @JoinedBy("ownerContentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content ownerContent;

    @JoinedBy("instanceOfContentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content instanceOfContent;
}
