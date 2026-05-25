package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_facility_location_quantity_test")
public class ProductFacilityLocationQuantityTest {
    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @ReadOnly
    @Column(name = "minimum_stock")
    private double minimumStock;

    @ReadOnly
    @Column(name = "move_quantity")
    private double moveQuantity;

    @ReadOnly
    @Column(name = "location_type_enum_id")
    private String locationTypeEnumId;

    @ReadOnly
    @Column(name = "available_to_promise_total")
    private double availableToPromiseTotal;

    @ReadOnly
    @Column(name = "quantity_on_hand_total")
    private double quantityOnHandTotal;
}
