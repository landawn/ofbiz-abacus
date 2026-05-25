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
@Table(name = "telecom_number")
public class TelecomNumber {
    @Id
    @Column(name = "contact_mech_id")
    private String contactMechId;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "area_code")
    private String areaCode;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "ask_for_name")
    private String askForName;

    @JoinedBy("contactMechId=ContactMech.contactMechId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ContactMech contactMech;
}
