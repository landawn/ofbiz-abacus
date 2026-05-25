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
@Table(name = "facility_contact_mech")
public class FacilityContactMech {
    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "extension")
    private String extension;

    @Column(name = "comments")
    private String comments;
}
