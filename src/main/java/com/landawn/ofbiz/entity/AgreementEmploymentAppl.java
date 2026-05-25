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
@Table(name = "agreement_employment_appl")
public class AgreementEmploymentAppl {
    @Id
    @Column(name = "agreement_id")
    private String agreementId;

    @Id
    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @Id
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Id
    @Column(name = "party_id_to")
    private String partyIdTo;

    @Id
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @Id
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "agreement_date")
    private Timestamp agreementDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;
}
