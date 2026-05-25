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
@Table(name = "cust_request_item")
public class CustRequestItem {
    @Id
    @Column(name = "cust_request_id")
    private String custRequestId;

    @Id
    @Column(name = "cust_request_item_seq_id")
    private String custRequestItemSeqId;

    @Column(name = "cust_request_resolution_id")
    private String custRequestResolutionId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "priority")
    private double priority;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "required_by_date")
    private Timestamp requiredByDate;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "selected_amount")
    private double selectedAmount;

    @Column(name = "maximum_amount")
    private double maximumAmount;

    @Column(name = "reserv_start")
    private Timestamp reservStart;

    @Column(name = "reserv_length")
    private double reservLength;

    @Column(name = "reserv_persons")
    private double reservPersons;

    @Column(name = "config_id")
    private String configId;

    @Column(name = "description")
    private String description;

    @Column(name = "story")
    private String story;

    @JoinedBy("custRequestId=CustRequest.custRequestId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustRequest custRequest;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("custRequestResolutionId=CustRequestResolution.custRequestResolutionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustRequestResolution custRequestResolution;

    @JoinedBy("productId=Product.productId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;
}
