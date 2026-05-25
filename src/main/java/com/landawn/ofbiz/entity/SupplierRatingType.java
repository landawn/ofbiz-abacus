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
@Table(name = "supplier_rating_type")
public class SupplierRatingType {
    @Id
    @Column(name = "supplier_rating_type_id")
    private String supplierRatingTypeId;

    @Column(name = "description")
    private String description;
}
