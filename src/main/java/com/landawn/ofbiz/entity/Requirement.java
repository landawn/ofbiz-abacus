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
@Table(name = "requirement")
public class Requirement {
    @Id
    @Column(name = "requirement_id")
    private String requirementId;

    @Column(name = "requirement_type_id")
    private String requirementTypeId;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "deliverable_id")
    private String deliverableId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "description")
    private String description;

    @Column(name = "requirement_start_date")
    private Timestamp requirementStartDate;

    @Column(name = "required_by_date")
    private Timestamp requiredByDate;

    @Column(name = "estimated_budget")
    private double estimatedBudget;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "use_case")
    private String useCase;

    @Column(name = "reason")
    private String reason;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @Column(name = "facility_id_to")
    private String facilityIdTo;
}
