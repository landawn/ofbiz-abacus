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
@Table(name = "sequence_value_item")
public class SequenceValueItem {
    @Id
    @Column(name = "seq_name")
    private String seqName;

    @Column(name = "seq_id")
    private double seqId;
}
