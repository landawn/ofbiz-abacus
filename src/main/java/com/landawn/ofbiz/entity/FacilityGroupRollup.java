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
@Table(name = "facility_group_rollup")
public class FacilityGroupRollup {
    @Id
    @Column(name = "facility_group_id")
    private String facilityGroupId;

    @Id
    @Column(name = "parent_facility_group_id")
    private String parentFacilityGroupId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "sequence_num")
    private double sequenceNum;

    @JoinedBy("facilityGroupId=FacilityGroup.facilityGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FacilityGroup facilityGroup;

    @JoinedBy("parentFacilityGroupId=FacilityGroup.facilityGroupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FacilityGroup parentFacilityGroup;
}
