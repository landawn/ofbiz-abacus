package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "product_category_and_member")
public class ProductCategoryAndMember {
    @ReadOnly
    @Column(name = "product_category_id")
    private String productCategoryId;

    @ReadOnly
    @Column(name = "product_category_type_id")
    private String productCategoryTypeId;

    @ReadOnly
    @Column(name = "primary_parent_category_id")
    private String primaryParentCategoryId;

    @ReadOnly
    @Column(name = "category_name")
    private String categoryName;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "long_description")
    private String longDescription;

    @ReadOnly
    @Column(name = "category_image_url")
    private String categoryImageUrl;

    @ReadOnly
    @Column(name = "link_one_image_url")
    private String linkOneImageUrl;

    @ReadOnly
    @Column(name = "link_two_image_url")
    private String linkTwoImageUrl;

    @ReadOnly
    @Column(name = "detail_screen")
    private String detailScreen;

    @ReadOnly
    @Column(name = "show_in_select")
    private String showInSelect;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;
}
