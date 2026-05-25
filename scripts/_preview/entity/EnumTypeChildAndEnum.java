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
@Table(name = "enum_type_child_and_enum")
public class EnumTypeChildAndEnum {
    @ReadOnly
    @Column(name = "parent_enum_type_id")
    private String parentEnumTypeId;

    @ReadOnly
    @Column(name = "parent_parent_type_id")
    private String parentParentTypeId;

    @ReadOnly
    @Column(name = "parent_has_table")
    private String parentHasTable;

    @ReadOnly
    @Column(name = "parent_description")
    private String parentDescription;

    @ReadOnly
    @Column(name = "child_enum_type_id")
    private String childEnumTypeId;

    @ReadOnly
    @Column(name = "child_has_table")
    private String childHasTable;

    @ReadOnly
    @Column(name = "child_description")
    private String childDescription;

    @ReadOnly
    @Column(name = "enum_id")
    private String enumId;

    @ReadOnly
    @Column(name = "enum_type_id")
    private String enumTypeId;

    @ReadOnly
    @Column(name = "enum_code")
    private String enumCode;

    @ReadOnly
    @Column(name = "sequence_id")
    private String sequenceId;

    @ReadOnly
    @Column(name = "description")
    private String description;
}
