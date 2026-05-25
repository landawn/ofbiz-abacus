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
@Table(name = "product_category_member_and_role")
public class ProductCategoryMemberAndRole {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_category_id")
    private String productCategoryId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "role_from_date")
    private String roleFromDate;

    @ReadOnly
    @Column(name = "role_thru_date")
    private String roleThruDate;

    @ReadOnly
    @Column(name = "role_comments")
    private String roleComments;
}
