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
@Table(name = "return_reason")
public class ReturnReason {
    @Id
    @Column(name = "return_reason_id")
    private String returnReasonId;

    @Column(name = "description")
    private String description;

    @Column(name = "sequence_id")
    private String sequenceId;
}
