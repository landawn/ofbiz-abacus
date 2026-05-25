package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "agreement_item_and_facility_appl")
public class AgreementItemAndFacilityAppl {
    @ReadOnly
    @Column(name = "agreement_id")
    private String agreementId;

    @ReadOnly
    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @ReadOnly
    @Column(name = "agreement_item_type_id")
    private String agreementItemTypeId;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "agreement_text")
    private String agreementText;

    @ReadOnly
    @Column(name = "agreement_image")
    private byte[] agreementImage;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id_to")
    private String partyIdTo;

    @ReadOnly
    @Column(name = "role_type_id_from")
    private String roleTypeIdFrom;

    @ReadOnly
    @Column(name = "role_type_id_to")
    private String roleTypeIdTo;

    @ReadOnly
    @Column(name = "agreement_type_id")
    private String agreementTypeId;

    @ReadOnly
    @Column(name = "agreement_date")
    private Timestamp agreementDate;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "text_data")
    private String textData;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;
}
