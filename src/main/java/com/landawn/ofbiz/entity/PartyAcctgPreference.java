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
@Table(name = "party_acctg_preference")
public class PartyAcctgPreference {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "fiscal_year_start_month")
    private double fiscalYearStartMonth;

    @Column(name = "fiscal_year_start_day")
    private double fiscalYearStartDay;

    @Column(name = "tax_form_id")
    private String taxFormId;

    @Column(name = "cogs_method_id")
    private String cogsMethodId;

    @Column(name = "base_currency_uom_id")
    private String baseCurrencyUomId;

    @Column(name = "invoice_seq_cust_meth_id")
    private String invoiceSeqCustMethId;

    @Column(name = "invoice_id_prefix")
    private String invoiceIdPrefix;

    @Column(name = "last_invoice_number")
    private double lastInvoiceNumber;

    @Column(name = "last_invoice_restart_date")
    private Timestamp lastInvoiceRestartDate;

    @Column(name = "use_invoice_id_for_returns")
    private String useInvoiceIdForReturns;

    @Column(name = "quote_seq_cust_meth_id")
    private String quoteSeqCustMethId;

    @Column(name = "quote_id_prefix")
    private String quoteIdPrefix;

    @Column(name = "last_quote_number")
    private double lastQuoteNumber;

    @Column(name = "order_seq_cust_meth_id")
    private String orderSeqCustMethId;

    @Column(name = "order_id_prefix")
    private String orderIdPrefix;

    @Column(name = "last_order_number")
    private double lastOrderNumber;

    @Column(name = "refund_payment_method_id")
    private String refundPaymentMethodId;

    @Column(name = "error_gl_journal_id")
    private String errorGlJournalId;

    @Column(name = "enable_accounting")
    private String enableAccounting;
}
