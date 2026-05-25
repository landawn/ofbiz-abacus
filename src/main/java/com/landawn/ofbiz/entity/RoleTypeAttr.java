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
@Table(name = "role_type_attr")
public class RoleTypeAttr {
    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "description")
    private String description;
}
