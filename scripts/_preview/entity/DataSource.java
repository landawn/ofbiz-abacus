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
@Table(name = "data_source")
public class DataSource {
    @Id
    @Column(name = "data_source_id")
    private String dataSourceId;

    @Column(name = "data_source_type_id")
    private String dataSourceTypeId;

    @Column(name = "description")
    private String description;

    @JoinedBy("dataSourceTypeId=DataSourceType.dataSourceTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataSourceType dataSourceType;
}
