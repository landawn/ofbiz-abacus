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
@Table(name = "agreement_type_attr")
public class AgreementTypeAttr {
    @Id
    @Column(name = "agreement_type_id")
    private String agreementTypeId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "description")
    private String description;
}
