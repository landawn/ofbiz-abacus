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
@Table(name = "fin_account_trans_type_attr")
public class FinAccountTransTypeAttr {
    @Id
    @Column(name = "fin_account_trans_type_id")
    private String finAccountTransTypeId;

    @Id
    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "description")
    private String description;

    @JoinedBy("finAccountTransTypeId=FinAccountTransType.finAccountTransTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccountTransType finAccountTransType;
}
