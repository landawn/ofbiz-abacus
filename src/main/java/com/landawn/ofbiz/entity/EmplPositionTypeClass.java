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
@Table(name = "empl_position_type_class")
public class EmplPositionTypeClass {
    @Id
    @Column(name = "empl_position_type_id")
    private String emplPositionTypeId;

    @Id
    @Column(name = "empl_position_class_type_id")
    private String emplPositionClassTypeId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "standard_hours_per_week")
    private Double standardHoursPerWeek;

    @JoinedBy("emplPositionTypeId=EmplPositionType.emplPositionTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private EmplPositionType emplPositionType;

    @JoinedBy("emplPositionClassTypeId=EmplPositionClassType.emplPositionClassTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private EmplPositionClassType emplPositionClassType;
}
