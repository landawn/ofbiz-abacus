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
@Table(name = "survey_response")
public class SurveyResponse {
    @Id
    @Column(name = "survey_response_id")
    private String surveyResponseId;

    @Column(name = "survey_id")
    private String surveyId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "response_date")
    private Timestamp responseDate;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "reference_id")
    private String referenceId;

    @Column(name = "general_feedback")
    private String generalFeedback;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "status_id")
    private String statusId;
}
