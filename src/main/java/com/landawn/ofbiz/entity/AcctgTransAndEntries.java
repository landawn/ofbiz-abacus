package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
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
@Table(name = "acctg_trans_and_entries")
public class AcctgTransAndEntries {
    @ReadOnly
    @Column(name = "is_posted")
    private String isPosted;

    @ReadOnly
    @Column(name = "gl_fiscal_type_id")
    private String glFiscalTypeId;

    @ReadOnly
    @Column(name = "acctg_trans_type_id")
    private String acctgTransTypeId;

    @ReadOnly
    @Column(name = "transaction_date")
    private Timestamp transactionDate;

    @ReadOnly
    @Column(name = "posted_date")
    private Timestamp postedDate;

    @ReadOnly
    @Column(name = "trans_description")
    private String transDescription;

    @ReadOnly
    @Column(name = "gl_journal_id")
    private String glJournalId;

    @ReadOnly
    @Column(name = "trans_type_description")
    private String transTypeDescription;

    @ReadOnly
    @Column(name = "invoice_id")
    private String invoiceId;

    @ReadOnly
    @Column(name = "payment_id")
    private String paymentId;

    @ReadOnly
    @Column(name = "shipment_id")
    private String shipmentId;

    @ReadOnly
    @Column(name = "receipt_id")
    private String receiptId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "work_effort_id")
    private String workEffortId;

    @ReadOnly
    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @ReadOnly
    @Column(name = "physical_inventory_id")
    private String physicalInventoryId;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "acctg_trans_id")
    private String acctgTransId;

    @ReadOnly
    @Column(name = "acctg_trans_entry_seq_id")
    private String acctgTransEntrySeqId;

    @ReadOnly
    @Column(name = "gl_account_id")
    private String glAccountId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "debit_credit_flag")
    private String debitCreditFlag;

    @ReadOnly
    @Column(name = "amount")
    private double amount;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "orig_amount")
    private double origAmount;

    @ReadOnly
    @Column(name = "orig_currency_uom_id")
    private String origCurrencyUomId;

    @ReadOnly
    @Column(name = "organization_party_id")
    private String organizationPartyId;

    @ReadOnly
    @Column(name = "gl_account_type_id")
    private String glAccountTypeId;

    @ReadOnly
    @Column(name = "account_code")
    private String accountCode;

    @ReadOnly
    @Column(name = "account_name")
    private String accountName;

    @ReadOnly
    @Column(name = "gl_account_class_id")
    private String glAccountClassId;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "reconcile_status_id")
    private String reconcileStatusId;

    @ReadOnly
    @Column(name = "acctg_trans_entry_type_id")
    private String acctgTransEntryTypeId;
}
