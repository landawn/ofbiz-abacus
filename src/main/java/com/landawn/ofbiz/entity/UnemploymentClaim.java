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
@Table(name = "unemployment_claim")
public class UnemploymentClaim {
    @Id
    @Column(name = "unemployment_claim_id")
    private String unemploymentClaimId;

    @Column(name = "unemployment_claim_date")
    private Timestamp unemploymentClaimDate;

    @Column(name = "description")
    private String description;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Column(name = "party_id_to")
    private String partyIdTo;

    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
