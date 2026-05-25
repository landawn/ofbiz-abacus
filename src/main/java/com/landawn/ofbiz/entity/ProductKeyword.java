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
@Table(name = "product_keyword")
public class ProductKeyword {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "keyword")
    private String keyword;

    @Id
    @Column(name = "keyword_type_id")
    private String keywordTypeId;

    @Column(name = "relevancy_weight")
    private double relevancyWeight;

    @Column(name = "status_id")
    private String statusId;
}
