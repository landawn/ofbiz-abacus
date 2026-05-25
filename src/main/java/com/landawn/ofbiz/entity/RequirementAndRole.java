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
@Table(name = "requirement_and_role")
public class RequirementAndRole {
    @ReadOnly
    @Column(name = "requirement_id")
    private String requirementId;

    @ReadOnly
    @Column(name = "requirement_type_id")
    private String requirementTypeId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

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
    @Column(name = "reason")
    private String reason;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "role_type_id")
    private String roleTypeId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;
}
