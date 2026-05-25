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
@Table(name = "party_qual")
public class PartyQual {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "party_qual_type_id")
    private String partyQualTypeId;

    @Column(name = "qualification_desc")
    private String qualificationDesc;

    @Column(name = "title")
    private String title;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "verif_status_id")
    private String verifStatusId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
