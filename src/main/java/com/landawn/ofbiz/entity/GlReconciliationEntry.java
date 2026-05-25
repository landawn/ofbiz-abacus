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
@Table(name = "gl_reconciliation_entry")
public class GlReconciliationEntry {
    @Id
    @Column(name = "gl_reconciliation_id")
    private String glReconciliationId;

    @Id
    @Column(name = "acctg_trans_id")
    private String acctgTransId;

    @Id
    @Column(name = "acctg_trans_entry_seq_id")
    private String acctgTransEntrySeqId;

    @Column(name = "reconciled_amount")
    private double reconciledAmount;
}
