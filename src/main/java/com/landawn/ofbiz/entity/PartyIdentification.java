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
@Table(name = "party_identification")
public class PartyIdentification {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "party_identification_type_id")
    private String partyIdentificationTypeId;

    @Column(name = "id_value")
    private String idValue;
}
