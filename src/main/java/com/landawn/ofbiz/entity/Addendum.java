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
@Table(name = "addendum")
public class Addendum {
    @Id
    @Column(name = "addendum_id")
    private String addendumId;

    @Column(name = "agreement_id")
    private String agreementId;

    @Column(name = "agreement_item_seq_id")
    private String agreementItemSeqId;

    @Column(name = "addendum_creation_date")
    private Timestamp addendumCreationDate;

    @Column(name = "addendum_effective_date")
    private Timestamp addendumEffectiveDate;

    @Column(name = "addendum_text")
    private String addendumText;
}
