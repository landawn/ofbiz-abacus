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
@Table(name = "content_purpose_operation")
public class ContentPurposeOperation {
    @Id
    @Column(name = "content_purpose_type_id")
    private String contentPurposeTypeId;

    @Id
    @Column(name = "content_operation_id")
    private String contentOperationId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "status_id")
    private String statusId;

    @Id
    @Column(name = "privilege_enum_id")
    private String privilegeEnumId;

    @JoinedBy("contentPurposeTypeId=ContentPurposeType.contentPurposeTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContentPurposeType contentPurposeType;

    @JoinedBy("contentOperationId=ContentOperation.contentOperationId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContentOperation contentOperation;

    @JoinedBy("roleTypeId=RoleType.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RoleType roleType;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("privilegeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;
}
