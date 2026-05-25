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
@Table(name = "party_name_view")
public class PartyNameView {
    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "party_type_id")
    private String partyTypeId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "first_name")
    private String firstName;

    @ReadOnly
    @Column(name = "middle_name")
    private String middleName;

    @ReadOnly
    @Column(name = "last_name")
    private String lastName;

    @ReadOnly
    @Column(name = "first_name_local")
    private String firstNameLocal;

    @ReadOnly
    @Column(name = "last_name_local")
    private String lastNameLocal;

    @ReadOnly
    @Column(name = "personal_title")
    private String personalTitle;

    @ReadOnly
    @Column(name = "suffix")
    private String suffix;

    @ReadOnly
    @Column(name = "group_name")
    private String groupName;

    @ReadOnly
    @Column(name = "group_name_local")
    private String groupNameLocal;
}
