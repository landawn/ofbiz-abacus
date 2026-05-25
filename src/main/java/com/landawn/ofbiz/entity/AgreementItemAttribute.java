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
@Table(name = "agreement_item_attribute")
public class AgreementItemAttribute {
    @Id
    @Column(name = "agreement_id")
    private String agreementId;

    @Id
    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "attr_description")
    private String attrDescription;

    @JoinedBy("agreementId=AgreementItem.agreementId, agreementItemSeqId=AgreementItem.agreementItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AgreementItem agreementItem;
}
