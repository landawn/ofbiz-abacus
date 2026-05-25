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
@Table(name = "testing_item")
public class TestingItem {
    @Id
    @Column(name = "testing_id")
    private String testingId;

    @Id
    @Column(name = "testing_seq_id")
    private String testingSeqId;

    @Column(name = "testing_history")
    private String testingHistory;
}
