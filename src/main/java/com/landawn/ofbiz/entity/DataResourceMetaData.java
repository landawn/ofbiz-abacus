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
@Table(name = "data_resource_meta_data")
public class DataResourceMetaData {
    @Id
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @Id
    @Column(name = "meta_data_predicate_id")
    private String metaDataPredicateId;

    @Column(name = "meta_data_value")
    private String metaDataValue;

    @Column(name = "data_source_id")
    private String dataSourceId;
}
