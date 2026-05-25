package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role_type_in3_levels")
public class RoleTypeIn3Levels {
    @ReadOnly
    @Column(name = "top_role_type_id")
    private String topRoleTypeId;

    @ReadOnly
    @Column(name = "top_description")
    private String topDescription;

    @ReadOnly
    @Column(name = "mid_role_type_id")
    private String midRoleTypeId;

    @ReadOnly
    @Column(name = "mid_description")
    private String midDescription;

    @ReadOnly
    @Column(name = "low_role_type_id")
    private String lowRoleTypeId;

    @ReadOnly
    @Column(name = "low_description")
    private String lowDescription;
}
