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
@Table(name = "data_category")
public class DataCategory {
    @Id
    @Column(name = "data_category_id")
    private String dataCategoryId;

    @Column(name = "parent_category_id")
    private String parentCategoryId;

    @Column(name = "category_name")
    private String categoryName;
}
