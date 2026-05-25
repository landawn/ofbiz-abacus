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
@Table(name = "product_facility_location")
public class ProductFacilityLocation {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "location_seq_id")
    private String locationSeqId;

    @Column(name = "minimum_stock")
    private double minimumStock;

    @Column(name = "move_quantity")
    private double moveQuantity;
}
