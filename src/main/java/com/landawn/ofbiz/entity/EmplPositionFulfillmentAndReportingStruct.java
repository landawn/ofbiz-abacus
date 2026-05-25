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
@Table(name = "empl_position_fulfillment_and_reporting_struct")
public class EmplPositionFulfillmentAndReportingStruct {
    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "empl_position_id")
    private String emplPositionId;

    @ReadOnly
    @Column(name = "empl_position_id_reporting_to")
    private String emplPositionIdReportingTo;

    @ReadOnly
    @Column(name = "internal_organisation")
    private String internalOrganisation;

    @ReadOnly
    @Column(name = "reporting_date")
    private String reportingDate;
}
