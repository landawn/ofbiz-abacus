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
@Table(name = "data_resource_purpose")
public class DataResourcePurpose {
    @Id
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @Id
    @Column(name = "content_purpose_type_id")
    private String contentPurposeTypeId;
}
