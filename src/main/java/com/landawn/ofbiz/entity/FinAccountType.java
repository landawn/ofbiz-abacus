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
@Table(name = "fin_account_type")
public class FinAccountType {
    @Id
    @Column(name = "fin_account_type_id")
    private String finAccountTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "replenish_enum_id")
    private String replenishEnumId;

    @Column(name = "is_refundable")
    private String isRefundable;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;
}
