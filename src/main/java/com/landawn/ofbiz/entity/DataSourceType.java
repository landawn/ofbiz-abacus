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
@Table(name = "data_source_type")
public class DataSourceType {
    @Id
    @Column(name = "data_source_type_id")
    private String dataSourceTypeId;

    @Column(name = "description")
    private String description;
}
