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
@Table(name = "picklist")
public class Picklist {
    @Id
    @Column(name = "picklist_id")
    private String picklistId;

    @Column(name = "description")
    private String description;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "shipment_method_type_id")
    private String shipmentMethodTypeId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "picklist_date")
    private Timestamp picklistDate;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;
}
