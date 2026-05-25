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
@Table(name = "party_pref_doc_type_tpl")
public class PartyPrefDocTypeTpl {
    @Id
    @Column(name = "party_pref_doc_type_tpl_id")
    private String partyPrefDocTypeTplId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "from_date")
    private Timestamp fromDate;

    @Column(name = "thru_date")
    private Timestamp thruDate;

    @Column(name = "invoice_type_id")
    private String invoiceTypeId;

    @Column(name = "order_type_id")
    private String orderTypeId;

    @Column(name = "quote_type_id")
    private String quoteTypeId;

    @Column(name = "custom_screen_id")
    private String customScreenId;

    @JoinedBy("partyId=Party.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Party party;

    @JoinedBy("partyId=PartyAcctgPreference.partyId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private PartyAcctgPreference partyAcctgPreference;

    @JoinedBy("invoiceTypeId=InvoiceType.invoiceTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private InvoiceType invoiceType;

    @JoinedBy("quoteTypeId=QuoteType.quoteTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private QuoteType quoteType;

    @JoinedBy("orderTypeId=OrderType.orderTypeId")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OrderType orderType;
}
