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
@Table(name = "contact_mech")
public class ContactMech {
    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @Column(name = "info_string")
    private String infoString;
}
