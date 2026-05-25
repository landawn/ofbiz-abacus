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
@Table(name = "agreement")
public class Agreement {
    @Id
    @Column(name = "agreement_id")
    private String agreementId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "party_id_from")
    private String partyIdFrom;

    @Column(name = "party_id_to")
    private String partyIdTo;

    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @Column(name = "agreement_type_id")
    private String agreementTypeId;

    @Column(name = "agreement_date")
    private Timestamp agreementDate;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "description")
    private String description;

    @Column(name = "text_data")
    private String textData;

    @Column(name = "status_id")
    private String statusId;
}
