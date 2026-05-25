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

    @JoinedBy("planTypeId=AllocationPlanType.planTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AllocationPlanType allocationPlanType;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("createdByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin createdByUserLoginRef;

    @JoinedBy("lastModifiedByUserLogin=UserLogin.userLoginId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private UserLogin lastModifiedByUserLoginRef;
}
