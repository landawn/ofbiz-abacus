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
@Table(name = "product_store_survey_appl")
public class ProductStoreSurveyAppl {
    @Id
    @Column(name = "product_store_survey_id")
    private String productStoreSurveyId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "survey_appl_type_id")
    private String surveyApplTypeId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "survey_id")
    private String surveyId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_category_id")
    private String productCategoryId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "survey_template")
    private String surveyTemplate;

    @Column(name = "result_template")
    private String resultTemplate;

    @Column(name = "sequence_num")
    private double sequenceNum;
}
