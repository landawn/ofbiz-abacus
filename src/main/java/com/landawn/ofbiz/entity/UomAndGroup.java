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
@Table(name = "uom_and_group")
public class UomAndGroup {
    @ReadOnly
    @Column(name = "uom_group_id")
    private String uomGroupId;

    @ReadOnly
    @Column(name = "uom_id")
    private String uomId;

    @ReadOnly
    @Column(name = "uom_type_id")
    private String uomTypeId;

    @ReadOnly
    @Column(name = "abbreviation")
    private String abbreviation;

    @ReadOnly
    @Column(name = "numeric_code")
    private double numericCode;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "type_uom_type_id")
    private String typeUomTypeId;

    @ReadOnly
    @Column(name = "type_parent_type_id")
    private String typeParentTypeId;

    @ReadOnly
    @Column(name = "type_has_table")
    private String typeHasTable;

    @ReadOnly
    @Column(name = "type_description")
    private String typeDescription;
}
