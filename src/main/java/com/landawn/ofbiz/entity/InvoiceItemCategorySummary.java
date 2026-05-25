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
@Table(name = "invoice_item_category_summary")
public class InvoiceItemCategorySummary {
    @ReadOnly
    @Column(name = "status_id")
    private String statusId;

    @ReadOnly
    @Column(name = "invoice_date")
    private Timestamp invoiceDate;

    @ReadOnly
    @Column(name = "invoice_type_id")
    private String invoiceTypeId;

    @ReadOnly
    @Column(name = "party_id_from")
    private String partyIdFrom;

    @ReadOnly
    @Column(name = "party_id")
    private String partyId;

    @ReadOnly
    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @ReadOnly
    @Column(name = "invoice_item_type_id")
    private String invoiceItemTypeId;

    @ReadOnly
    @Column(name = "product_id")
    private String productId;

    @ReadOnly
    @Column(name = "quantity_total")
    private String quantityTotal;

    @ReadOnly
    @Column(name = "amount_total")
    private String amountTotal;

    @ReadOnly
    @Column(name = "product_category_id")
    private String productCategoryId;
}
