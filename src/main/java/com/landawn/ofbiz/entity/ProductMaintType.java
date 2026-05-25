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
@Table(name = "product_maint_type")
public class ProductMaintType {
    @Id
    @Column(name = "product_maint_type_id")
    private String productMaintTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "parent_type_id")
    private String parentTypeId;
}
