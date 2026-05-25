package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
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
@Table(name = "product_facility_assoc")
public class ProductFacilityAssoc {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "facility_id")
    private String facilityId;

    @Id
    @Column(name = "facility_id_to")
    private String facilityIdTo;

    @Id
    @Column(name = "facility_assoc_type_id")
    private String facilityAssocTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @Column(name = "transit_time")
    private double transitTime;
}
