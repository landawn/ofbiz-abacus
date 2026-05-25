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
@Table(name = "product_feature_appl_attr")
public class ProductFeatureApplAttr {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;
}
