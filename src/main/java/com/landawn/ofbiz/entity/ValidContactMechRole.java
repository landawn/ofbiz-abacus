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
@Table(name = "valid_contact_mech_role")
public class ValidContactMechRole {
    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;
}
