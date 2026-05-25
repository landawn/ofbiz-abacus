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
@Table(name = "product_category_link")
public class ProductCategoryLink {
    @Id
    @Column(name = "product_category_id")
    private String productCategoryId;

    @Id
    @Column(name = "link_seq_id")
    private String linkSeqId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "title_text")
    private String titleText;

    @Column(name = "detail_text")
    private String detailText;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image_two_url")
    private String imageTwoUrl;

    @Column(name = "link_type_enum_id")
    private String linkTypeEnumId;

    @Column(name = "link_info")
    private String linkInfo;

    @Column(name = "detail_sub_screen")
    private String detailSubScreen;

    @JoinedBy("productCategoryId=ProductCategory.productCategoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductCategory productCategory;

    @JoinedBy("linkTypeEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;
}
