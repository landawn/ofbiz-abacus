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
@Table(name = "product_type")
public class ProductType {
    @Id
    @Column(name = "product_type_id")
    private String productTypeId;

    @Column(name = "parent_type_id")
    private String parentTypeId;

    @Column(name = "is_physical")
    private String isPhysical;

    @Column(name = "is_digital")
    private String isDigital;

    @Column(name = "has_table")
    private String hasTable;

    @Column(name = "description")
    private String description;
}
