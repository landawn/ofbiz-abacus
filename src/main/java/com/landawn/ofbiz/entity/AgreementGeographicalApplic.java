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

    @JoinedBy("agreementId=Agreement.agreementId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Agreement agreement;

    @JoinedBy("agreementId=AgreementItem.agreementId, agreementItemSeqId=AgreementItem.agreementItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AgreementItem agreementItem;

    @JoinedBy("geoId=Geo.geoId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Geo geo;
}
