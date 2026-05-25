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
@Table(name = "testing_node_and_member")
public class TestingNodeAndMember {
    @ReadOnly
    @Column(name = "testing_node_id")
    private String testingNodeId;

    @ReadOnly
    @Column(name = "primary_parent_node_id")
    private String primaryParentNodeId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "testing_id")
    private String testingId;

    @ReadOnly
    @Column(name = "from_date")
    private Timestamp fromDate;

    @ReadOnly
    @Column(name = "thru_date")
    private Timestamp thruDate;

    @ReadOnly
    @Column(name = "extend_from_date")
    private Timestamp extendFromDate;

    @ReadOnly
    @Column(name = "extend_thru_date")
    private Timestamp extendThruDate;
}
