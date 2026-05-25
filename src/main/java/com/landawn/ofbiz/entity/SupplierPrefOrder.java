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
@Table(name = "supplier_pref_order")
public class SupplierPrefOrder {
    @Id
    @Column(name = "supplier_pref_order_id")
    private String supplierPrefOrderId;

    @Column(name = "description")
    private String description;
}
