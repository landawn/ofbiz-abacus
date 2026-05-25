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

    @JoinedBy("testingId=Testing.testingId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Testing testing;

    @JoinedBy("testingNodeId=TestingNode.testingNodeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TestingNode testingNode;
}
