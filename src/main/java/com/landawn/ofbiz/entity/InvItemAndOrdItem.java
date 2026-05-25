package com.landawn.ofbiz.entity;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.ReadOnly;
import com.landawn.abacus.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inv_item_and_ord_item")
public class InvItemAndOrdItem {
    @ReadOnly
    @Column(name = "order_id")
    private String orderId;

    @ReadOnly
    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @ReadOnly
    @Column(name = "invoice_id")
    private String invoiceId;

    @ReadOnly
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @ReadOnly
    @Column(name = "invoice_item_type_id")
    private String invoiceItemTypeId;

    @ReadOnly
    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @ReadOnly
    @Column(name = "override_org_party_id")
    private String overrideOrgPartyId;

    @ReadOnly
    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "product_feature_id")
    private String productFeatureId;

    @ReadOnly
    @Column(name = "parent_invoice_id")
    private String parentInvoiceId;

    @ReadOnly
    @Column(name = "parent_invoice_item_seq_id")
    private String parentInvoiceItemSeqId;

    @ReadOnly
    @Column(name = "uom_id")
    private String uomId;

    @ReadOnly
    @Column(name = "taxable_flag")
    private String taxableFlag;

    @ReadOnly
    @Column(name = "quantity")
    private double quantity;

    @ReadOnly
    @Column(name = "amount")
    private double amount;

    @ReadOnly
    @Column(name = "description")
    private String description;

    @ReadOnly
    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @ReadOnly
    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @ReadOnly
    @Column(name = "tax_authority_rate_seq_id")
    private String taxAuthorityRateSeqId;

    @ReadOnly
    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;
}
