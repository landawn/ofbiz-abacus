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
@Table(name = "product_facility")
public class ProductFacility {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "minimum_stock")
    private double minimumStock;

    @Column(name = "reorder_quantity")
    private double reorderQuantity;

    @Column(name = "days_to_ship")
    private double daysToShip;

    @Column(name = "replenish_method_enum_id")
    private String replenishMethodEnumId;

    @Column(name = "last_inventory_count")
    private double lastInventoryCount;

    @Column(name = "requirement_method_enum_id")
    private String requirementMethodEnumId;
}
