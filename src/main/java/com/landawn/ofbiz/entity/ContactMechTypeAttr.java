package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact_mech_type_attr")
public class ContactMechTypeAttr {
    @Id
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "description")
    private String description;

    @JoinedBy("contactMechTypeId=ContactMechType.contactMechTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMechType contactMechType;
}
