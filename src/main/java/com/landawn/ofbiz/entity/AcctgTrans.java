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
@Table(name = "acctg_trans")
public class AcctgTrans {
    @Id
    @Column(name = "acctg_trans_id")
    private String acctgTransId;

    @Column(name = "acctg_trans_type_id")
    private String acctgTransTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "transaction_date")
    private Timestamp transactionDate;

    @Column(name = "is_posted")
    private String isPosted;

    @Column(name = "posted_date")
    private Timestamp postedDate;

    @Column(name = "scheduled_posting_date")
    private Timestamp scheduledPostingDate;

    @Column(name = "gl_journal_id")
    private String glJournalId;

    @Column(name = "gl_fiscal_type_id")
    private String glFiscalTypeId;

    @Column(name = "voucher_ref")
    private String voucherRef;

    @Column(name = "voucher_date")
    private Timestamp voucherDate;

    @Column(name = "group_status_id")
    private String groupStatusId;

    @Column(name = "fixed_asset_id")
    private String fixedAssetId;

    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "physical_inventory_id")
    private String physicalInventoryId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "role_type_id")
    private String roleTypeId;

    @Column(name = "invoice_id")
    private String invoiceId;

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "fin_account_trans_id")
    private String finAccountTransId;

    @Column(name = "shipment_id")
    private String shipmentId;

    @Column(name = "receipt_id")
    private String receiptId;

    @Column(name = "work_effort_id")
    private String workEffortId;

    @Column(name = "their_acctg_trans_id")
    private String theirAcctgTransId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "created_by_user_login")
    private String createdByUserLogin;

    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name = "last_modified_by_user_login")
    private String lastModifiedByUserLogin;

    @JoinedBy("acctgTransTypeId=AcctgTransType.acctgTransTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private AcctgTransType acctgTransType;

    @JoinedBy("glJournalId=GlJournal.glJournalId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlJournal glJournal;

    @JoinedBy("glFiscalTypeId=GlFiscalType.glFiscalTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private GlFiscalType glFiscalType;

    @JoinedBy("groupStatusId=StatusItem.statusId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private StatusItem statusItem;

    @JoinedBy("fixedAssetId=FixedAsset.fixedAssetId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FixedAsset fixedAsset;

    @JoinedBy("physicalInventoryId=PhysicalInventory.physicalInventoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PhysicalInventory physicalInventory;

    @JoinedBy("inventoryItemId=InventoryItem.inventoryItemId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItem inventoryItem;

    @JoinedBy("inventoryItemId=InventoryItemVariance.inventoryItemId, physicalInventoryId=InventoryItemVariance.physicalInventoryId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InventoryItemVariance inventoryItemVariance;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("roleTypeId=RoleType.roleTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private RoleType roleType;

    @JoinedBy("invoiceId=Invoice.invoiceId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Invoice invoice;

    @JoinedBy("paymentId=Payment.paymentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Payment payment;

    @JoinedBy("finAccountTransId=FinAccountTrans.finAccountTransId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private FinAccountTrans finAccountTrans;

    @JoinedBy("shipmentId=Shipment.shipmentId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Shipment shipment;

    @JoinedBy("receiptId=ShipmentReceipt.receiptId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ShipmentReceipt shipmentReceipt;

    @JoinedBy("workEffortId=WorkEffort.workEffortId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private WorkEffort workEffort;
}
