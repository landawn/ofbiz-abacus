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

    @JoinedBy("finAccountTransTypeId=FinAccountTransType.finAccountTransTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccountTransType finAccountTransType;

    @JoinedBy("finAccountId=FinAccount.finAccountId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccount finAccount;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("paymentId=Payment.paymentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Payment payment;

    @JoinedBy("orderId=OrderItem.orderId, orderItemSeqId=OrderItem.orderItemSeqId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderItem orderItem;

    @JoinedBy("performedByPartyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party performedByParty;

    @JoinedBy("reasonEnumId=Enumeration.enumId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Enumeration enumeration;

    @JoinedBy("statusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("glReconciliationId=GlReconciliation.glReconciliationId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlReconciliation glReconciliation;
}
