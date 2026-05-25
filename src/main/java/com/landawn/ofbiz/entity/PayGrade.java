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
@Table(name = "pay_grade")
public class PayGrade {
    @Id
    @Column(name = "pay_grade_id")
    private String payGradeId;

    @Column(name = "pay_grade_name")
    private String payGradeName;

    @Column(name = "comments")
    private String comments;
}
