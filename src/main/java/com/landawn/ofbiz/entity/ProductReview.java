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
@Table(name = "product_review")
public class ProductReview {
    @Id
    @Column(name = "product_review_id")
    private String productReviewId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "user_login_id")
    private String userLoginId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "posted_anonymous")
    private String postedAnonymous;

    @Column(name = "posted_date_time")
    private Timestamp postedDateTime;

    @Column(name = "product_rating")
    private double productRating;

    @Column(name = "product_review")
    private String productReview;
}
