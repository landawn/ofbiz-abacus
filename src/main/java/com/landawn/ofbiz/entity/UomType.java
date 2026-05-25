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
@Table(name = "uom_type")
public class UomType {
    @Id
    @Column(name = "uom_type_id")
    private String uomTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;
}
