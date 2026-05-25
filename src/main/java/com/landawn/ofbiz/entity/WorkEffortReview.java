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
@Table(name = "work_effort_review")
public class WorkEffortReview {
    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "user_login_id")
    private String userLoginId;

    @Id
    @Column(name = "review_date")
    private Timestamp reviewDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "posted_anonymous")
    private String postedAnonymous;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "review_text")
    private String reviewText;
}
