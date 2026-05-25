package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
