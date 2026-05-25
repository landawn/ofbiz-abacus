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
@Table(name = "invoice_item")
public class InvoiceItem {
    @Id
    @Column(name = "invoice_id")
    private String invoiceId;

    @Id
    @Column(name = "invoice_item_seq_id")
    private String invoiceItemSeqId;

    @Column(name = "invoice_item_type_id")
    private String invoiceItemTypeId;

    @Column(name = "override_gl_account_id")
    private String overrideGlAccountId;

    @Column(name = "override_org_party_id")
    private String overrideOrgPartyId;

    @Column(name = "inventory_item_id")
    private String inventoryItemId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_feature_id")
    private String productFeatureId;

    @Column(name = "parent_invoice_id")
    private String parentInvoiceId;

    @Column(name = "parent_invoice_item_seq_id")
    private String parentInvoiceItemSeqId;

    @Column(name = "uom_id")
    private String uomId;

    @Column(name = "taxable_flag")
    private String taxableFlag;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "amount")
    private double amount;

    @Column(name = "description")
    private String description;

    @Column(name = "tax_auth_party_id")
    private String taxAuthPartyId;

    @Column(name = "tax_auth_geo_id")
    private String taxAuthGeoId;

    @Column(name = "tax_authority_rate_seq_id")
    private String taxAuthorityRateSeqId;

    @Column(name = "sales_opportunity_id")
    private String salesOpportunityId;
}
