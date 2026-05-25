package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "requirement_cust_request")
public class RequirementCustRequest {
    @Id
    @Column(name = "cust_request_id")
    private String custRequestId;

    @Id
    @Column(name = "cust_request_item_seq_id")
    private String custRequestItemSeqId;

    @Id
    @Column(name = "requirement_id")
    private String requirementId;

    @JoinedBy("custRequestId=CustRequestItem.custRequestId, custRequestItemSeqId=CustRequestItem.custRequestItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustRequestItem custRequestItem;

    @JoinedBy("requirementId=Requirement.requirementId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Requirement requirement;
}
