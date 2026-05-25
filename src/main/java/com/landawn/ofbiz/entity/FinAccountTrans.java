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
@Table(name = "fin_account_trans")
public class FinAccountTrans {
    @Id
    @Column(name = "fin_account_trans_id")
    private String finAccountTransId;

    @Column(name = "fin_account_trans_type_id")
    private String finAccountTransTypeId;

    @Column(name = "fin_account_id")
    private String finAccountId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "gl_reconciliation_id")
    private String glReconciliationId;

    @Column(name = "transaction_date")
    private Timestamp transactionDate;

    @Column(name = "entry_date")
    private Timestamp entryDate;

    @Column(name = "amount")
    private double amount;

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "performed_by_party_id")
    private String performedByPartyId;

    @Column(name = "reason_enum_id")
    private String reasonEnumId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "status_id")
    private String statusId;
}
