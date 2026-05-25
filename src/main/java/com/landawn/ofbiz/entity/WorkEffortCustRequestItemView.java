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
@Table(name = "work_effort_cust_request_item_view")
public class WorkEffortCustRequestItemView {
    @ReadOnly
    @Column(name = "status_item_description")
    private String statusItemDescription;

    @ReadOnly
    @Column(name = "cust_request_id")
    private String custRequestId;

    @ReadOnly
    @Column(name = "cust_request_item_seq_id")
    private String custRequestItemSeqId;

    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "cust_request_resolution_id")
    private String custRequestResolutionId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "priority")
    private double priority;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "required_by_date")
    private Timestamp requiredByDate;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "selected_amount")
    private double selectedAmount;

    @ReadOnly
    @Column(name = "maximum_amount")
    private double maximumAmount;

    @ReadOnly
    @Column(name = "reserv_start")
    private Timestamp reservStart;

    @ReadOnly
    @Column(name = "reserv_length")
    private double reservLength;

    @ReadOnly
    @Column(name = "reserv_persons")
    private double reservPersons;

    @ReadOnly
    @Column(name = "config_id")
    private String configId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "story")
    private String story;
}
