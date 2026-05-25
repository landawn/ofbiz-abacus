package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_category_content")
public class ProductCategoryContent {
    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "prod_cat_content_type_id")
    private String prodCatContentTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "purchase_from_date")
    private Timestamp purchaseFromDate;

    @Column(name = "purchase_thru_date")
    private Timestamp purchaseThruDate;

    @Column(name = "use_count_limit")
    private double useCountLimit;

    @Column(name = "use_days_limit")
    private double useDaysLimit;
}
