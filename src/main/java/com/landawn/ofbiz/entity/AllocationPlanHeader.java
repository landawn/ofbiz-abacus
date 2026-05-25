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
@Table(name = "allocation_plan_header")
public class AllocationPlanHeader {
    @Id
    @Column(name = "plan_id")
    private String planId;

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "plan_type_id")
    private String planTypeId;

    @Column(name = "plan_name")
    private String planName;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
