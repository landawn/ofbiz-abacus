package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "acctg_trans_entry")
public class AcctgTransEntry {
    @Id
    @Column(name = "acctg_trans_id")
    private String acctgTransId;

    @Id
    @Column(name = "acctg_trans_entry_seq_id")
    private String acctgTransEntrySeqId;

    @Column(name = "acctg_trans_entry_type_id")
    private String acctgTransEntryTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "voucher_ref")
    private String voucherRef;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "their_party_id")
    private String theirPartyId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "their_product_id")
    private String theirProductId;

    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "gl_account_type_id")
    private String glAccountTypeId;

    @Column(name = "gl_account_id")
    private String glAccountId;

    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "orig_amount")
    private double origAmount;

    @Column(name = "orig_currency_uom_id")
    private String origCurrencyUomId;

    @Column(name = "debit_credit_flag")
    private String debitCreditFlag;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "tax_id")
    private String taxId;

    @Column(name = "reconcile_status_id")
    private String reconcileStatusId;

    @Column(name = "settlement_term_id")
    private String settlementTermId;

    @Column(name = "is_summary")
    private String isSummary;
}
