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
@Table(name = "agreement_item")
public class AgreementItem {
    @Id
    @Column(name = "agreement_id")
    private String agreementId;

    @Id
    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @Column(name = "agreement_item_type_id")
    private String agreementItemTypeId;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "agreement_text")
    private String agreementText;

    @Column(name = "agreement_image")
    private byte[] agreementImage;
}
