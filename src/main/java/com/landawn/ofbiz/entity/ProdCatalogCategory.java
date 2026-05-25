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
@Table(name = "prod_catalog_category")
public class ProdCatalogCategory {
    @Id
    @Column(name = "prod_catalog_id")
    private String prodCatalogId;

    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @Id
    @Column(name = "prod_catalog_category_type_id")
    private String prodCatalogCategoryTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @JoinedBy("prodCatalogId=ProdCatalog.prodCatalogId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProdCatalog prodCatalog;

    @JoinedBy("productCategoryId=ProductCategory.productCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductCategory productCategory;

    @JoinedBy("prodCatalogCategoryTypeId=ProdCatalogCategoryType.prodCatalogCategoryTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProdCatalogCategoryType prodCatalogCategoryType;
}
