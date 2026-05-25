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
@Table(name = "facility_group")
public class FacilityGroup {
    @Id
    @Column(name = "facility_group_id")
    private String facilityGroupId;

    @Column(name = "facility_group_type_id")
    private String facilityGroupTypeId;

    @Column(name = "primary_parent_group_id")
    private String primaryParentGroupId;

    @Column(name = "facility_group_name")
    private String facilityGroupName;

    @Column(name = "description")
    private String description;
}
