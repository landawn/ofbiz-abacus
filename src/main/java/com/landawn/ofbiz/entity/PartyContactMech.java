package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "party_contact_mech")
public class PartyContactMech {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "allow_solicitation")
    private String allowSolicitation;

    @Column(name = "extension")
    private String extension;

    @Column(name = "verified")
    private String verified;

    @Column(name = "comments")
    private String comments;

    @Column(name = "years_with_contact_mech")
    private double yearsWithContactMech;

    @Column(name = "months_with_contact_mech")
    private double monthsWithContactMech;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("partyId=PartyRole.partyId, roleTypeId=PartyRole.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyRole partyRole;

    @JoinedBy("roleTypeId=RoleType.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RoleType roleType;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;
}
