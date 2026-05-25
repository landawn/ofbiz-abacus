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
@Table(name = "empl_position_reporting_struct")
public class EmplPositionReportingStruct {
    @Id
    @Column(name = "empl_position_id_reporting_to")
    private String emplPositionIdReportingTo;

    @Id
    @Column(name = "empl_position_id_managed_by")
    private String emplPositionIdManagedBy;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "primary_flag")
    private String primaryFlag;

    @JoinedBy("emplPositionIdReportingTo=EmplPosition.emplPositionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private EmplPosition emplPositionReportingTo;

    @JoinedBy("emplPositionIdManagedBy=EmplPosition.emplPositionId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private EmplPosition emplPositionManagedBy;
}
