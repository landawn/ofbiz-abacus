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
@Table(name = "fin_account_type_attr")
public class FinAccountTypeAttr {
    @Id
    @Column(name = "fin_account_type_id")
    private String finAccountTypeId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "attr_value")
    private String attrValue;

    @Column(name = "description")
    private String description;

    @JoinedBy("finAccountTypeId=FinAccountType.finAccountTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccountType finAccountType;
}
