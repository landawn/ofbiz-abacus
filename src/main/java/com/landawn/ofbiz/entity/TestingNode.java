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
@Table(name = "testing_node")
public class TestingNode {
    @Id
    @Column(name = "testing_node_id")
    private String testingNodeId;

    @Column(name = "primary_parent_node_id")
    private String primaryParentNodeId;

    @Column(name = "description")
    private String description;

    @JoinedBy("primaryParentNodeId=TestingNode.testingNodeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private TestingNode testingNode;
}
