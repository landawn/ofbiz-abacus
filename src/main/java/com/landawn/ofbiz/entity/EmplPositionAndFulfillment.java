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
@Table(name = "empl_position_and_fulfillment")
public class EmplPositionAndFulfillment {
    @ReadOnly
    @Column(name = "employee_party_id")
    private String employeePartyId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "empl_position_id")
    private String emplPositionId;

    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "budget_id")
    private String budgetId;

    @ReadOnly
    @Column(name = "budget_item_seq_id")
    private String budgetItemSeqId;

    @ReadOnly
    @Column(name = "empl_position_type_id")
    private String emplPositionTypeId;

    @ReadOnly
    @Column(name = "estimated_from_date")
    private Timestamp estimatedFromDate;

    @ReadOnly
    @Column(name = "estimated_thru_date")
    private Timestamp estimatedThruDate;

    @ReadOnly
    @Column(name = "salary_flag")
    private String salaryFlag;

    @ReadOnly
    @Column(name = "exempt_flag")
    private String exemptFlag;

    @ReadOnly
    @Column(name = "fulltime_flag")
    private String fulltimeFlag;

    @ReadOnly
    @Column(name = "temporary_flag")
    private String temporaryFlag;

    @ReadOnly
    @Column(name = "actual_from_date")
    private Timestamp actualFromDate;

    @ReadOnly
    @Column(name = "actual_thru_date")
    private Timestamp actualThruDate;
}
