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
@Table(name = "party_contact_with_purpose")
public class PartyContactWithPurpose {
    @ReadOnly
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "contact_mech_purpose_type_id")
    private String contactMechPurposeTypeId;

    @ReadOnly
    @Column(name = "contact_from_date")
    private String contactFromDate;

    @ReadOnly
    @Column(name = "contact_thru_date")
    private String contactThruDate;

    @ReadOnly
    @Column(name = "purpose_from_date")
    private String purposeFromDate;

    @ReadOnly
    @Column(name = "purpose_thru_date")
    private String purposeThruDate;

    @ReadOnly
    @Column(name = "contact_mech_type_id")
    private String contactMechTypeId;

    @ReadOnly
    @Column(name = "info_string")
    private String infoString;

    @ReadOnly
    @Column(name = "comments")
    private String comments;

    @ReadOnly
    @Column(name = "extension")
    private String extension;

    @ReadOnly
    @Column(name = "allow_solicitation")
    private String allowSolicitation;

    @ReadOnly
    @Column(name = "purpose_description")
    private String purposeDescription;
}
