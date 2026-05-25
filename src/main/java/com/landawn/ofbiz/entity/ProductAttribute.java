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
@Table(name = "product_attribute")
public class ProductAttribute {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "attr_type")
    private String attrType;

    @Column(name = "attr_description")
    private String attrDescription;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;
}
