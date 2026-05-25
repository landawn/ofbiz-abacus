package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "product_and_assoc")
public class ProductAndAssoc {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "internal_name")
    private String internalName;

    @ReadOnly
    @Column(name = "product_id_to")
    private String productIdTo;

    @ReadOnly
    @Column(name = "product_assoc_type_id")
    private String productAssocTypeId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;
}
