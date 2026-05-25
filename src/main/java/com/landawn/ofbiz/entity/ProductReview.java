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

    @JoinedBy("productStoreId=ProductStore.productStoreId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProductStore productStore;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;

    @JoinedBy("userLoginId=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin userLogin;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;
}
