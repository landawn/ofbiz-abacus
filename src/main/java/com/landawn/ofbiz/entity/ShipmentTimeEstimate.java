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
@Table(name = "shipment_time_estimate")
public class ShipmentTimeEstimate {
    @Id
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Id
    @Column(name = "party_id")
    private String partyId;

    @Id
    @Column(name = "role_type_id")
    private String roleTypeId;

    @Id
    @Column(name = "geo_id_to")
    private String geoIdTo;

    @Id
    @Column(name = "geo_id_from")
    private String geoIdFrom;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "lead_time")
    private double leadTime;

    @Column(name = "lead_time_uom_id")
    private String leadTimeUomId;

    @Column(name = "sequence_number")
    private double sequenceNumber;
}
