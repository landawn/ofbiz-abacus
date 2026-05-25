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
@Table(name = "electronic_text")
public class ElectronicText {
    @Id
    @Column(name = "data_resource_id")
    private String dataResourceId;

    @Column(name = "text_data")
    private String textData;

    @JoinedBy("dataResourceId=DataResource.dataResourceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DataResource dataResource;
}
