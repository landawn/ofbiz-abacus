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
@Table(name = "product_category_member")
public class ProductCategoryMember {
    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "quantity")
    private double quantity;
}
