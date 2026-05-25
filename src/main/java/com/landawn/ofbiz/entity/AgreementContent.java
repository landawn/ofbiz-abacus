package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

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
@Table(name = "agreement_content")
public class AgreementContent {
    @Id
    @Column(name = "agreement_id")
    private String agreementId;

    @Id
    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @Id
    @Column(name = "agreement_content_type_id")
    private String agreementContentTypeId;

    @Id
    @Column(name = "content_id")
    private String contentId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @JoinedBy("agreementId=Agreement.agreementId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Agreement agreement;

    @JoinedBy("contentId=Content.contentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Content content;

    @JoinedBy("agreementContentTypeId=AgreementContentType.agreementContentTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AgreementContentType agreementContentType;
}
