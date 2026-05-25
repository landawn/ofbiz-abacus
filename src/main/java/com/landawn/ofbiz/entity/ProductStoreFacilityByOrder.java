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
@Table(name = "product_store_facility_by_order")
public class ProductStoreFacilityByOrder {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "product_store_id")
    private String productStoreId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "sequence_num")
    private double sequenceNum;

    @ReadOnly
    @Column(name = "store_name")
    private String storeName;

    @ReadOnly
    @Column(name = "facility_name")
    private String facilityName;

    @ReadOnly
    @Column(name = "facility_type_id")
    private String facilityTypeId;
}
