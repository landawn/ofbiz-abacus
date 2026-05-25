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
@Table(name = "picklist_and_bin")
public class PicklistAndBin {
    @ReadOnly
    @Column(name = "picklist_id")
    private String picklistId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "facility_id")
    private String facilityId;

    @ReadOnly
    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "picklist_date")
    private Timestamp picklistDate;

    @ReadOnly
    @Column(name = "created_date")
    private Timestamp createdDate;

    @ReadOnly
    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @ReadOnly
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @ReadOnly
    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @ReadOnly
    @Column(name = "picklist_bin_id")
    private String picklistBinId;

    @ReadOnly
    @Column(name = "bin_location_number")
    private double binLocationNumber;

    @ReadOnly
    @Column(name = "primary_order_id")
    private String primaryOrderId;

    @ReadOnly
    @Column(name = "primary_ship_group_seq_id")
    private String primaryShipGroupSeqId;
}
