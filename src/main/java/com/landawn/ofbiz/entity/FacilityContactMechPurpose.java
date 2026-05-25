package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "facility_contact_mech_purpose")
public class FacilityContactMechPurpose {
    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Id
    @Column(name = "contact_mech_purpose_type_id")
    private String contactMechPurposeTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
