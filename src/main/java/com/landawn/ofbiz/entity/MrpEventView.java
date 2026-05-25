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
@Table(name = "mrp_event_view")
public class MrpEventView {
    @ReadOnly
    @Column(name = "bill_of_material_level")
    private double billOfMaterialLevel;

    @ReadOnly
    @Column(name = "mrp_id")
    private String mrpId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "event_date")
    private Timestamp eventDate;

    @ReadOnly
    @Column(name = "mrp_event_type_id")
    private String mrpEventTypeId;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "event_name")
    private String eventName;

    @ReadOnly
    @Column(name = "is_late")
    private String isLate;

    @ReadOnly
    @Column(name = "facility_id_to")
    private String facilityIdTo;
}
