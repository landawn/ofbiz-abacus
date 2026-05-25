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
@Table(name = "agreement_geographical_applic")
public class AgreementGeographicalApplic {
    @Id
    @Column(name = "agreement_id")
    private String agreementId;

    @Id
    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @Id
    @Column(name = "geo_id")
    private String geoId;
}
