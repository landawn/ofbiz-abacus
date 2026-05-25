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
@Table(name = "product_category")
public class ProductCategory {
    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @Column(name = "product_category_type_id")
    private String productCategoryTypeId;

    @Column(name = "primary_parent_category_id")
    private String primaryParentCategoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String description;

    @Column(name = "long_description")
    private String longDescription;

    @Column(name = "category_image_url")
    private String categoryImageUrl;

    @Column(name = "link_one_image_url")
    private String linkOneImageUrl;

    @Column(name = "link_two_image_url")
    private String linkTwoImageUrl;

    @Column(name = "detail_screen")
    private String detailScreen;

    @Column(name = "show_in_select")
    private String showInSelect;
}
