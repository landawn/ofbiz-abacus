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
@Table(name = "data_resource_purpose")
public class DataResourcePurpose {
    @Id
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @Id
    @Column(name = "content_purpose_type_id")
    private String contentPurposeTypeId;

    @JoinedBy("dataResourceId=DataResource.dataResourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataResource dataResource;

    @JoinedBy("contentPurposeTypeId=ContentPurposeType.contentPurposeTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContentPurposeType contentPurposeType;
}
