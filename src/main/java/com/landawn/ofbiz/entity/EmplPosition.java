package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empl_position")
public class EmplPosition {
    @Id
    @Column(name = "empl_position_id")
    private String emplPositionId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "budget_id")
    private String budgetId;

    @Column(name = "budget_item_seq_id")
    private String budgetItemSeqId;

    @Column(name = "empl_position_type_id")
    private String emplPositionTypeId;

    @Column(name = "estimated_from_date")
    private Timestamp estimatedFromDate;

    @Column(name = "estimated_thru_date")
    private Timestamp estimatedThruDate;

    @Column(name = "salary_flag")
    private String salaryFlag;

    @Column(name = "exempt_flag")
    private String exemptFlag;

    @Column(name = "fulltime_flag")
    private String fulltimeFlag;

    @Column(name = "temporary_flag")
    private String temporaryFlag;

    @Column(name = "actual_from_date")
    private Timestamp actualFromDate;

    @Column(name = "actual_thru_date")
    private Timestamp actualThruDate;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;
}
