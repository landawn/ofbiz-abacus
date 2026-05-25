package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.JoinedBy;
import com.landawn.abacus.annotation.Table;

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
@Table(name = "protected_view")
public class ProtectedView {
    @Id
    @Column(name = "group_id")
    private String groupId;

    @Id
    @Column(name = "view_name_id")
    private String viewNameId;

    @Column(name = "max_hits")
    private double maxHits;

    @Column(name = "max_hits_duration")
    private double maxHitsDuration;

    @Column(name = "tarpit_duration")
    private double tarpitDuration;

    @JoinedBy("groupId=SecurityGroup.groupId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SecurityGroup securityGroup;
}
