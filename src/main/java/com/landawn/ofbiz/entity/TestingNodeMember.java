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
@Table(name = "testing_node_member")
public class TestingNodeMember {
    @Id
    @Column(name = "testing_node_id")
    private String testingNodeId;

    @Id
    @Column(name = "testing_id")
    private String testingId;

    @Id
    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "extend_from_date")
    private Timestamp extendFromDate;

    @Column(name = "extend_thru_date")
    private Timestamp extendThruDate;
}
