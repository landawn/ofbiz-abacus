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
@Table(name = "party_ics_avs_override")
public class PartyIcsAvsOverride {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "avs_decline_string")
    private String avsDeclineString;
}
