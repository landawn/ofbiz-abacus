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
@Table(name = "work_effort_requirement_view")
public class WorkEffortRequirementView {
    @ReadOnly
    @Column(name = "status_item_description")
    private String statusItemDescription;

    @ReadOnly
    @Column(name = "work_req_fulf_type_description")
    private String workReqFulfTypeDescription;

    @ReadOnly
    @Column(name = "requirement_description")
    private String requirementDescription;

    @ReadOnly
    @Column(name = "requirement_id")
    private String requirementId;

    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "work_req_fulf_type_id")
    private String workReqFulfTypeId;

    @ReadOnly
    @Column(name = "requirement_type_id")
    private String requirementTypeId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "deliverable_id")
    private String deliverableId;

    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "requirement_start_date")
    private Timestamp requirementStartDate;

    @ReadOnly
    @Column(name = "required_by_date")
    private Timestamp requiredByDate;

    @ReadOnly
    @Column(name = "estimated_budget")
    private double estimatedBudget;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "use_case")
    private String useCase;

    @ReadOnly
    @Column(name = "reason")
    private String reason;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @ReadOnly
    @Column(name = "facility_id_to")
    private String facilityIdTo;
}
